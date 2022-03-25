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
public interface EncryptionAlgorithm {
    
    public String encryptText(String text);    
    public String dencryptText(String text);  
}
