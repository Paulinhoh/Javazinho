package edu.devdojo.introducao;

public class Aula06_Arrays03 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        int[] numeros = new int[5];
        int[] numeros2 = {1,2,3,4,5};
        int[] numeros3 = new int[]{5,4,3,2,1};

        for(int num : numeros3){
            System.out.println(num);
        }
    }
}
