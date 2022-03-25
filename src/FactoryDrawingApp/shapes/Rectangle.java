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
public class Rectangle implements Shape{
    
    int width, height, posX, posY;
	
	public Rectangle(int width, int height, int posX, int posY) {
		super();
		this.width = width;
		this.height = height;
		this.posX = posX;
		this.posY = posY;
	}

	public Rectangle() {
		// TODO Auto-generated constructor stub
	}


    @Override
    public void draw(Graphics g) {
        g.drawRect(posX, posY, width, height);

    }
    
}
