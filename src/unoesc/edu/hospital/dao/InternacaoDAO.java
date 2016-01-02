package unoesc.edu.hospital.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import unoesc.edu.hospital.model.Internacao;



public class InternacaoDAO implements Serializable{


	private static final long serialVersionUID = -513323450283406271L;

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("unidade");
	private EntityManager em = emf.createEntityManager();
	private EntityTransaction transacion = em.getTransaction();
	
	public boolean store(Internacao internacao){
		try {
			transacion.begin();
			em.persist(internacao);
			transacion.commit();
		} catch (Exception e) {
			transacion.rollback();
			return false;
		}
		return true;
	}
	
	public boolean alter(Internacao internacao){
		try {
			transacion.begin();
			em.merge(internacao);
			transacion.commit();
		} catch (Exception e) {
			transacion.rollback();
			return false;
		}
		return true;
	}
	
	public boolean delete(Internacao internacao){
		try {
			transacion.begin();
			em.remove(internacao);
			transacion.commit();
		} catch (Exception e) {
			transacion.rollback();
			return false;
		}
		return true;
	}
	
	public Internacao get(Integer codigo){
		return em.find(Internacao.class, codigo);
	}
	
	public List<Internacao> listarTodos(){
		TypedQuery<Internacao> clientes = em.createNamedQuery(Internacao.LISTAR_INTERNACOES,Internacao.class);
		return clientes.getResultList();
	}
	
	public void close(){
		em.close();
		emf.close();
	}
}