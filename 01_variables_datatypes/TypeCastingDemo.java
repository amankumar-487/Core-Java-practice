package variables_datatypes;

public class TypeCastingDemo {
    public static void main(String[] args) {
        // Implicit Type Casting --> Widening

        char ch = 'A';
        int num = ch;

        System.out.println(num); // output: 65 --> ASCII value

        // Explicit Type Casting --> Narrowing

        double marks = 67.24;
        int number = (int)marks;

        System.out.println(number); // output: 67
    }
}
