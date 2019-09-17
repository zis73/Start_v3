package lab_4;

import java.util.Scanner;

public class TicTacToe {
    public static String tochka = ".";
    public static String cross = "x";
    public static String circle = "o";
    public static int turn = 0;
    public static String[][] arr = new String[3][3];
//int a = 0;

    public static void main(String[] args) {

        System.out.println("Добро пожаловать в Крестики-Нолики");
        StartField();
        CheckMove();
        while (true) {
            Player();
        }
    }

    public static void StartField() {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = tochka;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void UpdateField(int a, int b, String symbol) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("-------");
        CheckWin(circle);
        CheckWin(cross);
    }

    public static void Player() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Выбери первый индекс:");
        int a = scan.nextInt();
        if (a > 2 || a < 0) {
            System.out.println("Введите первое число от 0 до 2:");
            a = scan.nextInt();
        }

        System.out.print("Выбери второй индекс:");
        int b = scan.nextInt();
        if (b > 2 || b < 0) {
            System.out.println("Введите второе число от 0 до 2:");
            b = scan.nextInt();
        }
        if (arr[a][b] != tochka) {
            System.out.println("Индекс занят, введите другие");
            System.out.println("Введите первое число от 0 до 2:");
            a = scan.nextInt();
            System.out.println("Введите второе число от 0 до 2:");
            b = scan.nextInt();
        }
        if (arr[a][b] == tochka) {
            arr[a][b] = cross;
            UpdateField(a, b, cross);
            CheckMove();
        }
    }

    public static void Comp() {
//Random rand = new Random();
        int x = (int) (Math.random() * 3);
        int y = (int) (Math.random() * 3);
        if (arr[x][y].equals(tochka)) {
            arr[x][y] = circle;
            UpdateField(x, y, circle);
            CheckMove();
        } else {
            Comp();
        }
    }


    public static void CheckMove() {
        if (turn == 0) {
            turn++;
            Player();
        } else {
            turn--;
            Comp();
        }

    }

    public static void CheckWin(String elem) {
        if ((arr[0][0] == elem && arr[0][1] == elem && arr[0][2] == elem) ||
                (arr[1][0] == elem && arr[1][1] == elem && arr[1][2] == elem) ||
                (arr[2][0] == elem && arr[2][1] == elem && arr[2][2] == elem) ||
                (arr[0][0] == elem && arr[1][0] == elem && arr[2][0] == elem) ||
                (arr[0][1] == elem && arr[1][1] == elem && arr[2][1] == elem) ||
                (arr[0][2] == elem && arr[1][2] == elem && arr[2][2] == elem) ||
                (arr[0][0] == elem && arr[1][1] == elem && arr[2][2] == elem) ||
                (arr[0][2] == elem && arr[1][1] == elem && arr[2][0] == elem)) {
            System.out.println("Победили " + elem);
            System.exit(69);
        } else {
            int draw = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i][j] != tochka) {
                        draw++;
                    }
                }

            }

            if (draw == 9) {
                System.out.println("Ничья");
                System.exit(69);
            }
        }
    }

}