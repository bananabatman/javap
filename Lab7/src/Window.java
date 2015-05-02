import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;


public class Window {
	//Input: n antal fönster
	//Input: n rader med fönstrens storlek beskrivet av 4 tal
	//t.ex. x1, y1 (nedre vänstra hörnet) och x2, y2 (övre högra hörnet)
	//n är mellan 1 och 1000, x1<x2 och y1<y2
	// 10 000 x 10 000 

	public Window () {
		
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Läser in antalet fönster
		int numWin = scan.nextInt();
		ArrayList<Rectangle> windowList = new ArrayList<Rectangle>();
		int[] coord = new int[4];
		for(int i=0; i<numWin; i++) {
			//initiera och lagra rectangle/winobj object i en arraylist
			//ge appropriate indata a.k.a coordinates
			for(int j=0;j<4;j++) {
				coord[j]=scan.nextInt();
			}
			int x = coord[0];
			int y = coord[3];
			int width = coord[2]-coord[0];
			int height = coord[3]-coord[1];
			
			/*
			System.out.println("x "+x);
			System.out.println("y "+y);
			System.out.println("w "+width);
			System.out.println("h "+height);
			*/
			//coord upper left corner, width hegiht
			Rectangle window = new Rectangle(x, y, width, height);
			windowList.add(window);
		}
		
		// Hur intersect fungerar
		// Arraylista med alla intersections
		// Jämför "objekt för objekt" varje objekt med alla andra objekt 
		// och lagrar dessa intersections i en lista i form av Rectangles
	
		
		
		ArrayList <Rectangle> intersections = new ArrayList<Rectangle>();
		ArrayList <Rectangle> checkedWin = new ArrayList<Rectangle>();
		
		//intersECTION METOD FELAKTIG
		for(int i=0;i<windowList.size();i++) {
			Rectangle win = windowList.get(i);
			System.out.println("i " + i);
			checkedWin.add(win);
			
			for(int j=0; j<windowList.size(); j++) {
				
				Rectangle intsec = win.union(windowList.get(j));
				if(intsec.getWidth() > 0 && intsec.getHeight()>0) 
					intersections.add(intsec);
				System.out.println("j "+j);
				
			}
		}
		
		LinkedHashSet<Rectangle> unique = new LinkedHashSet<Rectangle>();
		unique.addAll(intersections);
		intersections.clear();
		intersections.addAll(unique);
		
		//summera alla rektanglars area
		//subtrahera den arean som intersectar
		//utnyttja rectangles union på nå vis?
		
		
		
		System.out.println("intsec size: "+intersections.size());
		for(int i=0; i<intersections.size(); i++) {
			System.out.println("intsec x: "+ intersections.get(i).getX());
			System.out.println("intsec y: "+ intersections.get(i).getY());
			System.out.println("intsec w: "+ intersections.get(i).getWidth());
			System.out.println("intsec y: "+ intersections.get(i).getHeight());
			
			System.out.println("-----------------------------------");
		}
		int area =0;
		for(int i =0; i<checkedWin.size();i++) {
			area += (int)checkedWin.get(i).getWidth()*(int)checkedWin.get(i).getHeight();
			
		}
		System.out.println("area: "+area);
		int intsecArea =0;
		for(int i =0; i<intersections.size(); i++) {
			intsecArea+=(int)intersections.get(i).getWidth()*(int)intersections.get(i).getHeight();
			
		}
		System.out.println("intsecarea "+intsecArea);
		scan.close();
	}

}

