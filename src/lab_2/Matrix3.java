package lab_2;

public class Matrix3 {
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 4, 5},
                {-4, 2, 4, 1},
                {2, 5, -6, -5},
                {-1, 7, 2, 5}};
        int indMax = arr[0][0];
        boolean bool = true;
        //найти мах число на диагонале +
        //проверка на отриц числа на диагонале и заполнить им всю матрицу
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] < 0 && i == j) {
                    bool = false;
                }

                /*if (i != j){
                    arr[i][j]= indMax;
                }*/
//                for (int k = 0; k < arr.length ; k++) {
//                    if (i != j /*&& arr[i][j] <0*/) {
//                        arr[i][j] = indMax;
//                    }
//                }

                //System.out.print(arr[i][j] + "\t");
            }
            // System.out.println(" ");

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (bool && i == j && indMax < arr[i][j]) {
                    indMax = arr[i][j];
                }
            }

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    arr[i][j] = indMax;
                }
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println(" ");
        }
        System.out.println(indMax);
    }
}
