//Counting number of lines, words, characters and paragraphs in a text file using Java

import java.io.*;

public class CountText {
	public static void main(String[] args)
		throws IOException
	{
		File file = new File(
			"C:\\TextReader.txt");             //Read text from TextReader.txt file
		FileInputStream fileInputStream
			= new FileInputStream(file);
		InputStreamReader inputStreamReader    
			= new InputStreamReader(fileInputStream);
		BufferedReader bufferedReader
			= new BufferedReader(inputStreamReader);  
		
		/*
		 * BufferedReader is a class which simplifies reading text from a character input stream. 
		 * It buffers the characters in order to enable efficient reading of text data.
		 */

		String line;
		int WordCount = 0;
		int CharacterCount = 0;
		int ParagraphCount = 0;
		int WhiteSpaceCount = 0;
		int SentenceCount = 0;

		while ((line = bufferedReader.readLine()) != null) {
			if (line.equals("")) {
				ParagraphCount += 1;
			}
			else {
				CharacterCount += line.length();
				String words[] = line.split("\\s+");
				WordCount += words.length;             //count words from file
				WhiteSpaceCount += WordCount - 1;
				String sentence[] = line.split("[!?.:]+");  //count lines from file
				SentenceCount += sentence.length;
			}
		}
		if (SentenceCount >= 1) {
			ParagraphCount++;
		}
		System.out.println("Total word count = "
						+ WordCount);
		System.out.println("Total number of sentences = "
						+ SentenceCount);
		System.out.println("Total number of characters = "
						+ CharacterCount);
		System.out.println("Number of paragraphs = "
						+ ParagraphCount);
		System.out.println("Total number of whitespaces = "
						+ WhiteSpaceCount);
	}
}
