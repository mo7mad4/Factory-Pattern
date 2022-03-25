/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delivery;

/**
 *
 * @author AL_Qema
 */
public class DeliveryMethodFactory {
    
    public static DeliveryMethod createDliveryMethod(int id){
        if(id == 1){
            return new LandDelivery();
        }else if(id == 2){
            return new MaritimeDelivery();
        }else if(id == 3){
            return new AirDelivery();
        }else{
            throw new IllegalArgumentException("Invalid id number");
        }
    }
    
}
