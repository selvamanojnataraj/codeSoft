package StudentGrade;

import java.util.Scanner;

public class toGetMark {
	Scanner sc = new Scanner(System.in);
	int AvgMark = 0;

    void tamil() {
		String Tamil="tamil";
		System.out.println("Enter your tamil mark");
		int tamil = sc.nextInt();
		//System.out.println("Tamil percentage " + AverageCalc.average(tamil));
		AvgMark += AverageCalc.average(tamil);
		Grade.grade(tamil, Tamil);
	}

	void english() {
		String English="english";
		System.out.println("Enter your english mark");
		int english = sc.nextInt();
		//System.out.println(" English percentage " + AverageCalc.average(english));
		AvgMark += AverageCalc.average(english);
		Grade.grade(english, English);
	}

	void maths() {
		String Maths="maths";
		System.out.println("Enter your maths mark");
		int maths = sc.nextInt();
		//System.out.println(" maths percentage " + AverageCalc.average(maths));
		AvgMark += AverageCalc.average(maths);
		Grade.grade(maths, Maths);
	}

	void science() {
		String Science="science";
		System.out.println("Enter your science mark");
		int science = sc.nextInt();
		//System.out.println(" Science percentage " + AverageCalc.average(science));
		AvgMark += AverageCalc.average(science);
		Grade.grade(science, Science);
	}

	void social() {
		String Social="social";
		System.out.println("Enter your social mark");
		int social = sc.nextInt();
		//System.out.println("social percentage " + AverageCalc.average(social));
		AvgMark += AverageCalc.average(social);
		Grade.grade(social, Social);
		System.out.println("-----------------------------------------------------");
		System.out.println("Average percentage "+AverageCalc.averagePercent(AvgMark));
	}

}
