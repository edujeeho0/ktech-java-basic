package d5.probs;

import java.util.Arrays;

/*
int[]를 인자로 받아, 순서가 반대가 되어있는 배열을 반환하는 메서드를 작성하시오.
 */
public class Qb {
    public static void main(String[] args) {
        int[] target = {1, 2, 3, 4};
        int[] result = reverseArray(target);
        System.out.println(Arrays.toString(result));

        result = reverseInPlace(target);
        // 메서드에 인자로 전달한 target을 반환하여
        // result에 직접 할당하게 되면  같은 배열을 사용하게 된다..
        target[0] = 0;
        System.out.println(result[0]);
        System.out.println(Arrays.toString(result));
        // 메서드 내에서 배열을 조작하면 밖에서도 반영이 된다.
        System.out.println(Arrays.toString(target));
    }

    public static int[] reverseArray(int[] target) {
        // 결과를 담을 배열을 만들고,
        int[] result = new int[target.length];
        // 배열의 크기만큼 반복한다.
        for (int i = 0; i < target.length; i++) {
            result[i] = target[target.length - 1 - i];
        }
        return result;
    }

    // 주의
    public static int[] reverseInPlace(int[] target) {
        // target의 0번째는 target의 target.length - 1과
        // target의 1번째는 target의 target.length - 2와 ...
        for (int i = 0; i < target.length / 2; i++) {
            int temp = target[i];
            target[i] = target[target.length - 1 - i];
            target[target.length - 1 - i] = temp;
        }
        return target;
    }
}
