package com.pluralsight;

public class TempConverter {
    public static void main(String[] args) {
        double celsius = 23.7;
        double fahrenheit = 98.6;
        double kelvin = 300.15;

        double celToFahren = (celsius * 9/5) + 32;
        double fahrenToCel = (fahrenheit - 32) * 5/9;
        double celToKelvin = celsius + 273.15;
        double kelvinToCel = kelvin - 273.15;

        System.out.printf("""
                ===Temperature Converter===
                Starting Temperature: %.1f
                
                Conversion Results:
                %.1f°C = %d°F (rounded)
                %.1f°C = %.1f (one decimal)
                %.1f°C = %.2f (two decimal)
                
                %.1f°C = %d°K (rounded)
                %.1f°C = %.1f (one decimal)
                %.1f°C = %.2f (two decimal)
                """, celsius, celsius, Math.round(celToFahren), celsius, celToFahren, celsius, celToFahren, celsius, Math.round(celToKelvin), celsius, celToKelvin, celsius, celToKelvin);

        System.out.printf("""
                ===Reverse Conversions===
                %.1f°F = %d°C (rounded)
                %.1f°K = 13°C (rounded)
                """, fahrenheit, Math.round(fahrenToCel), kelvin, kelvinToCel);
    }
}
