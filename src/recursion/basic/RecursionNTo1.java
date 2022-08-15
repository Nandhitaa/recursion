package recursion.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursionNTo1 {
	public void print(int i, int N) {
		if (i < 1) {
			return;
		}
		System.out.println(i);
		print(i - 1, N);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Enter N");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		RecursionNTo1 obj = new RecursionNTo1();
		obj.print(N, N);
	}
}