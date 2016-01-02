package unoesc.edu.hospital.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


@NamedQuery(name=Paciente.LISTAR_PACIENTES,query="from Paciente")
@Entity
public class Paciente implements Serializable {
	
	private static final long serialVersionUID = 5119860094131115385L;
	public static final String LISTAR_PACIENTES="ListarTodosPacientes";
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="idPaciente")
	private Integer codigo;
	
	private String nome;
	private Long cpf;
	private Long rg;
	private Integer idade;
	private Long telefone;
	
	@ManyToOne(targetEntity=Endereco.class)
	private Endereco endereco;
	
	@ManyToOne(targetEntity=HistoricoInternacao.class)
	private HistoricoInternacao historico;
	
	@OneToMany(mappedBy="paciente")
	private List<Internacao> internacoes;

	public Paciente() {
		super();
	}

	public Paciente(String nome, Long cpf, Long rg, Integer idade,
			Long telefone, Endereco endereco, HistoricoInternacao historico,
			List<Internacao> internacoes) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.idade = idade;
		this.telefone = telefone;
		this.endereco = endereco;
		this.historico = historico;
		this.internacoes = internacoes;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public Long getRg() {
		return rg;
	}

	public void setRg(Long rg) {
		this.rg = rg;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Long getTelefone() {
		return telefone;
	}

	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public HistoricoInternacao getHistorico() {
		return historico;
	}

	public void setHistorico(HistoricoInternacao historico) {
		this.historico = historico;
	}

	public List<Internacao> getInternacoes() {
		return internacoes;
	}

	public void setInternacoes(List<Internacao> internacoes) {
		this.internacoes = internacoes;
	}

	@Override
	public String toString() {
		return "Paciente [codigo=" + codigo + ", nome=" + nome + ", cpf=" + cpf
				+ ", rg=" + rg + ", idade=" + idade + ", telefone=" + telefone
				+ ", endereco=" + endereco + ", historico=" + historico
				+ ", internacoes=" + internacoes + "]";
	}
	
	
	
}
