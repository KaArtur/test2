public class binary {
    public static void main(String[] args) {
        int a = 5;
        int b = 1;
        int g;


        //iloczyn bitowy
        System.out.println(String.format("%32s", Integer.toBinaryString(a & b)).replace(' ','0'));

        //suma bitowa
        System.out.println(String.format("%32s",Integer.toBinaryString(a|b)).replace(' ','0'));

        //XOR
        System.out.println(String.format("%32s",Integer.toBinaryString(a^b)).replace(' ','0'));

        //>>
        System.out.println(String.format("%32s", Integer.toBinaryString(g=a<<2)).replace(' ', '0'));

        System.out.println(g);
        System.out.println("'\t'"+a);

    }
}
