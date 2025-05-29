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

    }
    public int getBurn(){
        return currentBurn;

    }
    public void setBurn(int val){
        currrentBurn = val;

    }


}