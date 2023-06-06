package SamplePackage;

public class PuppyContstrcutor {
	public PuppyContstrcutor(String name){
		System.out.println("Puppy name is : " + name);
	}
	
	public PuppyContstrcutor(){
		System.out.println("It is default constructor.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PuppyContstrcutor myPuppy = new PuppyContstrcutor("Mel Lone"); // argument constructor
		PuppyContstrcutor yourPuppy = new PuppyContstrcutor(); // default constructor 

	}
}
