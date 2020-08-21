
public class foreachEx {

    enum Week {월, 화, 수, 목, 금, 토,일}


    public static void main(String[] args) {
        int[] n = {1,2,3,4,5};
        String names[] = {"사과","배","바나나","체리","딸기","포도"};

        int sum =0;

        for (int k : n) {
            System.out.println(k+" "); //반복되는 수 k 값 출력
            sum += k;
        }
        System.out.println("합은"+sum);

        //아래 for

        for (String s : names)
            System.out.println(s+" ");
        System.out.println();

        //요일 반복

        for (Week day : Week.values())
            System.out.println(day + "요일");
        System.out.println();

    }

}
