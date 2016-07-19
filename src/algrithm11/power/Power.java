package algrithm11.power;

/**
 * Created by Administrator on 2016/4/28.
 */

/**
 * 不考虑大数问题；
 */

public class Power {

    public static void main(String[] args) {
        Power p = new Power();
        System.out.println();
        System.out.println(p.power(2, -2));
    }


    public double power(double base, int exponent) {
        boolean isExpNegative = false;
        double result = 0.0d;
        if (exponent < 0) {
            isExpNegative = true;
            exponent = -exponent;
        }
        result = pow(base, exponent);
        if (isExpNegative) return 1/result;
        return result;
    }

    public double pow(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        }
        double result = power(base, exponent >> 1);
        result *= result;
        if ((exponent & 0x1) == 1)
            result *= base;
        return result;

    }
}
