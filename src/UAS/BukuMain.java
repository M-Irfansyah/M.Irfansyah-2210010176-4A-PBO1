package UAS;

import java.util.Scanner;

public class BukuMain {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);

            // Tentukan ukuran array untuk dua data buku
            Buku[] buku = new BukuData[2];

            // Mengisi data buku berdasarkan input pengguna
            for (int i = 0; i < buku.length; i++) {
                System.out.println("=== Masukkan Data Buku ke-" + (i + 1) + " ===");
                System.out.print("Masukkan Judul Buku: ");
                String judul = scanner.nextLine();
                System.out.print("Masukkan No ISBN: ");
                String isbn = scanner.nextLine();

                // Polymorpisme
                buku[i] = new BukuData(judul, isbn);

                // Tampilkan nama buku dan ISBN setelah dimasukkan
                System.out.println("Data Buku yang telah dimasukkan:");
                System.out.println("Judul Buku: " + buku[i].getJudul());
                System.out.println("No ISBN: " + buku[i].getIsbn());
                System.out.println();
            }

            // Menampilkan semua data buku yang telah dimasukkan
            for (int i = 0; i < buku.length; i++) {
                System.out.println("======================");
                System.out.println("Data Buku Ke " + (i + 1));
                System.out.println(buku[i].tampilkanInfo());
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Kesalahan Memasukan No ISBN: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Kesalahan Format Number: " + e.getMessage());
        }
    }
}
