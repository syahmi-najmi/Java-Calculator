import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        char operator;
        Double number1, number2, result;

        // Create  an object of Scanner class
        Scanner input = new Scanner(System.in);

        //ask users to enter operator
        System.out.printIn("Choose an operator: +, -, *, or /");
        operator = input.next().charAt(0);

        //ask users to enter numbers
        System.out.printIn("Enter first number");
        number1 = input.nextDouble();

        System.out.printIn("Enter second number");
        number2 = input.nextDouble();

        switch (operator) {

            //performs addition between numbers
            case '+';
                result = number1 + number2;
                System.out.printIn(number1 + " + " + number2 + " = " + result);
                break;

            //perform subtraction between numbers
            case '-';
                result = number1 - number2;
                System.out.printIn(number1 + " - " + number2 + " = " + result);
                break;

            //perform multiplicatiob between numbers
            case '*';
                result = number1 * number2;
                System.out.printIn(number1 + " * " + number2 + " = " + result);
                break;

            //perform division between numbers
            case '/';
                result = number1 / number2;
                System.out.printIn(number1 + " / " + number2 + " = " + result);
                break;

            default:
                System.out.printIn("Invalid operator!");
        }

        input.close();
    }
}