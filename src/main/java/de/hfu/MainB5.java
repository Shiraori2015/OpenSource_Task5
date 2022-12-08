package de.hfu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MainB5 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String\n");
        String consoleInput = br.readLine();
        
        System.out.print("Entered String in Uppercase\n");
        System.out.print(consoleInput.toUpperCase());

	}

}
