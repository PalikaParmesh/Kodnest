import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter value to convert temperature from Fahrenheit to Celsius ");
        double fahrenheit= scanner.nextDouble();
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        System.out.println(temperatureConverter.convertFahrenheitToCelsius(fahrenheit));

    }
    }
