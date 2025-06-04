public class Option{
    private int netDamage;
    private int maxDamage;
    public int staminaCon;
    private int maxStaminaCon;
    private int scaleFactor=10;
    private Burnout burn;
    public Option(int netDamage, int initialBurn, int baseIncrement, int staminaCon, int scaling){
    burn = new Burnout(initialBurn, baseIncrement);
    maxDamage=netDamage;
    this.netDamage=netDamage;
    this.staminaCon =staminaCon;
    scaleFactor=scaling;
    }

    public void setScaling(int scale){
        scaleFactor=scale;

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
    public void burnStaminaPenalty(){
        staminaCon+= burn.getBurn()*scaleFactor;

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
        
        if(staminaCon+reductionAmount*scaleFactor>=maxStaminaCon){
            staminaCon=maxStaminaCon;


        }

        else{
        staminaCon+=reductionAmount*scaleFactor;  

        }
        

    } 
    

}