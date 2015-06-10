/**
 * Created by Nin on 10/06/2015.
 */
public class lagu {
    private String JudulLAgu;
    private String Penyanyi;
    private String Pengarang;

    public lagu(String judulLAgu, String penyanyi, String pengarang) {
        JudulLAgu = judulLAgu;
        Penyanyi = penyanyi;
        Pengarang = pengarang;
    }

    public lagu(String judulLAgu, String pengarang) {
        JudulLAgu = judulLAgu;
        Pengarang = pengarang;
    }

    public String getJudulLAgu() {
        return JudulLAgu;
    }

    public void setJudulLAgu(String judulLAgu) {
        JudulLAgu = judulLAgu;
    }

    public String getPenyanyi() {
        return Penyanyi;
    }

    public void setPenyanyi(String penyanyi) {
        Penyanyi = penyanyi;
    }

    public String getPengarang() {
        return Pengarang;
    }

    public void setPengarang(String pengarang) {
        Pengarang = pengarang;
    }

    @Override
    public String toString() {
        return "lagu{" +
                "JudulLAgu='" + JudulLAgu + '\'' +
                ", Penyanyi='" + Penyanyi + '\'' +
                ", Pengarang='" + Pengarang + '\'' +
                '}';
    }
}
