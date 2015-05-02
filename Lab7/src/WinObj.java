import java.awt.Rectangle;
import java.util.ArrayList;


public class WinObj extends Rectangle {
	private int x1;
	private Object y1;
	private int x2;
	private int y2;

	public WinObj (int x1, int y1, int x2, int y2) {
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;

	}
	
	public int width() {
		double width = this.getWidth();
		return (int)width;
		
	}
	
	public int height() {
		double height = this.getHeight();
		return (int)height;
	}

	public WinObj intersection(ArrayList<WinObj> windowList, int i) {
		WinObj intersection = (WinObj) this.intersection(windowList.get(i));
		return intersection;
	}
	
	
	
	

		//KOlla infon om rectangle
	//använd rectangles intersect metod
	//använd rectangles width och height metoder
	//get och set metoder för koordinater
}
