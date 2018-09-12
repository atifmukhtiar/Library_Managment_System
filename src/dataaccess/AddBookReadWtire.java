package dataaccess;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AddBookReadWtire {

	
	 public static void main(String[] args) {
	        try {
	            FileWriter writer = new FileWriter("Books.txt", true);
	            BufferedWriter bufferedWriter = new BufferedWriter(writer);
	            bufferedWriter.write("Game of thorones: season 1");
	            bufferedWriter.newLine();
	            bufferedWriter.write("Game of thorones: season 1");
	            System.out.println("Atif");
	            bufferedWriter.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		 
		 System.out.println("Atif");
	 
	    }
}
