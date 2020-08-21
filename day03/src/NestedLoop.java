public class NestedLoop {
    public static void main(String[] args) {
        for (int i=1; i<10; i++) { //각단의 구구셈 출력
        for (int j=1; j<10; j++)  {
            System.out.println(i+"*"+j+"="+i*j);
            System.out.println('\t');
        }
            System.out.println();//
        }
    }
}
