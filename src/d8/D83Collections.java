package d8;

import java.util.*;

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

        // Set
        // 순서를 보장하지 않으며, 중복을 허용하지 않는다.
        Set<String> skillSet = new HashSet<>();
        skillSet.add("Java");
        skillSet.add("Python");
        skillSet.add("Kotlin");
        skillSet.add("Java");
        System.out.println(skillSet);
        System.out.println(skillSet.contains("Java"));
        System.out.println(skillSet.contains("NodeJS"));
        skillSet.remove("Python");
        skillSet.remove("Kotlin");
        System.out.println(skillSet);
        // 순서가 없어서, get이 없다
        // skillSet.get();  // 오류

        // Set <-> List
        List<String> setToList = new ArrayList<>(skillSet);
        System.out.println(setToList.get(0));
        for (int i = 0; i < 5; i++) {
            setToList.add("Java");
        }
        System.out.println(setToList);

        Set<String> listToSet = new HashSet<>(setToList);
        System.out.println(listToSet);

        // 그냥 클래스로도 된다.
        List<Person> peopleList = new ArrayList<>();
        peopleList.add(new Person("alex", 25));
        peopleList.add(new Person("brad", 30));
        peopleList.add(new Person("chad", 35));
        peopleList.add(new Person("alex", 25));
        System.out.println(peopleList);

        // equals와 hashCode를 잘 Override 했다면
        // Set으로 중복 검사 가능
        Set<Person> people = new HashSet<>(peopleList);
        System.out.println("Set people");
        System.out.println(people);


        // Iterable
        // 일반적인 리스트가 있다고 가정하자.
        List<String> names = new ArrayList<>();
        names.add("alex");
        names.add("brad");
        names.add("chad");
        names.add("dave");
        // Iterator: 어떤 Collection의 데이터를 하나씩
        //          꺼내오는 객체
        // List의 Iterator를 가져오는 메서드
        Iterator<String> listIter = names.listIterator();
        // 이 Iterator가 가르키는 데이터 모음 중, 다음에 볼 데이터가 있는지
        // -> 아직 확인할 데이터가 남았는지
        while (listIter.hasNext()) {
            // 이 Iterator가 가르키고 있는 데이터를 가져온다.
            System.out.println(listIter.next());
        }
        // Iterable을 구현한 클래스는,
        // for - each에서 사용이 가능하다.
        for (String name: names) {
            System.out.println(name);
        }
        for (String skill: skillSet) {
            System.out.println(skill);
        }
        for (Person person: peopleList) {
            System.out.println(person);
        }

        // Map
        // Key - Value로 데이터를 관리하는 자료구조
        Map<String, String> me = new HashMap<>();
        // put(Key, Value)
        me.put("name", "Jeeho Park");
        me.put("age", "100");
        me.put("email", "edujeeho@gmail.com");
        System.out.println(me.get("name"));
        System.out.println(me.get("age"));
        System.out.println(me);

        Map<Long, String> bus = new HashMap<>();
        bus.put(9003L, "종로에서 운중동까지");
        // 같은 키를 사용하면 덮어씌워진다.
        bus.put(8100L, "명동에서 정자동까지");
        bus.put(8100L, "명동에서 분당까지");
        System.out.println(bus.get(8100L));
        // 없는 데이터를 get하면, null
        System.out.println(bus.get(1500L));

        // user.name, user.email
        Map<String, String> gitConfig = new HashMap<>();
        gitConfig.put("user.email", "edujeeho@gmail.com");
        gitConfig.put("user.name", "edujeeho");
        // 없으면 넣는다.
        gitConfig.putIfAbsent("user.name", "jeeho park");
        System.out.println(gitConfig.get("user.name"));
        // 없으면 기본값 사용
        System.out.println(gitConfig.getOrDefault("user.email", "unknown"));
        System.out.println(gitConfig.getOrDefault("user.online", "no"));

        // Key가 존재하면 true
        if (gitConfig.containsKey("user.online")) {
            System.out.println(gitConfig.get("user.online"));
        }
        // Key 연결된 Value를 반환하고 제거
        System.out.println(gitConfig.remove("user.name"));
        System.out.println(gitConfig.containsKey("user.name"));
        System.out.println(gitConfig.remove("user.online"));

        // keySet(): 이 맵이 들고있는 모든 Key를 가진 Set을 반환하는 메서드
        Set<String> confKeyset = gitConfig.keySet();
        // 그러면 있는 키들만 가지고 반복이 가능하다.
        for (String key: confKeyset) {
            System.out.println(key + ": " + gitConfig.get(key));
        }
        // Entry: Key와 Value한 쌍
        Set<Map.Entry<String, String>> entrySet = me.entrySet();
        for (Map.Entry<String, String> entry: entrySet) {
            System.out.println();
            System.out.println("key: " + entry.getKey());
            System.out.println("value: " + entry.getValue());
        }

        // Person Map
        Map<String, Person> peopleInfo = new HashMap<>();
        peopleInfo.put("alex", new Person("Alex", 25));
        peopleInfo.put("brad", new Person("Brad", 35));
        peopleInfo.put("chad", new Person("Chad", 40));
        for (Map.Entry<String, Person> entry: peopleInfo.entrySet()) {
            System.out.println();
            System.out.println("details for: " + entry.getKey());
            System.out.println(entry.getValue());
        }
        // key: present, absent
        Map<String, List<Person>> attendance;
    }

    public static void printEachElement(List<Integer> intList) {}
}
