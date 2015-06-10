/**
 * Created by Nin on 10/06/2015.
 */
public class author {
    private String JudulLagu;
    private String PengarangLagu;
    private int  TahunPeluncuranLagu;
    private String Genre;

    public author(String judulLagu, String pengarangLagu, int tahunPeluncuranLagu, String genre) {
        JudulLagu = judulLagu;
        PengarangLagu = pengarangLagu;
        TahunPeluncuranLagu = tahunPeluncuranLagu;
        Genre = genre;
    }


    public author(String judulLagu, String pengarangLagu, int tahunPeluncuranLagu) {
        JudulLagu = judulLagu;
        PengarangLagu = pengarangLagu;
        TahunPeluncuranLagu = tahunPeluncuranLagu;
    }

    public String getJudulLagu() {
        return JudulLagu;
    }

    public void setJudulLagu(String judulLagu) {
        JudulLagu = judulLagu;
    }

    public String getPengarangLagu() {
        return PengarangLagu;
    }

    public void setPengarangLagu(String pengarangLagu) {
        PengarangLagu = pengarangLagu;
    }

    public int getTahunPeluncuranLagu() {
        return TahunPeluncuranLagu;
    }

    public void setTahunPeluncuranLagu(int tahunPeluncuranLagu) {
        TahunPeluncuranLagu = tahunPeluncuranLagu;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    @Override
    public String toString() {
        return "author{" +
                "JudulLagu='" + JudulLagu + '\'' +
                ", PengarangLagu='" + PengarangLagu + '\'' +
                ", TahunPeluncuranLagu=" + TahunPeluncuranLagu +
                ", Genre='" + Genre + '\'' +
                '}';
    }
}
