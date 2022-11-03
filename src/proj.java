public class proj {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("hello");

        int invest = 14000;
        double oneYear = invest * 1.4;
        System.out.println(oneYear);
        double secYear = oneYear - 1500;
        System.out.println(secYear);
        double thdYear = secYear * 1.12;
        System.out.println(Math.ceil(thdYear));

        int b = 35;
        boolean c;
        if((b % 7 ==0) && (b%5==0)) System.out.println(c=true);

    char d=62;
        System.out.println(d);
        String g1 = " ";
        System.out.println(g1+g1 + d+g1+d);
        System.out.println(g1+d+g1+d+g1+d);

        int r= 2;
        int Pole = r*r;
        int obw = 4*r;
        double prze = (double)(r*Math.sqrt(2));
        System.out.println(prze);

    }
}
