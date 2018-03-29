import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchWords {
	String fileToAnalyze;
	
	public int [] getNumCommentsReddit(String fileToRead)
	{
		int [] numCommentsArray=new int[6466];
		
		try
		{
			FileReader myFileReader=new FileReader(fileToRead);
			BufferedReader myBufferReader= new BufferedReader(myFileReader);
			String line=null;
			int postCounter=0;
			while ((line=myBufferReader.readLine())!=null)
			{
				int numCommentsPost=Integer.parseInt(line);
				
				numCommentsArray[postCounter]=numCommentsPost;
				postCounter+=1;
				
				
				
			}
			return numCommentsArray;
			
			
		}
		catch (Exception ex)
		{
			System.out.println("I don't think I was able to find your file");
		}
		
		return numCommentsArray;
			
	}
	RedditPost [] getPostsReddit(String fileToRead)
	{
		RedditPost [] theDonaldPosts=new RedditPost[6466];
		
		try
		{
			FileReader myFileReader=new FileReader(fileToRead);
			BufferedReader myBufferReader= new BufferedReader(myFileReader);
			String line=null;
			int postCounter=0;
			while ((line=myBufferReader.readLine())!=null)
			{
				//System.out.println(line);
				theDonaldPosts[postCounter]=new RedditPost(line);
				postCounter+=1;
				
				
				
			}
			return theDonaldPosts;
			
			
		}
		catch (Exception ex)
		{
			System.out.println("I don't think I was able to find your file");
		}
		return theDonaldPosts;
	}
			
	public void CountingComments() {
		int [] numCommentsArray=getNumCommentsReddit("NumComments.txt");
		RedditPost [] posts=getPostsReddit("Posts.txt");
		
		int indexLargestNumberOfComments=0;
		int largestNumberOfComments=0;
		
		for (int i=0;i<numCommentsArray.length;i++)
		{
			
			int numCommentsPost=numCommentsArray[i];
			if (numCommentsPost>largestNumberOfComments)
			{
				
				largestNumberOfComments=numCommentsPost;
				indexLargestNumberOfComments=i;
			}
		}	
System.out.println("Largest number of comments:"+largestNumberOfComments);
		
		RedditPost postWithMostComments=posts[indexLargestNumberOfComments];
		System.out.println(postWithMostComments.title);
	}
	
	public void SearchWord() {
		boolean control = true;
		File fileName;
		Scanner keyboard = new Scanner(System.in);
		BufferedReader readFile = null;
		String input = null;
		String line = null;
		char blankSpace = 0;
		String regEx = null;
		Pattern analyzeRegEx;
		Matcher stringFinder;
		String response = null;
		
		try {
			System.out.println("Please select a file you want to analyze");
			System.out.println("Enter Posts.txt to search for words in posts or");
			System.out.println("Enter Authors.txt to search for users");
			fileName = new File(keyboard.nextLine());
			
while (control) {
				
				int total = 0;
				int counter = 0;

				FileReader importFile = new FileReader(fileName);
				System.out.println(fileName.toString() + " Thank you, your file is readable");

				readFile = new BufferedReader(importFile);
				System.out.println("Please enter the word you would like to search for");
				input = keyboard.nextLine();
				regEx = input + "([a-z]*)";

				readFile.readLine();

				while ((line = readFile.readLine()) != null) {

					for (int i = 0; i < line.length(); i++) {

						blankSpace = line.charAt(i);

						if (blankSpace == ' ') {

							total = total + 1;
								
							}
						
						}

					if (line.charAt(line.length() - 1) != 0) {
						
						total = total + 1;	
				
				}

					analyzeRegEx = Pattern.compile(regEx);
					stringFinder = analyzeRegEx.matcher(line);

					while (stringFinder.find()) {

						counter = counter + 1;

					}

				}

				System.out.println("The txt file contains total words of "  + ": " + total);
				System.out.println("Your word appears a total times of " + input + ": " + counter);

				

			}

		}

		catch (Exception ex) {

			System.out.println("The file could not be found.");

		}

		keyboard.close();

	}
	void MostUpVotes()
	{
		int [] numCommentsArray=getNumCommentsReddit("upvotes.txt");
		RedditPost [] posts=getPostsReddit("Posts.txt");
		
		int indexLargestNumberOfComments=0;
		int largestNumberOfComments=0;
		
		int index2ndNumberOfComments=0;
		int secLargestNumberOfComments=0;
		
		
		
		for (int i=0;i<numCommentsArray.length;i++)
		{
			
			int numCommentsPost=numCommentsArray[i];
			if (numCommentsPost>largestNumberOfComments)
			{
				//System.out.println("Entered IF, new largest comments:"+numCommentsPost);
				//System.out.println("Previously we had:"+largestNumberOfComments+"\n\n");
				
				largestNumberOfComments=numCommentsPost;
				indexLargestNumberOfComments=i;
			}
			
			else if (numCommentsPost>secLargestNumberOfComments)
			{
				//System.out.println("Entered second IF, new 2nd largest comments:"+numCommentsPost);
				//System.out.println("Previously we had:"+largestNumberOfComments+"\n\n");
				
				secLargestNumberOfComments=numCommentsPost;
				index2ndNumberOfComments=i;
				
				//index2ndNumberOfComments=0;
				//int secLargestNumberOfComments=0;
				
			}
			
			
			
		}
		
		System.out.println("Largest number of upvotes: \n"+largestNumberOfComments);
		RedditPost postWithMostComments=posts[indexLargestNumberOfComments];
		System.out.println(postWithMostComments.title);
		
		System.out.println("Second most number of upvotes:"+secLargestNumberOfComments);
		RedditPost postWith2ndMostComments=posts[index2ndNumberOfComments];
		System.out.println( postWith2ndMostComments.title);
	}

	}
	

