package week1;

public class Calculator {

    public Calculator() {

    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int intAverage(int a, int b) {
        return add(a,b) / 2;
    }

    public double doubleAverage(int a, int b) {
        return ((double) add(a,b)) / 2;
    }

    public boolean isPositive(int x) {
        if (x > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void printPositive(int x) {
        if (x > 0) {
            System.out.println(x + " is greater than 0");
        } else if (x == 0) {
            System.out.println(x + " equals 0");
        } else {
            System.out.println(x + " is less than 0");
        }
    }

    public boolean bigger(int a, int b) {
        if (a > b) {
            return true;
        } else {
            return false;
        }
    }

    public void printBigger(int a, int b) {
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else if (a == b) {
            System.out.println(a + " equals " + b);
        } else {
            System.out.println(a + " is less than " + b);
        }
    }

    public double hypotenuse(int a, int b) {
        double hSquared = Math.pow(a,2) + Math.pow(b,2);
        return Math.sqrt(hSquared);
    }

    public void nestedIf(int x) {
        /**
         * First find whether number is positive or negative. Then find if it's odd or even.
         * Special case for 0, just print "Number was 0"
         */
        if (x == 0) {
            System.out.println(x + " is 0");
            return;
            //Need the return so 0 doesn't return negative and odd. Could also put the remaining code in an else statement
        }
        if (x > 0) {
            if (x % 2 == 0) {
                System.out.println(x + " is positive and even");
            } else {
                System.out.println(x + " is positive and odd");
            }
        } else {
            if (x % 2 == 0) {
                System.out.println(x + " is negative and even");
            } else {
                System.out.println(x + " is negative and odd");
            }
        }
    }

    /**
     * These next 2 may be too difficult, in week 1 they haven't really learned about arrays, but I found it hard to
     * create an example with a for loop without an array
     */

    public int sumAll(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        return total;
    }

    public double averageAll(int[] nums) {
        double sum = sumAll(nums);
        //Implicit conversion above from int to double. Double needed to give the remainder
        int len = nums.length;
        return sum / len;

    }

}
