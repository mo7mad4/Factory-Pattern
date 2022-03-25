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
public class PublicKeyEncryption implements EncryptionAlgorithm{
    
    float encryptFactor;
    float compressionFactor;

    public PublicKeyEncryption(float encryptFactor, float compressionFactor) {
        this.encryptFactor = encryptFactor;
        this.compressionFactor = compressionFactor;
    }

    
    @Override
    public String encryptText(String text) {
        return "text encrypted by public key algorithm";
        
    }

    @Override
    public String dencryptText(String text) {
        return "text dencrypted by public key algorithm";
        
    }
    
    
}
