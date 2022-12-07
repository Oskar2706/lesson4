package group2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class cw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int j = scanner.nextInt();
        Random random = new Random();
        int[] array = new int[j];
        int i;
        int evenNums = 0;
        if (j < 5 || j > 10) {
            System.out.println("повторите ввод");
        } else {
            System.out.println("");
            for (i = 0; i < j; i++) {
                array[i] = random.nextInt(10);
                if (array[i] % 2 == 0) {
                    evenNums++;
                }
            }
            System.out.println(Arrays.toString(array));
            int[] array1 = new int[evenNums];
            int index = 0;
            for (i = 0; i < j; i++) {
                if (array[i] % 2 == 0) {
                    array1[index] = array[i];
                    index++;
                }
            }
            System.out.println(Arrays.toString(array1));
        }
    }
}
