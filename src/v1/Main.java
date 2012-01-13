package v1;

public class Main {
	
	/**
     * @param args
     */
    public static void main(String[] args) {
        
    	Simulator sim = new Simulator();
        
        SettingsThread settingThread = new SettingsThread("Settings", sim);
        settingThread.start();
        
        
    }

}
