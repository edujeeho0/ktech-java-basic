package d8;

public class D81Generics {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        IntArrayWrapper numWrapper = new IntArrayWrapper(nums);
        System.out.println(numWrapper.length());
        System.out.println(numWrapper.max());
        System.out.println(numWrapper.min());

        double[] doubleArr = {1.2, 3.4, 5.6, 9.9};
        DoubleArrayWrapper doubWrapper = new DoubleArrayWrapper(doubleArr);
        System.out.println(doubWrapper.max());
        System.out.println(doubWrapper.min());

        Integer[] integers = {1, 2, 3, 4, 5};
        ArrayWrapper<Integer> intArrayWrapper
                = new ArrayWrapper<>(integers);
        System.out.println(intArrayWrapper.contains(3));
        System.out.println(intArrayWrapper.contains(6));

        Double[] doubles = {1.2, 3.4, 5.6, 9.9};
        ArrayWrapper<Double> doubleArrayWrapper
                = new ArrayWrapper<>(doubles);
        System.out.println(doubleArrayWrapper.contains(1.2));
        System.out.println(doubleArrayWrapper.contains(3.14));
        System.out.println(contains(doubles, 1.2));

        System.out.println(intArrayWrapper.max());
        System.out.println(doubleArrayWrapper.max());
        ArrayWrapper<Person> p;

    }

    // 메서드 타입 파라미터
    public static <T> boolean contains(T[] source, T target) {
        for (T item: source) {
            if (item == null) continue;
            if (item.equals(target)) return true;
        }
        return false;
    }
}
