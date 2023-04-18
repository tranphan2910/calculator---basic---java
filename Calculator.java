import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, ans;
        char operator;
        System.out.println("Input first number: ");
        num1 = sc.nextDouble();
        System.out.println("Input second number: ");
        num2 = sc.nextDouble();

        System.out.println("Input operator");
        operator = sc.next().charAt(0);

        switch (operator){
            case '+':
                ans = num1 + num2;
                System.out.println(ans);
                break;

            case '-':
                ans = num1 - num2;
                System.out.println(ans);
                break;

            case '*':
                ans = num1 * num2;
                System.out.println(ans);
                break;

            case '/':
                if (num2 != 0){
                    ans = num1 / num2;
                    System.out.println(ans);
                }else{
                    System.out.println("Error: divide by zero");
                }
                break;

            default:
                System.out.println("Invalid operator");
                break;
        }
    }
}
