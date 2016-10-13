package Neo4J.Neo4J;

import org.neo4j.graphdb.Result;
import org.neo4j.graphdb.Transaction;
import org.neo4j.kernel.impl.store.Scanner;

import dao.Connector;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Connector connector = new Connector();
		connector.Conect();
		System.err.println("Conexão Iniciada");
		Query query = new Query(connector);
		//Crud crud = new Crud(connector);
		//crud.getIdNodes("SIGLA", "PR", "unidadefederativa");
		query.executeQuery("MATCH (e:endereco)-[ENDERECO_LOGRADOURO]->(log:logradouro)-[LOGRADOURO_CIDADE]->"
				+ "(c:cidade)-[CIDADE_UNIDADEFEDERATIVA]->(uf:unidadefederativa)-[UNIDADEFEDERATIVA_PAIS]->(p2:pais)"
				+ " MATCH (l:local)-[LOCAL_ENDERECO]->(e)" + " MATCH (l)-[r1:LOCAL_PARCEIRO]->(p:parceiro)"
				+ " OPTIONAL MATCH (pa:parceiroassociado)-[PARCEIROASSOCIADO_PARCEIRO]->(p)"
				+ " OPTIONAL MATCH (e)-[ENDERECO_LOCALIDADE]->(lo:localidade)"
				+ " OPTIONAL MATCH(pf:pessoafisica)-[PESSOAFISICA_PARCEIRO]->(p)"
				+ " WHERE  pa.associado = '1' AND p.IDGRUPOEMPRESARIAL ='1' AND p.ATIVO = '1'  AND l.ATIVO = '1'"
				+ " RETURN"
				+ " p.IDPARCEIRO  AS IDPARCEIRO, p.NOME AS NOME_PARCEIRO, p.CODIGO AS CODIGO_PARCEIRO, l.IDLOCAL AS IDLOCAL, "
				+ "l.CODIGO AS CODIGO_LOCAL,l.DESCRICAO AS DESCRICAO_LOCAL, c.IDCIDADE AS IDCIDADE, c.DESCRICAO AS CIDADE, "
				+ "uf.IDUNIDADEFEDERATIVA AS IDUNIDADEFEDERATIVA, uf.SIGLA AS UF, p2.IDPAIS AS IDPAIS, p2.SIGLA AS PAIS, "
				+ "log.TIPOLOGRADOURO AS TIPOLOGRADOURO, log.DESCRICAO AS ENDERECO, e.NUMERO AS NUMERO, lo.DESCRICAO AS BAIRRO, "
				+ "p.IDFLAGTIPOPESSOA AS FLAG, l.CNPJ as CNPJ_CPF, pa.NUMEROMATRICULA AS MATRICULA");

	}
}
