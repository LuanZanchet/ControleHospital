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

@NamedQuery(name=Medico.LISTAR_MEDICOS,query="from Medico")
@Entity
public class Medico implements Serializable{
	
	private static final long serialVersionUID = -630618247063978852L;
	public static final String LISTAR_MEDICOS ="ListarTodosMedicos";
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idMedico")
	private Integer codigo;
	
	private String nome;
	private String crm;
	private Long telefone;
	
	@ManyToOne(targetEntity=Endereco.class)
	private Endereco endereco;
	
	@OneToMany(mappedBy="medico")
	private List<Internacao> internacoes;

	public Medico() {
		super();
	}

	public Medico(String nome, String crm, Long telefone, Endereco endereco,
			List<Internacao> internacoes) {
		super();
		this.nome = nome;
		this.crm = crm;
		this.telefone = telefone;
		this.endereco = endereco;
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

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
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

	public List<Internacao> getInternacoes() {
		return internacoes;
	}

	public void setInternacoes(List<Internacao> internacoes) {
		this.internacoes = internacoes;
	}

	@Override
	public String toString() {
		return "Medico [codigo=" + codigo + ", nome=" + nome + ", crm=" + crm
				+ ", telefone=" + telefone + ", endereco=" + endereco
				+ ", internacoes=" + internacoes + "]";
	}
	
	
	
}
