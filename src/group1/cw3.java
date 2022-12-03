package group1;

public class cw3 {
    public static void main(String[] args) {
        int[] m1 = new int[5];
        int[] m2 = new int[5];
        for (int i = 0; i < m1.length; i++) {
            m1[i]=(int)(Math.random()*6);
        }
        for (int i = 0; i < m2.length; i++) {
            m2[i]=(int)(Math.random()*6);
        }
        for (int i = 0; i < m1.length; i++) {
            System.out.print(m1[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < m2.length; i++){
            System.out.print(m2[i]+" ");
        }
        System.out.println();
        int a = 0;
        int b = 0;

        for (int i = 0; i < m1.length; i++) {
            a += m1[i];
        }
        System.out.println(a);

        for (int i = 0; i < m2.length; i++) {
            b += m2[i];
        }
        System.out.println(b);

        if (a > b)
            System.out.println("Pervyi massiv bolshe");
         else if (a == b)
            System.out.println("Summa elementov massivov ravna");
         else
            System.out.println("Vtoroj massiv bolshe");

            
        }


    }



