package UAS;

public class BukuData extends Buku { // Pewarisan atau inheritance
    // Konstruktor
    public BukuData(String judul, String isbn) {
        super(judul, isbn);  // Memanggil konstruktor dari kelas
    }

     //untuk mendapatkan jenis buku dari isbn
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
    }
    //Polymorpisme override dari tampilkanInfo dari kelas
    @Override 
    public String tampilkanInfo() {
        return super.tampilkanInfo() +
                "\nJenis Buku: " + getJenis() +
                "\nGenre Buku: " + getGenre() +
                "\nPenerbit Buku: " + getPenerbit();
    }
}
