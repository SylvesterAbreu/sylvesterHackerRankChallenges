package net.sylvestertech.java.easy.algorythms.strings;

import java.util.ArrayList;
import java.util.List;

public class TwoStrings {
    public static int haveCommonSubStrings(final String firstString, final String secondString) {
        final List<Character> commonSubStringsList = new ArrayList<>();
        int commonSubStrings = 0;

        for (int i = 0; i < firstString.length(); i++) {
            final char currentSubString = firstString.charAt(i);

            if (itIsCommonSubString(secondString, commonSubStringsList, currentSubString)) {
                commonSubStrings++;
                commonSubStringsList.add(currentSubString);
            }
        }
        return commonSubStrings;
    }

    private static boolean itIsCommonSubString(String secondString, List<Character> commonSubStringsList, char currentSubString) {
        return containsCurrentSubString(secondString, currentSubString) && !commonSubStringsList.contains(currentSubString);
    }

    private static boolean containsCurrentSubString(String second, char currentSubString) {
        return second.indexOf(currentSubString) > -1;
    }
}
