
public class Rect {

	int x,y, h, w;
	
	public Rect(int x, int y, int w, int h) {
		// TODO Auto-generated constructor stub
		this.x=x;
		this.y=y;
		this.w=w;
		this.h=h;
	}

	public Rect intersection(Rect r2) {
		int newX = Math.max(this.x, r2.x);
		int newY = Math.max(this.y, r2.y);
		int newW = Math.min(this.x+this.w, r2.y+r2.w) - newX;
		int newH = Math.min(this.y+this.h, r2.y+r2.h) - newY;
		
		if(this.area()<0) 
			return null;
		else
			return new Rect(newX, newY, newW, newH);
		
	}
	
	public int area () {
		return this.w*this.h;
	}
	
	
}
