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
        int maxRange = 100;
        Random acak = new Random();
        Scanner input = new Scanner(System.in);
        int numAcak = acak.nextInt(maxRange+1);
        Tebakan tebak = new Tebakan(numAcak,false);
        System.out.println("Hai... nama saya Mr. Lappie, saya telah memilih "
            + "sebuah bilangan bulat acak antara 0 s/d 100. Silakan tebak ya!!!\n");
        while(!tebak.sttsDone){
            System.out.print("Tebakan Anda: ");
            int numInput = input.nextInt();
            tebak.getMsg(numInput);
        }
    }
    
}
