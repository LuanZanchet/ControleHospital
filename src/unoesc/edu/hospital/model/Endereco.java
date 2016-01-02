package unoesc.edu.hospital.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@NamedQuery(name=Endereco.LISTAR_ENDERECOS,query="from Endereco")
@Entity
public class Endereco implements Serializable {
	
	private static final long serialVersionUID = -479872560599474692L;
	public static final String LISTAR_ENDERECOS= "ListarTodosEnderecos";

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idEndereco")
	private Integer codigo;
	
	private String bairro;
	private String rua;
	private String cidade;
	private String uf;
	
	
	
	public Endereco() {
		super();
	
	}
	
	
	public Endereco(String bairro, String rua, String cidade, String uf) {
		super();
		this.bairro = bairro;
		this.rua = rua;
		this.cidade = cidade;
		this.uf = uf;
	}


	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}

	@Override
	public String toString() {
		return "Endereco [codigo=" + codigo + ", bairro=" + bairro + ", rua="
				+ rua + ", cidade=" + cidade + ", uf=" + uf + "]";
	}
	

}
