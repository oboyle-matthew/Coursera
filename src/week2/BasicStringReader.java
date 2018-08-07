package week2;

public class BasicStringReader {

    public BasicStringReader() {

    }

    public boolean isFirstOccurrence(String str, int index) {
        char letter = str.charAt(index);
        int firstOccurrence = str.indexOf(letter);
        if (firstOccurrence == index) {
            return true;
        } else {
            return false;
        }
    }

    public boolean hasMultipleOccurrences(String str, char c) {
        int firstIndex = str.indexOf(c);
        if (firstIndex == -1) {
            return false;
        } else {
            String subString = str.substring(firstIndex + 1);
            int secondIndex = subString.indexOf(c);
            if (secondIndex == -1) {
                return false;
            } else {
                return true;
            }
            // return secondIndex >= 0 is more concise
        }
    }

    public int countOccurrences(String str, char c) {
        int index = 0;
        int total = 0;
        String substring = str;
        while (index >= 0) {
            index = substring.indexOf(c);
            if (index >= 0) {
                substring = substring.substring(index+1);
                total += 1;
            }
        }
        return total;
    }

    public boolean startsAndEndsWith(String str, String start, String end) {
        return str.startsWith(start) && str.endsWith(end);
    }

    public boolean startsOrEndsWith(String str, String startOrEnd) {
        return str.startsWith(startOrEnd) || str.endsWith(startOrEnd);
    }

    public boolean comesBefore(String str, char first, char second) {
        int firstOccurrence = str.indexOf(first);
        int secondOccurrence = str.indexOf(second);
        return firstOccurrence < secondOccurrence;
    }

    public boolean occursNextTo(String str, char first, char second) {
        /**
         * Note: For this method, first must occur BEFORE second. Although technically they could occur next to eachother
         * if second occurs first, this is not what this method is supposed to return
         * i.e. if str = "abcabcabc" first = "a" second = "c" should return false
         */
        /**
         * Another way to do this would be to create a string of first and second, and simply check whether this string
         * appears anywhere in the word. Eg. str = "abcdef" first = "b" second = "c", simply all str.indexOf("bc") and
         * check if this is >= 0.
         */

        int index = 0;
        String substring = str;
        while (index >= 0) {
            index = substring.indexOf(first);
            if (index >= 0) {
                substring = substring.substring(index+1);
                if (substring.length() > 0 && substring.charAt(0) == second) {
                    return true;
                }
            }
        }
        return false;
    }

}
