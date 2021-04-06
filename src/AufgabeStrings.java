import java.util.Scanner;

public class AufgabeStrings {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie ein Wort ein: ");
        String wort = scan.next();
        scan.close();

        String trow = dreheWortUm(wort);
        System.out.println(trow);
    }

    public static String dreheWortUm(String wort) {

        if (wort.length() <= 0) {
            return "";
        } else
        {
            char letzter = wort.charAt(wort.length() - 1);
            String rest = wort.substring(0, wort.length() - 1);
            return letzter + dreheWortUm(rest);
        }
    }
}