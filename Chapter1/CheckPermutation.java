// Given two strings, write a method to decide if one is a permutation of the other
public class CheckPermutation {
    public static void main (String [] args) {
        String data1 = "hello";
        String data2 = "ollhe";

        char [] array1 = new char [26];
        char [] array2 = new char [26];

        if (data1.length() != data2.length()) {
            System.out.println (data1 + " is not a permutation of " + data2);
        }

        else {
            boolean flag = false;

            for (char token : data1.toCharArray()) {
                array1 [token - 'a']++;
            }
    
            for (char token : data2.toCharArray()) {
                array2 [token -'a']++;
            }

            for (int index = 0; index < 26; index++) {
                if (array1 [index] != array2 [index]) {
                    System.out.println (data1 + " is not a permutation of " + data2);
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                System.out.println (data1 + " is a permutation of " + data2);
            }
        }
    }   
}
