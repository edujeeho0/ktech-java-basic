package d9;

// 함수형 인터페이스: 하나의 추상 메서드만 존재하며,
//       해당하는 메서드의 형태를 가진 메서드를 나타내는 객체
@FunctionalInterface  // 약속을 지키게 해주는 도우미
public interface NoArgRetFunction {
    void noArgReturn();
}
