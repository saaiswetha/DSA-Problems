// No link

import java.util.*;
public class Main {
	public static void main(String[] args) {
		// write your code here

		int m1[][] = {{3,1,4},
					  {2,0,3}};
		int m2[][] = {{1,3,0},
					  {5,2,4},
					  {6,0,4}};
		
		int r1 = m1.length, c1 = m1[0].length, r2 = m2.length, c2 = m2[0].length;

		// To be able to mul 2 matrices, c1 == r2
		if(c1 != r2) {
			System.out.println("Cannot multiply these matrices");
		} else {
			int ans[][] = new int [r1][c2];

			for(int i=0;i<r1;i++){
				for(int j=0;j<c2;j++){
					int sum = 0;
					for(int k=0;k<c1;k++){
						sum += m1[i][k] * m2[k][j];
					}
					ans[i][j] =sum;
				}
			}

			for(int i=0;i<r1;i++){
				for(int j=0;j<c2;j++){
					System.out.print(ans[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
}

// output
// 32 11 20 
//  20 6 12 
