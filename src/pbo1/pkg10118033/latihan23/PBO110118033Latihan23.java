
/**
 * 
 * @author 
 * NAMA  : Ikrar Anugrah Bastary
 * KELAS : PBO1
 * NIM   : 10118033
 * Deskripsi Program : Program ini berisi program untuk menentukan nilai
 * terbesar dan terkecil
 *  
 */

package pbo1.pkg10118033.latihan23;

import java.util.Scanner;

public class PBO110118033Latihan23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====Program Nilai Terbesar dan Nilai Terkecil=====");
        System.out.print("Masukkan Nama Petugas : ");
        String nama = scanner.next();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        int n = scanner.nextInt();
        int[] nilai = new int[n];
        int i;
        for (i=1;i<=n;i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-"+i+" = ");
            nilai[i-1] = scanner.nextInt();
        }
        System.out.println("\n=====Hasil Nilai Mahasiswa=====");
        for(i=1;i<=n;i++){
            System.out.println("Nilai Mahasiswa ke-"+i+" : "+nilai[i-1]);
        }
        int max = nilai[0];
        int min = nilai[0];
        for(i=1;i<=n;i++){
            if(nilai[i-1] >= max){
                max = nilai[i-1];
            } else if (nilai[i-1] <= min){
                min = nilai[i-1];
            }
        }
        System.out.println("\nNilai Terbesar adalah : "+max);
        System.out.println("Nilai Terkecil adalah : "+min);
        System.out.println("\nPetugas : "+nama);
        System.out.println("(Developed By : Ikrar AB)");
    }
}