package d8;

// 정수 배열에 여러 기능이 추가된 클래스
public class IntArrayWrapper {
    private int[] intArray;

    public IntArrayWrapper(int[] intArray) {
        this.intArray = intArray;
    }

    public int length() {
        return intArray.length;
    }

    // intArray의 원소 중 최댓값을 반환하는 메서드
    public int max() {
        int maxValue = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            maxValue = Math.max(maxValue, intArray[i]);
        }
        return maxValue;
    }

    public int min() {
        int minValue = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            minValue = Math.min(minValue, intArray[i]);
        }
        return minValue;
    }
}
