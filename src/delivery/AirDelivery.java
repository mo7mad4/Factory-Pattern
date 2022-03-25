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
public class AirDelivery implements DeliveryMethod {

    @Override
    public float clacDelieveryPrice(Item item) {
        return item.getWidth()*50;
    }
    
}
