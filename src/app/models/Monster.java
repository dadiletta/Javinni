package app.models;

/**
 * Abstract class for our game's base enemy. 
 */
public abstract class Monster {
    private int health;
    private int strength;
    private int defense;
    
    public Monster(int health, int strength, int defense){
        this.health = health;
        this.strength = strength;
        this.defense = defense;
    }
    
    /**
     * Accesses the monster's current health
     * @return health instance variable
     */
    public int health(){
        return this.health;
    }
    
    /**
     * Mutates the monster's current health
     * @param change modifies the health
     */
    public void health(int change){
        health += change;
    }
    
    /**
     * Accesses this monster's strength
     * @return strength var
     */
    public int strength(){
        return strength;
    }
    
    /**
     * Accesses this monster's defense property
     * @return defense instance variable
     */
    public int defense(){
        return defense;
    }
    
    /**
     * Mutates this monster's defense
     * @param change the modification to be made
     */
    public void defense(int change){
        defense += change;
    }
    
}