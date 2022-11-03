public class Help3 {


    void helpOn(int what) {
        switch (what) {
            case '1':
                System.out.println("Instruckja warunkowa if \n;");
                System.out.println("if (warunek) instrukcja;");
                System.out.println("else instrukcja;");
                break;

            case '2':
                System.out.println("Instruckja wyboru switch \n;");
                System.out.println("switch (wyrażenie) {");
                System.out.println("stała:");
                System.out.println("sekwencja instrukcji;");
                System.out.println("break;");
                System.out.println("}");
                break;

            case '3':
                System.out.println("Pętla for: \n;");
                System.out.println("for (inicjalizacja; warunek; iteracja)");
                System.out.println("instrukcja");
                break;

            case '4':
                System.out.println("Pętla while: \n;");
                System.out.println("while (warunek) instrukcja;");
                break;

            case '5':
                System.out.println("Pętla do-while: \n;");
                System.out.println("do {");
                System.out.println("instrukcja;");
                System.out.println("} while (warunek)");
                break;

            case '6':
                System.out.println("break: \n;");
                System.out.println("break; lub break etykieta;");
                break;
            case '7':
                System.out.println("continue: \n;");
                System.out.println("continue; lub continue etykieta;");
                break;
        }
        System.out.println();
    }

    void showMenu() {
        System.out.println("Information about syntax and intruction");
        System.out.println(" 1: if");
        System.out.println(" 2: switch");
        System.out.println(" 3: for");
        System.out.println(" 4: while");
        System.out.println(" 5: do-while");
        System.out.println(" 6: break");
        System.out.println(" 7: continue");
        System.out.println(" Choice number (or q to close)");
    }

    boolean isValid(int ch) {
        if (ch < '1' | ch > '7' & ch != 'q') return false;
        else return true;
    }
}
