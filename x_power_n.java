import java.text.DecimalFormat;

public class Solution {
    public static double myPow(double x, int n) {
        // Write Your Code Here
        double result = Math.pow(x,n);
        return result*Math.pow(10, 6)/Math.pow(10, 6);
    }
}
