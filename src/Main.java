import javax.swing.JFrame;
import models.Coulor;
import vues.Vue;

public class Main {
	public static void main(String[] args) {
		Coulor c = new Coulor();
		Vue vue = Vue.getinstance(c);
		c.addObserver(vue);
		vue.setVisible(true);
		vue.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
