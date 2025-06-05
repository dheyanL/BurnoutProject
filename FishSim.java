public class FishSim{
    public static Feintsim feintsim = new Feintsim();
    public static void run(){
        while (feintsim.aggro.getHp()>0&&feintsim.passive.getHp()>0){

            
            if ((int) (Math.random() * 2 + 1)==1){
                if ((int) (Math.random() * 2 + 1)==1){
                   feintsim.passive.changeHp(feintsim.aggro.useStoredOption(4));
                   feintsim.aggro.changeHp(feintsim.passive.useStoredOption(1));
                 //  feintsim.passive.getOption(1).burnPenalty();
                   System.out.println("The Attacker has: " + feintsim.aggro.getHp() + "The Defender has: " + feintsim.passive.getHp());
                
                }
                else{
                  feintsim.passive.changeHp(feintsim.aggro.useStoredOption(4));
                    feintsim.aggro.changeHp(feintsim.passive.useStoredOption(0));
                   System.out.println("The Attacker has: " + feintsim.aggro.getHp() + "The Defender has: " + feintsim.passive.getHp());
                    

                }

    
            }
            else{
                 if ((int) (Math.random()*2)+1==1){
                   feintsim.passive.changeHp(feintsim.aggro.useStoredOption(2));
                   feintsim.aggro.changeHp(feintsim.passive.useStoredOption(2));
                 //  feintsim.passive.getOption(2).burnPenalty();
                   System.out.println("The Attacker has: " + feintsim.aggro.getHp() + " The Defender has: " + feintsim.passive.getHp());
                   feintsim.aggro.getOption(2).burnStaminaPenalty();
                
                }
                else{
                  feintsim.passive.changeHp(feintsim.aggro.useStoredOption(3));
                    feintsim.aggro.changeHp(feintsim.passive.useStoredOption(1));
                   System.out.println("The Attacker has: " + feintsim.aggro.getHp() + " The Defender has: " + feintsim.passive.getHp());
                  // feintsim.passive.getOption(1).burnPenalty();
                   feintsim.aggro.getOption(3).burnStaminaPenalty();
                    

                }
            }
            }
        if(feintsim.aggro.getHp()==0){
            System.out.println("Passive player wins");
        }
        if(feintsim.passive.getHp()==0){
            System.out.println("Aggro player wins");
        }

    }
}