package structural_design_patterns;

interface Code{

	public void assemble();
	
}

class PseudoCode implements Code {

	public void assemble() {
		System.out.print("Pseudo Code. ");		
	}

}

class CodeDecorator implements Code {

	protected Code code;
	
	public CodeDecorator(Code c){
		this.code=c;
	}
	
	public void assemble() {
		this.code.assemble();
	}

}

class JavaCode extends CodeDecorator {

	public JavaCode(Code c) {
		super(c);
	}

	@Override
	public void assemble(){
		super.assemble();
		System.out.print("Adding Java Code. ");
	}
}

class PythonCode extends CodeDecorator {

	public PythonCode(Code c) {
		super(c);
	}
	
	@Override
	public void assemble(){
		super.assemble();
		System.out.print("Adding Python Code. ");
	}
}

public class DecoratorPattern {
   public static void main(String args[]) {
	   Code javaCode=new JavaCode(new PseudoCode());
	   javaCode.assemble();
	   System.out.println("\n-------------------------------------------------------");
	   Code javaPythonCode=new JavaCode(new PythonCode(new PseudoCode()));
	   javaPythonCode.assemble();
   }
}
