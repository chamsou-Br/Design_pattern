package models;
import vues.Observer;

public class Coulor implements Observable{
	private int r;
	private int v;
	private int b;
	
	public Coulor() {
		r=0;
		v=0;
		b=0;
	}
	
	public int getR() {
		return r;
	}
	
	public void setR(int r) throws Exception {
		if(r<0 || r>255) throw new Exception("color code must be in 0-255");
		this.r=r;
		notifyAllObservateur();		
	}
	
	public int getV() {
		return v;
	}	
	public void setV(int v) throws Exception {
		if(v<0 || v>255) throw new Exception("color code must be in 0-255");
		this.v=v;
		notifyAllObservateur();
	}
	
	public int getB() {
		return b;
	}	
	public void setB(int b) throws Exception {
		if(b<0 || b>255) throw new Exception("color code must be in 0-255");
		this.b=b;
		notifyAllObservateur();
	}
	
	@Override
	public void notifyAllObservateur() {
		for(int i=0; i<observers.size(); i++) {
			observers.get(i).update();
		}
	}
	
	@Override
	public void addObserver(Observer o) {
		observers.add(o);
	}
	
	@Override
	public void removeObserver(Observer o) {
		observers.remove(v);
	}	
}
