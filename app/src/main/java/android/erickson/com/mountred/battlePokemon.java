package android.erickson.com.mountred;

/**
 * Created by Jake on 9/14/2018.
 */

public class battlePokemon
{
     private String name;
     private Type typeOne;
     private Type typeTwo;
     private int level;

     private Move slot1;
     private Move slot2;
     private Move slot3;
     private Move slot4;
     private String item; //for now lets assume that we will just use this as a string
    private String ability; //use a string again. nothing in database to interpret besides name
    private String nature;

    //will use evs in calculating the stat
    private int hp;
    private int attack;
    private int defense;
    private int sp_attack;
    private int sp_defense;
    private int speed;

    private String statusCondition; //maybe make into enum later

    //private int statModifier; //not sure what to do with this yet because this can effect all stats
    //for now ignore


    public battlePokemon(){
        //need default constructor to build pokemon
    }
    public battlePokemon(String name, Type typeOne, Type typeTwo, int level, Move slot1, Move slot2, Move slot3, Move slot4, String item, String ability, String nature, int hp, int attack, int defense, int sp_attack, int sp_defense, int speed, String statusCondition)
    {
        this.name = name;
        this.typeOne = typeOne;
        this.typeTwo = typeTwo;
        this.level = level;
        this.slot1 = slot1;
        this.slot2 = slot2;
        this.slot3 = slot3;
        this.slot4 = slot4;
        this.item = item;
        this.ability = ability;
        this.nature = nature;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.sp_attack = sp_attack;
        this.sp_defense = sp_defense;
        this.speed = speed;
        this.statusCondition = statusCondition;
    }

    public String getName() {
        return name;
    }

    public Type getTypeOne() {
        return typeOne;
    }

    public Type getTypeTwo() {
        return typeTwo;
    }

    public int getLevel() {
        return level;
    }

    public Move getSlot1() {
        return slot1;
    }

    public Move getSlot2() {
        return slot2;
    }

    public Move getSlot3() {
        return slot3;
    }

    public Move getSlot4() {
        return slot4;
    }

    public String getItem() {
        return item;
    }

    public String getAbility() {
        return ability;
    }

    public String getNature() {
        return nature;
    }

    public int getHp() {
        return hp;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getSp_attack() {
        return sp_attack;
    }

    public int getSp_defense() {
        return sp_defense;
    }

    public int getSpeed() {
        return speed;
    }

    public String getStatusCondition() {
        return statusCondition;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setSp_attack(int sp_attack) {
        this.sp_attack = sp_attack;
    }

    public void setSp_defense(int sp_defense) {
        this.sp_defense = sp_defense;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setStatusCondition(String statusCondition) {
        this.statusCondition = statusCondition;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTypeOne(Type typeOne) {
        this.typeOne = typeOne;
    }

    public void setTypeTwo(Type typeTwo) {
        this.typeTwo = typeTwo;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setSlot1(Move slot1) {
        this.slot1 = slot1;
    }

    public void setSlot2(Move slot2) {
        this.slot2 = slot2;
    }

    public void setSlot3(Move slot3) {
        this.slot3 = slot3;
    }

    public void setSlot4(Move slot4) {
        this.slot4 = slot4;
    }
}
