public class PalindromeTriangle{
	public static void main(String args[]){
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i;j++){ //spaces
				System.out.print(" ");
			}
			
			for(int j=i;j>=1;j--){ //1st part before 1
				System.out.print(j);
			}
			
			for(int j=2;j<=i;j++){ //2nd part after 1
				System.out.print(j);
			}
			System.out.println();
		}
	}
}