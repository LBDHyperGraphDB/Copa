package lbd2;
import java.time.Year;
import java.util.List;
import org.hypergraphdb.HGHandle;
import org.hypergraphdb.HGQuery.hg;
import org.hypergraphdb.HGValueLink;
import org.hypergraphdb.HyperGraph;

public class HGDBAddCopa{
	public static void main(String[] args) { 
	String databaseLocation = "/home/karine/Documents/hypergraphdb-1.3"; 
	HyperGraph copaGraph = null; 
	try { 
		copaGraph = new HyperGraph(databaseLocation);
		Copa copa= new Copa("2002", "06-2002", "07-2002");
		Pais pais = new Pais("Japão");
		
		HGHandle copaHandle = copaGraph.add(copa);
		HGHandle paisHandle = copaGraph.add(pais);
		
		HGValueLink link = new HGValueLink("nome", copaHandle, paisHandle);

   } catch (Throwable t) {
       t.printStackTrace();
   } finally {
       copaGraph.close();
   }
}

} 
