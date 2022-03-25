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
public class LandDelivery implements DeliveryMethod{

    @Override
    public float clacDelieveryPrice(Item item) {
        return (item.getWeight()*10) + ((item.getHeight()*item.getWidth()/100)*20);
        
    }
    
}
