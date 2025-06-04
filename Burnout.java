public class Burnout{

    private int currentBurn;
    private int incrementPerAction;
    public Burnout(int initialVal, int incrementPerAction){
        currentBurn = initialVal;
        this.incrementPerAction = incrementPerAction;


    }

    public void addBurn(){
        currentBurn+= incrementPerAction;

    }
    public void addBurn(int val){
        currentBurn+= val;
        if(currentBurn<0){
            currentBurn=0;
        }

    }
    public int getBurn(){
        return currentBurn;

    }
    public void setBurn(int val){
        currentBurn = val;

    }


}