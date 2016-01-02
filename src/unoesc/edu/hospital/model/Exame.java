package unoesc.edu.hospital.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@NamedQuery(name=Exame.LISTAR_EXAMES,query="from Exame")
@Entity
public class Exame implements Serializable {

	private static final long serialVersionUID = -2802978136239171296L;
	public static final String LISTAR_EXAMES = "ListarTodosExames";

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idExame")
	private Integer codigo;
	
	@Temporal(TemporalType.DATE)
	private Date dataSolicitacao;
	
	@Temporal(TemporalType.DATE)
	private Date dataResultado;
	
	@ManyToOne(targetEntity=Internacao.class)
	private Internacao internacao;
	
	@ManyToOne(targetEntity=Resultado.class)
	private Resultado resultado;
	
	@ManyToOne(targetEntity=TipoExame.class)
	private TipoExame tipoExame;

	public Exame() {
		super();
	}

	public Exame(Date dataSolicitacao, Date dataResultado,
			Internacao internacao, Resultado resultado, TipoExame tipoExame) {
		super();
		this.dataSolicitacao = dataSolicitacao;
		this.dataResultado = dataResultado;
		this.internacao = internacao;
		this.resultado = resultado;
		this.tipoExame = tipoExame;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Date getDataSolicitacao() {
		return dataSolicitacao;
	}

	public void setDataSolicitacao(Date dataSolicitacao) {
		this.dataSolicitacao = dataSolicitacao;
	}

	public Date getDataResultado() {
		return dataResultado;
	}

	public void setDataResultado(Date dataResultado) {
		this.dataResultado = dataResultado;
	}

	public Internacao getInternacao() {
		return internacao;
	}

	public void setInternacao(Internacao internacao) {
		this.internacao = internacao;
	}

	public Resultado getResultado() {
		return resultado;
	}

	public void setResultado(Resultado resultado) {
		this.resultado = resultado;
	}

	public TipoExame getTipoExame() {
		return tipoExame;
	}

	public void setTipoExame(TipoExame tipoExame) {
		this.tipoExame = tipoExame;
	}

	@Override
	public String toString() {
		return "Exame [codigo=" + codigo + ", dataSolicitacao="
				+ dataSolicitacao + ", dataResultado=" + dataResultado
				+ ", internacao=" + internacao + ", resultado=" + resultado
				+ ", tipoExame=" + tipoExame + "]";
	}
	

}
