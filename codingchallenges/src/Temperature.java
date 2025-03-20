public class Temperature {
    public static void convertCelsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }

    public static void convertFahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Temperature in Celsius: " + celsius);
    }

    public static void main(String[] args) {
        
        double celsius = 37;
        double fahrenheit = 98.6;

        convertFahrenheitToCelsius(fahrenheit);
        convertCelsiusToFahrenheit(celsius);

            
        }
    
        
    
}
