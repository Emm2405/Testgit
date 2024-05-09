package Practices1;

import java.util.ArrayList;
import java.util.List;

public class Problem3 {
	public static boolean checkGoal(int x[], int goal) {
		List<String> checkgoal = new ArrayList<String>();
		for(int i =0; i < x.length - 1 ; i++) {
			for(int j = i+1; j < x.length; j++) {
				if(x[i] + x[j] == goal) {
					checkgoal.add("("+x[i]+","+x[j]+")");
				}
			}
		}
		if(!checkgoal.isEmpty()) {
			System.out.print("True -> ");
			for(int i = 0; i < checkgoal.size() - 1; i++) {
				System.out.print(checkgoal.get(i)+" or ");
			}
			System.out.print(checkgoal.get(checkgoal.size()-1));
			return true;
		}
		else {
			System.out.println("false");
			return false;
		}
	}
	public static void main(String[] args) {
		int x[]= {-5, 1, -40, 20, 6, 8, 7};
		int goal = 15;
		checkGoal(x, goal);
	}
}
