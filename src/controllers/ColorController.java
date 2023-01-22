package controllers;

import models.Coulor;

public class ColorController {
	private IC opt;
	
	public ColorController(IC opt) {
		this.opt = opt;
	}
	
	public void execute(int valeur, Coulor c) throws Exception {
		opt.setColor(valeur, c);
	}
}
