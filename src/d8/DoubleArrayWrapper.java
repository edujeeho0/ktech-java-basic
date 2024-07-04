package d8;

// 정수 배열에 여러 기능이 추가된 클래스
public class DoubleArrayWrapper {
    private double[] doubArr;

    public DoubleArrayWrapper(double[] doubArr) {
        this.doubArr = doubArr;
    }

    public int length() {
        return doubArr.length;
    }

    // intArray의 원소 중 최댓값을 반환하는 메서드
    public double max() {
        double maxValue = doubArr[0];
        for (int i = 0; i < doubArr.length; i++) {
            maxValue = Math.max(maxValue, doubArr[i]);
        }
        return maxValue;
    }

    public double min() {
        double minValue = doubArr[0];
        for (int i = 0; i < doubArr.length; i++) {
            minValue = Math.min(minValue, doubArr[i]);
        }
        return minValue;
    }
}
