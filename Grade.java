package StudentGrade;

public class Grade {
   static void grade(int Mark,String Sub) {
	   if(Mark<100 && Mark >=90) {
		   System.out.println("Grade O in "+Sub);
	   }
	   else if(Mark<90 && Mark>=80) {
		   System.out.println("Grade A in "+Sub);
	   }
	   else if(Mark<80 && Mark>=70) {
		   System.out.println("Grade B in "+ Sub);
	   }
	   else if(Mark<70 && Mark>=60) {
		   System.out.println("Grade C in "+ Sub);
	   }
	   else if(Mark<60 && Mark>=50) {
		   System.out.println("Grade D in "+ Sub);
	   }
	   else if(Mark<50 ) {
		   System.out.println("Grade U in "+ Sub);
	   }
	   else {
		   System.out.println("Invalid");
		   Application.main(null);
	   }
   }
}
