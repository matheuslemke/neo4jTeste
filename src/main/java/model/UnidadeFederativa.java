package model;

import org.neo4j.graphdb.Label;

public class UnidadeFederativa implements Label {
	private long idUnidadeFederativa;
	private long codigoIBGE;
	private String descricao;
	private long idPais;
	private String sigla;

	public long getIdUnidadeFederativa() {
		return idUnidadeFederativa;
	}

	public void setIdUnidadeFederativa(long idUnidadeFederativa) {
		this.idUnidadeFederativa = idUnidadeFederativa;
	}

	public long getCodigoIBGE() {
		return codigoIBGE;
	}

	public void setCodigoIBGE(long codigoIBGE) {
		this.codigoIBGE = codigoIBGE;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public long getIdPais() {
		return idPais;
	}

	public void setIdPais(long idPais) {
		this.idPais = idPais;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

}
