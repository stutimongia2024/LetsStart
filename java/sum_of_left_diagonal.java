import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        try {
            double sum=0.0;
            Scanner sc = new Scanner(System.in);
            double arr[][] = new double[4][4];
            int i,j;

            for (i = 0; i < arr.length; i++) {
                for (j = 0; j < arr[i].length; j++) {
                    arr[i][j] = sc.nextDouble();
                }
            }
            for (i = 0; i < arr.length; i++) {
                for (j = 0; j < arr[i].length; j++) {
                    if(i==j){
                        sum+=arr[i][j];
                    }
                }

            } System.out.printf("Sum of diagonal elements = %.2f\n", sum);
        }
        catch(InputMismatchException ex){
            System.err.println("Invalid data");
        }
    }

    };

