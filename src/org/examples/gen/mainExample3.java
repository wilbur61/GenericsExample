package org.examples.gen;

// https://www.geeksforgeeks.org/generics-in-java/

//Java program to show multiple
//type parameters in Java Generics

//We use < > to specify Parameter type
class MultParm<T, U>
{
	T obj1; // An object of type T
	U obj2; // An object of type U

	// constructor
	MultParm(T obj1, U obj2)
	{
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	// To print objects of T and U
	public void print()
	{
		System.out.println(obj1);
		System.out.println(obj2);
	}
}

//Driver class to test above
class mainExample3
{
	public static void main (String[] args)
	{
		MultParm <String, Integer> obj =
			new MultParm<String, Integer>("Hello World", 61);

		obj.print();
	}
}
