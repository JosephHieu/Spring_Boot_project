package math;

import java.util.Random;

public class MathRandom {

    public static void main(String[] args) {

        int random = (int) (Math.random() * 26) + 65;

        for (int i = 0; i < 10; i++) {
            System.out.printf("%1$d = %1$c%n", (int) (Math.random() * 26) + 65);
        }

        System.out.println("--------------------");
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.printf("%1$d = %1$c%n", r.nextInt(65, 91));
        }

        System.out.println("--------------------");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%1$d = %1$c%n", r.nextInt((int) 'A', (int) 'Z' + 1));
        }

        System.out.println("--------------------");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%1$d%n", r.nextInt(-10, 11));
        }

        System.out.println("--------------------");
        r.ints()
                .limit(10)
                .forEach(System.out::println);

        System.out.println("--------------------");
        r.ints(0, 10)
                .limit(10)
                .forEach(System.out::println);

        System.out.println("--------------------");
        r.ints(10, 0, 10)
                .forEach(System.out::println);

        System.out.println("--------------------");
        r.ints(10)
                .forEach(System.out::println);


        long nanoTime = System.nanoTime();
        Random pseudoRandom = new Random(nanoTime);
        System.out.println("--------------------");
        pseudoRandom.ints(10, 0, 10)
                .forEach(i -> System.out.print(i + " "));

        Random notReallyRandom = new Random(nanoTime);
        System.out.println("\n--------------------");
        notReallyRandom.ints(10, 0, 10)
                .forEach(i -> System.out.print(i + " "));








    }
}
