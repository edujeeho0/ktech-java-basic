package d3.prob;


import java.util.Scanner;

// 5개의 서로다른 정수가 입력된다.
// 이중 최대값의 위치(index)를 구해서 출력하여라.
public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[5];
        // for문으로 5번 입력받기
        for (int i = 0; i < 5; i++) {
            nums[i] = scanner.nextInt();
        }

        // 최댓값의 위치를 기록할 변수
        int maxIdx = 0;
        for (int i = 0; i < 5; i++) {
            // if를 이용해 현재 최댓값보다 더 큰지 확인한다.
            // nums[maxIdx]는 여태까지 본 값들중 최대인 값이다.
            // nums[i]는 지금 확인하는 값이다.
            if (nums[maxIdx] < nums[i]) {
                maxIdx = i;
            }
        }
        // 결과 출력
        System.out.println(maxIdx);
    }
}
