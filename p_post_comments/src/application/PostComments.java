package application;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class PostComments {

	public static void main(String[] args) throws ParseException {
		// https://github.com/acenelio/composition2-java
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");		
		
		Post post = new Post();
		
		System.out.println(" ******** Rede Social ******** ");
		System.out.println();
			
		System.out.println("Enter moment");
		System.out.print("Date (DD/MM/YYYY) HH:mm:ss? ");
		Date moment = sdf.parse(sc.nextLine());
		
		System.out.print("Enter title? ");
		String title = sc.nextLine();
		
		System.out.print("Enter content? ");
		String content = sc.nextLine();
		
		System.out.print("Enter likes? ");
		Integer likes = sc.nextInt();
		
		post = new Post(moment, title, content, likes);	
		
		//Comment c1 = new Comment("Have a nice trip!");		
		//post.addComment(c1);
		
		//Comment c2 = new Comment("Wow that's awesome!");
		//post.addComment(c2);		
		
		System.out.println();
		System.out.print("Quantity comments? ");
		int qtdComments = sc.nextInt();
		
		sc.nextLine();
		for (int x= 0; x < qtdComments; x++) {
			System.out.print("Comments? ");
			String text = sc.nextLine();
			
			Comment comment = new Comment(text);		
			
			post.addComment(comment);
		}

		System.out.println();
		System.out.println(post.toString());
		
		sc.close();
	}
}