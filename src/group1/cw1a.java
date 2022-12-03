package group1;

import java.util.Arrays;
import java.util.Scanner;

public class cw1a {
    public static int [] removeElements( int [] arr, int k) {



        int index = 0 ;
        for ( int i= 0 ; i<arr.length; i++)
            if (arr[i] != k)
                arr[index++] = arr[i];

        return Arrays.copyOf(arr, index);
    }

    public static void main(String[] args)
    {
        int [] array = { 3 , 9 , 2 , 3 , 1 , 7 , 2 , 3 , 5 };
        System.out.println(Arrays.toString(array));
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();



        array = removeElements(array, k);
        System.out.println(Arrays.toString(array));
    }

}
