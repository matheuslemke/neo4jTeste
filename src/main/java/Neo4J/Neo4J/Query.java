package Neo4J.Neo4J;

import org.neo4j.graphdb.Result;
import org.neo4j.graphdb.Transaction;

import dao.Connector;

public class Query {

	private Connector connector = new Connector();
	private Result result;

	public Query(Connector connector) {
		this.connector = connector;
	}

	public void executeQuery(String query) {
		try {
			Transaction tx = connector.db.beginTx();
			long time = System.currentTimeMillis();
			result = connector.db.execute(query);
			tx.success();
			System.err.println("Transação finalizada");
			System.out.println("Tempo de Busca "
					+ ((System.currentTimeMillis() - time) / 1000) + "s");
		} catch (Exception e) {
			e.printStackTrace();
		}
		while (result.hasNext()) {
			System.out.println(result.next().toString());
		}
	}
}
