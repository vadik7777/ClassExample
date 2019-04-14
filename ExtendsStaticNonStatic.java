class B {	
	//Private const
	final private static int final_private_static_elem = 0;
	final private int final_private_non_static_elem = 1;
	
	//Private variable
	private static int private_static_elem;
	private int private_non_static_elem;
	
	//Shared const
	final static int final_static_elem = 3;
	final int final_non_static_elem = 4;

	//Shared variable
	static int static_elem;
	int non_static_elem;
	
	//Private const methods
	final private void final_private_non_static_method() {
		
		int k = final_private_static_elem;
		k = final_private_non_static_elem;
		private_static_elem = 10;
		private_non_static_elem = 10;
		k = final_static_elem;
		k = final_non_static_elem;
		static_elem = 10;
		non_static_elem = 10;
		
		final_private_static_method();
		final_private_non_static_method();
		private_static_method();
		private_non_static_method();
		final_non_static_method();
		final_static_method();
		non_static_method();
		static_method();
		
	}
	final private static void final_private_static_method() {
		
		int k = final_private_static_elem;
		private_static_elem = 10;
		k = final_static_elem;
		static_elem = 10;
		
		final_private_static_method();
		private_static_method();
		final_static_method();
		static_method();
	}
	
	//Private methods
	private void private_non_static_method() {
		final_private_static_method();
		final_private_non_static_method();
	}
	private static void private_static_method() {
		final_private_static_method();
	}
	
	//Const methods
	final void final_non_static_method() {
		private_non_static_method();
		private_static_method();
	}
	final static void final_static_method() {
		private_static_method();
	}

	//Shared methods
	void non_static_method() {
		final_non_static_method();
		final_static_method();
	}
	static void static_method() {
		final_static_method();
	}
}

class C extends B {
	
	private void touchElements() {
		int k = this.final_non_static_elem;
		k = this.final_static_elem;
		this.non_static_elem = 10;
		this.static_elem = 10;
	}
	private static void touchStaticElements(){
		int k = C.final_static_elem;
		C.static_elem = 10;
	}
	@Override
	void non_static_method() {}
	
	//@Override
	static void static_method() {}
}

public class ExtendsStaticNonStatic {

	public static void main(String[] args) {
		//Class elements
		int k = B.final_static_elem;	
		B.static_elem = 5;
		B.final_static_method();
		B.static_method();
		
		//Object elements
		B b = new B();
		
		k = b.final_static_elem;
		k = b.final_non_static_elem;
		
		b.static_elem = 5;
		b.non_static_elem = 5;
		
		b.final_static_method();
		b.final_non_static_method();
		b.static_method();
		b.non_static_method();	
	}
}