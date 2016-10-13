package model;

import java.util.Date;

import org.neo4j.graphdb.Label;

public class PessoaFisica implements Label {
	private long idPessoaFisica;
	private String celular;
	private String contaCorrenteFunRural;
	private String cpf;
	private Date dataAdmissaoTrabalho;
	private Date dataExpedicao;
	private Date dataNascimento;
	private long empregador;
	private String foneTrabalho;
	private long idCargo;
	private long idCidadeNascimento;
	private long idEstadoCivil;
	private long idparceiro;

	public long getIdPessoaFisica() {
		return idPessoaFisica;
	}

	public void setIdPessoaFisica(long idPessoaFisica) {
		this.idPessoaFisica = idPessoaFisica;
	}

	public long getIdparceiro() {
		return idparceiro;
	}

	public void setIdparceiro(long idparceiro) {
		this.idparceiro = idparceiro;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getContaCorrenteFunRural() {
		return contaCorrenteFunRural;
	}

	public void setContaCorrenteFunRural(String contaCorrenteFunRural) {
		this.contaCorrenteFunRural = contaCorrenteFunRural;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataAdmissaoTrabalho() {
		return dataAdmissaoTrabalho;
	}

	public void setDataAdmissaoTrabalho(Date dataAdmissaoTrabalho) {
		this.dataAdmissaoTrabalho = dataAdmissaoTrabalho;
	}

	public Date getDataExpedicao() {
		return dataExpedicao;
	}

	public void setDataExpedicao(Date dataExpedicao) {
		this.dataExpedicao = dataExpedicao;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public long getEmpregador() {
		return empregador;
	}

	public void setEmpregador(long empregador) {
		this.empregador = empregador;
	}

	public String getFoneTrabalho() {
		return foneTrabalho;
	}

	public void setFoneTrabalho(String foneTrabalho) {
		this.foneTrabalho = foneTrabalho;
	}

	public long getIdCargo() {
		return idCargo;
	}

	public void setIdCargo(long idCargo) {
		this.idCargo = idCargo;
	}

	public long getIdCidadeNascimento() {
		return idCidadeNascimento;
	}

	public void setIdCidadeNascimento(long idCidadeNascimento) {
		this.idCidadeNascimento = idCidadeNascimento;
	}

	public long getIdEstadoCivil() {
		return idEstadoCivil;
	}

	public void setIdEstadoCivil(long idEstadoCivil) {
		this.idEstadoCivil = idEstadoCivil;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}
}
