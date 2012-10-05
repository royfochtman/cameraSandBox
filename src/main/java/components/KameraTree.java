package components;

import java.util.SortedSet;
import java.util.TreeSet;


public class KameraTree {

	private final SortedSet<Kamera> rememberedCameras = new TreeSet<Kamera>();
	
	private final Kamera nikonD3000 = new Kamera();
	private final Kamera nikonD3100 = new Kamera("Nikon", "D3100", 454, 14.2, "CMOS", 322);
	private final Kamera nikonD3200 = new Kamera("Nikon", "D3200", 454, 24.2, "CMOS", 478);
	private final Kamera nikonD5000 = new Kamera("Nikon", "D5000", 558, 12.3, "CMOS", 344);
	private final Kamera nikonD5100 = new Kamera("Nikon", "D5100", 558, 16.2, "CMOS", 489);
	private final Kamera nikonD90 = new Kamera("Nikon", "D90", 621, 12.3, "CMOS", 555);
	private final Kamera nikonD7000 = new Kamera("Nikon", "D7000", 689, 16.2, "CMOS", 789);
	private final Kamera nikonD300s = new Kamera("Nikon", "D300s", 830, 12.3, "CMOS", 529);
	private final Kamera nikonD600 = new Kamera("Nikon", "D600", 762, 24.3, "CMOS", 1950);
	private final Kamera nikonD800 = new Kamera("Nikon", "D800", 898, 36.3, "CMOS", 2564);
	private final Kamera nikonD3s = new Kamera("Nikon", "D3s", 1240, 12.1, "CMOS", 4740);
	private final Kamera nikonD3x = new Kamera("Nikon", "D3x", 1200, 24.5, "CMOS", 7700);
	private final Kamera nikonD4 = new Kamera("Nikon", "D4", 1340, 16.2, "CMOS", 4633);
	
	
	
	public KameraTree(){
		
		rememberedCameras.add(nikonD3000);
		rememberedCameras.add(nikonD3100);
		rememberedCameras.add(nikonD3200);
		rememberedCameras.add(nikonD5000);
		rememberedCameras.add(nikonD5100);
		rememberedCameras.add(nikonD90);
		rememberedCameras.add(nikonD7000);
		rememberedCameras.add(nikonD300s);
		rememberedCameras.add(nikonD600);
		rememberedCameras.add(nikonD800);
		rememberedCameras.add(nikonD3s);
		rememberedCameras.add(nikonD3x);
		rememberedCameras.add(nikonD4);
		
		
	}
	
	public SortedSet<Kamera> getTree(){
		return rememberedCameras;
	}
	
	
	
}
