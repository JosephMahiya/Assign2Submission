import java.io.*;
import java.util.*;
public class ReadFile {
	private Scanner X;
	
	public void openFile() {
		try {
			X = new Scanner(new File("Authors.txt"));
			}
		catch(Exception e) {
			System.out.println("You have an error. File not found");
		}
	}
	
	public void readFile() {
		while(X.hasNextLine()) {
			
			String A = X.next();
			//System.out.printf("%s \n", A);
			if (A.contains("russia") == false) {
			System.out.println(A);
			}
			else {
				System.out.println("Read file but nothing detected");
			}
			
		}	
	}
	
	//public void searchTerm() {
		
	//}
	public void closeFile() {
		X.close();
	}

}
