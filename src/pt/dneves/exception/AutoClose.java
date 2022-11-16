package pt.dneves.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AutoClose {

	private static Logger logger = Logger.getLogger(AutoClose.class.getName());
	
	public static void main(String[] args) {
		
		try {
			openFile(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void openFile(String fileName) throws IOException {
		
		
		BufferedReader in = null;
		
		try {
			
			in = new BufferedReader(new FileReader(fileName));
			String text = in.readLine();
			
		} catch (FileNotFoundException e) {
			logger.log(Level.SEVERE, "Error opening file", e);
			return;
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Error reading file", e);
			throw new CustomException("Failed to read text", e);
		} finally {
			
			try {
				
				if(in != null) {
					in.close();
				}
				
			} catch (IOException e) {
				logger.log(Level.SEVERE, "Error closing file", e);
			}
			
		}
		
	}

	public static void openFileAutoclose(String fileName) throws IOException {
		
		
		try (BufferedReader in = new BufferedReader(new FileReader(fileName));) {
			
			String text = in.readLine();
			
		} catch (FileNotFoundException e) {
			logger.log(Level.SEVERE, "Error opening file", e);
			return;
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Error reading file", e);
			throw new CustomException("Failed to read text", e);
		}
		
	}

	public static void openFileWriteFileAutoclose(String inputFileName, 
			String outputFileName) throws IOException {
		

		try (BufferedReader in = new BufferedReader(new FileReader(inputFileName));
				PrintWriter out = new PrintWriter(new FileWriter(outputFileName));) {
			
			String text = in.readLine();
			out.println(text);
			
		} catch (FileNotFoundException e) {
			logger.log(Level.SEVERE, "Error opening file", e);
			return;
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Error reading file", e);
			throw new CustomException("Failed to read text", e);
		}
		
	}
	
}
