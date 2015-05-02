import java.util.*;


public class OrdTillTal {

	public static void main(String[] args) {
		HashMap<String, Integer> tal = new HashMap<String, Integer>();
		tal.put("ett", 1);
		tal.put("en", 1);
		tal.put("två", 2);
		tal.put("tre", 3);
		tal.put("fyra", 4);
		tal.put("fem", 5);
		tal.put("sex", 6);
		tal.put("sju", 7);
		tal.put("åtta", 8);
		tal.put("nio", 9);
		tal.put("tio", 10);
		tal.put("elva", 11);
		tal.put("tolv", 12);
		tal.put("tretton", 13);
		tal.put("fjorton", 14);
		tal.put("femton", 15);
		tal.put("sexton", 16);
		tal.put("sjutton", 17);
		tal.put("arton", 18);
		tal.put("nitton", 19);
		tal.put("tjugo", 20);
		tal.put("trettio", 30);
		tal.put("fyrtio", 40);
		tal.put("femtio", 50);
		tal.put("sextio", 60);
		tal.put("sjuttio", 70);
		tal.put("åttio", 80);
		tal.put("nittio", 90);
		tal.put("hundra", 100);
		tal.put("tusen", 1000);
		tal.put("miljon", 1000000);
		tal.put("miljoner", 1000000);
		tal.put("miljard", 1000000000);
		tal.put("miljarder", 1000000000);

		//Läs in hela raden
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		//splitta på mellanslag och lägg i en lista
		String inputList[] = input.split(" ");




		//specialfall som ej hanteras
		// tolv hundra - skrivs som ett tusen två hundra
		// hundra elva - skrivs som ett hundra elva

		// fall som hanteras
		// åtta hundra åttio åtta
		// åtta miljoner åtta hundra åttio tusen åtta	



		// typ av tal			index
		//[hundra miljarder]	0
		//[tio miljarder]		1	
		//[miljard]				2
		//[hundra miljoner]		3
		//[tio miljoner]		4
		//[miljon]				5
		//[hundratusen]			6
		//[tiotusen]			7
		//[tusen]				8
		//[hundra]				9
		//[ental/tiotal]		10


		//dela upp på följande vis
		// 997 miljarder stoppas på index 0
		// 1 miljon stoppas på index 5 
		// 543 tusen stoppas på index 6 
		// 1 hundra stoppas på index 9
		// 18 stoppas på index 10

		int[] outputNumbers = new int[12];
		for(int i =0; i<outputNumbers.length; i++) {
			outputNumbers[i]=0;
		}
		/*ArrayList parts = new ArrayList();

		for(int i=0; i<inputList.length; i++) {
			parts.add(tal.get(inputList[i]));
			System.out.println("PART: "+parts.get(i));

		}*/

		int tusenIdx = 0;
		int miljonIdx = 0;
		int miljardIdx = 0;

		//loopa igenom listan
		for(int i=0; i<inputList.length; i++) {
			if (inputList[i].equals("tusen")) {
				tusenIdx=i;
			} else if(inputList[i].equals("miljon") || inputList[i].equals("miljoner")) {
				miljonIdx=i;
			} else if(inputList[i].equals("miljard") || inputList[i].equals("miljarder")) {
				miljardIdx=i;
			}

			//plocka motsvarande heltal i strängform från en hashmap
			//beroende på sträng, placera på ett visst index i en arraylist
		}
		//System.out.println("tusen: "+tusenIdx+" miljon: "+miljonIdx+" miljard: "+miljardIdx);

		if(miljardIdx != 0) {
			for(int i = 0; i<miljardIdx; i++) {
				if(tal.get(inputList[i])<= 9  && i !=(inputList.length-1)) {
					if(inputList[i+1].equals("hundra")) {
						outputNumbers[0] = tal.get(inputList[i])*tal.get(inputList[i+1]);
					} else {
						outputNumbers[2]=tal.get(inputList[i]);
					}
				} else if(tal.get(inputList[i]) <=90 && tal.get(inputList[i]) >= 10 ){
					outputNumbers[1] = tal.get(inputList[i]); 
				} else if(tal.get(inputList[i])<= 9) {
					outputNumbers[2]=tal.get(inputList[i]);
				}
			}

			/*for(int j=0; j<3; j++) {
				System.out.println("Output at idx " +j+ ", value : "+outputNumbers[j]);
			}*/
		} 

		if(miljonIdx !=0) {
			for(int i = miljardIdx; i<miljonIdx; i++) {
				if(tal.get(inputList[i])<= 9  && i !=(inputList.length-1)) {
					if(inputList[i+1].equals("hundra")) {
						outputNumbers[3] = tal.get(inputList[i])*tal.get(inputList[i+1]);
					} else {
						outputNumbers[5] = tal.get(inputList[i]);
					}
				} else if(tal.get(inputList[i]) <=90 && tal.get(inputList[i]) >= 10 ){
					outputNumbers[4] = tal.get(inputList[i]); 
				} else if(tal.get(inputList[i])<= 9) {
					outputNumbers[5] = tal.get(inputList[i]);
				}
			}
			/*System.out.println("idx 3 hundRA miljoner "+outputNumbers[3]);
			System.out.println("idx 4 tio miljoner "+outputNumbers[4]);
			System.out.println("idx 5 miljon "+outputNumbers[5]);*/
		}

			if(tusenIdx !=0) {
				for(int i = miljonIdx; i<tusenIdx; i++) {
					if(tal.get(inputList[i])<= 9  && i !=(inputList.length-1)  ) {
						if(inputList[i+1].equals("hundra")) {
							outputNumbers[6] = tal.get(inputList[i])*tal.get(inputList[i+1]);
						} else {
							outputNumbers[8] = tal.get(inputList[i]);
						}
					} else if(tal.get(inputList[i]) <=90 && tal.get(inputList[i]) >= 10 ){
						outputNumbers[7] = tal.get(inputList[i]); 
					} else if(tal.get(inputList[i])<= 9) {
						outputNumbers[8] = tal.get(inputList[i]);
					}
				}
				/*System.out.println("idx 6 hundRA tusen "+outputNumbers[6]);
			System.out.println("idx 7 tio tusen "+outputNumbers[7]);
			System.out.println("idx 8 hundRA tusen "+outputNumbers[8]);*/
			}

			for(int i=tusenIdx; i<inputList.length; i++) {
				if(tal.get(inputList[i])<= 9 && i !=(inputList.length-1)) {
					if(inputList[i+1].equals("hundra")) {
						outputNumbers[9] = tal.get(inputList[i])*tal.get(inputList[i+1]);
					} else {
						outputNumbers[11] = tal.get(inputList[i]);
					}
				} else if(tal.get(inputList[i])<= 9) {
					outputNumbers[11] = tal.get(inputList[i]);
				} else if(tal.get(inputList[i]) <=90 && tal.get(inputList[i]) >= 10 ){
					outputNumbers[10] = tal.get(inputList[i]); 
				}

			}
			//System.out.println("idx 9 hundRA "+outputNumbers[9]);
			//System.out.println("idx 10 tiotal "+outputNumbers[10]);
			//System.out.println("idx 11 ental "+outputNumbers[11]);


			//utdata  skapas genom att loopa igenom arraylisten och addera


			long outputMiljard = (long) (outputNumbers[0]+outputNumbers[1]+outputNumbers[2])*1000000000;
			long outputMiljon = (outputNumbers[3]+outputNumbers[4]+outputNumbers[5])*1000000;
			int outputTusen = (outputNumbers[6]+outputNumbers[7]+outputNumbers[8])*1000;
			int resterande = outputNumbers[9] + outputNumbers[10] + outputNumbers[11];
			/*System.out.println("miljarder: "+outputMiljard);
		System.out.println("miljoner: "+outputMiljon);
		System.out.println("tusen: "+outputTusen);
		System.out.println("rest: "+resterande);*/

			long output = outputMiljard+outputMiljon+outputTusen+resterande;
			System.out.print(output);
		}
	}
