import java.io.File;
import java.util.Scanner;

public class RedditPost {
	String datePosted;
	int numUpvotes;
	int numDownvotes;
	String postType;
	String attachedURL;
	String message;
	String title;
	
	RedditPost(String postname)
	{
		title=postname;
	}
	

	/*public void countWord() {
		try {
			int count = 0;
			Scanner scanner = new Scanner(new File("Posts.txt"));
			Scanner keyboard = new Scanner(System.in);
			String X = keyboard.nextLine();
			while (scanner.hasNextLine()) {
			    String nextToken = scanner.next();
			    if (nextToken.equalsIgnoreCase(X))
			    count++;
			  System.out.println(X); 
			}
		}
		catch(Exception e) {
			System.out.println("Operation cannot be completed at this time");
		}
		
	}
	*/
}
