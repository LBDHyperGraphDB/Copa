package lbd2;

import org.hypergraphdb.HGHandle;
import org.hypergraphdb.HyperGraph;
import org.hypergraphdb.HGQuery.hg;

public class HGDBUpdateMovie {
	public static void main(String[] args) { 
		String databaseLocation = "/home/karine/Documents/hypergraphdb-1.3"; 
		HyperGraph movieGraph = null; 
		try { 
			Movie movie = new Movie();
			//Query consulta
			movieGraph = new HyperGraph(databaseLocation);
			movie = hg.getOne(movieGraph, hg.and(hg.type(Movie.class), hg.eq("year", "2017")));
			System.out.println(movie.getTitle());
			System.out.println(movie.getYear());
			
			movie.setYear("2018");
			
			movieGraph.update(movie);
			System.out.println(movie.getTitle());
			System.out.println(movie.getYear());
			
	   } catch (Throwable t) {
		   System.out.println("Update error");
	       t.printStackTrace();
	   } finally {
	       movieGraph.close();
	   }
	}
}
