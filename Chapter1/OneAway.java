// Given two strings, write a function to check if they are one edit or zero edits away
public class OneAway {
    public static void main (String [] args) {
        String data1 = "pale";
        String data2 = "bake";

        if (Math.abs (data1.length() - data2.length()) > 1) {
            System.out.println(data1 + " and " + data2 + " are not one edit/zero edits away");
            return;
        }

        String shortString = data1.length() < data2.length() ? data1 : data2;
        String longString = data1.length() < data2.length() ? data2 : data1;
        
        int index1 = 0;
        int index2 = 0;
        boolean foundDifference = false;

        while (index1 < shortString.length() && index2 < longString.length()) {
            if (shortString.charAt(index1) != longString.charAt(index2)) {

                if (foundDifference) {
                    System.out.println(data1 + " and " + data2 + " are not one edit/zero edits away");
                    return;
                }

                foundDifference = true;
                if (shortString.length() == longString.length()) {
                    index1++;
                }
            }

            else {
                index1++;
            }

            index2++;
        }

        System.out.println(data1 + " and " + data2 + " are one edit/zero edits away");
    }
}
