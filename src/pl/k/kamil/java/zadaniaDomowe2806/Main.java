package pl.k.kamil.java.zadaniaDomowe2806;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static pl.k.kamil.java.zadaniaDomowe2806.ScannerUtils.getFromScanner;

public class Main {

    public static void main(String[] args) {
        // Napisać program, który wczytuje od użytkownika ciąg znaków, a następnie wyświetla informację o tym ile razy w tym ciągu powtarza się jego ostatni znak.

        String text = getFromScanner("Podaj ciąg znaków");
        int length = text.length();
        System.out.println("Ostatni znak to :" + text.charAt(text.length() - 1));
        int number = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == text.charAt(text.length() - 1)) {
                number++;
            }

        }
        System.out.println("ostatni znak " + text.charAt(text.length() - 1) + " wystąpił " + number);

        // Napisać program, który wczytuje od użytkownika ciąg znaków, a następnie tworzy łańcuch będący
        // odwróceniem podanego łańcucha i wyświetla go na ekranie. Przykładowo, dla łańcucha „Kot” wynikiem powinien być łańcuch „toK”.

        char[] textArray = text.toCharArray();
        char[] textArrayReversed = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            textArrayReversed[i] = textArray[text.length() - 1 - i];
        }
        String textReversed = new String(textArrayReversed);
        System.out.println(textReversed);


        //Napisz walidator na liczby. Program powinien przyjmować od użytkownika napis o
        // typie String a następnie sprawdzić czy użytkownik podał tylko liczby w tym ciągu znaków.

        Pattern compile = Pattern.compile("[0-9]+");
        Matcher matcher = compile.matcher(text);
        if (matcher.matches()) {
            System.out.println("podałeś tylko liczby");
        } else {
            System.out.println("Podałeś inne znaki niz tylko liczby");
        }


        //Napisz program wyliczający dzień tygodnia w który przypadają Twoje urodziny, na 10 lat do przodu.

        LocalDate birtday = LocalDate.of(2020, 05, 18);
        System.out.println(birtday.getDayOfWeek());

        for (int i = 0; i < 10; i++) {
            birtday = birtday.plusYears(1);
            System.out.println(birtday.getDayOfWeek());

        }


    }
}
