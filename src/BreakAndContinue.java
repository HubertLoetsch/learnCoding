

public class BreakAndContinue {
    public static void main(String[] args) {


        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum = sum + i;
            if (sum > 12) {
                break;
            }
        }
        System.out.println(sum);


        int sum1 = 0;
        for (int i = 0; i < 10; i++) {
            if (i==8){
                continue;
            }
            sum1 = sum1 +1;
        }
        System.out.println(sum1);

    }

}
