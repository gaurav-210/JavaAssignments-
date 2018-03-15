package class9_Assignments;

public class substring {



    public static void main(String[] args) {
        int n, count = 0, a;
        String x = "abcd";
        String str1 = "XYZ";
        char str2[] = str1.toCharArray();

        double length = str1.length();
        int lengths = (int) Math.pow(2, length);


        for (int i = 1; i < lengths; i++) {
            n = i;

            String binaryString = Integer.toBinaryString(n);
            x = binaryString;

            if (binaryString.length() != str1.length()) {
                while (x.length() != str1.length()) {
                    x = "0" + x;
                }
            }
            char ch[] = x.toCharArray();

            for (int j = 0; j < str1.length(); j++) {
                if (ch[j] == '1')
                    System.out.print(" " + str2[j]);

            }
            System.out.println(" ");

        }


    }


}






//Algorihtm - Gaurav Chauhan

//(1) Calculate total number of subsets of n elements = 2^n (store it as lengths)

//(2) Generate decimal numbers from 1 to lengths

//    for each decimal number:
//        Convert it to n bit binary (length of given string (assuming all charcters are unique))
//        Store each binary in a string
//        Convert each string to a character array.
//            for each element position in above character array:
//                    if(element=='1')
//                        print character in string at that position.
//
//
//a   b    c    d
//0   0    1    0
//--> c is present and all others are absent
//
//0   1   1     1
//--> b and c are present and all others are absent
//*/
//
//