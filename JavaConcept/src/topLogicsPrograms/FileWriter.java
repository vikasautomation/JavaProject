package topLogicsPrograms;

import java.io.BufferedWriter;
import java.io.IOException;

public class FileWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		java.io.FileWriter fw = new java.io.FileWriter("D:\\Automation_Notes\\test123.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Hi vikas");
		bw.write("Enhance your skills");
	}

}
