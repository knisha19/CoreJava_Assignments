package org.apex.java_assignment;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountLetter {

	public static void main(String[] args) throws FileNotFoundException {
		File file=new File("C:\\Users\\Vnishal\\Core_Java_Training\\JavaAssignment\\src\\org\\apex\\java_assignment\\data1.txt"); 
		Scanner text = new Scanner (file);
		    String word = null;
		    int count = 0;
		    while(text.hasNextLine())
		    {
		    	 word = text.next();
		        for (int i = 0; i < word.length(); i++)
		        {
		            if  (word.charAt(i) == 'a')
		            {
		                count++;
		            }
		        }

		    }

		    text.close();
		    System.out.println("Number of times letter 'a' occured in the text file= "+count);
		}
		}

	






   