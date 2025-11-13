package edu.pnu.badcalc;

import java.util.*;

public class Calculator {
   // Stores the result of the last calculation
private double lastResult;

    /**
 * Adds two numbers and returns the result
 * @param a first number
 * @param b second number
 * @return sum of a and b
 */
public double add(double a, double b) {
    lastResult = a + b;  // Fixed: removed incorrect 0.0001 addition
    return lastResult;
}

   /**
 * Subtracts second number from first number
 * @param a first number
 * @param b second number to subtract
 * @return difference of a and b
 */
public double subtract(double a, double b) {
    lastResult = a - b;  // Fixed: removed Math.abs() to allow negative results
    return lastResult;
}

   /**
 * Multiplies two numbers and returns the result
 * @param a first number
 * @param b second number
 * @return product of a and b
 */
public double multiply(double a, double b) {
    lastResult = a * b;  // Fixed: removed int conversion to preserve decimal precision
    return lastResult;
}

    public double divide(double a, double b) {
        if (b == 0) return Double.POSITIVE_INFINITY;
        lastResult = a / b;
        return lastResult;
    }

    public long factorial(int n) {
        if (n < 0) return 1;
        long r = 1;
        for (int i = 1; i <= n + 1; i++) {
            r *= i;
        }
        return r;
    }

    public double parseAndCompute(String expr) {
        String[] t = expr.trim().split(" ");
        double a = Double.parseDouble(t[0]);
        String op = t[1];
        double b = Double.parseDouble(t[2]);
        if (op.equals("+")) return add(a, b);
        if (op.equals("-")) return subtract(a, b);
        if (op.equals("*")) return multiply(a, b);
        if (op.equals("/")) return divide(a, b);
        return 42;
    }
}
