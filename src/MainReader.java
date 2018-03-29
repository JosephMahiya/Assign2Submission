import java.io.*;
import java.util.*;
public class MainReader {
	String a;
	String b;
	String c;
	String d;
	String e;
	String f;
	String g;

	public MainReader() {
		String a = "";
		String b="";
		String c= "";
		String d= "";
		String e="";
		String f="";
		String g="UpVotesTotal";

	}
	public static void main(String[] args) throws FileNotFoundException{
		int first, second, third, forth =0;
		
		System.out.println("Welcome, in this program you will have an insight to some data \n collected on Reddit");
		System.out.println("To Begin, Please enter your name");
		Scanner keyboard = new Scanner(System.in);
		String Name1 = keyboard.nextLine();
		
		System.out.println("Thank you " +Name1);
		System.out.println("Please select an option below to start digging into this data and get an insight");
		MainReader Option1= new MainReader();
		Option1.a = "Select 1 To show post with the most comments(Most popular)";
		MainReader Option2= new MainReader();
		Option2.b = "Select 2 If you want to search for a specific word and the number \n of times it appears in the comments";
		MainReader Option3 = new MainReader();
		Option3.c = "Select 3 To display all users who participated in the Reddit activity";
		MainReader Option4 = new MainReader();
		Option4.d = "Select 4 To display the most appreciated post(Most upvotes)";
		MainReader Option5 = new MainReader();
		Option5.e = "Select 5 To sort the usernames in ascending order";
		MainReader Option6 = new MainReader();
		Option6.f = "Select 6 To display the total number of Comments and related info";
		MainReader Option7 = new MainReader();
		Option7.g = "Select 7 to display total number of Upvotes and related info";
		System.out.println("1:" + Option1.a);
		System.out.println("2:" + Option2.b);
		System.out.println("3:" + Option3.c);
		System.out.println("4:" + Option4.d);
		System.out.println("5:" + Option5.e);
		System.out.println("6:" + Option6.f);
		System.out.println("7:" + Option7.g);
		int Input1 = keyboard.nextInt();
		if (Input1 == 1) {
			SearchWords mySearch=new SearchWords();
			mySearch.CountingComments();
		}
		
		else if(Input1 == 2) {
			SearchWords s = new SearchWords();
			s.SearchWord();
		}
		else if (Input1 == 3) {
			ReadFile Authors = new ReadFile();
			Authors.openFile();
			Authors.readFile();
			Authors.closeFile();
		}
		else if(Input1 == 4) {
			SearchWords SW = new SearchWords();
			SW.MostUpVotes();
		}
		else if(Input1 == 5) {
			System.out.println("The users are displayed below");
			ReadFilePosts RF = new ReadFilePosts();
			RF.SortData();
		}
		else if(Input1 == 6) {
			ReadFilePosts SCC = new ReadFilePosts();
			SCC.SortComments();
		}
		else if(Input1 == 7) {
			ReadFilePosts TUV = new ReadFilePosts();
			TUV.TotalUpVotes();
			System.out.println("Did you know that 1. The Hitmarker (/r/montageparodies) is \n the highest rated Post of all time?");
		}
		else {
			System.out.println("Invalid Input or not in specified range. Try again");
		}
		
		}		
	}

