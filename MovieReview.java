import java.util.*;

class MovieInformation{
	int movieId;
	String movieName;
	double movieRating;
	String movieReview ;
	
	public void Add() {
		this.movieId=movieId;
		this.movieName=movieName;
		this.movieRating=movieRating;
		this.movieReview=movieReview;
	}
	public void display() {
		System.out.println("Movie Id : " + movieId + " Movie Name : " + movieName + "Movie Rating : " + movieRating + "Movie Review : " + movieReview );
	}
}
public class MovieReviewSystem {
	
	public static void main(String[] args) {
		MovieInformation m = new MovieInformation();
		m.Add();
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the  movieId,  movieName, movieRating, movieReview");
		int id=sc.nextInt();
		String name = sc.next();
		double rating = sc.nextDouble();
		String review = sc.next();
		
		m.display();
	}

}
