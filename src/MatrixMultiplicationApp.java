/**
 * Created by Azamat on 02.02.2016.
 */
public class MatrixMultiplicationApp {
public static void main(String[] args) {
AnotherJavaClass ClassAzamat = new AnotherJavaClass();
    int arr1[][] = new int[2][2];
    int arr2[][] = new int[2][2];
    System.out.println("Введите значение первой матрицы");
    ClassAzamat.setArray(arr1);
    System.out.println("Введите значение второй матрицы");
    ClassAzamat.setArray(arr2);
    System.out.println("Результат:");
    mattrixMulti(arr1,arr2);
    }
    public static void mattrixMulti(int arr1[][],int arr2[][]){
        int sum = 0;
        int sum2[][] = new int[2][2];
        for(int row=0;row<2;row++){
            for(int col=0;col<2;col++){
                sum=0;
                for(int k=0;k<2;k++){
                    sum += arr1[row][k] * arr2[k][col];

                }
                 sum2[row][col] = sum;
                System.out.print(sum2[row][col]+"\t");

            } System.out.println();
    }
    }
    }