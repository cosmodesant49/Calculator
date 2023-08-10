import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double operation;

        System.out.println("введите первое число");
        Scanner scanner = new Scanner(System.in);
        double number1 = scanner.nextDouble();

        System.out.println("введите первое число");
        double number2 = scanner.nextDouble();

        System.out.println("выберите действие (+, -, *, /)");
        char opera   = scanner.next().charAt(0);


        switch (opera){
            case    '+' :
                System.out.println(operation=number1+number2);
            break;
            case    '-' :
                System.out.println(operation=number1-number2);
            break;
            case    '*' :
                System.out.println(operation=number1*number2);
            break;
            case    '/' :
                System.out.println(operation=number1/number2);
            break;
            default:
                System.out.println("Прогер ленивая сволчь и такое не проходил");



        }
    }
}