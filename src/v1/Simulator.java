package v1;

import java.util.ArrayList;
import java.util.Random;

/**
 * Simulator for Midterm Zombiegame.
 * 
 * @author pylaffon 
 * 
 */
public class Simulator {
    // Default health pointsfor our creatures
    private static final int HP_HUMANS = 100;
    private static final int HP_VAMPIRES = 150;
    private static final int HP_ZOMBIES = 30;
    // List of characters currently in the game
    private ArrayList<Character> characterList;

    /**
     * Initialize game.
     */
    public void init() {
        // Create characters
        Character h1 = new Human("Human 1", HP_HUMANS);
        Character h2 = new Human("Human 2", HP_HUMANS);
        Character v1 = new Vampire("Vampire 1", HP_VAMPIRES);
        Character v2 = new Vampire("Vampire 2", HP_VAMPIRES);
        Character z1 = new Zombie("Zombie 1", HP_ZOMBIES);
        // MadZombie mz1 = new MadZombie("MadZombie 1", HP_ZOMBIES); //
        // uncomment in
        // question 5b
        // Add characters to the list
        characterList = new ArrayList<Character>();
        characterList.add(h1);
        characterList.add(h2);
        characterList.add(v1);
        characterList.add(v2);
        characterList.add(z1);
        // characterList.add(mz1);
        // uncomment in question 5b
        
    }

    /**
     * Perform all game logic for next turn.
     */
    public void nextTurn() {
        // All characters encounter the next character in the list (question 5)
        for (int i = 0; i < characterList.size(); ++i) {
            
            Character c = characterList.get(i);
            System.out.println((i + 1) % (characterList.size()));
            Character encountered = characterList.get((i + 1)
                    % (characterList.size()));
            c.encounterCharacter(encountered);
            System.out.println(characterList.get(0).getHealthPoints());
            try {
                wait(20);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        // Dead characters are removed from the character list
        // ... add your code here (question 6) ...
        
        // J'ai fait une liste d'entier qui vont stocker les index des character à supprimer
        // Cela évite les problèmes de suppression d'une liste pendant que l'on parcourt cette liste
        ArrayList<Integer> toRemove = new ArrayList<Integer>();
        for (int i = 0; i < characterList.size(); ++i){
            Character d = characterList.get(i);
            if (d.getHealthPoints() <= 0) toRemove.add(i);
        }
        for (int j = 0; j <toRemove.size(); j++){
            characterList.remove(toRemove.get(j));
        }
        
        
        // Each vampire (if he is thirsty) bites the first Human in the list
        // who has not been bitten yet
        // ... add your code here (question 7a) ...
        
        for (int p = 0; p < characterList.size(); p++){
            if (characterList.get(p).type == 2){
                Vampire vamp = (Vampire) characterList.get(p);
                if (vamp.getIsThirsty()){
                    for (int t = 0; t < characterList.size(); t++){
                        if (characterList.get(t).type == 1){
                            Human bob = (Human) characterList.get(t);
                           if(bob.getHasBeenBitten() == false){
                               vamp.bite(bob);
                               break;
                           }
                        }
                    }
                }
            }
        }
        
        // Humans that have been bitten become vampires
        // ... add your code here (question 7b) ...
        
        for(int l = 0; l < characterList.size();l++){
            if (characterList.get(l).type == 1){
                Human ted = (Human) characterList.get(l);
                if (ted.getHasBeenBitten() == true){
                    characterList.remove(ted);
                }
            }
        }
        
        // Perform end-of-turn actions for all characters (question 4)
        for (int i = 0; i < characterList.size(); ++i) {
            /*if(characterList.get(i).type == 1){
               Human c = (Human) characterList.get(i);
                c.endOfTurn();
            }
            if (characterList.get(i).type == 2){
                Vampire d = (Vampire) characterList.get(i);
                d.endOfTurn();
            }
            if (characterList.get(i).type == 3){
                Zombie e = (Zombie) characterList.get(i);
                e.endOfTurn();
            }*/
            characterList.get(i).endOfTurn();
            }
        }
    

    /**
     * @return the number of human characters currently in the game
     */
    public int nbHumansAlive() {
        // Need to iterate through the list of characters
        // and count the number of humans
        int nbHumans = 0;
        for (Character character : characterList) {
            if (character instanceof Human) {
                nbHumans++;
            }
        }
        return nbHumans;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // Game initialization
        Simulator sim = new Simulator();
        sim.init();
        System.out.println("Game starts with " + sim.nbHumansAlive()
                + " humans!");
        // Iterate until no alive human remains
        while (sim.nbHumansAlive() > 0) {
            sim.nextTurn();
        }
        System.out.println("All humans have been eaten!");
    }

    /**
     * Generate a pseudo-random boolean.
     * 
     * @return pseudo-random boolean
     */
    public static boolean GenerateRandomBoolean() {
        Random random = new Random();
        return random.nextBoolean();
    }
}
