package app.models;

/**
 * Skeleton is the lowest-level monster
 */
public class Skeleton extends Monster {
   
   public Skeleton(int h, int s, int d){
       // call parent constructor and give it the vars its demanding
       super(h, s, d);
       
       System.out.println("BEHOLDER has entered the game. You're in trouble.");
   }
   
}
