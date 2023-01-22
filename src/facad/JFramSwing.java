package facad;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import controllers.*;
import models.*;
import facad.*;

import vues.*;
public class JFramSwing extends JFrame{

    public JFramSwing(){

    }
    public  void  generateFrame(Vue v){
        setBounds(250,150,490,400);
        setLayout(null);
        add(v.labelRouge.getLabel());
        add(v.labelVert.getLabel());
        add(v.labelBleu.getLabel());
        add(v.sliderRouge.getSlider());
        add(v.sliderVert.getSlider());
        add(v.sliderBleu.getSlider());
        add(v.inputRouge.getInput());
        add(v.inputVert.getInput());
        add(v.inputBleu.getInput());
        add(v.couleur.getCouleur());

    }
}
