package week1;

public class FirstWeek {

    public FirstWeek() {
        System.out.println("First week examples \n");
    }

    public void test() {
        Calculator calc = new Calculator();
        System.out.print("4 + 5 = ");
        System.out.println(calc.add(4,5));
        System.out.print("10 - 2 = ");
        System.out.println(calc.subtract(10,2));
        System.out.print("Integer average of 4 and 5 = ");
        System.out.println(calc.intAverage(4,5));
        System.out.print("Double average of 4 and 5 = ");
        System.out.println(calc.doubleAverage(4,5));
        System.out.print("5 is positive? ");
        System.out.println(calc.isPositive(5));
        System.out.print("-4 is positive? ");
        System.out.println(calc.isPositive(-4));
        System.out.print("0 is positive? ");
        System.out.println(calc.isPositive(0));
        calc.printPositive(1);
        calc.printPositive(-9);
        calc.printPositive(0);
        System.out.print("100 is bigger than 2? ");
        System.out.println(calc.bigger(100, 2));
        System.out.print("5 is bigger than 5? ");
        System.out.println(calc.bigger(5, 5));
        System.out.print("1 is bigger than 20? ");
        System.out.println(calc.bigger(1, 20));
        calc.printBigger(10,2);
        calc.printBigger(0,0);
        calc.printBigger(1,3);
        System.out.print("Hypotenuse where a = 3, b = 4 is ");
        System.out.println(calc.hypotenuse(3, 4));
        calc.nestedIf(5);
        calc.nestedIf(10);
        calc.nestedIf(-2);
        calc.nestedIf(-7);
        calc.nestedIf(0);
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        System.out.print("Sum of nums = ");
        System.out.println(calc.sumAll(nums));
        System.out.print("Average of nums = ");
        System.out.println(calc.averageAll(nums));
    }
}
