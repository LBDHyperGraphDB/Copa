package lbd2;

import org.hypergraphdb.HGHandle;
import org.hypergraphdb.HyperGraph;
import org.hypergraphdb.HGQuery.hg;

public class HGDBDeleteMovie {
	public static void main(String[] args) { 
		String databaseLocation = "/home/karine/Documents/hypergraphdb-1.3"; 
		HyperGraph movieGraph = null; 
		try { 
			Movie movie = new Movie();
			
			//Query consulta
			movieGraph = new HyperGraph(databaseLocation);
			movie = hg.getOne(movieGraph, hg.and(hg.type(Movie.class), hg.eq("title", "It")));
			
			HGHandle movieHandle = movieGraph.getHandle(movie);
			
			movieGraph.remove(movieHandle);
			
	   } catch (Throwable t) {
		   System.out.println("Delete error");
	       t.printStackTrace();
	   } finally {
	       movieGraph.close();
	   }
	}
}
