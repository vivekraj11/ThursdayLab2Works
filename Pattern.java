package thursdayLab2;

public class Pattern {
	
	public static void main(String[] args) {
		Pattern(5);
		}
	static void Pattern(int x){
		for(int i=x;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print("*");
				}
			System.out.println();
		}
	}
}