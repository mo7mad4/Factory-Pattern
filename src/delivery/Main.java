/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delivery;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author AL_Qema
 */
public class Main {

    
    public static void main(String[] args) {
        //Reflection API
        
        try {
            Class c = Class.forName("delivery.Item");
            System.out.println(c.getName());
            Field[] fields = c.getDeclaredFields();
            for(Field f: fields){
                System.out.println(f.getName());
            }
            System.out.println("-------------------");
            Method[] methods = c.getMethods();
            for(Method m: methods){
                System.out.println(m.getName());
            }
            System.out.println("********************");
            Constructor[] cs = c.getConstructors();
            for (Constructor css : cs) {
                System.out.println(css.getName());
                
            }
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
            
//        Item item = new Item();
//        item.setPrice(100);
//        item.setWeight(5);
//        item.setWidth(100);
//        item.setHeight(200);
//        
//        Scanner s = new Scanner (System.in);
//        System.out.println("Choose delivery method: \n1. Land, 2. Maritime, 3. Air, 4.Drone");
//        int choice = s.nextInt();
//        float deliveryPrice =0;
//        DeliveryMethod d = DeliveryMethodFactory.createDliveryMethod(choice);
//        deliveryPrice = d.clacDelieveryPrice(item);
//        System.out.println("Delievery Price = " + deliveryPrice);
    } 
    
}
