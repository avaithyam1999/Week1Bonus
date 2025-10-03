package com.pluralsight;

public class MathExpressionBuilder {
    public static void main(String[] args) {
        int x = 12;
        int y = 7;
        int z = 2;
        double w = 1.8;

        double simpleCalc = x + y * z - w;
        double pemdasCalc = (x + y) * z - w;

        double difference = Math.abs(simpleCalc-pemdasCalc);


        System.out.printf("""
                === Mathematical Expression Builder ===
                Original expression: %d + %d * %d - %f
                Direct Calculation: %.2f
                
                With parentheses: (%d + %d) * %d - %f
                PEMDAS Calculation: %.2f
                
                Difference: %.2f
                
                """,x,y,z,w,simpleCalc,x,y,z,w,pemdasCalc,difference);
    }
}
