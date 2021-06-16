package FirstMain;

public class FirstProgram {

public static void main(String[] args)	{
	String s = oddeven();
	System.out.println("Number is :"+s);
	
}

public static String oddeven() {
			int a=12;
	String s;
	if(a%2 == 0) {
		s="even";
		return s ;
	}
	else{
		s="odd";
		return s ;
	}
		
	
}

}
