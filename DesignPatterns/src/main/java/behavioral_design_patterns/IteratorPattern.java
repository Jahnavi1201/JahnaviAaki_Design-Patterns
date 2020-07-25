package behavioral_design_patterns;

interface Iterator {
	   public boolean hasNext();
	   public Object next();
	}

interface Container {
	   public Iterator getIterator();
	}

class ColorRepository implements Container {
	   public String colors[] = {"Red","Sky Blue","Pink","Green","Black","White"};

	   public Iterator getIterator() {
	      return new ColorIterator();
	   }

	   private class ColorIterator implements Iterator {

	      int index;

	      public boolean hasNext() {
	      
	         if(index < colors.length){
	            return true;
	         }
	         return false;
	      }

	      public Object next() {
	      
	         if(this.hasNext()){
	            return colors[index++];
	         }
	         return null;
	      }		
	   }
	}

public class IteratorPattern {
public static void main(String args[]) {
	   ColorRepository color_obj = new ColorRepository();
	   for(Iterator iter = color_obj.getIterator(); iter.hasNext();){
	         String color = (String)iter.next();
	         System.out.println("Color : " + color);
}
}
}
