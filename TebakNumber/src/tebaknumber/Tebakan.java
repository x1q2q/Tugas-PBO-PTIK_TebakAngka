/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebaknumber;

/**
 *
 * @author rafikbojes
 */
public class Tebakan {
    int numTebak;
    int numAcak;
    boolean sttsDone;
    
    Tebakan(int angkRandom, boolean stts){
        this.numAcak = angkRandom;
        this.sttsDone=stts;
    }
    
    void getMsg(int angka){
        this.numTebak=angka;
        if(angka < this.numAcak){
            System.out.println("Hehehe.. Bilangan tebakan anda terlalu kecil \n");
        }else if(angka > this.numAcak){
            System.out.println("Hehehe.. Bilangan tebakan anda terlalu besar \n");
        }else{
            System.out.println("Yeeee... Bilangan tebakan anda BENAR");
            this.sttsDone=!this.sttsDone;
        }
    }
}
