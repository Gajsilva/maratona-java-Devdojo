package academy.devdojo;

public class Aula08ArraysMultiDimensionais02 {
    public static void main(String[] args) {
        int[][] arrayint = new int[2][];

        arrayint[0] = new int[3];
        arrayint[1] = new int[6];

        for (int[] arrayBase: arrayint) {
            System.out.println("\n-------");
            for (int num: arrayBase) {
                System.out.print(num + " ");
            }
        }
    }
}
