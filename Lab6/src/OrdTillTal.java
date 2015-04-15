import java.util.*;


public class OrdTillTal {

	//Läs in strängar och stoppa i en lista
	//loopa igenom listan och
	//plocka motsvarande heltal i strängform från en hashmap
	//beroende på sträng, placera på ett visst index i en arraylist
	//utdata strängen skapas genom att loopa igenom arraylisten och addera
	//strängarna med varandra
	//strängen konverteras till ett tal som skrivs ut 

	public static void main(String[] args) {
		HashMap<String, String> tal = new HashMap<String, String>();
		tal.put("ett", "1");
		tal.put("en", "1");
		tal.put("två", "2");
		tal.put("tre", "3");
		tal.put("fyra", "4");
		tal.put("fem", "5");
		tal.put("sex", "6");
		tal.put("sju", "7");
		tal.put("åtta", "8");
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
		
		ArrayList<String> dummaTal = new ArrayList<String>();
		dummaTal.add("hundra");
		dummaTal.add("hundra");
		dummaTal.add("tusen");
		dummaTal.add("miljon");
		dummaTal.add("miljoner");
		dummaTal.add("miljard");
		dummaTal.add("miljarder");
		
		//Läs in hela raden
		//splitta på mellanslag och lägg i en lista
		//loopa igenom listan
		//om list[i+1] == hundra stoppa på specifik plats i output
		//om list[i] == tjugo stoppa på specifik plats i output
		

		//[hundra miljarder][tio miljarder][miljard][hundra miljoner]
		//[tio miljoner][miljon][hundratusen][tiotusen][tusen][hundra]
		//[ental/tiotal]

		ArrayList<String> outputNumbers = new ArrayList<String>(11); 



	}

}
