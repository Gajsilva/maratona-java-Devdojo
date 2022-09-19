package academy.devdojo;

public class Aula08ArraysMultiDimensionais02 {
    public static void main(String[] args) {
        int[] array = {1,2,5,6,9};
        int[][] arrayint = new int[3][];

        arrayint[0] = array;
        arrayint[1] = new int[] {1,2,3,4,5,6};
        arrayint[2] = new int[4];

        int[][] arrayInt2 = {{1,2},{0,0,3,5,6},{9,8,7,6,5,4,3,2,1}};

        for (int[] arrayBase: arrayInt2) {
            System.out.println("\n-------");
            for (int num: arrayBase) {
                System.out.print(num + " ");
            }
        }
    }
}
