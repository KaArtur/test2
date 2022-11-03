public class Main {
    public static void main(String[] args) {
        int i;
        int j;
        for( i =2; i<= 10; i++) {
      System.out.print( "podzielniki liczby " + i + ":");
            for( j = 2; j<i; j++)
               if ((i%j)==0) System.out.print(j + " ");
            System.out.println();
        }
    }
}