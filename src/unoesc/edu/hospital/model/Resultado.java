package unoesc.edu.hospital.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@NamedQuery(name=Resultado.LISTAR_RESULTADOS,query="from Resultado")
@Entity
public class Resultado implements Serializable {

	private static final long serialVersionUID = -3121121128830424824L;
	public static final String LISTAR_RESULTADOS = "ListarTodosResultados";

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idResultado")
	private Integer codigo;

	private String descricao;

	public Resultado() {
		super();
	}

	public Resultado(String descricao) {
		super();
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Resultado [codigo=" + codigo + ", descricao=" + descricao + "]";
	}

	
}
