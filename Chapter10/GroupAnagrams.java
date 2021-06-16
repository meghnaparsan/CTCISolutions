// Write a method to sort an array of strings so that all the anagram are next to each other 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public static void main (String [] args) {
        String [] words = {"eat","tea","tan","ate","nat","bat"};
        System.out.println ("Grouped Anagrams: " + groupAnagrams(words));
    }

    private static List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, ArrayList <String>> sortedMap = new HashMap <>();
        
        for (String word : strs) {
            char [] tokens = word.toCharArray();
            Arrays.sort (tokens);
            String sortedWord = String.valueOf (tokens);
            
            if (!sortedMap.containsKey (sortedWord)) {
                sortedMap.put (sortedWord, new ArrayList <>());
            }
            
            sortedMap.get (sortedWord).add (word);
        }
        
        List <List <String>> result = new ArrayList <>();
        for (Map.Entry <String, ArrayList <String>> words : sortedMap.entrySet()) {
            result.add (words.getValue());
        }
        
        return result;
    }
}
