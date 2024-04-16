public class Tank {
    public int pos=0;

    public void goForward(int i){
        pos+=i;
    }

    public void goBackward(int i){
        goForward(-i);
    }

    public void printPosition(){
        System.out.println("The Tank is at " + pos + " now "  );
    }
}
