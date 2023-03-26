import java.util.Random;
import java.util.concurrent.TimeUnit;

class Tester {
	static int totaal = 0;
	static int totaal1 = 0;
	static int KostteMe = 1;
	/*
	 * static int Magic = 11; 10 is ook mooie verdeling Magic must be greater
	 * then 1 !! otherwise infinit loop Magic = 2 gives straight table;
	 * sequential 1 to 50 Magic = 3 gives only max +1 allowed from number taken
	 */

	static int Magic = 17;//it is ok

	public static void main(String[] args) {
		MijnTabel lotje = new MijnTabel();
		lotje.vulTabel();

		MijnResultaat[] uitkomst = new MijnResultaat[3];
		uitkomst[0] = new MijnResultaat();
		uitkomst[1] = new MijnResultaat();
		uitkomst[2] = new MijnResultaat();

		lotje.printTabel();
		Random rand = new Random();
		int n = 0;
		while (totaal < 45) {
			// n = rand.nextInt(45) + 1;
			// n = totaal + 1;
			try {
				TimeUnit.MILLISECONDS.sleep(10);
				n = rand.nextInt(45) + 1;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (n - totaal < Magic) {
				if (lotje.lottotabel.contains(n)) {
					totaal1 = totaal + 1;
					// System.out.println("n = " + n + " " + " verschil = " + (n
					// - totaal) );
					System.out.println(
							"getal: " + totaal1 + " succes bij poging:  " + KostteMe + " Getrokken : " + n
									+ " verschil = " + (n - 1 - totaal) + " nog te gaan: " + (45 - 1 - totaal));
					uitkomst[0].plaatsGetal(n);
					uitkomst[1].plaatsGetalVar1(n);
					uitkomst[2].plaatsGetalMy(n);
					lotje.haalUitLijst(n);
					KostteMe = 1;
					//lotje.printTabel();
					totaal++;
				} else {
					KostteMe = KostteMe + 1;
					System.out.println(n + " is al geweest");
				}
			}
			//System.out.println(" shit random choice....." + n + " makes: " + (n - totaal) );
		}
		uitkomst[0].printResultaat();
		System.out.println("");
		System.out.println("-gebruik deze----------------");
		uitkomst[1].printResultaat();
		System.out.println("");
		System.out.println("-----------------");
		System.out.println("");

		//uitkomst[2].printResultaat2();
	}
}

