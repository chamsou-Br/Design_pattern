package controllers;

import models.Coulor;

public class ColorController {

	
	public ColorController() {

	}
	
	public void execute(int valeur, Coulor c,IC opt) throws Exception {
		opt.setColor(valeur, c);
	}
}
