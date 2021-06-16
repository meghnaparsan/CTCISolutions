// Given a String, write a function to check if it a permutation of palindrome
// Solution -> A Palindromw would have every character with even number of count, with atmost one character with odd number of count
public class PalindromePermutation {
    public static void main (String [] args) {
        String data = "tact coa";
        char [] countArray = new char [26];

        for (char token : data.toCharArray()) {
            if (token == ' ') {
                continue;
            }

            countArray [token - 'a']++;
        }

        int oddcount = 0;
        for (int index = 0; index < 26; index++) {
            if (countArray [index] % 2 != 0) {
                oddcount++;
            }
        }

        if (oddcount <= 1) {
            System.out.println (data + " is a Palindrome permutation");
        }

        else {
            System.out.println (data + " is not a Palindrome permutation");
        }
    }
}
