package newtest;

public class TwoDimensionalarrays {

	public static void main(String[] args) {
		
		int a[][]=new int[2][3];
		a[0][0]=100;
		a[0][1]=101;
		a[0][2]=102;
		
		a[1][0]=200;
		a[1][1]=201;
		a[1][2]=202;
		
		for(int i=0;i<2;i++) {
			for (int j=0;j<3;j++) {
				System.out.println(a[i][j]);
			}
		}
	}

}
