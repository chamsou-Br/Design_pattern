package facad;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import controllers.*;
import models.*;
public class JLabelSwing {


    private JLabel label ;
    public  JLabelSwing(String text,int x,int y,int w,int h){
        this.label = generatorLabel(text,x,y,w,h);
    }

    public JLabel getLabel(){
        return label;
    }


    public JLabel setBoundLable(JLabel label,int x,int y,int w,int h) {
        label.setBounds(x,y,w,h);
        return label;
    }

    public JLabel generatorLabel(String text,int x,int y,int w,int h){
        JLabel label;
        label = setBoundLable(new JLabel(text),x, y, w, h);
        return label ;
    }
}
