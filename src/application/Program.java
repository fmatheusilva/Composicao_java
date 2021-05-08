package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		
		Comment c1 = new Comment("Habe a nice trip");
		Comment c2 = new Comment("Wow that's awesome");
		Post p1 = new Post(
				sdf.parse("21/06/2018 13:05:44"),
				"Traveling to New Zealand", 
				"I'm going to visit this wonderful country!", 
				12);
	
	
	p1.addComments(c1);
	p1.addComments(c2);
	
	System.out.println(p1);
    }
}

