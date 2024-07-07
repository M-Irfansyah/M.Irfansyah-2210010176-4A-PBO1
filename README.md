# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Buku`, `BukuData`, dan `BukuMain` adalah contoh dari class.

```bash
public class Buku {
    ...
}

public class BukuData extends Buku {
    ...
}

public class BukuMain {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `mhs[i] = new MahasiswaDetail(nama, npm);` adalah contoh pembuatan object.

```bash
Buku[] buku = new BukuData[2];
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `npm` adalah contoh atribut.

```bash
  String judul;
     String isbn;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Mahasiswa` dan `MahasiswaDetail`.

```bash
public Buku(String judul, String isbn) {
        this.judul = judul;
        this.isbn = isbn;
}

 public BukuData(String judul, String isbn) {
        super(judul, isbn);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setNpm` adalah contoh method mutator.

```bash
public void setJudul(String judul) {
        this.judul = judul;
    }
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getNpm`, `getTahunMasuk`, `getFakultas`, `getProdi`, dan `getNoRegistrasi` adalah contoh method accessor.

```bash
public String getJudul() {
        return judul;
    }

    public String getIsbn() {
        return isbn;
    }

```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `npm` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
 private String judul;
    private String isbn;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `MahasiswaDetail` mewarisi `Mahasiswa` dengan sintaks `extends`.

```bash
public class BukuData extends Buku {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Mahasiswa` merupakan overloading method `displayInfo` dan `displayInfo` di `MahasiswaDetail` merupakan override dari method `displayInfo` di `Mahasiswa`.

```bash
public String tampilkanInfo() {
        return "Judul Buku: " + getJudul() + "\nNo ISBN: " + getIsbn();
    }
}

@Override 
    public String tampilkanInfo() {
        return super.tampilkanInfo() +
                "\nJenis Buku: " + getJenis() +
                "\nGenre Buku: " + getGenre() +
                "\nPenerbit Buku: " + getPenerbit();
    }
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getFakultas` dan seleksi `switch` dalam method `getProdi`.

```bash
 public String getJenis() {
        String jenis = getIsbn().substring(0, 1);
        switch (jenis) {
            case "1":
                return "Novel";
            case "2":
                return "Komik";
            default:
                return "Jenis Buku Lainnya";
        }
    }

    public String getGenre() {
        String genre = getIsbn().substring(1, 3);
        switch (genre) {
            case "02":
                return "Roman";
            case "03":
                return "Horor";
            default:
                return "Genre Buku Lainnya";
        }
    }
    public String getPenerbit() {
        String penerbit = getIsbn().substring(3, 5);
        switch (penerbit) {
            case "12":
                return "Gramedia";
            case "13":
                return "Erlangga";
            default:
                return "Penerbit Buku Lainnya";
        }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < buku.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
 Scanner scanner = new Scanner(System.in);

                System.out.println("=== Masukkan Data Buku ke-" + (i + 1) + " ===");
                System.out.print("Masukkan Judul Buku: ");
                String judul = scanner.nextLine();
                System.out.print("Masukkan No ISBN: ");
                String isbn = scanner.nextLine();

                 System.out.println("Data Buku Ke " + (i + 1));
                System.out.println(buku[i].tampilkanInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `MahasiswaDetail[] mahasiswas = new MahasiswaDetail[2];` adalah contoh penggunaan array.

```bash
   Buku[] buku = new BukuData[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
} catch (StringIndexOutOfBoundsException e) {
            System.out.println("Kesalahan Memasukan No ISBN: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Kesalahan Format Number: " + e.getMessage());
        }
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: M.Irfansyah
NPM: 2210010176
