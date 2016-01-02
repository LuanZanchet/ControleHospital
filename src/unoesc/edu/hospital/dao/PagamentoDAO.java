package unoesc.edu.hospital.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import unoesc.edu.hospital.model.Pagamento;

public class PagamentoDAO implements Serializable {
	
	private static final long serialVersionUID = -1830888674396323074L;

	
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("unidade");
	private EntityManager em = emf.createEntityManager();
	private EntityTransaction transacion = em.getTransaction();
	
	public boolean store(Pagamento pagamento){
		try {
			transacion.begin();
			em.persist(pagamento);
			transacion.commit();
		} catch (Exception e) {
			transacion.rollback();
			return false;
		}
		return true;
	}
	
	public boolean alter(Pagamento pagamento){
		try {
			transacion.begin();
			em.merge(pagamento);
			transacion.commit();
		} catch (Exception e) {
			transacion.rollback();
			return false;
		}
		return true;
	}
	
	public boolean delete(Pagamento pagamento){
		try {
			transacion.begin();
			em.remove(pagamento);
			transacion.commit();
		} catch (Exception e) {
			transacion.rollback();
			return false;
		}
		return true;
	}
	
	public Pagamento get(Integer codigo){
		return em.find(Pagamento.class, codigo);
	}
	
	public List<Pagamento> listarTodos(){
		TypedQuery<Pagamento> clientes = em.createNamedQuery(Pagamento.LISTAR_PAGAMENTOS,Pagamento.class);
		return clientes.getResultList();
	}
	
	public void close(){
		em.close();
		emf.close();
	}
}
