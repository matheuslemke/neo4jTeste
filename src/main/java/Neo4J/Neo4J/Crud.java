package Neo4J.Neo4J;

import java.util.Map;

import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.Result;

import dao.Connector;

public class Crud {
	private Connector connector = new Connector();
	private Result result;

	public Crud(Connector connector) {
		this.connector = connector;
	}

	public long getIdNodes(String propertyUnique, String value, String nodeName) {
		result = connector.db.execute("MATCH (n:" + nodeName + " {" + propertyUnique
				+ ":" + "'" + value + "\'" + " } ) RETURN ID(n)");
		Map<String, Object> node = result.next();
		System.out.println(node.toString());
		return ((long) node.get("ID(n)"));
	}

	public void insertNode(Label label) {
		connector.db.createNode(label);
	}

	public void updateNode(int node, String propety, String value) {
		connector.db.getNodeById(node).setProperty(propety, value);
	}

	public void deleteNode(long node) {
		connector.db.getNodeById(node).delete();
	}

	public void creationRelationship(RelationshipType relationship, long node1,
			long node2) {
		Node node = connector.db.getNodeById(node2);
		connector.db.getNodeById(node1).createRelationshipTo(node, relationship);
	}
}
