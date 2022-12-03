package group1;


import java.util.Arrays;
import java.util.Scanner;

public class cw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число");
        int i = scanner.nextInt();
        int[] mas = new int[]{1, 2, 4, 5, 7, 8, 3};


        for (int j = 0; j < mas.length; j++) {
            if (i == mas[j]) {
                System.out.println("Число входит в массив");
            }
        }
    }
}

