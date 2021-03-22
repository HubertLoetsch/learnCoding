

public class Quersumme3 {
    public static void main(String[] args) {

        int[] crossSumCounter = new int[28];

        for (int cnt = 0; cnt < 1000; cnt++) {

            int crossSum = getCrossSum(cnt);

            crossSumCounter[crossSum] += 1;
        }

        int maxIndex = 0;
        int maxValue = 0;
        for (int i = 0; i < crossSumCounter.length; i++) {
            if (crossSumCounter[i] > maxValue) {
                maxValue = crossSumCounter[i];
                maxIndex = i;
            }
        }
        for (int i = 0; i < crossSumCounter.length; i++) {
            if (crossSumCounter[1] == maxValue) {
                System.out.println("75 mal vor: " + i);
            }
        }



        }

        private static int getCrossSum ( int number){
            //Quersumme Berechnung
            String numberAsString = Integer.toString(number);
            char[] numbers = numberAsString.toCharArray();

            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum = sum + Character.getNumericValue(numbers[i]);
            }
            return sum;
        }
    }



