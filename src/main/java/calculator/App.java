package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        /* 연산의 결과를 저장할 수 있도록 적합한 타입의 배열을 생성합니다. */
        /* 연산의 결과가 저장된 배열의 마지막 index를 저장하는 변수를 선언 */
        int[] intArray = new int[10]; //10개를 저장할 수 있는 배열 선언
        int index = 0; // 변수 선언
        Scanner sc = new Scanner(System.in);

        while (true) { // 혹은 for( ; ; ) 초깃값, 조건식, 증감식을 모두 생략하면 무한 루프
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
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
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
            /* 반복문 사용 해서 연산을 반복 */

            System.out.println("결과: " + result);
            /* 연산의 결과를 배열에 저장합니다. */
            /* index를 증가 시킵니다. */
            intArray[index] = result; // 순번 지정, [index] 없으면 어디 넣을지 알 수 없음, 배열[idx] = int,double,long등, 배열 = 다른배열
                                      // 배열 없이 적을 경우 intArray = {1,2,3} 이런 식으로 작성
            index++;

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exit = sc.next();
            if (exit.equals("exit")) {
                break;
                /* exit을 입력 받으면 반복 종료 */
            }
        }
    }
}