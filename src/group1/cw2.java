package group1;

import java.util.Arrays;
import java.util.Scanner;

public class cw2 {
    public static void main(String[] args) {
        System.out.println("введите число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] mas = new int[a];
        double sum = 0;
        for (int i = 0; i < a; i++) {
            mas[i] = (int) (Math.random() * 15);
            sum = mas[i] + sum;
            System.out.print(" "+mas[i]);
        }

        System.out.println("");
        System.out.println(Arrays.stream(mas).max());
        System.out.println(Arrays.stream(mas).min());
        System.out.println(sum/mas.length);
    }
}



