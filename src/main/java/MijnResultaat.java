import java.util.concurrent.TimeUnit;

public class MijnResultaat {
    int[][] resultaat = new int[8][6];

    void printResultaat() {
        int rows = 8;
        int cols = 6;
        //int n = 0;


        for (int r = 0; r < rows; r++)
        { System.out.println();
            int c = 0 ;
            while (c < cols) {
                try {
                    TimeUnit.MILLISECONDS.sleep(1);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                // System.out.print(resultaat[r] [c] + " ");
                System.out.print( String.format("%02d", resultaat[r][c]) + "  ");
                // System.out.println(" ");
                c++;
            }
        }
    }

    void plaatsGetal(int n) {
        boolean klaar = false;
        for (int r = 0; r < 8; r++)
            //{ System.out.println();
            for (int c = 0; c < 6; c++)
            {
                if (resultaat[r][c] == 0  && !klaar ) {
                    resultaat[r][c] = n;
                    //System.out.println("nog nul");
                    klaar = true;
                }
            }
    }
    void plaatsGetalVar1(int n) {
        boolean klaar = false;
        for (int c = 0; c < 6; c++)
            //{ System.out.println();
            for (int r = 0; r < 8; r++)
            {
                if (resultaat[r][c] == 0  && !klaar ) {
                    //if (resultaat[r][c] == 0 ) {
                    resultaat[r][c] = n;
                    //System.out.println("nog nul");
                    klaar = true;
                }
            }
    }
    void plaatsGetalMy(int n) {
        boolean klaar = false;
        for (int r = 0; r < 8; r++)
            //{ System.out.println();
            for (int c = 0; c < 6; c++)
            {
                if (resultaat[r][c] == 0  && !klaar ) {
                    resultaat[r][c] = n;
                    //System.out.println("nog nul");
                    klaar = true;
                }
            }
    }
}

