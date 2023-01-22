package controllers;
import models.Coulor;

public class ControllerGreen implements IC {
	@Override
	public void setColor(int valeur,Coulor c) throws Exception {
		c.setV(valeur);
	}
}