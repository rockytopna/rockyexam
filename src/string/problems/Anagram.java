package string.problems;

import java.util.Arrays;
import java.util.BitSet;

public class Anagram {

    public static boolean checkAnagram(String str1, String str2) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".


        if (str1.length() != str2.length()) {

            return false;
        }

        if (str1.toLowerCase().equals(str2.toLowerCase())) {
            return false;

        }
        char[] chr1 = str1.toLowerCase().toCharArray();
        char[] chr2 = str2.toLowerCase().toCharArray();
        Arrays.sort(chr1);
        Arrays.sort(chr2);

        for (int i = 0; i < chr1.length; i++) {

            if (chr1[i] != chr2[i]) {
                return false;
            }

        }

        return true;

    }

    public static void main(String[] args) {

        String str1 = "MARY";
        String str2 ="ARMY";
        if (checkAnagram(str1,str2)){

            System.out.println(str1+ " and " + str2+ " is anagram");
        }
        else {

            System.out.println(str1+ "and "+ str2 + " is not anagram");
        }
    }





    }
