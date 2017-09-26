package lbd2;

import java.util.List;

import org.hypergraphdb.HyperGraph;
import org.hypergraphdb.HGQuery.hg;

public class HGDBQuery {
	public static void main(String[] args) { 
		String databaseLocation = "/home/karine/Documents/hypergraphdb-1.3"; 
		HyperGraph movieGraph = null;
		try { 
			movieGraph = new HyperGraph(databaseLocation);
		
			//Query de consulta
			 List<Movie> movies = hg.getAll(movieGraph, hg.and(hg.type(Movie.class), hg.eq("year", "2017")));
		       for (Movie movie: movies)
		          System.out.println(movie.getTitle());
		     
		} catch (Throwable t) {
			t.printStackTrace();
		} finally {
		    movieGraph.close();
		}
	}

}
