import java.util.*;
public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		double avg=0;
		int sum=0;
		int count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
			sum+=arr[i];
			avg=sum/n;
			if(arr[i]>=35) {
				count++;
			}
		}
		System.out.println("Highest: "+max);
		System.out.println("Lowest: "+min);
		System.out.println("Average: "+avg);
		System.out.println("No. of hot days: "+count);
	}
}
