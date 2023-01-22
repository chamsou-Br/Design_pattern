package controllers;
import models.Coulor;

public class ControllerBlue implements IC{
	@Override
	public void setColor (int valeur,Coulor c) throws Exception {
		c.setB(valeur);
	}
}
