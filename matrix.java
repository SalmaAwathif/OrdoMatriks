import java.util.Scanner;

public class matrix {

    public static void main(String[] args) {
        Scanner input = newScanner( System.in) ;

        System.out.println( "Masukkan Jumlah Baris: ");
        int baris = input.nextInt();
        System.out.println( "Masukkan Jumlah Kolom: ");
        int Kolom = input.nextInt();

        int matrix[] [] = new int[baris] [Kolom];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println( "Masukkan Nilai Matrix: ");
                matrix[i] [j] = input.nextInt();
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i] . length; j++) {
                System.out.println(matrix[i] [j] + ", ");
            }
            System.out.println();
        }
                   
    }}

    
        

       

  
