package lab_2;

public class Matrix {
    public static void main(String[] args) {

        int[][] matr = new int[6][6];
        int n = 3;
        int k = 5;
        int indMax = matr[0][0];
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr.length; j++) {
                if (i == j) {
                    n++;
                    matr[i][j] = n;
                    if (indMax < matr[i][j]) {
                        indMax = matr[i][j];
                    }
                }
                if (i != j) {
                    //matr[i][j] = k;
                    if (matr[i][j] > 0) {
                        matr[i][j] = indMax;
                    }
                }
//                if( i != j){
//                    k--;
//                    matr[i][j]=k;
//                }
                System.out.print(matr[i][j] + "\t");
            }
            System.out.println("   ");
        }
        System.out.print(indMax);
    }


}

//найти мах число на диагонале +
// проверка на отриц числа на диагонале и заполнить им всю матрицу