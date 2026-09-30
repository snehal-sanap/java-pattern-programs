public class FloydsTriangle{
	public static void main(String[] a){
		int n=5, num=1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
}