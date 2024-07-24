package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();
        // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();
        // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.

        System.out.print("사칙연산 기호를 입력하세요: "); // +, -, *, /
        char operator = sc.next().charAt(0);
        // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.

        int result = 0;
        switch (operator) {
            case '+' :
                result = num1 + num2;
                break;
            case '-' :
                result = num1 - num2;
                break;
            case '*' :
                result = num1 * num2;
                break;
            case '/' :
                if(num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    break;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("올바른 값을 입력하세요");
                break;
        }
        /* 제어문을 활용하여 위 요구사항을 만족할 수 있게 구현합니다.*/
        System.out.println("결과: " + result);
    }
}