class Greet {
    public static void main(String[] args) {
        greet();
        greet("Alice");
    }

    static void greet() {
        System.out.println("Hello!");
    }

    static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
}