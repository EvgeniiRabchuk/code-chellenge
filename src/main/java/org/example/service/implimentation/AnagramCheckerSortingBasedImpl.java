package org.example.service.implimentation;

import org.example.service.AnagramChecker;

import java.util.Arrays;


/**
 * Create characters array for both strings,
 * Sort both arrays
 * Compare arrays
 */

public class AnagramCheckerSortingBasedImpl implements AnagramChecker {
    @Override
    public boolean checkIfAnagrams(String str1, String str2) {
        // Optimisation - if length of strings is not equal - not anagrams
        if (str1.length() != str2.length()) return false;

        // Create to arrays from strings
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        // Sort arrays
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        // Result is equals of arrays
        return Arrays.equals(chars1, chars2);
    }
}
