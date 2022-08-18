package org.examples.gen;

// https://www.geeksforgeeks.org/generics-in-java/
	
// Generic Classes: A generic class is implemented exactly 
// like a non-generic class. The only difference is that it 
// contains a type parameter section. There can be more than 
// one type of parameter, separated by a comma. The classes, 
// which accept one or more parameters, ​are known as parameterized 
// classes or parameterized types.

// We use < > to specify Parameter type

class Test<T> {
	// An object of type T is declared
	T obj;
	Test(T obj) { this.obj = obj; } // constructor
	public T getObject() { return this.obj; }
}

class mainExample2 {
	public static void main(String[] args)
	{
		// instance of Integer type
		Test<Integer> iObj = new Test<Integer>(15);
		System.out.println(iObj.getObject());

		// instance of String type
		Test<String> sObj
			= new Test<String>("GeeksForGeeks");
		System.out.println(sObj.getObject());
	}
}
