import java.util.Scanner;
public class Text {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice = "";
        while (!choice.equals("Exit")) {
            System.out.println("Enter Exit");
            choice = input.next();
            System.out.println("Das Programm ist zu ende ");
        }

    }
}

