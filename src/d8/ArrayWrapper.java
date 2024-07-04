package d8;

// Generic Type Reference
// 자료형을 클래스를 사용하는 입장에서 정할 수 있도록
public class ArrayWrapper<T extends Comparable<T>> {  // Type Parameter
    // T를 자료형(클래스)처럼 사용할 수 있다.
    private T[] array;

    public ArrayWrapper(T[] array) {
        this.array = array;
    }

    public int length() {
        return array.length;
    }

    public boolean contains(T target) {
        for (T item : array) {
            if (item == null) continue;
            if (item.equals(target)) return true;
        }
        return false;
    }

    public T max() {
        T maxValue = null;
        for (T item: array) {
            if (item == null) continue;
            if (maxValue == null ||
                    item.compareTo(maxValue) > 0)
                maxValue = item;
        }
        return maxValue;
    }
}
