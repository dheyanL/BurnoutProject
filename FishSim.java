public class FishSim{
    public static void main(){
        for (int i=0; i<100; i++){

            
            if ((int) Math.random()*2+1==1){
                if ((int) Math.random()*2+1==1){
                   Feintsim.passive.changeHp(Feintsim.aggro.useStoredOption(4));
                   Feintsim.aggro.changeHp(Feintsim.passive.useStoredOption(1));
                   Feintsim.passive.getOption(4).burnPenalty();
                   System.out.println("The Attacker has:" + Feintsim.aggro.getHp() + "The Defender has: " + Feintsim.passive.getHp());
    
                }
    
            }
            }

    }
}