import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        try {
            Scanner sc = new Scanner(System.in);
            double arr[][] = new double[3][];
            int i, j;
            double sum = 0.00;
            arr[0] = new double[5];
            arr[1] = new double[7];
            arr[2] = new double[9];

            for (i = 0; i < arr.length; i++) {
                for (j = 0; j < arr[i].length; j++) {
                    arr[i][j] = sc.nextDouble();
                }
            }
            for (i = 0; i < arr.length; i++) {
                sum = 0.00;
                for (j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                    sum += arr[i][j];
                }
                System.out.printf("= %.2f\n", sum);
            }
        }
        catch(InputMismatchException ex){
            System.err.println("Invalid data");
        }
    }

    };

