package edu.handong.csee.java.example.binarydemo;


import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class NumbersDoubledReader {
		public static void main(String[] args) {
		NumbersDoubledReader read = new NumbersDoubledReader();
		read.run();
	}
		
		private void run() {
			String fileName="numbersDoubled.dat";
			try {
				ObjectInputStream inputStream = new ObjectInputStream(
						new FileInputStream(fileName));
				int anInteger = inputStream.readInt();
				while(anInteger>=0) {
					System.out.println(anInteger);
					anInteger = inputStream.readInt();
				}
				inputStream.close();
			}catch(FileNotFoundException e) {
				System.out.println("Problem opening the file " + fileName);
			} catch (EOFException e) {
				System.out.println("Problem reading the file " + fileName);
				System.out.println("Reached end of the file.");
			} catch (IOException e) {
				System.out.println("Problem reading the file " + fileName);
			}
		}
	}


