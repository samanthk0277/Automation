package basics;

import java.util.Scanner;
import org.testng.annotations.Test;


public class Arithmatic {

	/**
	 * @Method : verifyLengthandLongestWord
	 * @Description : Find the longest word and its length from a sentence
	 * @Input : Sentence
	 * @return : Longest word and length of a string in a given sentence
	 * @exception : NA
	 */
	@Test
	public String verifyLengthandLongestWord()
	{
		String result="";
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a sentence"); // Input any sentence
			String str = sc.nextLine();
			String[] arrWords = str.split(" "); // Split the words from a sentence
			int max=0;
			String res="";
			for (int i = 0; i < arrWords.length; i++) {
				max=arrWords[i].length();
				res=arrWords[i];
			}

			//System.out.println("Maximum length of the word is : " + max);
			//System.out.println("Maximum length word is : " + res);

			result=res+ "|" + max; // Concatenate max world and length and store it in result with '|' delimiter
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return result; // Max length word and its length
	}
}
