package homework_33;

public class Channel {

    private String[] Programs;
    private int count;

    public Channel( String[] plist ) {


        this.Programs = plist;

    }

    public String getRandomProgram(int no ) {
        return Programs[no];
    }



}
