import java.util.*;


public class OrdTillTal {

	public static void main(String[] args) {
		HashMap<String, String> tal = new HashMap<String, String>();
		tal.put("ett", "1");
		tal.put("en", "1");
		tal.put("tv�", "2");
		tal.put("tre", "3");
		tal.put("fyra", "4");
		tal.put("fem", "5");
		tal.put("sex", "6");
		tal.put("sju", "7");
		tal.put("�tta", "8");
		tal.put("nio", "9");
		tal.put("tio", "10");
		tal.put("elva", "11");
		tal.put("tolv", "12");
		tal.put("tretton", "13");
		tal.put("fjorton", "14");
		tal.put("femton", "15");
		tal.put("sexton", "16");
		tal.put("sjutton", "17");
		tal.put("arton", "18");
		tal.put("nitton", "19");
		tal.put("tjugo", "20");
		tal.put("trettio", "30");
		tal.put("fyrtio", "40");
		tal.put("femtio", "50");
		tal.put("sextio", "60");
		tal.put("sjuttio", "70");
		tal.put("�ttio", "80");
		tal.put("nittio", "90");
		tal.put("hundra", "100");
		tal.put("tusen", "1000");
		tal.put("miljon", "1000000");
		tal.put("miljoner", "1000000");
		tal.put("miljard", "1000000000");
		tal.put("miljarder", "1000000000");

		//L�s in str�ngar och stoppa i en lista
		//loopa igenom listan och
		//plocka motsvarande heltal i str�ngform fr�n en hashmap
		//beroende p� str�ng, placera p� ett visst index i en arraylist
		//utdata str�ngen skapas genom att loopa igenom arraylisten och addera
		//str�ngarna med varandra i int form


		//[hundra miljarder][tio miljarder][miljard][hundra miljoner]
		//[tio miljoner][miljon][hundratusen][tiotusen][tusen][hundra]
		//[ental/tiotal]

		ArrayList<String> outputNumbers = new ArrayList<String>(11);


		//L�s in hela raden
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		//splitta p� mellanslag och l�gg i en lista
		String inputList[] = input.split(" ");
		//loopa igenom listan
		for(int i=0; i<inputList.length; i++) {
			//if
			
			//om list[i+1] == hundra stoppa p� specifik plats i output
			//om list[i] == tjugo stoppa p� specifik plats i output
		}
		



	}

}
