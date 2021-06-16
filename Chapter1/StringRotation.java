public class StringRotation {
    public static void main (String [] args) {
        String data1 = "waterbottle";
        String data2 = "erbottlewat";

        String combinedString = data2 + data2;

        if (combinedString.contains(data1)) {
            System.out.println (data2 + " is a rotation of " + data1);
        }

        else {
            System.out.println (data2 + " is not a rotation of " + data1);
        }
    }
}
