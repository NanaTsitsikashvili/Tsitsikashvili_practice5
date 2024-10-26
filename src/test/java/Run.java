public class Run {
    public static void main(String[] args) {
        // Testing isEven method
        System.out.println("Testing isEven method:");
        System.out.println("isEven(4): " + NumberUtils.isEven(4));
        System.out.println("isEven(7): " + NumberUtils.isEven(7));
        System.out.println();

        // Testing findLargest method
        System.out.println("Testing findLargest method:");
        System.out.println("findLargest(5, 12, 9): " + NumberUtils.findLargest(5, 12, 9));
        System.out.println();

        // Testing calculateArea method
        System.out.println("Testing calculateArea method:");
        System.out.println("calculateArea(5.5, 4.0): " + GeometryUtils.calculateArea(5.5, 4.0));
        System.out.println();

        // Testing greet methods
        System.out.println("Testing greet methods:");
        Greeter.greet();
        Greeter.greet("Alice");
        System.out.println();

        // Testing convertToCelsius method
        System.out.println("Testing convertToCelsius method:");
        System.out.println("convertToCelsius(98.6): " + TemperatureConverter.convertToCelsius(98.6));
    }
}

// Class for number-related utilities
class NumberUtils {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int findLargest(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
}

// Class for geometry-related utilities
class GeometryUtils {
    public static double calculateArea(double length, double width) {
        return length * width;
    }
}

// Class for greeting functionality
class Greeter {
    public static void greet() {
        System.out.println("Hello!");
    }

    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
}

// Class for temperature conversion
class TemperatureConverter {
    public static double convertToCelsius(double fahrenheit) {
        return (5.0/9.0) * (fahrenheit - 32);
    }
}
