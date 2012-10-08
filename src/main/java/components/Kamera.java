package components;
/**
 * 
 * @author Roy Fochtman
 *
 */
public class Kamera implements Comparable<Kamera>{
	
	String marke;
	String modell;
	int gewicht;
	double aufloesung;
	String bildsensor;
	int preis;
	
	public Kamera(){
		marke = "Nikon";
		modell = "D3000";
		gewicht = 485;
		aufloesung = 10.2;
		bildsensor = "CCD";
		preis = 300;
	}
	
	public Kamera(String marke, String modell, int gewicht, double aufloesung, String bildsensor, int preis){
		this.marke = marke;
		this.modell = modell;
		this.gewicht = gewicht;
		this.aufloesung = aufloesung;
		this.bildsensor = bildsensor;
		this.preis = preis;
	}
	
	public String marke(){
		return this.marke;
	}
	
	public String modell(){
		return this.modell;
	}
	
	public int gewicht(){
		return this.gewicht;
	}
	
	public double aufloesung(){
		return this.aufloesung;
	}
	
	public String bildsensor(){
		return this.bildsensor;
	}
	
	public int preis(){
		return this.preis;
	}
	
	public String toString(){
		return this.marke + " " + this.modell;
	}

	@Override
	public int compareTo(Kamera compareCamera) {
		
		return this.preis - compareCamera.preis;
	}
	
}
