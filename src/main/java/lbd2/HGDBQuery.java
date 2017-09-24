package lbd2;

import java.util.List;

import org.hypergraphdb.HyperGraph;
import org.hypergraphdb.HGQuery.hg;

public class HGDBQuery {
	public static void main(String[] args) { 
		String databaseLocation = "/home/karine/Documents/hypergraphdb-1.3"; 
		HyperGraph copaGraph = null;
		try { 
			copaGraph = new HyperGraph(databaseLocation);
		
			//Query de consulta
			 List<Copa> copas = hg.getAll(copaGraph, hg.and(hg.type(Copa.class), hg.eq("ano", "2002")));
		       for (Copa copa : copas)
		           System.out.println(copa.getAno());
		} catch (Throwable t) {
			t.printStackTrace();
		} finally {
		    copaGraph.close();
		}
	}

}
