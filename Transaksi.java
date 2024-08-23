import java.util.ArrayList;
import java.util.Scanner;

public class Transaksi {
    public static void main(String[] args) {
        Client a = new Client();
        Petugas b = new Petugas();
        JenisLaundry c = new JenisLaundry();
        Transaksi e = new Transaksi();
        e.Transaksi(a, b, c, e);
    }
    private ArrayList<Integer> IdClient = new ArrayList<Integer>();
    private ArrayList<Integer> IdPetugas = new ArrayList<Integer>();
    private ArrayList<Integer> IdJenisLaundry = new ArrayList<Integer>();
    private ArrayList<Integer> Banyak = new ArrayList<Integer>();
    
    public Transaksi (){
        this.IdClient.add(0);
        this.IdJenisLaundry.add(0);
        this.IdPetugas.add(0);
        this.Banyak.add(0);
        
        this.IdClient.add(1);
        this.IdJenisLaundry.add(1);
        this.IdPetugas.add(1);
        this.Banyak.add(1);
        
        this.IdClient.add(2);
        this.IdJenisLaundry.add(2);
        this.IdPetugas.add(2);
        this.Banyak.add(2);
    }
    public void Transaksi(Client Client, Petugas Petugas, JenisLaundry JenisLaundry, Transaksi Transaksi) {
        int total = 0;
        int isi = 0;
        Scanner d = new Scanner (System.in);
        boolean ulang = true;
        
        
        System.out.println("Selamat Datang di Sha's Laundry");
        System.out.println("Daftar nama petugas : ");
        for(int i=0;i <Petugas.get() ;i++){
            System.out.println(i+1+".Nama : "+ Petugas.getNama(IdPetugas.get(i)));
            System.out.println("  Alamat  : " + Petugas.getAlamat(IdPetugas.get(i)));
            System.out.println("  Telepon : " + Petugas.getTelepon(IdPetugas.get(i)));
            System.out.println("  Jabatan : " + Petugas.getJabatan(IdPetugas.get(i)));
        }
        System.out.print("Masukkan ID petugas anda : ");
        int idP = d.nextInt();
        System.out.println("Daftar client : ");
        for(int i=0;i<Client.get();i++){
            System.out.println(i+1+".Nama : "+ Client.getNama(IdClient.get(i)));
            System.out.println("  Alamat : " + Client.getAlamat(IdClient.get(i)));
            System.out.println("  Telepon : " + Client.getTelepon(IdClient.get(i)));
            System.out.println("  Saldo : " + Client.getSaldo(IdClient.get(i)));
        }
        System.out.print("Masukkan ID Client anda : ");
        int idC = d.nextInt();
        System.out.println("Selamat datang kembali, " + Client.getNama(idC-1)+". Petugas yang melayani anda adalah " + Petugas.getNama(idP-1));
        
        do{
            System.out.println("Daftar Jenis Laundry : ");
            for(int i=0;i<JenisLaundry.get();i++){
                System.out.println(i+1+".Jenis Laundry :"+ JenisLaundry.getJenisLaundry(i));
                System.out.println("  Harga : " + JenisLaundry.getHarga(i)+"/kg");
                System.out.println("  Durasi : " + JenisLaundry.getDurasi(i));
            }
            
            System.out.println("Pilihan anda : ");
            int pilL = d.nextInt();
            if(pilL>3){
                System.out.println("Pilihan anda salah");
                break;
            }
            System.out.println("Jumlah/kg : ");
            int jmlh = d.nextInt();
            System.out.println("Pilihan anda = " + JenisLaundry.getJenisLaundry(pilL-1)+" "+jmlh+" kg");
            total += JenisLaundry.totalLaundry(JenisLaundry.getHarga(pilL-1), jmlh);
            System.out.println("Total = " + total);
            System.out.println("Apakah anda ingin memesan lagi? \n 1. Ya \n 2. Tidak");
            int jawab = d.nextInt(); 
            if (jawab == 1){
                ulang = true;
            }
            else if (jawab == 2){
                System.out.println("        Sha's Laundry         "
                        +"\n------------------------------"
                        +"\nNama Petugas    : " + Petugas.getNama(idP-1)
                        +"\nNama Client     : " + Client.getNama(idC-1)
                        +"\nJenis Laundry   : " + JenisLaundry.getJenisLaundry(pilL-1));
                System.out.println("Jumlah          : "+jmlh
                        +"\nTotal           : " + total
                        +"\nSisa saldo anda : " + Client.editSaldo(Client.getSaldo(idC-1), total, isi));
                            do{         
                                
                                    if(Client.editSaldo(Client.getSaldo(idC-1), isi)<total){
                                        System.out.println("Pembayaran anda kurang " + Client.editSaldo(Client.getSaldo(idC-1), total, isi) + " lakukan pengisian saldo : ");
                                        isi += d.nextInt();
                                        if(Client.editSaldo(Client.getSaldo(idC-1), isi)<0){
                                            ulang=true;
                                        }
                                        else if(Client.editSaldo(Client.getSaldo(idC-1), isi)==total){
                                            System.out.println("Pembayaran anda lunas");
                                            break;
                                        }
                                        else if(Client.editSaldo(Client.getSaldo(idC-1), isi)>total){
                                            System.out.println("Pembayaran anda lunas dan saldo anda "+Client.editSaldo(Client.getSaldo(idC-1), total, isi));
                                            ulang=false;
                                        }
                                    }
                                    else{
                                        System.out.println("Pembayaran anda lunas");
                                        ulang=false;
                                        break;
                                    }
                                    
                            }while(ulang==true);
            }
            else {
                System.out.println("Salah pilih");
                break;
            }
        }while (ulang == true);
    }
}
    