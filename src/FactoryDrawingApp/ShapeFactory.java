/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryDrawingApp;

import java.io.File;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AL_Qema
 */
public class ShapeFactory {
                                        //بدنا نجيب class object  
                                        //وانا بدي الكلاس الي من نوع شيب فقط
                                        //عشان هيك عملنا  class<? extends Shape>>
    private static HashMap<Integer, Class<? extends Shape>> shapeMap = new HashMap<>();
    static { //constractor <Solilty>
        File d = new File("E:\\ملفات الجامعة\\سنة ثالثة\\فصل ثاني\\Design pattern projects\\factoryPattern\\src\\FactoryDrawingApp\\FactoryDrawingApp.shapes");
        File[] files = d.listFiles();
        int i =1;
        for (File file : files) {
            String className = file.getName().split("\\.")[0];
            try {
                Class<? extends Shape> c = Class.forName("FactoryDrawingApp.shapes."+className).asSubclass(Shape.class);
                shapeMap.put(i, c);
                i++;
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }

                       
            
        }
    }
    
    public static HashMap<Integer, Class<? extends Shape>> getShapeMap(){
        return shapeMap;
    }
//    public static Shape createShape(int id){
//    Random r = new Random();
//        if(id == 1){
//            return new Circle(50, r.nextInt(500), r.nextInt(350));
//        }else if(id == 2){
//            return new Rectangle(100, 50, r.nextInt(500), r.nextInt(350));
//        }else{
//            throw new IllegalArgumentException("");
//        }
//    }
    
}
