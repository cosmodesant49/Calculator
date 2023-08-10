import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double operation;
        System.out.println("введите первое число");
        Scanner scanner1 = new Scanner(System.in);
        double number1 = scanner1.nextDouble();
        System.out.println("введите первое число");
        Scanner scanner2 = new Scanner(System.in);
        double number2 = scanner2.nextDouble();
        System.out.println("выберите действие (+, -, *, /)");
        Scanner scanner3 = new Scanner(System.in);
        char opera   = scanner3.next().charAt(0);
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


        }
    }
}