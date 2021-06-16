class StringCompression {
    public static void main (String [] args) {
        String data = "aabcccccaaa";
        StringBuilder compressedData = new StringBuilder();
        int count = 0;
        int index = 0;

        for (index = 0; index < data.length(); index++) {
            if (index != 0 && data.charAt(index) != data.charAt(index - 1)) {
                compressedData.append (data.charAt(index - 1));
                compressedData.append (count);
                count = 0;
            }

            count++;
        }

        compressedData.append (data.charAt(index - 1));
        compressedData.append (count);

        System.out.println (String.valueOf(compressedData));
    }   
}
