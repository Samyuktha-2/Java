import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		int[] a = {-1000,-1000,-1000,1000,1000,1000};
		int  bal = 0;
		int work = 0;
		
		for(int i = 0 ; i < a.length; i++){
		    bal += a[i];
		    work += Math.abs(bal);
		}
		System.out.println(work);
	}
}
