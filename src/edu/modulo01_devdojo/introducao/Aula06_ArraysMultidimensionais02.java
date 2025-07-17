package edu.modulo01_devdojo.introducao;

public class Aula06_ArraysMultidimensionais02 {
    public static void main(String[] args) {

        int[][] arrayInt = new int[3][];
        int[] array = { 1, 2, 3 };

        arrayInt[0] = new int[2];
        arrayInt[1] = array;
        arrayInt[2] = new int[] { 1, 2, 3, 4, 5, 6 };

        for (int[] arrBase : arrayInt) {
            for (int num : arrBase) {
                System.out.print(num + " ");
            }
            System.out.println("\n--------------");
        }

        System.out.println("----------------------------------");
        int[][] arrayInt2 = { { -4, 26 }, { 6, 8, 9 }, { 5, 4, 3, 2, 1, 0 } };

        for (int[] arrBase : arrayInt2) {
            for (int num : arrBase) {
                System.out.print(num + " ");
            }
            System.out.println("\n--------------");
        }
    }
}
