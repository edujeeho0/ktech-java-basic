package d4.q2;
/*
`Music` 클래스를 만들어보자.

1. `Music`은 제목, 아티스트, 앨범, 시간에 대한 정보를 가졌다.
    이때, 시간 정보는 초단위로 기록된다.
2. 생성자와 Getter, Setter 메서드는 자유롭게 만든다.
3. `play()` 메서드가 존재하며, 호출될 시 아래와 같은 출력이 일어난다.

    ```
    Now playing, <제목>...
    ```

4. `checkDuration()` 메서드가 존재하며, 호출될 시 아래와 같은 출력이 일어난다.

    ```
    <제목> - <분>:<초>
    ```
 */
public class Main {
    public static void main(String[] args) {
        Music track = new Music(
                "Inertia",
                "AJR",
                "The Maybe Man",
                220
        );

        track.play();
        track.checkDuration();
    }
}
