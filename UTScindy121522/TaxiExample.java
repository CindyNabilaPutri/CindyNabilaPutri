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
public class TaxiExample { 
     public static void main(String[] args){
        TaxiRecord taxi1=new TaxiRecord();
        
        taxi1.setKode("001");
        taxi1.setTgl("15 Des 2022");
        taxi1.setTarif(2000.0);
        taxi1.setJarak(12);
        
        taxi1.print(taxi1.getKode(),taxi1.getTgl(),taxi1.getTarif(),taxi1.getJarak(),taxi1.getDiskon(),taxi1.getTotal());
    }
}
    

