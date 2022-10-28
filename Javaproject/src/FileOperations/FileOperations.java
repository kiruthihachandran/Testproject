package FileOperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileOperations {

	public static void main(String[] args) {
		File file = new File("D:\\viratst.txt ");
		BufferedReader br = null;
		try {

			FileReader filereader = new FileReader(file);
			br = new BufferedReader(filereader);
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Problem reading the  file" + file.getName());

		} finally {
			try {

				br.close();
			} catch (IOException e) {
				System.out.println("Unable to close file" + file.getName());
			}
		}

	}
}
