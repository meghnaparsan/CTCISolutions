// Question: Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structure?
import java.util.HashSet;

class IsUnique {
    public static void main (String [] args) {

        Solution solution = new Solution();
        String data = "World";

        // Using an additional Data Structure
        System.out.println("Using an additional Data Structure");
        if (solution.isUnique (data)) {
            System.out.println ("Every Character in the word " + data + " is unique");
        }
        else {
            System.out.println ("The String " + data + " contains repeated Characters");
        }

        // Without any additional Data Structure
        System.out.println("Without any additional Data Structure");
        if (solution.isUniqueFollowUp (data)) {
            System.out.println ("Every Character in the word " + data + " is unique");
        }
        else {
            System.out.println ("The String " + data + " contains repeated Characters");
        }

    }
}

class Solution {

    // Additional Data Structure
    public boolean isUnique (String data) {
        HashSet <Character> set = new HashSet<>();

        for (char token : data.toCharArray()) {
            if (set.contains(token)) {
                return false;
            }

            else {
                set.add (token);
            }
        }

        return true;
    }

    // Without using any additional Data Structure
    public boolean isUniqueFollowUp (String data) {
        for (int index = 0; index < data.length() - 1; index++) {
            for (int jIndex = index + 1; jIndex < data.length(); jIndex++) {
                if (data.charAt(index) == data.charAt(jIndex)) {
                    return false;
                }
            }
        }

        return true;
    }
}