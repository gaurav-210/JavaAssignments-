package class2Assignment;

//program to find largest no of given no

public class Class2_Biggest_GauravChauhan {

    //programs begins with call to main

    public static void main(String[] args) {

        int num1 = 120, num2 = 110, num3 = 200;
        if (num1 > num2 && num1 > num3)
            System.out.println(num1 + " is the largest number");
        else if (num2 > num1 && num2 > num3)
            System.out.println(num2 + " is the largest number");
        else
            System.out.println(num3 + " is the largest number");


    }

}