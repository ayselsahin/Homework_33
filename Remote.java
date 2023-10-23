package homework_33;
import java.util.Random;


import java.util.Scanner;

public class Remote {

    private static  Random rand = new Random();

    private Scanner scanner = new Scanner(System.in);
    public int   ON( int channelNo){

        int n = rand.nextInt(5);
        return n;

    }

    public int Listen(){

        return scanner.nextInt();
    }
}
