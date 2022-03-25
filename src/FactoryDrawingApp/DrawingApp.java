/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryDrawingApp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawingApp extends JFrame {
    
//    Random r = new Random();
	DrawingManager manager = new DrawingManager();
	
	public DrawingApp() {
		JPanel drawingPanel = new JPanel();		
		JButton circleBtn = new JButton("Circle");
		circleBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
//				Circle c = new Circle(50, r.nextInt(500), r.nextInt(350));
                               // Shape c = ShapeFactory.createShape(1);
				//manager.drawCircle(c, drawingPanel.getGraphics());
				//manager.drawShape(c, drawingPanel.getGraphics());

			}
			
		});
		JButton rectBtn = new JButton("Rectangle");
		rectBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
//				Rectangle rect = new Rectangle(100, 50, r.nextInt(500), r.nextInt(350));
                                //Shape rect = ShapeFactory.createShape(2);
				//manager.drawRectangle(rect, drawingPanel.getGraphics());
				//manager.drawShape(rect, drawingPanel.getGraphics());

			}
			
		});
		JButton scBtn = new JButton("Solid Circle");
		scBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
//				SolidCircle sc = new SolidCircle(50, r.nextInt(500), r.nextInt(350), Color.red);
//				manager.drawShape(sc, drawingPanel.getGraphics());

			}
			
		});

		JButton clearBtn = new JButton("Clear");
		clearBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				manager.clear(drawingPanel.getGraphics());
			}
			
		});

		JButton undoBtn = new JButton("Undo");
		undoBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				manager.undo(drawingPanel.getGraphics());	
			}
			
		});

//		JPanel buttonsPanel = new JPanel();
//		buttonsPanel.setLayout(new FlowLayout());
//		buttonsPanel.add(circleBtn);
//		buttonsPanel.add(rectBtn);
//		buttonsPanel.add(scBtn);
//
//		buttonsPanel.add(clearBtn);
//		buttonsPanel.add(undoBtn);
//		
//		this.getContentPane().setLayout(new BorderLayout());
//		this.getContentPane().add(buttonsPanel, BorderLayout.NORTH);
//		this.getContentPane().add(drawingPanel, BorderLayout.CENTER);
//		
//		this.setSize(500, 400);
//		this.setLocationRelativeTo(null);
//		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
//		this.setTitle("Drawing App");
//		this.setVisible(true);
	}
	
	public static void main(String[] args) {
            HashMap<Integer, Class<? extends Shape>> map = ShapeFactory.getShapeMap();
            for (Integer key : map.keySet()) {
                System.out.println(key + " ," +map.get(key) );
                
            }
		new DrawingApp();
	}
    
}
