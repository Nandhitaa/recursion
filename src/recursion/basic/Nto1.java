package recursion.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nto1 {

	public void function(int i, int n) {
		if(i > n) return;
		function(i+1, n);
		System.out.println(i);
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Enter N:");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		Nto1 obj = new Nto1();
		obj.function(1, N);
	}

}
