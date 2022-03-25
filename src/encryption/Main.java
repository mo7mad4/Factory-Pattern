/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryption;

import java.util.Scanner;

/**
 *
 * @author AL_Qema
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner (System.in);
        System.out.println("Choose Encryption Algorithm : 1. Public Key, 2.Hach" );
        int choice = s.nextInt();
        EncryptionAlgorithm a = EncryptionFactory.createEncryptionAlgorithm(choice);
        String ET = a.encryptText("My name is Mohammed");
        
       
    
    }
    
}
