package com.Model;

import java.awt.Color;

public class ModelRGB {
	//////////Calculacating Value of Color to change it ////////
	private Color c;

	
	public  void ColorCalculater(int r , int g , int b) {
		 float[] hsbvals = new float[3];
		Color.RGBtoHSB(r, g, b, hsbvals);
		this.c = Color.getHSBColor(hsbvals[0],hsbvals[1], hsbvals[2]);
	}


	public Color getC() {
		return c;
	}



	
}
