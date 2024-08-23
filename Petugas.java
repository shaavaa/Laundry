import java.util.ArrayList;

public class Petugas implements User{
    private ArrayList<String> Nama = new ArrayList<String>();
    private ArrayList<String> Alamat = new ArrayList<String>();
    private ArrayList<String> Telepon = new ArrayList<String>();
    private ArrayList<String> Jabatan  = new ArrayList<String>();

    @Override
    public String getNama(int namapetugas) {
        return this.Nama.get(namapetugas);
    }
    @Override
    public void setNama(String NamaPetugas) {
        this.Nama.add(NamaPetugas);
    }
    @Override
    public String getAlamat(int alamat) {
        return this.Alamat.get(alamat);
    }
    @Override
    public void setAlamat(String Alamat) {
        this.Alamat.add(Alamat);
    }
    @Override
    public String getTelepon(int tlp) {
        return this.Telepon.get(tlp);
    }
    @Override
    public void setTelepon(String Telepon) {
        this.Telepon.add(Telepon);
    }

    public String getJabatan(int jabatan) {
        return this.Jabatan.get(jabatan);
    }

    public void setJabatan(String Jabatan) {
        this.Jabatan.add(Jabatan);
    }
    public int get(){
        return this.Nama.size();
    }
    
    public Petugas(){
        this.Nama.add("Risma");
        this.Alamat.add("Jl. Soerkarno");
        this.Telepon.add("0821334678901221");
        this.Jabatan.add("Manager");
        this.Nama.add("Tono");
        this.Alamat.add("Jl. Hatta");
        this.Telepon.add("082234435665");
        this.Jabatan.add("Karyawan");
        this.Nama.add("Yanti");
        this.Alamat.add("Jl. Kartini");
        this.Telepon.add("082122478903");
        this.Jabatan.add("Kasir");
    }
}
