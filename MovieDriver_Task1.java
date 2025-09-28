import java.util.Scanner;
public class MovieDriver_Task1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Movie movie = new Movie();
		
		System.out.println("Enter the title of a movie: ");
		movie.setTitle(input.nextLine());
		
		System.out.println("Enter the movie's rating: ");
		movie.setRating(input.nextLine());
		
		System.out.println("Enter the ticket's sold: ");
		movie.setSoldTickets(input.nextInt());
		
		input.nextLine();
		
		System.out.println(movie.toString());
		System.out.println("Goodbye");	
		
		//task 2
		
		
		
	}

}
