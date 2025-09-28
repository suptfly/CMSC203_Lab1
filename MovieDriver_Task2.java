/* 
 Class: CMSC203 CRN 23118
 Program: Lab 1
 Instructor: Huseyin Aygun
 Summary of Description: Making a movie test/driver class to test a movie java file. This class tests multiple movies.
 Due Date: 09/29/2025 
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
Izzat Ismailov
 */

import java.util.Scanner;
public class MovieDriver_Task2 {
	private static Movie movie = new Movie();
	private static String moreMovies;
	public static void main(String[] args) {
		//creating objects 
		Scanner input = new Scanner(System.in);
		Movie movie = new Movie();

		do { //repeat at least once 
			String title, rating;
			int ticketsSold;
			
			//getting user input and setting the input using setters 
			System.out.println("Enter the title of a movie: ");
			title = input.nextLine();
			movie.setTitle(title);
			
			System.out.println("Enter the movie's rating: ");
			rating = input.nextLine();
			movie.setRating(rating);
			
			System.out.println("Enter the ticket's sold: ");
			ticketsSold = input.nextInt();
			movie.setSoldTickets(ticketsSold);
			
			input.nextLine();
			
			//printing the output 
			System.out.println(movie.toString());
			
			//asking user to play again or not 
			System.out.println("Do you want to enter another movie? (Y/N)");
			moreMovies = input.nextLine();
			
		} while (moreMovies.toLowerCase().equals("y")); //repeat while the user says yes 
		
		System.out.println("Goodbye");
		input.close();
	}
}
