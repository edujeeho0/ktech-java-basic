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

        // List
        // 데이터의 중복을 허용하며, 순서를 지키는 데이터 모음
        List<String> skillList = new ArrayList<>();
        skillList.add("Java");
        skillList.add("Python");
        skillList.add("Kotlin");
        skillList.add("Java");
        // [Java, Python, Kotlin, Java]
        System.out.println(skillList);
        // get(int index): 몇번째의 데이터를 사용하겠다. [] 대신 쓴다.
        System.out.println(skillList.get(0));
        System.out.println(skillList.get(2));
        // System.out.println(skillList.get(4));  // 지금은 예외발생

        // 메서드기 때문에, 결과 값만 돌려주니까...[]로 데이터를 할당하기는 어렵다.
        // skillList.get(2) = "";  // 컴파일 안됨
        // 특정 위치에 add 하기
        skillList.add(1, "Markdown");
        // 특정 위치의 데이터 바꾸기
        skillList.set(2, "Git");
        System.out.println(skillList);

        System.out.println(skillList.contains("Java"));
        System.out.println(skillList.contains("Python"));
        System.out.println(skillList.indexOf("Git"));
        skillList.remove("Kotlin");
        skillList.remove("Java");
        System.out.println(skillList);
    }

    public static void printEachElement(List<Integer> intList) {}
}
