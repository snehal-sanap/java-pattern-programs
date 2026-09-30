public class Butterfly{
	public static void main(String ar[]){
		int n=4;
		
		//upper part
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){ //first half stars
				System.out.print("*");
			}
			
			int spaces=2*(n-i); //n-i spaces between 2 parts
			for(int j=1;j<=spaces;j++){
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++){ //second half stars
				System.out.print("*");
			}
			System.out.println();
		}
		
		//lower part
		for(int i=n;i>=1;i--){
			for(int j=1;j<=i;j++){ //first half stars
				System.out.print("*");
			}
			
			int spaces=2*(n-i); //n-i spaces between 2 parts
			for(int j=1;j<=spaces;j++){
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++){ //second half stars
				System.out.print("*");
			}
			System.out.println();
		}
	}
}