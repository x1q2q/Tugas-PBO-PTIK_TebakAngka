/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebaknumberskor;

/**
 *
 * @author rafikbojes
 */
public class Tebakan {
    int numTebak;
    int numAcak;
    int score;
    int count=5;
    boolean getStts=true;
    
    Tebakan(int angkRandom, int skor){
        this.numAcak = angkRandom;
        this.score = skor;
    }
    
    void getMsg(int angka){
        this.numTebak=angka;
        if(angka < this.numAcak){
            System.out.println("Hehehe.. Bilangan tebakan anda terlalu kecil \n");
            this.hitung();
        }else if(angka > this.numAcak){
            System.out.println("Hehehe.. Bilangan tebakan anda terlalu besar \n");
            this.hitung();
        }else{
            System.out.println("Yeeee... Bilangan tebakan anda BENAR");
            getStts=false;
        }
    }
    void hitung(){
        this.score-=2;
        this.count-=1;
    }
    int getScore(){
        return this.score <= 0 ? 0 : this.score; 
        // jika skor jadi minus maka jadikan score 0
    }
    int getBonus(){
        return (this.score <= 0) ? 0: this.count>=0? 50 : 0; 
        // bonus akan dieksekusi jika score tidak minus (-)
    }
    int getTotal(){
        return (this.score <= 0) ? 0: this.count>=0? this.score+50 : this.score; 
        // total score akan dieksekusi jika score tidak minus (-)
    }
    void getResult(){
        System.out.println("Score Anda: "+getScore());
        System.out.println("Bonus Anda: "+getBonus());
        System.out.println("Total Score: "+getTotal());
    }
}
