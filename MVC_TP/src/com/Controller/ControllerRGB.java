package com.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.Model.ModelRGB;

import come.View.ViewRGB;

public class ControllerRGB {
	private ModelRGB Model ;
	private ViewRGB View ;
	public ControllerRGB(ModelRGB model, ViewRGB view) {
		
		this.Model = model;
		this.View = view;
		View.ActionListnertoTextElemnts(new ColorCalucationAction());
		View.ActionListnertoSliderElemnts(new ColorCalucationAction1());
	} 
	class ColorCalucationAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			try {
				int r = Integer.parseInt(View.getFielText());
				int g = Integer.parseInt(View.getFielText1());
				int b = Integer.parseInt(View.getFielText2()); 
				View.setSlider(r);
				View.setSlider1(g);
				View.setSlider2(b);
				Model.ColorCalculater(r, g, b);
				View.SetThecolor(Model.getC());	
			}catch(Exception ex){
				System.out.println("Not valid number");
			}
		}
		
	}
	class ColorCalucationAction1 implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent arg0) {
			// TODO Auto-generated method stub
		try {
			int r = View.getSlider();
			int g = View.getSlider1(); 
			int b = View.getSlider2();
			View.setFielText(String.valueOf(r));
			View.setFielText1(String.valueOf(g));
			View.setFielText2(String.valueOf(b));
			Model.ColorCalculater(r, g, b);
			View.SetThecolor(Model.getC());	
			}catch(Exception e) {
				System.out.println("Not valid number");
			}
		}

		
		
	}
}
