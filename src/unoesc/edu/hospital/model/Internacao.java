package unoesc.edu.hospital.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@NamedQuery(name=Internacao.LISTAR_INTERNACOES,query="from Internacao")
@Entity
public class Internacao implements Serializable {
	
	private static final long serialVersionUID = -7456188263875964518L;
	public static final String LISTAR_INTERNACOES ="ListarTodasInternacoes";
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idInternacao")
	private Integer codigo;

	private Long codigoCID;

	private Long codigoAIH;
	
	private Integer numeroQuarto;
	
	private Double valorDiaria;
	
	@Temporal(TemporalType.DATE)
	private Date dataInternacao;
	
	@Temporal(TemporalType.DATE)
	private Date dataAlta;
	
	@ManyToOne(targetEntity=Paciente.class)
	private Paciente paciente;
	
	@ManyToOne(targetEntity=Hospital.class)
	private Hospital hospital;

	
	@ManyToOne(targetEntity=Medico.class)
	private Medico medico;
	
	
	@OneToMany(mappedBy="internacao")
	private List<Exame> exames;
	

	@ManyToOne(targetEntity=Pagamento.class)
	private Pagamento pagamento;

	public Internacao() {
		super();
	}

	public Internacao(Long codigoCID, Long codigoAIH, Date dataInternacao,
			Date dataAlta, Paciente paciente, Integer numeroQuarto,
			List<Exame> exames, Pagamento pagamento, Hospital hospital, Double valorDiaria) {
		super();
		this.codigoCID = codigoCID;
		this.codigoAIH = codigoAIH;
		this.dataInternacao = dataInternacao;
		this.dataAlta = dataAlta;
		this.paciente = paciente;
		this.numeroQuarto = numeroQuarto;
		this.exames = exames;
	this.hospital = hospital;
		this.pagamento = pagamento;
		this.valorDiaria = valorDiaria;
	}

	@Override
	public String toString() {
		return "Internacao [codigo=" + codigo + ", codigoCID=" + codigoCID
				+ ", codigoAIH=" + codigoAIH + ", dataInternacao="
				+ dataInternacao + ", dataAlta=" + dataAlta + ", paciente="
				+ paciente + ", exames=" + exames
				+ ", pagamento=" + pagamento + "]";
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Long getCodigoCID() {
		return codigoCID;
	}

	public void setCodigoCID(Long codigoCID) {
		this.codigoCID = codigoCID;
	}

	public Long getCodigoAIH() {
		return codigoAIH;
	}

	public void setCodigoAIH(Long codigoAIH) {
		this.codigoAIH = codigoAIH;
	}

	public Date getDataInternacao() {
		return dataInternacao;
	}

	public void setDataInternacao(Date dataInternacao) {
		this.dataInternacao = dataInternacao;
	}

	public Date getDataAlta() {
		return dataAlta;
	}

	public void setDataAlta(Date dataAlta) {
		this.dataAlta = dataAlta;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	

	public Double getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(Double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public Integer getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(Integer numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	public List<Exame> getExames() {
		return exames;
	}

	public void setExames(List<Exame> exames) {
		this.exames = exames;
	}

	

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	
	
}
