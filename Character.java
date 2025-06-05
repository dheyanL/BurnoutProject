import java.util.ArrayList;

public class Character{
private final int totalHP;
private int stamina;
private final int maxStamina;
public int currentHp;
private int stamRegenPerUse;
public ArrayList<Option> storedOptions = new ArrayList<>();
public Character(int totalHP, int stamina, int stamRegenPerUse){
    this.totalHP=totalHP;
    this.stamina=stamina;
    maxStamina=stamina;
    currentHp=totalHP;
    storedOptions.add(new Option(0,0,0,0,0));
}

public void addOption(int netDamage, int initialBurn, int baseIncrement, int staminaCon, int scaling){
    storedOptions.add(new Option(netDamage, initialBurn, baseIncrement, staminaCon, scaling));
}
public  Option getOption(int optionNumber){
    return storedOptions.get(optionNumber); 

}

public int useStoredOption(int optionNumber){
    if(storedOptions.get(optionNumber).staminaCon>=stamina){
        stamina -= storedOptions.get(optionNumber).staminaCon;
        stamina+= stamRegenPerUse;
        if(stamina>maxStamina){
            stamina=maxStamina;
        }
        return storedOptions.get(optionNumber).useOption();
    }
    else{
        stamina+= stamRegenPerUse;
        if(stamina>maxStamina){
            stamina=maxStamina;
        }
        return 0;
    }
}
public void changeStamina(int amount){
    if(stamina+amount>=maxStamina){
        stamina=maxStamina;

    }
    else if(stamina+amount<=0){
        stamina=0;
    }
    else{
        stamina+=amount;

    }

}
public void changeHp(int amount){
    if(currentHp-amount>=totalHP){
        currentHp=totalHP;

    }
    else if(currentHp-amount<=0){
        currentHp=0;
    }
    else{
        currentHp-=amount;

    }
}
public int getHp(){
    return currentHp;
}
public int getStamina(){
    return stamina;
}

}