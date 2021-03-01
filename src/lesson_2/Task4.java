package lesson_2;
/*
4. Создать квадратный двумерный целочисленный массив
(количество строк и столбцов одинаковое)
и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
 */

public class Task4 {

    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        fillDiagArray(arr);
    }

    public static void fillDiagArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("");
        }
    }

}
