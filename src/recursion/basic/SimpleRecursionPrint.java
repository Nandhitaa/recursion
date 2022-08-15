package recursion.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleRecursionPrint {

	public void print(int i, int N) {
		if (i == N) {
			return;
		}
		System.out.println("Name");
		print(i + 1, N);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Enter N:");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		SimpleRecursionPrint obj = new SimpleRecursionPrint();
		obj.print(0, N);
	}

}