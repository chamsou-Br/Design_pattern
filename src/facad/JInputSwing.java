package facad;
import controllers.*;
import vues.Vue;

import javax.swing.JTextField;
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
            IC ICB = new ControllerBlue();
            IC ICR = new ControllerRed();
            IC ICG = new ControllerGreen();
            if(e.getSource().equals(v.inputBleu.getInput())) {
                ColorController ctrl = new ColorController();
                try {
                     ctrl.execute(Integer.parseInt(v.inputBleu.getInput().getText()), v.c,ICB);
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
            else if(e.getSource().equals(v.inputRouge.getInput())) {
                ColorController ctrl = new ColorController();
                try {
                    ctrl.execute(Integer.parseInt(v.inputRouge.getInput().getText()), v.c,ICR);
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
            else if(e.getSource().equals(v.inputVert.getInput())) {
                ColorController ctrl = new ColorController();
                try {
                    ctrl.execute(Integer.parseInt(v.inputVert.getInput().getText()), v.c,ICG);
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }

        }
    }



}
