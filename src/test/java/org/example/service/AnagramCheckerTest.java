package org.example.service;


import org.example.service.implimentation.AnagramCheckerMapsBasedImpl;
import org.example.service.implimentation.AnagramCheckerSortingBasedImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnagramCheckerTest {
    private final String str1 = "a bc";
    private final String str2 = "cb a";
    private final String str3 = "ca a";
    @Test
    public void test_MapsBased_Algo_positive_result() {
        AnagramChecker ach = new AnagramCheckerMapsBasedImpl();
        Assertions.assertEquals(true, ach.checkIfAnagrams(str1, str2));
    }

    @Test
    public void test_MapsBased_Algo_negative_result() {
        AnagramChecker ach = new AnagramCheckerMapsBasedImpl();
        Assertions.assertEquals(false, ach.checkIfAnagrams(str1, str3));
    }

    @Test
    public void test_SortingBased_Algo_positive_result() {
        AnagramChecker ach = new AnagramCheckerSortingBasedImpl();
        Assertions.assertEquals(true, ach.checkIfAnagrams(str1, str2));
    }

    @Test
    public void test_SortingBased_Algo_negative_result() {
        AnagramChecker ach = new AnagramCheckerSortingBasedImpl();
        Assertions.assertEquals(false, ach.checkIfAnagrams(str1, str3));
    }

}
