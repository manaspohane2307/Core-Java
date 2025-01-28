class Program24{
	public static void main(String args[]){
		show();
	}

	void show(){
		System.out.println("Show function called");
	}
}

/*

C:\Users\91779\OneDrive\Documents\Desktop\Java-Dsoft>javac Program24.java
Program24.java:3: error: non-static method show() cannot be referenced from a static context
                show();
                ^
1 error

*/