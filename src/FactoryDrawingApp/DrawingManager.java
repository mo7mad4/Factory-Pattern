/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryDrawingApp;

import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author AL_Qema
 */
public class DrawingManager {
    ArrayList<Shape> shapes = new ArrayList<>();

	public void drawShape(Shape p, Graphics g) {
		p.draw(g);
		shapes.add(p);
	}
	
	
	public void clear(Graphics g) {
		g.clearRect(0, 0, 500, 400);
	}
	
	public void undo(Graphics g) {
		System.out.println("Undo");
		for(Shape p: shapes) {
			p.draw(g);
		}
	}
	public DrawingManager() {
		// TODO Auto-generated constructor stub
	}
}
