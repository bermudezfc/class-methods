public class App {
    public static void main(String[] args) throws Exception {

        App myApp = new App();



        // Non-static method call
        myApp.showHelloJava();

        // Static method call
        showHelloWorld();

        // Non-static method call with parameter
        
        myApp.showName("Elizer");

        // Static method call with parameter
        showAge(20);

        // Static method call with two parameters
        showNameAndAge("Elizer", 20);

        // Non-static method call with two parameters that returns an int
        int total = myApp.add(1, 1);
        System.out.println(total);

        // Static method call with two parameters that returns an int
        int difference = subtract(1, 1);
        System.out.println(difference);

        // Static multiplication method call

        int multiplication = multiplication(2, 2);
        System.out.println(multiplication);

        // Static Division method call

        int division = division(2, 2);
        System.out.println(division);

        boolean equal = equal(2, 2);
        System.out.println(equal);

        boolean greater = greater(2, 5);
        System.out.println(greater);


    }

    // Non-static method
    void showHelloJava() {
        System.out.println("Hello Java! This is a non-static method.");
    }

    // Static method
    static void showHelloWorld() {
        System.out.println("Hello World! This is a static method.");
    }

    // Non-static method with a parameter
    void showName(String name) {
        System.out.println("My name is " + name);
    }

    // Static method with a parameter
    static void showAge(int age) {
        System.out.println("My age is " + age);
    }

    // Static method with two parameters
    static void showNameAndAge(String name, int age) {
        System.out.println("Hello: " + name);
        System.out.println("You are : " + age + " years old!");
    }

    // Non-static method with two parameters with a return type
    int add(int x, int y) {
        int z = x + y;
        return z;
    }

    // Static method with two parameters with a return type
    static int subtract(int x, int y) {
        int z = x - y;
        return z;
    }

    static int multiplication(int x, int y) {
        int z = x * y;
        return z;
    }

    static int division(int x, int y) {
        int z = x / y;
        return z;
    }

    static boolean equal(int x, int y) {
        boolean z = x == y;
        return z;
    }

    static boolean greater(int x, int y) {
        boolean z = x > y;
        return z;
    }


    
        
    
}
