package pl.k.kamil.java.zadaniaDomowe2806;
import java.util.Scanner;
public class ScannerUtils {

    public static final Scanner scanner = new Scanner(System.in);

    public static String getFromScanner(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }
}
