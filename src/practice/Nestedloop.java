package practice;

public class Nestedloop {
    public static void main(String[] args) {


        // print numbers 1~5
        for (int j = 0; j <= 5; j++) {
            for (int i = 1; i <= 5; i++) {

                System.out.print(i + " ");

            }
            System.out.println();

            for (char i = 'A'; i <= 'E'; i++) {
                System.out.println(i);
                if (i == 'C') {
                    continue;
                }
                System.out.println("-------------");
                for (int k = 1; k <= 5; k++) {
                    System.out.println(k);
                    if (k == 3) {
                        continue;
                    }

                }


            }
            for (char i = 'A'; i <= 'E'; i++) {
                System.out.println(i);
                if (i == 'C') {
                    continue;
                }
                System.out.println(i);

            }
        }
    }}