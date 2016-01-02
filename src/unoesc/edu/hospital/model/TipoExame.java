package unoesc.edu.hospital.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@NamedQuery(name=TipoExame.LISTAR_TIPOEXAME,query="from TipoExame")
@Entity
public class TipoExame implements Serializable {

	private static final long serialVersionUID = -1744595907132583581L;
	public static final String LISTAR_TIPOEXAME = "ListarTodosTiposExames";

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idTipoExame")
	private Integer codigo;
	
	private String nome;
	
	private String descricao;

	public TipoExame() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TipoExame(String nome, String descricao) {
		super();
		this.nome = nome;
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "TipoExame [codigo=" + codigo + ", nome=" + nome
				+ ", descricao=" + descricao + "]";
	}
	
	
}
