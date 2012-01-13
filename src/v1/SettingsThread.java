package v1;

public class SettingsThread extends Thread {
	 
	Simulator sim;
    
    public SettingsThread(String name, Simulator sim){
            super(name);
            this.sim = sim;
    }
    
    public void run(){
            
    	SettingsWindow settingsWindow = new SettingsWindow(sim);
    	settingsWindow.openWindow();
            
    }       
}
