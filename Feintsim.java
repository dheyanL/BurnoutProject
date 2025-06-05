// assumes double dash, negative penalty works as intended
public class Feintsim{
   public  Character randOption;
    public Character aggro;
    public  Character passive;
    public Feintsim(){
        randOption = new Character(100, 100,20);
        aggro = new Character(100, 100,20);
        passive = new Character (100,100,20);
        aggro.addOption(4, 0, 0, 20,0 );
        
        aggro.addOption(6, 0, 2, 35,5 );
        aggro.addOption(0, 0, 2, 35, 5 );
        aggro.addOption(0, 0, 0, 20, 0 );
        passive.addOption(6,0,4,10, 5);
        passive.addOption(0,0,1,10, 5);
    }




    

}