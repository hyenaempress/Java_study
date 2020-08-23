import java.util.Scanner;
import  java.util.InputMismatchException;

public class InputException {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("정수 3개 입력해 주세요");

        int sum =0 , n=0;

        for (int i=0; i<3 ; i++){
            System.out.println(i+">>>");

            try {
                n = scanner.nextInt();//정수입

            }catch (InputMismatchException e){
                System.out.println("정수가 아닙니다 다시 도전해 주세요");
                scanner.nextLine();
                i--;
                continue;
            }
            sum += n; //합하기
        }
        System.out.println("합은"+sum);
        scanner.close();
    }
}
