package lang.print.gaps.task6;

public class FloatTypeCasting {
    public static void roundNumber(float numberToBeRounded) {
        int val = (int) Math.round(numberToBeRounded);
        System.out.println(val);
    }
    public static void main(String[] args) {
        roundNumber(3.66f);
    } 
}
