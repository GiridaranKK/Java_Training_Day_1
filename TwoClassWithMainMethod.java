class Class1{
	static public void main(String ss[]){
		System.out.println("Class1 is printing...");
	}
}
class Class2{
	static public void main(String ss[]){
		System.out.println("Class2 is printing...");
	}
}

//if we have two different class and two main method in a same file 
//it will create two class file (Sample1.class , Sample2.class) once the program compiled. 
//calling Class1.class --> OUTPUT: Class1 is printing...
//calling Class2.class --> OUTPUT: Class2 is printing...