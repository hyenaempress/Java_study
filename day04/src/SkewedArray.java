public class SkewedArray {

    public static void main(String[] args) {
        int intArray[][]= new int[4][];//각 행의 래퍼런스 배열 생성
        intArray[0] = new int[3];
        intArray[1] = new int[2];
        intArray[2] = new int[3];
        intArray[3] = new int[2];

        for (int i=0; i<intArray.length; i++)
            for (int j=0; j<intArray.length; j++) //열의 대한 반복
                intArray[i][j] = (i+1)*10 +j;

            for (int i=0; i<intArray.length; i++){
                for (int j=0; j<intArray[i].length; j++)
                    System.out.println(intArray[i][j]+ " ");
                System.out.println();//다음줄로 넘어가기
            }

    }
}
