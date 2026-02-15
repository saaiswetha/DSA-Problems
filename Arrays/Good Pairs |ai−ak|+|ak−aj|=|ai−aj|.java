// https://codeforces.com/problemset/problem/1656/A

import java.util.*;
public class Main {
	public static void main(String[] args) {
		// write your code here
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
		while(t > 0){
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++){
				arr[i] = sc.nextInt();
			}

			int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
			int minId = -1, maxId = -1;

			for(int i=0;i<n;i++){
				if(arr[i] < min) {
					min = arr[i];
					minId = i;
				} 
				if(arr[i] > max) {
					max = arr[i];
					maxId = i;
				}
			}

			System.out.print((minId + 1) + " " + (maxId + 1));
			System.out.println();
			t--;
		}
	}
}
