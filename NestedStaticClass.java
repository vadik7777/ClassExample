public class NestedStaticClass {
	// Private const
	final private static int final_private_static_elem = 0;
	final private int final_private_non_static_elem = 1;

	// Private variable
	private static int private_static_elem;
	private int private_non_static_elem;

	// Shared const
	final static int final_static_elem = 3;
	final int final_non_static_elem = 4;

	// Shared variable
	static int static_elem;
	int non_static_elem;

	// Private const methods
	final private void final_private_non_static_method() {}
	final private static void final_private_static_method() {}

	// Private methods
	private void private_non_static_method() {}
	private static void private_static_method() {}

	// Const methods
	final void final_non_static_method() {}
	final static void final_static_method() {}

	// Shared methods
	void non_static_method() {}
	static void static_method() {}

	static class Nested {
		// Private const
		final private static int nested_final_private_static_elem = 0;
		final private int nested_final_private_non_static_elem = 1;

		// Private variable
		private static int nested_private_static_elem;
		private int nested_private_non_static_elem;

		// Shared const
		final static int nested_final_static_elem = 3;
		final int nested_final_non_static_elem = 4;

		// Shared variable
		static int nested_static_elem;
		int nested_non_static_elem;

		// Private const methods
		final private void nested_final_private_non_static_method() {
			int k = final_private_static_elem;
			private_static_elem = 10;
			k = final_static_elem;
			static_elem = 10;
			
			final_private_static_method();
			private_static_method();
			final_static_method();
			static_method();
		}
		final private static void nested_final_private_static_method() {}

		// Private methods
		private void nested_private_non_static_method() {}
		private static void nested_private_static_method() {}

		// Const methods
		final void nested_final_non_static_method() {}
		final static void nested_final_static_method() {}

		// Shared methods
		void nested_non_static_method() {}
		static void nested_static_method() {}
	}

	public static void main(String[] args) {

		int k = NestedStaticClass.Nested.nested_final_private_static_elem;
		k = NestedStaticClass.Nested.nested_final_static_elem;
		NestedStaticClass.Nested.nested_private_static_elem = 10;
		NestedStaticClass.Nested.nested_static_elem = 10;
		
		NestedStaticClass.Nested.nested_final_private_static_method();
		NestedStaticClass.Nested.nested_private_static_method();
		NestedStaticClass.Nested.nested_final_static_method();
		NestedStaticClass.Nested.nested_static_method();
		
		NestedStaticClass.Nested nested = new Nested();
		k = nested.nested_final_private_static_elem;
		k = nested.nested_final_private_non_static_elem;
		k = nested.nested_final_static_elem;
		k = nested.nested_final_non_static_elem;
		nested.nested_private_static_elem = 10;
		nested.nested_private_non_static_elem = 10;
		nested.nested_static_elem = 10;
		nested.nested_non_static_elem = 10;
		
		nested.nested_final_private_static_method();
		nested.nested_final_private_non_static_method();
		nested.nested_private_static_method();
		nested.nested_private_non_static_method();
		nested.nested_final_static_method();
		nested.nested_final_non_static_method();
		nested.nested_static_method();
		nested.nested_non_static_method();
	}
}