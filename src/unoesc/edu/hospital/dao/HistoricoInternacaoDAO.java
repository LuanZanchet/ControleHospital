package unoesc.edu.hospital.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import unoesc.edu.hospital.model.HistoricoInternacao;

public class HistoricoInternacaoDAO implements Serializable {

	private static final long serialVersionUID = -7828995039226267618L;

	
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("unidade");
	private EntityManager em = emf.createEntityManager();
	private EntityTransaction transacion = em.getTransaction();
	
	public boolean store(HistoricoInternacao historico){
		try {
			transacion.begin();
			em.persist(historico);
			transacion.commit();
		} catch (Exception e) {
			transacion.rollback();
			return false;
		}
		return true;
	}
	
	public boolean alter(HistoricoInternacao historico){
		try {
			transacion.begin();
			em.merge(historico);
			transacion.commit();
		} catch (Exception e) {
			transacion.rollback();
			return false;
		}
		return true;
	}
	
	public boolean delete(HistoricoInternacao historico){
		try {
			transacion.begin();
			em.remove(historico);
			transacion.commit();
		} catch (Exception e) {
			transacion.rollback();
			return false;
		}
		return true;
	}
	
	public HistoricoInternacao get(Integer codigo){
		return em.find(HistoricoInternacao.class, codigo);
	}
	
	public List<HistoricoInternacao> listarTodos(){
		TypedQuery<HistoricoInternacao> historicos = em.createNamedQuery(HistoricoInternacao.LISTAR_HISTORICO,HistoricoInternacao.class);
		return historicos.getResultList();
	}
	
	public void close(){
		em.close();
		emf.close();
	}
}
