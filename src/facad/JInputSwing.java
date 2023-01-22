package facad;
import controllers.ColorController;
import controllers.ControllerBlue;
import controllers.ControllerGreen;
import controllers.ControllerRed;
import vues.Vue;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JInputSwing  {


    private JTextField input;

    private Vue v;
    public  JInputSwing(String text,int x,int y,int w,int h){
        this.input = this.generatorInput(text,x,y,w,h);
    }

    public JTextField getInput() {
        return input;
    }

    public JTextField setBoundInput(JTextField input, int x, int y, int w, int h) {
        input.setBounds(x,y,w,h);
        return input;
    }
    public JTextField generatorInput(String text,int x,int y,int w,int h){
        JTextField input;
        input = setBoundInput(new JTextField(text),x, y, w, h);
        return input ;
    }
    public void addActionListener (Vue v) {
        this.v = v;
        inputHandler inputHandler = new inputHandler();
        this.input.addActionListener(inputHandler);
    }

    class inputHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource().equals(v.inputBleu.getInput())) {
                v.ctrl = new ColorController(new ControllerBlue());
                try {
                    v.ctrl.execute(Integer.parseInt(v.inputBleu.getInput().getText()), v.c);
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
            else if(e.getSource().equals(v.inputRouge.getInput())) {
                v.ctrl = new ColorController(new ControllerRed());
                try {
                    v.ctrl.execute(Integer.parseInt(v.inputRouge.getInput().getText()), v.c);
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
            else if(e.getSource().equals(v.inputVert.getInput())) {
                v.ctrl = new ColorController(new ControllerGreen());
                try {
                    v.ctrl.execute(Integer.parseInt(v.inputVert.getInput().getText()), v.c);
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }

        }
    }



}
