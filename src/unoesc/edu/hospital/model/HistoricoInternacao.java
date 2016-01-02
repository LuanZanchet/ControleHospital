package unoesc.edu.hospital.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@NamedQuery(name=HistoricoInternacao.LISTAR_HISTORICO,query="from HistoricoInternacao")
@Entity
public class HistoricoInternacao implements Serializable {

	private static final long serialVersionUID = 6627061492307867364L;
	public static final String LISTAR_HISTORICO ="ListarTodosHistoricos";
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idHistorico")
	private Integer codigo;
	
	private Integer quantInternacao;
	
	@Temporal(TemporalType.DATE)
	private Date dataUltimaInternacao;

	public HistoricoInternacao() {
		super();
		
	}

	public HistoricoInternacao(Integer quantInternacao,
			Date dataUltimaInternacao) {
		super();
		this.quantInternacao = quantInternacao;
		this.dataUltimaInternacao = dataUltimaInternacao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Integer getQuantInternacao() {
		return quantInternacao;
	}

	public void setQuantInternacao(Integer quantInternacao) {
		this.quantInternacao = quantInternacao;
	}

	public Date getDataUltimaInternacao() {
		return dataUltimaInternacao;
	}

	public void setDataUltimaInternacao(Date dataUltimaInternacao) {
		this.dataUltimaInternacao = dataUltimaInternacao;
	}

	@Override
	public String toString() {
		return "HistoricoInternacao [codigo=" + codigo + ", quantInternacao="
				+ quantInternacao + ", dataUltimaInternacao="
				+ dataUltimaInternacao + "]";
	}
	
}
