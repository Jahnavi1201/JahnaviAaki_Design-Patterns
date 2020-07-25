package structural_design_patterns;

abstract class Ball { 
    protected Task Throw; 
    protected Task Catch; 
  
    protected Ball(Task task1,Task task2) 
    { 
        this.Throw = task1; 
        this.Catch = task2; 
    } 
  
    abstract public void initiateTask(); 
} 

class RedBall extends Ball { 
    public RedBall(Task task1,Task task2) 
    { 
        super(task1,task2); 
    } 
  
    @Override
    public void initiateTask() 
    { 
        System.out.print("Red Ball "); 
        Throw.doTask(); 
        Catch.doTask(); 
    } 
} 

class GreenBall extends Ball { 
    public GreenBall(Task task1,Task task2) 
    { 
        super(task1,task2); 
    } 
  
    @Override
    public void initiateTask() 
    { 
        System.out.print("Green Ball "); 
        Throw.doTask(); 
        Catch.doTask(); 
    } 
} 

interface Task 
{ 
    abstract public void doTask(); 
} 

class Throw implements Task { 
	
    public void doTask() 
    { 
        System.out.print("Thrown"); 
    } 
} 

class Catch implements Task { 
	
    public void doTask() 
    { 
        System.out.print(" And"); 
        System.out.println(" Caught."); 
    } 
} 

public class BridgePattern {
	public static void main(String[] args) 
    { 
        Ball ball1 = new RedBall(new Throw(), new Catch()); 
        ball1.initiateTask();
        Ball ball2 = new GreenBall(new Throw(), new Catch()); 
        ball2.initiateTask(); 
    } 
}
