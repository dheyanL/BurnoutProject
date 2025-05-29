public class Option{
    private int netDamage;
    private Burnout burn;
    public Option(int netDamage, int initialBurn, int baseIncrement){
    burn = new Burnout(initialBurn, baseIncrement);

    }
    

}