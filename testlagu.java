/**
 * Created by Nin on 10/06/2015.
 */
public class testlagu {
    public static void main(String[] args) {

        author beby = new author ("Bunga Terakhir","Beby Romeo",2010,"jazz");
        System.out.println("Data Lagu :"+ beby.toString());
        System.out.println("Judul Lagu :"+ beby.getJudulLagu());
        System.out.println("Pengarang Lagu :"+ beby.getPengarangLagu());
        System.out.println("Tahun Peluncuran Lagu :"+ beby.getTahunPeluncuranLagu());
        System.out.println("Genre Lagu :"+ beby.getGenre());
    }
}
