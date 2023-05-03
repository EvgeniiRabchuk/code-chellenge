package org.example.service.implimentation;

import org.example.service.AnagramChecker;

import java.util.HashMap;
import java.util.Map;

/**
 * Create vocabulary for both strings,
 * vocabulary is a HashMap structure
 * where Key is Character and Value - counter of particular Character in text
 * than comparing two vocabularies
 * Also array of integers can be used for vocabularies instead of Map, where index
 * of character would be char value of ASCII table
 */

public class AnagramCheckerMapsBasedImpl implements AnagramChecker {
    @Override
    public boolean checkIfAnagrams(String str1, String str2) {
        // Optimisation - if length of strings is not equal - not anagrams
        if (str1.length() != str2.length()) return false;

        // Create vocabulary of all characters from str1
        Map<Character, Integer> vocabulary1 = new HashMap<>();
        for (Character ch : str1.toCharArray()) {
            vocabulary1.merge(ch, 1, Integer::sum);
        }

        // Create vocabulary of all characters from str2
        Map<Character, Integer> vocabulary2 = new HashMap<>();
        for (Character ch : str2.toCharArray()) {
            vocabulary2.merge(ch, 1, Integer::sum);
        }

        // Result is equals of vocabularies
        return vocabulary1.equals(vocabulary2);
    }
}
