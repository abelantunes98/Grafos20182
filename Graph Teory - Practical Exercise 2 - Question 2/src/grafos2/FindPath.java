package grafos2;

import java.util.Iterator;
import java.util.Set;

import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.alg.shortestpath.DijkstraShortestPath;

/**
 * This class finds the closest path between two vertices.
 * 
 * @author Abel Antunes
 * @author José Guilherme
 * @author Mariana Nascimento
 * @author Siuanny Barbosa
 */
public class FindPath {
	
	/**
	 * This method uses two vertices and tells the smallest path between them.
	 * @param graphGml - Used graph
	 * @param sink - Vertex Dice
	 * @return - Smallest path between vertices
	 */
	public static GraphPath<Object, RelationshipEdge> searchShortestPath(Graph<Object, RelationshipEdge> graphGml, Object sink) {
		DefaultVertex C = findMachine(graphGml, "C");
		DefaultVertex M = findMachine(graphGml, sink);
		return DijkstraShortestPath.findPathBetween(graphGml, C, M);
	}
	
	/**
	 * This method looks for the vertexs information.
	 * @param graphGml - Used graph
	 * @param sink - Vertex Dice
	 * @return - The vertexs information
	 */
	private static DefaultVertex findMachine(Graph<Object, RelationshipEdge> graphGml, Object sink) {
		Set<Object> vertex = graphGml.vertexSet();
		Iterator<Object> iter = vertex.iterator();
		while (true) {
		    DefaultVertex M = (DefaultVertex) iter.next();
			if (M.getLabel().equals(sink))
				return M;
		}
	}

}
