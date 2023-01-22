package facad;

import javax.swing.*;
import java.awt.*;

public class JPanelSwing {

    private JPanel couleur;

    public  JPanelSwing(Color clr,int x,int y,int w,int h){
        this.couleur = generateJpanel(clr,x,y,w,h);
    }

    public JPanel getCouleur() {
        return couleur;
    }
    public JPanel setBoundPanel(JPanel clr,int x,int y,int w,int h) {
        clr.setBounds(x,y,w,h);
        return clr;
    }

    JPanel generateJpanel(Color clr,int x,int y,int w,int h){
        this.couleur  = this.setBoundPanel(new JPanel(),x,y,w,h);
        this.couleur.setBackground(clr);
        return this.couleur;
    }
}
