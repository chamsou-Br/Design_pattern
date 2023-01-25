package facad;

import javax.swing.JLabel;

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
