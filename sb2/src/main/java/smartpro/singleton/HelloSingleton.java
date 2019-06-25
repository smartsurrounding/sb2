package smartpro.singleton;

public class HelloSingleton {

	// Static member holds only one instance of the
	// SingletonExample class
	private static HelloSingleton singletonInstance;

	// SingletonExample prevents any other class from instantiating
	private HelloSingleton() {
	}

	// Providing Global point of access
	public static HelloSingleton getSingletonInstance() {
		if (null == singletonInstance) {
			singletonInstance = new HelloSingleton();
		}
		return singletonInstance;
	}

	public void printSingleton() {
		System.out.println("Inside print Singleton");
	}
}