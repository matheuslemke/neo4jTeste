package model;

import org.neo4j.graphdb.Label;

public class Logradouro  implements Label {
	
	private long idLogradouro;
	private long idCidade;
	private long idTipoLogradouro;
	private String descricao;
	private long codigo;
	private long idGrupoEmpresarial;

	
	public long getIdLogradouro()
	{
		return idLogradouro;
	}

	public void setIdLogradouro(long idLogradouro)
	{
		this.idLogradouro = idLogradouro;
	}

	public long getIdCidade()
	{
		return idCidade;
	}

	public void setIdCidade(long idCidade)
	{
		this.idCidade = idCidade;
	}

	public long getIdTipoLogradouro()
	{
		return idTipoLogradouro;
	}

	public void setIdTipoLogradouro(long idTipoLogradouro)
	{
		this.idTipoLogradouro = idTipoLogradouro;
	}

	public String getDescricao()
	{
		return descricao;
	}

	public void setDescricao(String descricao)
	{
		this.descricao = descricao;
	}

	public long getCodigo()
	{
		return codigo;
	}

	public void setCodigo(long codigo)
	{
		this.codigo = codigo;
	}
	public long getIdGrupoEmpresarial() {
		return idGrupoEmpresarial;
	}

	public void setIdGrupoEmpresarial(long idGrupoEmpresarial) {
		this.idGrupoEmpresarial = idGrupoEmpresarial;
	}


	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}
}
