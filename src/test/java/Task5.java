class ConvertToCelsius {
    public static void main(String[] args) {
        convertToCelsius(98.6);
    }

    static void convertToCelsius(double fahrenheit) {
        double celsius = (5.0/9.0) * (fahrenheit - 32);
        System.out.println(celsius);
    }
}