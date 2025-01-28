/*
WAP to create a class student having following data members and member functions to create the marksheet of Data Members: Rollno, name,
marks for 3 subjects, total marks, percent, result and division.
Member functions: setdata(), showdata(), totalmarks(), percentage(), result() and division()
*/

class Marksheet{
	public static void main(String args[]){

		Student S = new Student();

		S.setData(111,56,67,89,"Nitin");
		S.totalMarks();
		S.percent();
		S.result();
		S.division();
		S.showData();
	}
}

class Student{
	int rollno, p1, p2, p3, total;
	float per;
	String name,res,div;

	void setData(int r, int m1, int m2, int m3, String sname)
	{
		rollno = r;
		p1 = m1;
		p2 = m2;
		p3 = m3;
		name = sname;
	}

	void totalMarks()
	{
		total = p1+p2+p3;
	}

	void percent()
	{
		per = total*100/300;
	}

	void result()
	{
		if(p1>=35 && p2>=35 && p3>=35)
			res = "Pass"; //c/c++: strcpy(res,"Pass")
		else
			res = "Fail";
	}

	void division()
	{
		if(per >= 75)
			div = "Dist";
		else if(per >= 60)
			div = "First";
		else if(per >= 50)
			div = "Second";
		else if(per >= 35)
			div = "Third";
	}

	void showData(){
		System.out.println("\n\n\t\t MARKSHEET \n");
		System.out.println("\t\t-------------\n\n");
		System.out.println("Rollno\t Name\t p1\t p2\t p3\t Total \t Per \t Result Division \n");
		System.out .println(rollno + "\t" + name + "\t" + p1 + "\t" + p2 + "\t" + p3 + "\t" + total + "\t" + per + "\t" + res + "\t" + div + "\t");
	}
}



