package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int first = number % 10;
        int second = (number % 100 - first) / 10;
        int third = number / 100;
        System.out.println("" + first + second + third);
    }
}
