package d8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class D83Collections {
    public static void main(String[] args) {
        // arr가 있었다. 크기는 5.
        int[] arr = {1, 2, 3, 4, 5};
        // arr의 뒤에 6을 추가하고 싶다면?
        // arr = {1, 2, 3, 4, 5, 6};
        // 1. 6칸 짜리 배열을 만들고
        int[] newArr = new int[6];
        // 2. 앞의 5개의 데이터를 복사 붙여넣기 한 다음
        for (int i = 0; i < 5; i++) {
            newArr[i] = arr[i];
        }
        // 3. 새로운 데이터 6을 넣어준다.
        newArr[5] = 6;
        // 이미 존재하는 배열에 데이터를 추가하기는 어렵다...
        System.out.println(Arrays.toString(newArr));

        // 대신 ArrayList 같은걸 사용하면?
        List<Integer> intArrayList = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            intArrayList.add(i);
        }
        System.out.println(intArrayList);
        printEachElement(intArrayList);

    }

    public static void printEachElement(List<Integer> intList) {}
}
