package unoesc.edu.hospital.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

@NamedQuery(name=Hospital.TODOS_HOSPITAIS,query="from Hospital")
@Entity
public class Hospital implements Serializable{
	
	private static final long serialVersionUID = 5266805096383646603L;
	public static final String TODOS_HOSPITAIS="ListarTodosHospitais";

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idHospital")
	private Integer codigo;
	
	private String nome;
	private Long telefone;
	
	@ManyToOne(targetEntity=Endereco.class)
	private Endereco endereco;

	public Hospital() {
		super();
	
	}

	public Hospital(String nome, Long telefone, Endereco endereco) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
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

	@Override
	public String toString() {
		return "Hospital [codigo=" + codigo + ", nome=" + nome + ", telefone="
				+ telefone + ", endereco=" + endereco + "]";
	}
	

	
}
