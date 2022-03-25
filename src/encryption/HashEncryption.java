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
public class HashEncryption implements EncryptionAlgorithm{
//    float toeranceFactory;
    float hashKey;

    public HashEncryption(float hashKey) {
        this.hashKey = hashKey;
    }
    
    

    @Override
    public String encryptText(String text) {
        return "text encrypted by Hash algorithm";
    }

    @Override
    public String dencryptText(String text) {
        return "text encrypted by Hash algorithm";
    }
    
}
