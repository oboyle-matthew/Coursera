package week2;

public class SecondWeek {

    public SecondWeek() {
        System.out.println("Second week examples \n");
    }

    public void test() {
        BasicStringReader bsr = new BasicStringReader();
        String s1 = "abcabcabcabc";
        String s2 = "aaaaaa";
        String s3 = "abc";
        String s4 = "abcdefghijklmnopqrstuvwxyz";
        isFirstOccurrenceTest(bsr, s1, s2, s3, s4);
        multipleOccurrenceTest(bsr, s1, s2, s3, s4);
        countOccurrencesTest(bsr, s1, s2, s3, s4);
        startsOrEndsWithTest(bsr, s1, s2, s3, s4);
        comesBeforeTest(bsr, s1, s2, s3, s4);
        occursNextToTest(bsr, s1, s2, s3, s4);

    }

    private void multipleOccurrenceTest(BasicStringReader bsr, String s1, String s2, String s3, String s4) {
        System.out.print(s1 + "has multiple Occurrences of c? ");
        System.out.println(bsr.hasMultipleOccurrences(s1, 'c'));
        System.out.print(s2 + "has multiple Occurrences of c? ");
        System.out.println(bsr.hasMultipleOccurrences(s2, 'c'));
        System.out.print(s2 + "has multiple Occurrences of a? ");
        System.out.println(bsr.hasMultipleOccurrences(s2, 'a'));
        System.out.print(s3 + "has multiple Occurrences of c? ");
        System.out.println(bsr.hasMultipleOccurrences(s3, 'c'));
        System.out.print(s4 + "has multiple Occurrences of c? ");
        System.out.println(bsr.hasMultipleOccurrences(s4, 'c'));
    }

    private void isFirstOccurrenceTest(BasicStringReader bsr, String s1, String s2, String s3, String s4) {
        System.out.print("Index 1 is first Occurrence of the letter in string " + s1 + "? ");
        System.out.println(bsr.isFirstOccurrence(s1, 1));
        System.out.print("Index 5 is first Occurrence of the letter in string " + s1 + "? ");
        System.out.println(bsr.isFirstOccurrence(s1, 5));
        System.out.print("Index 1 is first Occurrence of the letter in string " + s2 + "? ");
        System.out.println(bsr.isFirstOccurrence(s2, 1));
        System.out.print("Index 18 is first Occurrence of the letter in string " + s4 + "? ");
        System.out.println(bsr.isFirstOccurrence(s4, 18));
    }

    private void countOccurrencesTest(BasicStringReader bsr, String s1, String s2, String s3, String s4) {
        System.out.print("Counting Occurrences of c in " + s1 + ": ");
        System.out.println(bsr.countOccurrences(s1, 'c'));
        System.out.print("Counting Occurrences of c in " + s2 + ": ");
        System.out.println(bsr.countOccurrences(s2, 'c'));
        System.out.print("Counting Occurrences of a in " + s2 + ": ");
        System.out.println(bsr.countOccurrences(s2, 'a'));
        System.out.print("Counting Occurrences of j in " + s3 + ": ");
        System.out.println(bsr.countOccurrences(s3, 'j'));
        System.out.print("Counting Occurrences of j in " + s4 + ": ");
        System.out.println(bsr.countOccurrences(s4, 'j'));
    }

    private void startsOrEndsWithTest(BasicStringReader bsr, String s1, String s2, String s3, String s4) {
        String start1 = "abc";
        String start2 = "aa";
        String start3 = "zzzzzzz";
        String end1 = "abc";
        String end2 = "yz";
        String end3 = "fsdj";
        System.out.print(s1 + " starts with " + start1 + " AND ends with " + end1 + "? ");
        System.out.println(bsr.startsAndEndsWith(s1, start1, end1));
        System.out.print(s2 + " starts with " + start2 + " AND ends with " + end1 + "? ");
        System.out.println(bsr.startsAndEndsWith(s2, start2, end1));
        System.out.print(s3 + " starts with " + start1 + " AND ends with " + end1 + "? ");
        System.out.println(bsr.startsAndEndsWith(s3, start1, end1));
        System.out.print(s4 + " starts with " + start1 + " AND ends with " + end2 + "? ");
        System.out.println(bsr.startsAndEndsWith(s2, start1, end1));
        System.out.print(s1 + " starts with " + start1 + " AND ends with " + end3 + "? ");
        System.out.println(bsr.startsAndEndsWith(s1, start1, end3));
        System.out.print(s4 + " starts with " + start3 + " AND ends with " + end2 + "? ");
        System.out.println(bsr.startsAndEndsWith(s4, start3, end2));

        System.out.print(s1 + " starts OR ends with " + start1 + "? ");
        System.out.println(bsr.startsOrEndsWith(s1, start1));
        System.out.print(s2 + " starts OR ends with " + end2 + "? ");
        System.out.println(bsr.startsOrEndsWith(s2, end2));
        System.out.print(s3 + " starts OR ends with " + start2 + "? ");
        System.out.println(bsr.startsOrEndsWith(s3, start2));
        System.out.print(s4 + " starts OR ends with " + end2 + "? ");
        System.out.println(bsr.startsOrEndsWith(s4, end2));
        System.out.print(s1 + " starts OR ends with " + end3 + "? ");
        System.out.println(bsr.startsOrEndsWith(s1, end3));
    }

    private void comesBeforeTest(BasicStringReader bsr, String s1, String s2, String s3, String s4) {
        System.out.print("a comes before c in " + s1 + "? ");
        System.out.println(bsr.comesBefore(s1, 'a', 'c'));
        System.out.print("c comes before b in " + s1 + "? ");
        System.out.println(bsr.comesBefore(s1, 'c', 'b'));
        System.out.print("l comes before t in " + s4 + "? ");
        System.out.println(bsr.comesBefore(s4, 'l', 't'));
        System.out.print("z comes before r in " + s1 + "? ");
        System.out.println(bsr.comesBefore(s4, 'z', 'r'));
    }

    private void occursNextToTest(BasicStringReader bsr, String s1, String s2, String s3, String s4) {
        System.out.print("a occurs one space before c in " + s1 + "? ");
        System.out.println(bsr.occursNextTo(s1, 'a', 'c'));
        System.out.print("c occurs one space before a in " + s1 + "? ");
        System.out.println(bsr.occursNextTo(s1, 'c', 'a'));
        System.out.print("r occurs one space before s in " + s4 + "? ");
        System.out.println(bsr.occursNextTo(s4, 'r', 's'));
        System.out.print("a occurs one space before a in " + s1 + "? ");
        System.out.println(bsr.occursNextTo(s2, 'a', 'a'));
        System.out.print("b occurs one space before c in " + s3 + "? ");
        System.out.println(bsr.occursNextTo(s3, 'b', 'c'));
        System.out.print("l occurs one space before n in " + s4 + "? ");
        System.out.println(bsr.occursNextTo(s4, 'l', 'n'));
    }
}