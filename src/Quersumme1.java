

public class Quersumme1 {
    public static void main(String[] args) {



        // Quersummen berechnung 1-2-3(4)

        int[] crossSumCounter = new int[28];

        for (int cnt = 0; cnt < 1000; cnt++) {
            //Quersumme Berechnung
            String numberAsString = Integer.toString(cnt);
            char[] numbers = numberAsString.toCharArray();

            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum = sum + Character.getNumericValue(numbers[i]);
            }
            //Quersumme wo 15 enthält
            if (sum == 15){
                System.out.println("nummer: " + cnt + "Quersumme: " + sum);
            }


        }
    }
}
