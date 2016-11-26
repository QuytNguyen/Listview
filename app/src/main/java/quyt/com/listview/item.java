package quyt.com.listview;

/**
 * Created by nguye on 24/10/2016.
 */
public class item {
    String ten;
    String sdt;
    String hinh;

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public item( String ten, String sdt, String hinh) {
        this.ten=ten;
        this.sdt=sdt;
        this.hinh=hinh;
    }


}
