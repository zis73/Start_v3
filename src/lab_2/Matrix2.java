package lab_2;

public class Matrix2 {
    public static void main(String[] args) {

        int[][] matr = new int[6][6];
        int n = 1;
        int indMax = matr[0][0];
        int[][] superArr = {{0, 3, 4, 5},
                {1, 2, -9, 7},
                {1, 2, -9, 7},
                {1, 2, -9, 7}};

        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr.length; j++) {
                if (i == j) {
                    n++;
                    matr[i][j] = n;

                }
                if (matr[i][j] > 0 && matr[i][j] > indMax) {
                    int zamena = 0;
                    indMax = matr[i][j];
                    matr[i][j] = zamena;
                    indMax = zamena;
                }
                System.out.print(matr[i][j] + "\t");
            }
            System.out.println(" ");
        }
        System.out.println(indMax);
    }
//    boolean bool = true;
//    for(int i = 0, arr.lamgth, i++)
//
//    {
//        for (int j = 0, arr.lamgth, i++){
//            if(att[i][j] <0 && i==j)
//                bool = false;
//    }
//    }

}



