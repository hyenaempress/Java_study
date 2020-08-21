import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        char grade;
        Scanner scanner = new Scanner(System.in);

        System.out.println("점수를 입력하시요 1-100");
        int score = scanner.nextInt(); //점수읽기
        if(score >= 90) //score 가 90 이상
            grade ='a';
        else if(score >= 80) //
            grade ='b';

        else if(score >= 70) //
            grade ='c';

        else if(score >= 60) //
            grade ='d';

        else if(score >= 50) //
            grade ='e';
        else //
            grade ='f';
        System.out.println("학점은"+grade+"입니다.");
        scanner.close();
    }
}
