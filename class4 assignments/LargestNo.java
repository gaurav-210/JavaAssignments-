package class4_Assignments;
import java.util.Scanner;

public class LargestNo {
    public static void main(String[] args) {
        System.out.println("Enter any 10 numbers ");
        Scanner scan = new Scanner(System.in);
        int arr[] = { 0,0,0,0,0,0,0,0,0,0};
        int i, temp;
        for (i = 0; i < 10; i++)
            arr[i] = scan.nextInt();
        int max_index = 0;
        for (i = 0; i < 10; i++) {
            if (arr[i] > arr[max_index])
                max_index = i;
            if (i == 9) {
                // this will shift the largest element to arr[0]
                temp = arr[max_index];
                arr[max_index] = arr[0];
                arr[0] = temp;
            }
            //now search largest element from arr[ 1 to 9] this will give second largest as arr[0] is the largest(first)
            max_index = 1;
            for (i = 1; i < 10; i++) {
                if (arr[i] > arr[max_index])
                    max_index = i;
            }
            System.out.println(" " + arr[max_index]);
        }
    }
}