package class2Assignment;

//program to find check given no is prime  or not

public class Class2_Reverse_GauravChauhan {
       public static void main(String[] args) {
        int num = 63155, revNum = 0, tempNum, lastDigit;
        while (num != 0) {
            tempNum = num / 10;
            lastDigit = num % 10;
            revNum = revNum * 10 + lastDigit;
            num = tempNum;
        }

        System.out.println("The Reverse Of A Given Number Is " + revNum);
    }

}