public class Option{
    private int netDamage;
    private int maxDamage;
    public int staminaCon;
    private int scaleFactor=1;
    private Burnout burn;
    public Option(int netDamage, int initialBurn, int baseIncrement, int staminaCon){
    burn = new Burnout(initialBurn, baseIncrement);
    maxDamage=netDamage;
    this.netDamage=netDamage;
    this.staminaCon =staminaCon;
    }
    public void burnPenalty(){
        staminaCon+= burn.getBurn()*scaleFactor;
        if(burn.getBurn()>netDamage){
            netDamage=0;
        }
        else{
            netDamage-=burn.getBurn();

        }

    }
    public int useOption(){
        burn.addBurn();
        return netDamage;

    }
    public void reduceBurn(int reductionAmount){
        burn.addBurn(-1*reductionAmount);
        if(netDamage+reductionAmount>=maxDamage){
            netDamage=maxDamage;


        }

        else{
        netDamage+=reductionAmount;  

        }

    } 
    

}