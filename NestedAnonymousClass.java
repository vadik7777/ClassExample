abstract class AnonymousClass {
	{
		this.anyNewMethod();
	}

	abstract void anyNewMethod();
}

public class NestedAnonymousClass {
	static {
		new AnonymousClass() {
			@Override
			void anyNewMethod() {
				System.out.println("Hello from anonimous staticInit");
			}
		};
	}
	{
		new AnonymousClass() {
			@Override
			void anyNewMethod() {
				System.out.println("Hello from anonimous nonStaticInit");
			}
		};
	}
	
	public void nonStaticMethod() {
		new AnonymousClass() {
			@Override
			void anyNewMethod() {
				System.out.println("Hello from anonimous nonStaticMethod");
			}
		};
	}
	
	public static void staticMethod() {
		new AnonymousClass() {
			@Override
			void anyNewMethod() {
				System.out.println("Hello from anonimous staticMethod");
			}
		};
	}

	public static void main(String[] args) {
		
		NestedAnonymousClass.staticMethod();
		
		NestedAnonymousClass nestedAnonymousClass = new NestedAnonymousClass();
		
		nestedAnonymousClass.nonStaticMethod();	
	}
}