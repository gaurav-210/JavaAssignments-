package class9_Assignments;

public class VowelsRemoval {

    public static void main(String args[]) {

        String str1 = "Hello I'm Gaurav Chauhan ";

        char ch2[] = new char[str1.length()];
        int j = 0, k = 0;
        for (int i = 0; i < str1.length(); i++) {
            char temp = str1.charAt(j);
            if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u') {
                j++;
            } else {
                ch2[k] = str1.charAt(j);
                j++;
                k++;
            }
        }
        String str2 = new String(ch2); // converting char array to string;

        System.out.println("String without vowel is " + str2);

    }
}