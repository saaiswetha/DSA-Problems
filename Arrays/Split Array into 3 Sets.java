// https://codeforces.com/contest/300/problem/A

import java.util.*;
public class Main {
	public static void main(String[] args) {
		// write your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n]; int pos[] = new int[n]; int neg[] = new int[n];
		int ne = 0, p =0;
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}

		int negId = -1, posId = -1; 
		for(int i=0;i<n;i++){
			if(arr[i] < 0){
				if(negId == -1)
					negId = i;
				else 
					neg[ne++] = arr[i];
			} else if(arr[i] > 0){
				pos[p++] = arr[i];
			}
		}

		// < 0  --> print 1 neg no.
		System.out.println(1 + " " + arr[negId]);
		int negCount = ne/2 * 2;

		// > 0 
		//--> print all pos nos. && all neg nos. giving +ve product
		System.out.print((negCount + p) + " " );
		for(int i=0; p>0 && i<p ; i++){
			System.out.print(pos[i] + " ");
		}

		for( int i = 0; negCount>0 && i<negCount; i++)
			System.out.print(neg[i] + " " );
		
		System.out.println();

		// 0 
		// 0 && left out neg no.
			
		if(ne != 1 && ne % 2 == 0)
		  System.out.println(1 + " " + 0);
		else{
			System.out.println(2 + " " + 0 + " " + neg[ne-1]);
		}
	}
}
