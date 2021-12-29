package ejen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Jungol516 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double A=Double.parseDouble(br.readLine());
		double B=Double.parseDouble(br.readLine());
		char C=br.readLine().charAt(0);
		
		System.out.printf("%.2f\n",A);
		System.out.printf("%.2f\n",B);
		System.out.println(C);
	}
}
