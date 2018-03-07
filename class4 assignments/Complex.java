package class4_Assignments;

import java.util.Scanner;

public class Complex {

    int real;
    int imaginary;

    Complex(int x, int y) {
        real = x;
        imaginary = y;
    }
    public void Display(Complex C1) {
        System.out.print("Answer is :");
        System.out.print(C1.real + "+" + C1.imaginary + "i");
    }
    public void plus(Complex C2) {
        Complex C1 = new Complex(real, imaginary);
        C1.real = real + C2.real;
        C1.imaginary = imaginary + C2.imaginary;
        Display(C1);
    }
    public void minus(Complex C2) {
        Complex C1 = new Complex(real, imaginary);
        C1.real = C1.real - C2.real;
        C1.imaginary = C1.imaginary - C2.imaginary;
        Display(C1);
    }
    public void multiply(Complex C2) {
        Complex C1 = new Complex(real, imaginary);
        Complex C3 = new Complex(real, imaginary);
        C3.real = C1.real * C2.real - (C1.imaginary * C2.imaginary);
        C3.imaginary = C1.real * C2.imaginary + C2.real * C1.imaginary;
        Display(C3);
    }
    public static void main(String[] args) {
        int a, b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the First Complex Number");
        a = scan.nextInt();
        b = scan.nextInt();
        Complex C1 = new Complex(a, b);
        System.out.println("Enter the Second Complex Number");
        a = scan.nextInt();
        b = scan.nextInt();
        Complex C2 = new Complex(a, b);
        System.out.println("Choose one out of the following Operations");
        System.out.println("1 Addition \n 2 Subtraction \n 3 Multiplication ");
        b = scan.nextInt();
        switch (b) {
            case 1: //Addition
                C1.plus(C2);
                break;
            case 2: //Subtraction
                C1.minus(C2);
                break;
            case 3: //Multiplication
                C1.multiply(C2);
                break;
        }
    }
}