public class ForSample {

    public static void main(String[] args) {
        int sum= 0;

        for (int i=1; i<10; i++) { // 1~10 까지 반복
            sum += i;
            System.out.println(i);//더하는 수 출력
            if(i<=9) // 1~9 까지는 + 출력
                System.out.println("+");
            else { // i 가 10인 경우
                System.out.println("=");
                System.out.println(sum);
            }
        }
    }
}
