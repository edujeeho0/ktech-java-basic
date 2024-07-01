package d5.probs;

import java.util.Arrays;

/*
int[]을 두개 받아,
첫번째 배열의 마지막 원소 뒤에,
두번째 배열의 첫번째 원소가 오도록
두 배열을 연결한 배열을 반환하는 메서드를 작성하시오.
 */
public class Q5 {
    public static void main(String[] args) {
        int[] front = {-1, 0, 1, 2, 3, 8, 9};
        int[] back = {4, 5, 6, 7};
        int[] result = connect(front, back);
        System.out.println(Arrays.toString(result));
    }

    public static int[] connect(
            int[] front,
            int[] back
    ) {
        int[] result = new int[front.length + back.length];
        // result의 앞부분에 front의 값들을 넣어주자.
        for (int i = 0; i < front.length; i++) {
            result[i] = front[i];
        }
        // result의 뒷부분에 back의 값들을 넣어주자.
        for (int i = 0; i < back.length; i++) {
            result[front.length + i] = back[i];
        }
        return result;
    }
}
/*
설명:

아래의 두 정수 배열이 인자로 전달되면,

int[] arrA = {1, 2, 3};
int[] arrB = {4, 5, 6};

메서드의 결과로 반환되는 배열은 아래와 같다.

int[] result = {1, 2, 3, 4, 5, 6};
 */