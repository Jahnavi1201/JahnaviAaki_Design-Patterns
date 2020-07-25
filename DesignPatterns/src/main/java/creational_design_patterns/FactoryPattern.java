package creational_design_patterns;

interface Animal{
	   void roar();
	}

class Lion implements Animal {

	   public void roar() {
	      System.out.println("Inside Lion::roar() method.");
	   }
	}

class Deer implements Animal {

	   public void roar() {
	      System.out.println("Inside Deer::roar() method.");
	   }
	}

class Elephant implements Animal {

	   public void roar() {
	      System.out.println("Inside Elephant::roar() method.");
	   }
	}

class AnimalFactory {
	
	   public Animal getAnimal(String animalName){
	
	      if(animalName.equalsIgnoreCase("LION")){
	         return new Lion();
	         
	      } else if(animalName.equalsIgnoreCase("DEER")){
	         return new Deer();
	         
	      } else if(animalName.equalsIgnoreCase("ELEPHANT")){
	         return new Elephant();
	      }
		return null;
	   }	   
	}

class FactoryPattern {
	
   public static void main(String args[]) {
	   AnimalFactory obj=new AnimalFactory();
	   Animal animal1=obj.getAnimal("LION");
	   animal1.roar();
	   Animal animal2=obj.getAnimal("DEER");
	   animal2.roar();
	   Animal animal3=obj.getAnimal("ELEPHANT");
	   animal3.roar();
   }
}
