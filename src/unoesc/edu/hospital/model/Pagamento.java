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

@NamedQuery(name=Pagamento.LISTAR_PAGAMENTOS,query="from Pagamento")
@Entity
public class Pagamento implements Serializable {

	private static final long serialVersionUID = 3949368261101934602L;
	public static final String LISTAR_PAGAMENTOS = "ListarTodosPagamentos";

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idPagamento")
	private Integer Codigo;
	
	@Column(nullable=false)
	private Double valor;
	
	@Temporal(TemporalType.DATE)
	private Date data;

	public Pagamento() {
		super();
		
	}

	public Pagamento(Double valor, Date data) {
		super();
		this.valor = valor;
		this.data = data;
	}

	public Integer getCodigo() {
		return Codigo;
	}

	public void setCodigo(Integer codigo) {
		Codigo = codigo;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Pagamento [Codigo=" + Codigo + ", valor=" + valor + ", data="
				+ data + "]";
	}

	
}
