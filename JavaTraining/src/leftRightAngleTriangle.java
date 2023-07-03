
public class leftRightAngleTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		int n=5;
		for(i=1;i<=n;i++)//outer loop for rows
		{
			for(j=n-i;j>=1;j--) // inner loop for spaces
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) //inner loop for columns
			{
				System.out.print("*");
			}
			System.out.println(); //ending line after each row
		}
	}

}
