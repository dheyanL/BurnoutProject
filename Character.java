import java.util.ArrayList;

public class Character{
private int totalHP;
private int stamina;
private int maxStamina;
private int currentHp;
private ArrayList<Option> storedOptions = new ArrayList<>();
public Character(int totalHP, int stamina){
    this.totalHP=totalHP;
    this.stamina=stamina;
    maxStamina=stamina;
    currentHp=totalHP;
    storedOptions.add(new Option(0,0,0,0));
}

public void addOption(int netDamage, int initialBurn, int baseIncrement, int staminaCon){
    storedOptions.add(new Option(netDamage, intialBurn, baseIncrement, int staminaCon));
}
public Option getOption(int optionNumber){
    return storedOptions.get(optionNumber); 

}

public void changeStamina(int amount){
    if(stamina+amount>=maxStamina){
        stamina=maxStamina;

    }
    else if(stamina+amount<=0){
        stamina=0;
    }
    else{
        stamina+= amount;

    }

}
public void changeHp(int amount){
    if(currentHp+amount>=totalHP){
        currentHp=totalHP;

    }
    else if(currentHp+amount<=0){
        currentHp=0;
    }
    else{
        currentHp+= amount;

    }
}
public int getHp(){
    return currentHp;
}
public int getStamina(){
    return stamina;
}

}