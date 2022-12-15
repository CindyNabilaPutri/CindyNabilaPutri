/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTScindy121522;

/**
 *
 * @author LENOVO
 */
public class TaxiRecord {
    private String kode;
    private String tgl;
    private double tarif;
    private int jarak;
    private double diskon;
    private double total;
    
    public TaxiRecord(){
        
    }

    public void setKode(String kode){
        this.kode=kode;
    }

    public void setTgl(String tgl){
        this.tgl=tgl;
    }

    public void setTarif(double tarif){
        this.tarif=tarif;
    }
    
    public void setJarak(int jarak){
    this.jarak=jarak;
    }
    
    public String getKode(){
        return kode;
    }
    
    public String getTgl(){
        return tgl;
    }
    
    public double getTarif(){
        return tarif;
    }
    
    public int getJarak(){
        return jarak;
    }
    
    public double getDiskon(){
        double harga;
        
        if(jarak>=10){
            harga=10*tarif;
            diskon=harga*0.1;
        }
        
        return diskon;
    }

    public double getTotal(){
        if(jarak>=10){
            total=(jarak*tarif)-diskon;
        }
        else{
            total=jarak*tarif;
        }
        
        return total;
    }
    
    public void print(String kode,String tgl,double tarif,int jarak,double diskon,double total){
        System.out.println("\n=Tarif Taxi=");
        System.out.println("Kode Bayar : "+kode);
        System.out.println("Tanggal Pembayaran : "+tgl);
        System.out.println("Tarif Perkilo : "+tarif);
        System.out.println("Jarak(km) : "+jarak);
        System.out.println("Diskon : "+diskon);
        System.out.println("Total Bayar: "+total);
    }
}
