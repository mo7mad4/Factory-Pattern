 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryDrawingApp.shapes;

import FactoryDrawingApp.Shape;
import java.awt.Graphics;

/**
 *
 * @author AL_Qema
 */
public class Circle implements Shape{
    
    int radius, centerX, centerY;

    public Circle(int radius, int centerX, int centerY) {
        super();
        this.radius = radius;
        this.centerX = centerX;
        this.centerY = centerY;
    }
    


    @Override
    public void draw(Graphics g) {
		g.drawOval(centerX, centerY, radius, radius);
    }
    
    
}
