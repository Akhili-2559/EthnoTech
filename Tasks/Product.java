import java.util.Scanner;
public class Product {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Product of array is: ");
		for(int i=0;i<n;i++) {
			int prod=1;
			for(int j=0;j<n;j++) {
				if(i!=j) {
					prod=prod*arr[j];
				}
			}
			System.out.print(prod+" ");
		}
		sc.close();
	}
}
