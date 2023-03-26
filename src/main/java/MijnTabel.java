import java.util.ArrayList;

public class MijnTabel {
    int tabelgrootte = 48;
    ArrayList<Integer> lottotabel = new ArrayList<>(tabelgrootte);


    void vulTabel() {
        for(int i=0 ; i < tabelgrootte ; i++) {
            lottotabel.add(i+1);
        }
    }
    void printTabel() {
        System.out.println(lottotabel);

    }
    void haalUitLijst( int n) {

        lottotabel.set(n-1, 99);
    }
}
