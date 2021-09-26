package June12;

import java.util.Scanner;

public class far2cel {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int minf=scn.nextInt();
		int maxf=scn.nextInt();
		int step=scn.nextInt();
		int tempf=minf;
		while(tempf<=maxf)
		{
			int tempc=(int)((5.0/9)*(tempf-32));
			System.out.println(tempf+"\t"+tempc); 
			tempf+=step;
		}
	}

}
