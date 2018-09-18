package android.erickson.com.mountred;

/**
 * Created by Jake on 9/18/2018.
 */

public class Move
{
    private int super_contest_id;
    private int pp;
    private int contest_effect_id;
    private int power;
    private int target_id;
    private int effect_chance;
    private int effect_id;
    private int accuracy;
    private String identifier;
    private int id;
    private int damage_class_id;
    private int priority;
    private int contest_type_id;
    private int type_id;
    private int generation_id;

    public Move()
    {
        //default constructor is required for all calls to DataSnapshot.getValue(Move.class)
    }
    public Move(int super_contest_id, int pp, int ontest_effect_id, int power, int target_id, int effect_chance, int effect_id, int accuracy, String identifier, int id, int damage_class_id, int priority, int contest_type_id, int type_id, int generation_id) {
        this.super_contest_id = super_contest_id;
        this.pp = pp;
        this.contest_effect_id = ontest_effect_id;
        this.power = power;
        this.target_id = target_id;
        this.effect_chance = effect_chance;
        this.effect_id = effect_id;
        this.accuracy = accuracy;
        this.identifier = identifier;
        this.id = id;
        this.damage_class_id = damage_class_id;
        this.priority = priority;
        this.contest_type_id = contest_type_id;
        this.type_id = type_id;
        this.generation_id = generation_id;
    }

    public int getSuper_contest_id() {
        return super_contest_id;
    }

    public void setSuper_contest_id(int super_contest_id) {
        this.super_contest_id = super_contest_id;
    }

    public int getPp() {
        return pp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }

    public int getContest_effect_id() {
        return contest_effect_id;
    }

    public void setContest_effect_id(int ontest_effect_id) {
        this.contest_effect_id = ontest_effect_id;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getTarget_id() {
        return target_id;
    }

    public void setTarget_id(int target_id) {
        this.target_id = target_id;
    }

    public int getEffect_chance() {
        return effect_chance;
    }

    public void setEffect_chance(int effect_chance) {
        this.effect_chance = effect_chance;
    }

    public int getEffect_id() {
        return effect_id;
    }

    public void setEffect_id(int effect_id) {
        this.effect_id = effect_id;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage_class_id() {
        return damage_class_id;
    }

    public void setDamage_class_id(int damage_class_id) {
        this.damage_class_id = damage_class_id;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getContest_type_id() {
        return contest_type_id;
    }

    public void setContest_type_id(int contest_type_id) {
        this.contest_type_id = contest_type_id;
    }

    public int getType_id() {
        return type_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }

    public int getGeneration_id() {
        return generation_id;
    }

    public void setGeneration_id(int generation_id) {
        this.generation_id = generation_id;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Move))
            return false;

        Move m = (Move)obj;
        //unique code will be identifier
        return identifier == null && m.identifier == null || identifier.equals(m.identifier);

    }
}
