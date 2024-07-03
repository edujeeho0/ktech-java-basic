package d6.d64;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Beeper beeper = new Car();
        makeBeepSound(beeper);
        beeper = new Ship();
        makeBeepSound(beeper);
        beeper = new Airplane();
        makeBeepSound(beeper);

        Person alex = new Person("alex", 25);
        Person brad = new Person("brad", 45);
        Person chad = new Person("chad", 40);
        Person pete = new Person("brad", 35);
        Person[] people = new Person[]{alex, brad, chad, pete};

        int[] arr = {2, 5, 3, 10, 6, 7, 1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(people);
        for (Person person: people) {
            person.printInfo();
        }
    }

    public static void makeBeepSound(
            Beeper beeper
    ) {
        beeper.beep();
    }
}
