package org.examples.gen;


class Printer{
     
    public <E> void printArray(E[] inputArray) 
    {
    	// display array elements
    	for (E element : inputArray){
    		System.out.println(element);
    	}
    }
}