import java.util.ArrayList;

public class JenisLaundry {
    private ArrayList<String> JenisLaundry = new ArrayList<String>();
    private ArrayList<Integer> Harga = new ArrayList<Integer>();
    private ArrayList<Integer> Durasi = new ArrayList<Integer>();

    public String getJenisLaundry(int jenislaundry) {
        return this.JenisLaundry.get(jenislaundry);
    }

    public void setJenisLaundry(String JenisLaundry) {
        this.JenisLaundry.add(JenisLaundry);
    }

    public int getHarga(int harga) {
        return this.Harga.get(harga);
    }

    public void setHarga(int Harga) {
        this.Harga.add(Harga);
    }

    public Integer getDurasi(int durasi) {
        return this.Durasi.get(durasi);
    }

    public void setDurasi(int Durasi) {
        this.Durasi.add(Durasi);
    }
    
    public int get(){
        return this.JenisLaundry.size();
    }
    
    public int totalLaundry(int harga,int jumlah){
        return harga*jumlah;
    }
    
    public JenisLaundry(){
        this.JenisLaundry.add("Cuci Kering");
        this.Harga.add(6000);
        this.Durasi.add(2);
        this.JenisLaundry.add("Cuci Kering Setrika");
        this.Harga.add(8000);
        this.Durasi.add(3);
        this.JenisLaundry.add("Setrika");
        this.Harga.add(10000);
        this.Durasi.add(2);
    }
}
