
public class ProfileConstructors {
	private String AuthorName;
	private String Comment;
	private int NumComments;
	private int NumUpVotes;
	
	public ProfileConstructors(){
		AuthorName=null;
		Comment=null;
		NumComments=0;
		NumUpVotes=0;
		}
	public ProfileConstructors(String AuthorName, String Comment, int NumComments, int NumUpVotes){
		this.AuthorName = AuthorName;
		this.Comment = Comment;
		this.NumComments = NumComments;
		this.NumUpVotes = NumUpVotes;
	}	

}
//find posts with most comments
//create an array on NumCommentsPosts
//create array with comments, create array with posts, iterate through comment array
//find largest # and store index
//correspond index with 