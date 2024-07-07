package UAS;

public class Buku {
    private String judul;
    private String isbn;

    public Buku(String judul, String isbn) {
        this.judul = judul;
        this.isbn = isbn;
    }
    //Mutator (setter) 
    public void setJudul(String judul) {
        this.judul = judul;
    }
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    //Accessor (getter)
    public String getJudul() {
        return judul;
    }

    public String getIsbn() {
        return isbn;
    }

    public String tampilkanInfo() {
        return "Judul Buku: " + getJudul() + "\nNo ISBN: " + getIsbn();
    }
}
