// Write a method to replace all spaces in a string with '%20'
public class URLify {
    public static void main (String [] args) {

        String data = "Mr John Smith    ";
        int trueLength = 13;
        int trueIndex = trueLength - 1;
        int urlIndex = data.length() - 1;
        char [] urlData = data.toCharArray();

        for (int index = trueIndex; index >= 0; index--) {
            if (urlData [index] != ' ') {
                urlData [urlIndex] = urlData [index];
                urlIndex--;
            }

            else {
                urlData [urlIndex] = '0';
                urlData [urlIndex - 1] = '2';
                urlData [urlIndex - 2] = '%';
                urlIndex -= 3;
            }
        }

        System.out.println (String.valueOf(urlData));
    }
}
