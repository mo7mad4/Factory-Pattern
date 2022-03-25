/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryption;

/**
 *
 * @author AL_Qema
 */
public class EncryptionFactory {
    public static EncryptionAlgorithm createEncryptionAlgorithm(int id){
         if (id == 1) {
            return new PublicKeyEncryption(0.3f, 0.5f);
//            a.encryptText("My name is Mohammed");
        }else if(id == 2){
            return new HashEncryption(5f);
//            h.encryptText("I'm 21 years old");  
        }else{
            throw new IllegalArgumentException("InValied Error");
        }
    }
}
