package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int four = number % 10;
        int third = (number % 100 - four) / 10;
        int second = (number % 1000 - (third * 10 + four)) / 100;
        int first = number / 1000;
        System.out.println(first + second + third + four);
    }
}
