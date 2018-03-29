import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
import java.io.*;
import java.util.*;

public class ReadFilePosts {
	private Scanner X;
	
	public void openFile() {
		try {
			X = new Scanner(new File("Posts.txt"));
			}
		catch(Exception e) {
			System.out.println("You have an error. File not found");
		}
	}
	public void readFile() {
		while(X.hasNextLine()) {
			
			String A = X.nextLine();
			System.out.printf("%s \n", A);
			//if (A.contains("russia") == false) {
			//	System.out.println(A);
			//}
			}	
	}
	public void closeFile() {
		X.close();
	}
	public void SortComments() throws FileNotFoundException {
		Scanner X = new Scanner(new File("NumComments.txt"));
	
		try{
	        int sum = 0;
	        while (X.hasNext()){
	            sum += X.nextInt();
	        }
	        System.out.println("There has been a total number of comments of:"+sum); 
	    }catch(Exception err){
	        err.printStackTrace();
	    }
		X.close();
		}
	public void TotalUpVotes() throws FileNotFoundException {
		Scanner X = new Scanner(new File("upvotes.txt"));
	
		try{
	        int sum = 0;
	        while (X.hasNext()){
	            sum += X.nextInt();
	        }
	        System.out.println("There has been a total number of Upvotes of:"+sum); 
	    }catch(Exception err){
	        err.printStackTrace();
	    }
		X.close();
		}

	public void SortData() {
		BufferedReader readData = null; 
        
        BufferedWriter writeData = null;
                 
        //Create an ArrayList object to hold the lines of input file
         
        ArrayList<String> lines = new ArrayList<String>();
         
        try
        {
            //Creating BufferedReader object to read the input file
             
            readData = new BufferedReader(new FileReader("Authors.txt"));
             
            //Reading all the lines of input file one by one and adding them into ArrayList
             
            String currentLine = readData.readLine();
             
            while (currentLine != null) 
            {
                lines.add(currentLine);
                 
                currentLine = readData.readLine();
            }
             
            //Sorting the ArrayList
             
            Collections.sort(lines);
             
            //Creating BufferedWriter object to write into output file
             
            writeData = new BufferedWriter(new FileWriter("Authors.txt"));
             
            //Writing sorted lines into output file
             
            for (String line : lines)
            {
                writeData.write(line);
                 
                writeData.newLine();
            }
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        /*finally
        {
            //Closing the resources
             
            try
            {
                if (reader != null)
                {
                    reader.close();
                }
                 
                if(writer != null)
                {
                    writer.close();
                }
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }*/
        System.out.printf("%s ", lines);
    }  
	
	}


