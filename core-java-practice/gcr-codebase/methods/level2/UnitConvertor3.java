import java.util.Scanner;

public class UnitConvertor3 {

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKg(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKgToPounds(double kg) {
        return kg * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Fahrenheit: ");
        double f = sc.nextDouble();
        System.out.println(f + " F = " + convertFahrenheitToCelsius(f) + " C");

        System.out.print("Enter Celsius: ");
        double c = sc.nextDouble();
        System.out.println(c + " C = " + convertCelsiusToFahrenheit(c) + " F");

        System.out.print("Enter pounds: ");
        double pounds = sc.nextDouble();
        System.out.println(pounds + " lbs = " + convertPoundsToKg(pounds) + " kg");

        System.out.print("Enter kilograms: ");
        double kg = sc.nextDouble();
        System.out.println(kg + " kg = " + convertKgToPounds(kg) + " lbs");

        System.out.print("Enter gallons: ");
        double gallons = sc.nextDouble();
        System.out.println(gallons + " gal = " + convertGallonsToLiters(gallons) + " L");

        System.out.print("Enter liters: ");
        double liters = sc.nextDouble();
        System.out.println(liters + " L = " + convertLitersToGallons(liters) + " gal");

        sc.close();
    }
}
