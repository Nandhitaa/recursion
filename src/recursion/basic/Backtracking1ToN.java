package recursion.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backtracking1ToN {
	public void print(int i, int N) {
		if (i < 1) {
			return;
		}
		print(i - 1, N);
		System.out.println(i);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Enter N:");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		Backtracking1ToN obj = new Backtracking1ToN();
		obj.print(N, N);
	}
}