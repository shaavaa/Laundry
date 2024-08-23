import java.util.ArrayList;

public class Client implements User {
    private ArrayList<String> Nama = new ArrayList<String>();
    private ArrayList<String> Alamat = new ArrayList<String>();
    private ArrayList<String> Telepon = new ArrayList<String>();
    private ArrayList<Integer> Saldo = new ArrayList<Integer>();

    @Override
    public String getNama(int NamaClient) {
        return this.Nama.get(NamaClient);
    }
    @Override
    public void setNama(String NamaClient) {
        this.Nama.add(NamaClient);
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
    public String getTelepon(int telepon) {
        return this.Telepon.get(telepon);
    }
    @Override
    public void setTelepon(String Telepon) {
        this.Telepon.add(Telepon);
    }

    public Integer getSaldo(int saldo) {
        return this.Saldo.get(saldo);
    }

    public void setSaldo(int Saldo) {
        this.Saldo.add(Saldo);
    }
    
    public int get(){
        return this.Nama.size();
    }
    
    public int editSaldo(int Saldo,int total, int isi){
        return Saldo-total+isi;
    }
    
    public int editSaldo(int saldo, int isi){
        return saldo+isi;
    }
    
    public Client(){
        this.Nama.add("Roni");
        this.Alamat.add("Jl. Mawar");
        this.Telepon.add("082223244556");
        this.Saldo.add(100000);
        this.Nama.add("Rani");
        this.Alamat.add("Jl. Matahari");
        this.Telepon.add("082122567890");
        this.Saldo.add(100000);
        this.Nama.add("Santi");
        this.Alamat.add("Jl. Lavender");
        this.Telepon.add("082254890067");
        this.Saldo.add(100000); 
    }
}
