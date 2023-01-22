package models;
import java.util.Vector;
import vues.Observer;

public interface Observable {
	Vector<Observer> observers = new Vector<Observer>();
	
	public void addObserver(Observer o);
	public void removeObserver(Observer o);
	
	public void notifyAllObservateur();
}
