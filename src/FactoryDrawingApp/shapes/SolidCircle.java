/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryDrawingApp.shapes;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author AL_Qema
 */
public class SolidCircle extends Circle{
    
    	Color fillColor;
	
	public SolidCircle(int radius, int centerX, int centerY, Color fillColor) {
		super(radius, centerX, centerY);
		this.fillColor = fillColor;
	}
	
	@Override
	public void draw(Graphics g) {
		super.draw(g);
		g.setColor(fillColor);
		g.fillOval(this.centerX, this.centerY, this.radius, this.radius);
	}
    
}
