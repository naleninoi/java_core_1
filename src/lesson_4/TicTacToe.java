package lesson_4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static void startGame() {

        char[][] field = generateEmptyField();
        drawField(field);
        while (true) {
            doPlayerMove(field);
            drawField(field);
            if (isWinner(field, 'X')) {
                System.out.println("Congratulations! You're the winner!");
                break;
            }
            if (isDraw(field)) {
                System.out.println("Draw! Nobody wins.");
                break;
            }
            doAIMove(field);
            drawField(field);
            if (isWinner(field, '0')) {
                System.out.println("Sorry, you've lost :(");
                break;
            }
        }
    }

    private static char[][] generateEmptyField() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please set the field's size: ");
        int size = scanner.nextInt();
        char[][] field = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                field[i][j] = '-';
            }
        }
    return field;
    }

    private static void drawField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void doPlayerMove(char[][] field) {
        int h, v;
        do {
            System.out.println("Make your move!");
            h = getCoordinate(field.length, 'h');
            v = getCoordinate(field.length, 'v');
        } while (isOccupiedCell(field, h, v));
        field[h][v] = 'X';
    }

    private static int getCoordinate(int length, char symbol) {
        Scanner scanner = new Scanner(System.in);
        int coordinate;
        do {
            System.out.printf("Please input %s value: ", symbol);
            coordinate = scanner.nextInt() - 1;
        } while (coordinate < 0 || coordinate >= length);
        return coordinate;
    }

    private static void doAIMove(char[][] field) {
        Random random = new Random();
        int h, v;
        do {
            h = random.nextInt(3);
            v = random.nextInt(3);
        } while (isOccupiedCell(field, h, v));
        field[h][v] = '0';
    }

    private static boolean isOccupiedCell(char[][] field, int h, int v) {
        return field[h][v] != '-';
    }

    private static boolean isFreeCell(char[][] field, int h, int v) {
        return !isOccupiedCell(field, h, v);
    }

    private static boolean isWinner(char[][] field, char symbol) {
        /**
         * Для поля 3х3 победа - 3 символа в ряд
         * Для поля 5х5 победа - 4 символа в ряд
         */
        int toWin = (field.length > 3) ? field.length - 1 : field.length;
        int counterMDia = 0;
        int counterSDia = 0;
        for (int i = 0; i < field.length; i++) {
            int counterH = 0;
            int counterV = 0;
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == symbol) counterH++; // checks horizontal cells
                if (field[j][i] == symbol) counterV++; // checks vertical cells
                if (i == j && field[i][j] == symbol) counterMDia++; // checks main diagonal cells
                if (j == field.length - 1 - i && field[i][j] == symbol) counterSDia++; // checks secondary diagonal cells

                // returns true if a row or a column is filled with the symbol
                if (counterH == toWin || counterV == toWin) return true;
            }
        }
        // returns true if a diagonal is filled with the symbol
        return (counterMDia == toWin || counterSDia == toWin);
    }

    private static boolean isDraw(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (isFreeCell(field, i, j)) {
                    return false;
                }
            }
        }
        return true;
    }

}
