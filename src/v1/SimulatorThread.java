package v1;

public class SimulatorThread extends Thread {
	
	Simulator sim;
    
    public SimulatorThread(String name, Simulator sim){
            super(name);
            this.sim = sim;
    }
    
    public void run(){
            
    	
        sim.init();
        
    	System.out.println("Game starts with " + sim.nbHumansAlive()
                + " humans!");
        // Iterate until no alive human remains
        while ((sim.nbHumansAlive() > 0 && sim.nbMonsterAlive() >0)&& sim.stopSimulation == false) {
            sim.nextTurn();
           try {
                Thread.sleep(sim.speed);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println("Game finished");
        if(sim.nbHumansAlive() > 0){
        	System.out.println("Humans wins!");
        }else{
        	System.out.println("All humans have been eaten!");
     
        }
            
    }       
}
