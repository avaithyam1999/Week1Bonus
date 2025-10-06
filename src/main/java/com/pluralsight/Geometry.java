package com.pluralsight;

public class Geometry {
    public static void main(String[] args) {
        double circleRadius = 5.5;
        double rectangleLength = 8.2;
        double rectangleWidth = 3.7;
        double triangleBase = 6.0;
        double triangleHeight = 4.5;

        double circleArea = Math.PI * Math.pow(circleRadius,2);
        double circleCircumference = 2 * Math.PI * circleRadius;

        double rectangleArea = rectangleLength * rectangleWidth;
        double rectanglePerimeter = 2 * (rectangleLength * rectangleWidth);

        double triangleArea = .5 * triangleBase * triangleHeight;
        double triangleHypotenuse = Math.sqrt(Math.pow(triangleBase,2) * Math.pow(triangleHeight,2));

        double totalArea = circleArea + rectangleArea + triangleArea;

        System.out.printf("""
                ===Geometry Calculator===
                
                Circle (radius: %.1f)
                Area: %.2f
                Circumference: %.2f
                
                Rectangle (%.1f x %.1f)
                Area: %.2f
                Perimeter: %.2f
                
                Right Triangle (base: %.1f, height: %.1f)
                Area: %.2f
                Hypotenuse: %.2f
                
                ===Summary===
                Total Area Calculated: %.2f
                """,circleRadius, circleArea, circleCircumference, rectangleWidth, rectangleLength, rectangleArea, rectanglePerimeter, triangleBase, triangleHeight, triangleArea, triangleHypotenuse, totalArea);
    }

}
