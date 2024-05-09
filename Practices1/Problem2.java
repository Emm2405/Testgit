package Practices1;

public class Problem2 {
	public static void sapXepTang_C1(int x[]) {
		int a = 0, b= 0, c = 0;
		for(int i = 0; i < x.length; i++) {
			if(x[i] == 0) {
				a++;
			}
			else if(x[i] == 1){
				b++;
			}
			else if(x[i] == 2) {
				c++;
			}
		}
		int i  = 0;
		while(a > 0) {
			x[i++] = 0;
			a--;
		}
		while(b > 0) {
			x[i++] = 1;
			b--;
		}
		while(c > 0) {
			x[i++] = 2;
			c--;
		}
	}
	
	public static void sapXepTang_C2(int x[]) {
		int i = 0;
		int so_0 = 0;
		int so_2 = x.length - 1;
		while(i < so_2) {
			if(x[i] == 0) {
				int temp = x[i];
				x[i] = x[so_0];
				x[so_0] = temp;
				i++;
				so_0++;
			}
			else if(x[i] == 2) {
				int temp = x[so_2];
				x[so_2] = x[i];
				x[i] = temp;
				so_2--;
			}
			else{
				i++;
			}
		}
		
	}
	public static void main(String[] args) {
		int x[] = {0,2,1,0,1,2,1,0};
		
		System.out.println("Truoc khi di chuyen: ");
		
		for(int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		
		sapXepTang_C1(x);
		
		System.out.println("\nSau khi di chuyen: ");
		for(int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}

	}

}
