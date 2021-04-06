public class Quersumme2 {
    public static void main(String[] args) {


        for (int cnt = 0; cnt < 1000; cnt++) {

            //Quersumme Berechnung
            String numberAsString = Integer.toString(cnt);
            char[] numbers = numberAsString.toCharArray();

            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum = sum + Character.getNumericValue(numbers[i]);
            }
            //
            int rest = sum % 10;
            if (rest >= 10){
                System.out.println("nummer: " + cnt + "Quersumme: " + sum);
            }


        }
    }
}


/*
for (int i = 1; i < 1000; i++) {
    int zahl = i;
    int qs = 0;
    while (zahl > 0) {
        qs = qs + zahl % 10;
        zahl = zahl / 10;
    }
    System.out.println(i + " = " + qs);
    if (qs >= 10) {
        int iqs = 0;
        while (qs > 0) {
            iqs = iqs + qs % 10;
            qs = qs / 10;
        }
        System.out.println("--> " + iqs);
    }
}
 */