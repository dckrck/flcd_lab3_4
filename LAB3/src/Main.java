
import program.*;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("P1");
        LexycalScanner p1_scanner = new LexycalScanner("src/resources/P1.txt", "src/resources/PIF1.txt", "src/resources/ST1.txt");
        p1_scanner.scan();

        System.out.println();
        System.out.println("P2");
        LexycalScanner p2_scanner = new LexycalScanner("src/resources/P2.txt", "src/resources/PIF2.txt", "src/resources/ST2.txt");
        p2_scanner.scan();


        System.out.println();
        System.out.println("P3");
        LexycalScanner p3_scanner = new LexycalScanner("src/resources/P3.txt", "src/resources/PIF3.txt", "src/resources/ST3.txt");
        p3_scanner.scan();

        System.out.println();
        System.out.println("P1ERR");
        LexycalScanner p1_scanner_err = new LexycalScanner("src/resources/P1err.txt", "src/resources/PIFerr.txt", "src/resources/STerr.txt");
        p1_scanner_err.scan();
    }
}