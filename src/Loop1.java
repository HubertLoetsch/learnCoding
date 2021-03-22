public class Loop1 {

    public static void main(String[] args) {

        int num = 100, count = 1, total = 0;

        while (count <= num) {
            total = total + count;
            count++;
        }

        System.out.println("The Total Summen is " + total);


//For Loop

        int nmb;
        int total1 = 0;

        for (nmb = 1; nmb <= 100; nmb++) {
            total1 = total1 + nmb;
        }
        System.out.println("The Total summe is " + total1);

    }

}

