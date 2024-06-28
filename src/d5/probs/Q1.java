package d5.probs;

public class Q1 {
    public static void main(String[] args) {
        int[] numbers = {2, 1, 4, 5, 3};
        System.out.println(maxWhere(numbers));
        System.out.println(minWhere(numbers));
        System.out.println(maxDiff(numbers));
    }

    // 배열의 값들 중 최댓값과 최솟값의 차이를 반환하는 maxDiff
    public static int maxDiff(int[] numbers) {
        // 방법 1: 참고용
        /*int maxValue = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];
            if (current > maxValue) {
                maxValue = numbers[i];
            }
        }
        int minValue = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];
            if (current < minValue) {
                minValue = numbers[i];
            }
        }

        return maxValue - minValue;*/

        // 방법 2: foreach 2번
        /*int maxValue = numbers[0];
        for (int current : numbers) {
            if (current > maxValue) {
                maxValue = current;
            }
        }
        int minValue = numbers[0];
        for (int current : numbers) {
            if (current < minValue) {
                minValue = current;
            }
        }

        return maxValue - minValue;*/

        // 방법 3: 한번 반복으로 최대 최소 다 구하기
        /*int maxValue = numbers[0];
        int minValue = numbers[0];
        for (int current : numbers) {
            if (current > maxValue) {
                maxValue = current;
            }
            if (current < minValue) {
                minValue = current;
            }
        }

        return maxValue - minValue;*/

        // 방법 4: 출제자의 의도
        return numbers[maxWhere(numbers)] - numbers[minWhere(numbers)];
    }

    // 배열의 값들 중 최댓값의 위치를 반환하는 maxWhere
    public static int maxWhere(int[] numbers) {
        // 첫번째 값을 기준으로
        int maxIdx = 0;
        int maxValue = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            // 현재 값
            int current = numbers[i];
            // 만약 현재 값이 더 크다면,
            if (current > maxValue) {
                // 현재 위치를 저장한다.
                maxIdx = i;
                // 현재 값도 저장한다.
                maxValue = current;
            }
        }
        return maxIdx;
    }

    // 배열의 값들 중 최솟값의 위치를 반환하는 minWhere
    public static int minWhere(int[] numbers) {
        // 첫번째 값을 기준으로
        int minIdx = 0;
        int minValue = numbers[0];
        // max에서 한걸 반복한다.
        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];
            if (current < minValue) {
                minIdx = i;
                minValue = current;
            }
        }
        return minIdx;
    }

    /*
    int[]을 인자로 받아,

    - 배열의 값들 중 최댓값의 위치를 반환하는 maxWhere
    - 배열의 값들 중 최솟값의 위치를 반환하는 minWhere
    - 배열의 값들 중 최댓값과 최솟값의 차이를 반환하는 maxDiff

    메서드를 각각 작성하시오.
     */
}
