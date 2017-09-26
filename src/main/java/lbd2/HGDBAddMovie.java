package lbd2;
import java.time.Year;
import java.util.List;
import org.hypergraphdb.HGHandle;
import org.hypergraphdb.HGQuery.hg;
import org.hypergraphdb.HGValueLink;
import org.hypergraphdb.HyperGraph;

public class HGDBAddMovie{
	public static void main(String[] args) { 
	String databaseLocation = "/home/karine/Documents/hypergraphdb-1.3"; 
	HyperGraph movieGraph = null; 
	try { 
		movieGraph = new HyperGraph(databaseLocation);
		Movie movie = new Movie("It", "Andy Muschietti", "Horror", "2017");
		
		HGHandle movieHandle = movieGraph.add(movie);

   } catch (Throwable t) {
	   System.out.println("Insertion Error");
       t.printStackTrace();
   } finally {
       movieGraph.close();
   }
}

} 
