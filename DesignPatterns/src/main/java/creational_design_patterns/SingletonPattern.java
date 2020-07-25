package creational_design_patterns;

class SingleObject {
	
	   private static SingleObject instance = new SingleObject();

	   public static SingleObject getInstance(){
	      return instance;
	   }

	   public void showMessage(){
	      System.out.println("Hello! Demonstrating Singleton Pattern!");
	   }
	   
	}

class SingletonPattern {
	
	public static void main(String args[]) {
		SingleObject object = SingleObject.getInstance();
		object.showMessage();
	}
	
}
