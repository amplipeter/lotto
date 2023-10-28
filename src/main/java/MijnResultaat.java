import java.util.Random;
import java.util.concurrent.TimeUnit;

public class MijnResultaat {
    int resultaat[][] = new int[8][6];

    void printResultaat() {
        int rows = 8;
        int cols = 6;
        //int n = 0;
        Random rand = new Random();


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
    void printResultaat2() {

        System.out.println(" ");
        System.out.print( String.format("%02d", resultaat[0][0]) + "  ");
        System.out.print( String.format("%02d", resultaat[1][1]) + "  ");
        System.out.print( String.format("%02d", resultaat[2][2]) + "  ");
        System.out.print( String.format("%02d", resultaat[3][3]) + "  ");
        System.out.println( String.format("%02d", resultaat[4][4]) + "  ");
        //System.out.print(" ");
        System.out.print( String.format("%02d", resultaat[1][0]) + "  ");
        System.out.print( String.format("%02d", resultaat[2][1]) + "  ");
        System.out.print( String.format("%02d", resultaat[3][2]) + "  ");
        System.out.print( String.format("%02d", resultaat[4][3]) + "  ");
        System.out.println( String.format("%02d", resultaat[5][4]) + "  ");
        //System.out.print(" ");

        System.out.print( String.format("%02d", resultaat[2][0]) + "  ");
        System.out.print( String.format("%02d", resultaat[3][1]) + "  ");
        System.out.print( String.format("%02d", resultaat[4][2]) + "  ");
        System.out.print( String.format("%02d", resultaat[5][3]) + "  ");
        System.out.println( String.format("%02d", resultaat[6][4]) + "  ");

        System.out.print( String.format("%02d", resultaat[3][0]) + "  ");
        System.out.print( String.format("%02d", resultaat[4][1]) + "  ");
        System.out.print( String.format("%02d", resultaat[5][2]) + "  ");
        System.out.print( String.format("%02d", resultaat[6][3]) + "  ");
        System.out.println( String.format("%02d", resultaat[7][4]) + "  ");


        System.out.print( String.format("%02d", resultaat[4][0]) + "  ");
        System.out.print( String.format("%02d", resultaat[5][1]) + "  ");
        System.out.print( String.format("%02d", resultaat[6][2]) + "  ");
        System.out.print( String.format("%02d", resultaat[7][3]) + "  ");
        System.out.println( String.format("%02d", resultaat[8][4]) + "  ");


        System.out.print( String.format("%02d", resultaat[5][0]) + "  ");
        System.out.print( String.format("%02d", resultaat[6][1]) + "  ");
        System.out.print( String.format("%02d", resultaat[7][2]) + "  ");
        System.out.print( String.format("%02d", resultaat[8][3]) + "  ");
        System.out.println( String.format("%02d", resultaat[9][4]) + "  ");

        System.out.print( String.format("%02d", resultaat[6][0]) + "  ");
        System.out.print( String.format("%02d", resultaat[7][1]) + "  ");
        System.out.print( String.format("%02d", resultaat[8][2]) + "  ");
        System.out.print( String.format("%02d", resultaat[9][3]) + "  ");
        System.out.println( String.format("%02d", resultaat[0][4]) + "  ");

        System.out.print( String.format("%02d", resultaat[7][0]) + "  ");
        System.out.print( String.format("%02d", resultaat[8][1]) + "  ");
        System.out.print( String.format("%02d", resultaat[9][2]) + "  ");
        System.out.print( String.format("%02d", resultaat[0][3]) + "  ");
        System.out.println( String.format("%02d", resultaat[1][4]) + "  ");

        System.out.print( String.format("%02d", resultaat[8][0]) + "  ");
        System.out.print( String.format("%02d", resultaat[9][1]) + "  ");
        System.out.print( String.format("%02d", resultaat[0][2]) + "  ");
        System.out.print( String.format("%02d", resultaat[1][3]) + "  ");
        System.out.println( String.format("%02d", resultaat[2][4]) + "  ");

        System.out.print( String.format("%02d", resultaat[9][0]) + "  ");
        System.out.print( String.format("%02d", resultaat[0][1]) + "  ");
        System.out.print( String.format("%02d", resultaat[1][2]) + "  ");
        System.out.print( String.format("%02d", resultaat[2][3]) + "  ");
        System.out.println( String.format("%02d", resultaat[3][4]) + "  ");
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

