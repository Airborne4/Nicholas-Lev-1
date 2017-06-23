
public class Netflix {
public static void main(String[] args) {
	Movie AoT=new Movie("Attack on Titan", 5);
	Movie GotG=new Movie("Guardians of the Galaxy", 5);
	Movie PotC=new Movie("Pirates of the Caribbean", 4);
	Movie GR=new Movie("Generic Romance", 2);
	Movie N=new Movie("Naruto", 3);
	System.out.println(AoT.getTicketPrice());
	System.out.println(GotG.getTicketPrice());
	System.out.println(PotC.getTicketPrice());
	System.out.println(GR.getTicketPrice());
	System.out.println(N.getTicketPrice());
	NetflixQueue nq=new NetflixQueue();
	nq.addMovie(AoT);
	nq.addMovie(GotG);
	nq.addMovie(PotC);
	nq.addMovie(GR);
	nq.addMovie(N);
	nq.printMovies();
	nq.sortMoviesByRating();
	System.out.println("The best movie is, " + nq.getBestMovie());
	for (int i = 1; i < 5; i++) {
		System.out.println("The next best movie is, " + nq.getMovie(i));	
		
	}
	
}
}
