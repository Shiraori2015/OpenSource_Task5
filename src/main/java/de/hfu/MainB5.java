package de.hfu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MainB5 {

	/**
	 * Main function for reading console input and convert it to upper case
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		/*save console input in parameter consoleInput*/
		System.out.print("Enter String\n");
        String consoleInput = br.readLine();
        
        /*convert input to upper case*/
        System.out.print("Entered String in Uppercase\n");
        System.out.print(consoleInput.toUpperCase());

	}

}
