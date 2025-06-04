// assumes double dash, negative penalty works as intended
public class Feintsim{
   public static Character randOption;
    public static Character aggro;
    public  static Character passive;
    public  Feintsim(){
        Character randOption = new Character(100, 100,20);
        Character aggro = new Character(100, 100,20);
        Character passive = new Character (100,100,20);
        aggro.addOption(4, 0, 0, 20,0 );
        
        aggro.addOption(6, 0, 2, 35,5 );
        aggro.addOption(0, 0, 2, 35, 5 );
        aggro.addOption(0, 0, 0, 20, 0 );
        passive.addOption(6,0,4,10, 5);
        passive.addOption(0,0,1,10, 5);
    }




    

}