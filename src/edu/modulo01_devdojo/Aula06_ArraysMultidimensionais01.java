package edu.modulo01_devdojo;

public class Aula06_ArraysMultidimensionais01 {
    public static void main(String[] args) {
        
        // 1, 2, 3, 4, 5 Meses
        // 31,28,31,30,31 Dias

        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 30;
        dias[1][1] = 31;
        dias[1][2] = 30;
        System.out.println(dias[0][0]);
        System.out.println("----------------------------------");

        // forI
        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("----------------------------------");

        // forEach
        for (int[] arrBase : dias) {
            for (int num : arrBase) {
                System.out.println(num);
            }
        }
    }
}
