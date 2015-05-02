import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;


public class Window2 {
	//Input: n antal fönster
	//Input: n rader med fönstrens storlek beskrivet av 4 tal
	//t.ex. x1, y1 (nedre vänstra hörnet) och x2, y2 (övre högra hörnet)
	//n är mellan 1 och 1000, x1<x2 och y1<y2
	// 10 000 x 10 000 

	public Window2 () {
		
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Läser in antalet fönster
		int numWin = scan.nextInt();
		ArrayList<Rect> windowList = new ArrayList<Rect>();
		int[] coord = new int[4];
		for(int i=0; i<numWin; i++) {
			//initiera och lagra rectangle/winobj object i en arraylist
			//ge appropriate indata a.k.a coordinates
			for(int j=0;j<4;j++) {
				coord[j]=scan.nextInt();
			}
			int x = coord[0];
			int y = coord[1];
			int width = coord[2]-coord[0];
			int height = coord[3]-coord[1];
			
			/*
			System.out.println("x "+x);
			System.out.println("y "+y);
			System.out.println("w "+width);
			System.out.println("h "+height);*/
			
			Rect window = new Rect(x, y, width, height);
			windowList.add(window);
		}
		
		ArrayList <Rect> intersections = new ArrayList<Rect>();
		ArrayList <Rect> checkedWin = new ArrayList<Rect>();
		checkedWin.addAll(windowList);
		
		//intersECTION METOD FELAKTIG
		for(int i=0;i<windowList.size();i++) {
			Rect win = windowList.get(i);
			windowList.remove(win);
			for(int j=0; j<windowList.size(); j++) {
				Rect intsec = win.intersection(windowList.get(j));
				intersections.add(intsec);
			}
		}
		
		//Rect intersection = windowList.get(0).intersection(windowList.get(1));
		
		LinkedHashSet<Rect> unique = new LinkedHashSet<Rect>();
		unique.addAll(intersections);
		intersections.clear();
		intersections.addAll(unique);
		
		System.out.println("intsec size: "+intersections.size());
		for(int i=0; i<intersections.size(); i++) {
			System.out.println("intsec x: "+ intersections.get(i).x);
			System.out.println("intsec y: "+ intersections.get(i).y);
			System.out.println("intsec h: "+ intersections.get(i).h);
			System.out.println("intsec w: "+ intersections.get(i).w);
			
			System.out.println("-----------------------------------");
		}
		
		int area =0;
		for(int i =0; i<checkedWin.size();i++) {
			area += checkedWin.get(i).area();
			
		}
		int intsecArea =0;
		for(int i =0; i<intersections.size(); i++) {
			intsecArea+=intersections.get(i).area();
			
		}
		
		int totArea = area - intsecArea;
		System.out.println(totArea);
		
		scan.close();
	}

}

