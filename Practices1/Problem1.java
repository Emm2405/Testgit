package Practices1;

import java.util.Iterator;

public class Problem1 {
	public static void diChuyen0_C1(int x[]) {
		int left = 0;
		int right = 0;
		while(right < x.length) {
			if(x[right] != 0) {
				x[left++] = x[right];
			}
			right++;
		}
		while(left < x.length) {
			x[left++] = 0;
		}
	}

	public static void diChuyen0_C2(int x[]) {
		int left = 0;
		for(int i = 0; i < x.length; i++) {
			if(x[i] != 0) {
				int temp = x[left];
				x[left] = x[i];
				x[i] = temp;
				left++;
			}
		}
	}
	
	public static void main(String[] args) {
		int x[] =  {4,8,0,0,2,0,1,};
		System.out.println("Truoc khi di chuyen: ");
		for(int i = 0; i < x.length ; i++) {
			System.out.print(x[i]+" ");
		}
		
		diChuyen0_C2(x);
		
		System.out.println("\nSau khi di chuyen: ");
		for(int i = 0; i < x.length ; i++) {
			System.out.print(x[i]+" ");
		}	
	}
}
