package class2Assignment;

//program to find check given no is palindrome or not

public class Class2_Palindrome_GauravChauhan {

    //program begins with call to main

    public static void main(String[] args) {

        int num = 1111, revNum = 0, tempNum, lastDigit, orig;
        orig = num;
        while (num != 0) {
            tempNum = num / 10;
            lastDigit = num % 10;
            revNum = revNum * 10 + lastDigit;
            num = tempNum;
        }
        if (orig == revNum)
            System.out.println("Given no. is Palindrome");
        else
            System.out.println("Given no is not Palindrome");
    }

}