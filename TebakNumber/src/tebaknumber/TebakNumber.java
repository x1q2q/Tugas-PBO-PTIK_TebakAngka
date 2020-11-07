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
import java.util.Random;
import java.util.Scanner;
public class TebakNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int maxRange = 100; // set range max value
        Random acak =  new Random();
        int numAcak = acak.nextInt(maxRange+1); // set range value 0-99
        boolean numTebak=true;
        Scanner input = new Scanner(System.in);
        System.out.println("Hai... nama saya Mr. Lappie, saya telah memilih "
            + "sebuah bilangan bulat acak antara 0 s/d 100. Silakan tebak ya!!!\n");
        while(numTebak){
            System.out.print("Tebakan Anda: ");
            int numInput = input.nextInt();
            if(numInput < numAcak){
                System.out.println("Hehehe.. Bilangan tebakan anda terlalu kecil \n");
            }else if(numInput > numAcak){
                System.out.println("Hehehe.. Bilangan tebakan anda terlalu besar \n");
            }else{
                System.out.println("Yeeee... Bilangan tebakan anda BENAR");
                numTebak=false;
            }
        }
        
    }
    
}
