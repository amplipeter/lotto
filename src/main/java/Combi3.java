
public class Combi3 {
	int resultaat[][] = new int[100][3];

	void printResultaat() {
		int rows = 10;
		int cols = 5;

		for (int r = 0; r < rows; r++)
		{ System.out.println();
		  for (int c = 0; c < cols; c++)
		  {
			 // System.out.print(resultaat[r] [c] + " ");
			  //System.out.print( String.format("%02d", resultaat[r][c]) + "  ");
			 // System.out.println(" ");
		  }
		}
	}
	void plaatsGetal(int n) {
		boolean klaar = false;
		for (int r = 0; r < 10; r++)
		//{ System.out.println();
		  for (int c = 0; c < 5; c++)
		  {
			  if (resultaat[r][c] == 0  && !klaar ) {
				  resultaat[r][c] = n;
				  //System.out.println("nog nul");
				  klaar = true;
		  }
		}
	}

}
