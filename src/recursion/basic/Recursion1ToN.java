package recursion.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Recursion1ToN {
	public void print(int i, int N) {
		if (i > N) {
			return;
		}
		System.out.println(i);
		print(i + 1, N);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Enter N");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		Recursion1ToN obj = new Recursion1ToN();
		obj.print(1, N);
	}
}