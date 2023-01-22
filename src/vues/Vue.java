package vues;

import java.awt.Color;
import controllers.*;
import models.*;
import facad.*;

public class Vue extends JFramSwing implements Observer{
	private static final long serialVersionUID = 1L;

	public static Vue screen;
	public static Vue getinstance(Coulor color){
		if(Vue.screen==null){
			Vue.screen=new Vue(color);
		}
		return  Vue.screen;

	}


	public JLabelSwing labelBleu = new JLabelSwing("B:",30,48,15,50);
	public JLabelSwing labelRouge = new JLabelSwing("R:",30,248,15,50);
	public JLabelSwing labelVert = new JLabelSwing("v:",30,148,15,50);

	public JSlideSwing sliderBleu = new JSlideSwing(0,255,0,45,250,150,50);
	public JSlideSwing sliderRouge = new JSlideSwing(0,255,0,45,50,150,50);;
	public JSlideSwing sliderVert = new JSlideSwing(0,255,0,45,150,150,50);;

	public JInputSwing inputBleu = new JInputSwing("0",200,265,50,20);
	public JInputSwing inputRouge = new JInputSwing("0",200,65,50,20);
	public JInputSwing inputVert = new JInputSwing("0",200,165,50,20);
	
	public JPanelSwing couleur = new JPanelSwing(Color.BLACK,290,50,100,100);
	
	//	Controller
	public ColorController ctrl;
	
	//Model	
	public Coulor c;
	
	public Vue(Coulor col) {
		c = col;

		generateFrame(this);

		sliderRouge.addChangeListener(this);
		sliderBleu.addChangeListener(this);
		sliderVert.addChangeListener(this);

		inputBleu.addActionListener(this);
		inputRouge.addActionListener(this);
		inputVert.addActionListener(this);

	}
	
	@Override
	public void update() {
		int r = c.getR(), v=c.getV(), b=c.getB();
		inputRouge.getInput().setText(""+r);
		sliderRouge.getSlider().setValue(r);
		inputBleu.getInput().setText(""+b);
		sliderBleu.getSlider().setValue(b);
		inputVert.getInput().setText(""+v);
		sliderVert.getSlider().setValue(v);
		couleur.getCouleur().setBackground(new Color(r, v, b));
	}
	

	

}
