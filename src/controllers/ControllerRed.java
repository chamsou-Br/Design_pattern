package controllers;
import models.Coulor;

public class ControllerRed implements IC{
	@Override
	public void setColor(int valeur,Coulor c) throws Exception {
		c.setR(valeur);
	}
}
