package facad;

import controllers.ColorController;
import controllers.ControllerBlue;
import controllers.ControllerGreen;
import controllers.ControllerRed;
import vues.Vue;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSlideSwing {

    JSlider slider;

    Vue v;
    public  JSlideSwing(int min,int max,int value,int x,int y,int w,int h){
        this.slider = generatorSlide(min,max,value,x,y,w,h);
    }

    public JSlider getSlider() {
        return slider;
    }

    public JSlider setBoundInput(JSlider slide, int x, int y, int w, int h) {
        slide.setBounds(x,y,w,h);
        return slide;
    }
    public JSlider generatorSlide(int min,int max,int value,int x,int y,int w,int h){
        JSlider slider;
        slider = setBoundInput(new JSlider( min, max, value),x, y, w, h);
        return slider ;
    }
    public void addChangeListener(Vue v) {
        this.v = v ;
        sliderHandler sliderHandler = new sliderHandler();
        this.slider.addChangeListener(sliderHandler);
    }

    class sliderHandler implements ChangeListener {
        public void stateChanged(ChangeEvent e) {
            if(e.getSource().equals(v.sliderBleu.getSlider())) {
                v.ctrl = new ColorController(new ControllerBlue());
                try {
                    v.ctrl.execute(v.sliderBleu.getSlider().getValue(), v.c);
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
            else if(e.getSource().equals(v.sliderRouge.getSlider())) {
                v.ctrl = new ColorController(new ControllerRed());
                try {
                    v.ctrl.execute(v.sliderRouge.getSlider().getValue(), v.c);
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
            else if(e.getSource().equals(v.sliderVert.getSlider())){
                v.ctrl = new ColorController(new ControllerGreen());
                try {
                    v.ctrl.execute(v.sliderVert.getSlider().getValue(), v.c);
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
            else if(e.getSource().equals(v.inputBleu)) {
                v.ctrl = new ColorController(new ControllerBlue());
                try {
                    v.ctrl.execute(Integer.parseInt(v.inputBleu.getInput().getText()), v.c);
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
            else if(e.getSource().equals(v.inputRouge)) {
                v.ctrl = new ColorController(new ControllerBlue());
                try {
                    v.ctrl.execute(Integer.parseInt(v.inputRouge.getInput().getText()), v.c);
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
            else if(e.getSource().equals(v.inputVert)) {
                v.ctrl = new ColorController(new ControllerBlue());
                try {
                    v.ctrl.execute(Integer.parseInt(v.inputVert.getInput().getText()), v.c);
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }

        }
    }



}
