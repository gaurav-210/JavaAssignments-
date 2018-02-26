package class2Assignment;

//program to find check given no is prime  or not

public class Class2_PrimeNo_GauravChauhan {

    public static void main(String[] args) {

        //providing inputs and take variable flag 
        int num = 3, i = 2, flag = 0;

        while (i < (num / 2)) {
            if (num % i == 0) {
                flag = 1;
                break;
            } else {
                flag = 0;
            }
            i++;
        }
        if (flag == 0)
            System.out.println("Given No. Is Prime Number");
        else
            System.out.println("Given No. Is Composite Number");
    }


}