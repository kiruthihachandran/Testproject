package FileOperations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {

	public static void main(String[] args) {
		String Readline;
		try (BufferedReader br = new BufferedReader(new FileReader("D:\\Viratt.txt"))) {
			Readline = br.readLine();
			while (Readline != null) {
				System.out.println(Readline);
				break;
			}

		} catch (FileNotFoundException e) {

			System.out.println("File not Found");
		} catch (IOException e) {
			e.printStackTrace();

		}

	}

}
