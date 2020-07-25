package behavioral_design_patterns;

interface Command 
{ 
    public void execute(); 
} 

class Fan 
{ 
    public void on() 
    { 
        System.out.println("Switched on the fan"); 
    } 
    public void off() 
    { 
        System.out.println("Switched off the fan"); 
    } 
} 

class FanOnCommand implements Command 
{ 
    Fan fan; 
    public FanOnCommand(Fan fan) 
    { 
       this.fan = fan; 
    } 
    public void execute() 
    { 
       fan.on(); 
    } 
} 

class FanOffCommand implements Command 
{ 
	Fan fan; 
    public FanOffCommand(Fan fan) 
    { 
        this.fan = fan; 
    } 
    public void execute() 
    { 
         fan.off(); 
    } 
} 

public class CommandPattern {
	public static void main(String args[]) {
		Fan fan=new Fan();
		FanOnCommand on_obj=new FanOnCommand(fan);
		on_obj.execute();
		FanOffCommand off_obj=new FanOffCommand(fan);
		off_obj.execute();
	}
}