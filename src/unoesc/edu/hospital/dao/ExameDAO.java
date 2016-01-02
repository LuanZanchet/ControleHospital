package unoesc.edu.hospital.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import unoesc.edu.hospital.model.Exame;

public class ExameDAO implements Serializable{

	private static final long serialVersionUID = 946171321398997609L;
	
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("unidade");
	private EntityManager em = emf.createEntityManager();
	private EntityTransaction transacion = em.getTransaction();
	
	public boolean store(Exame exame){
		try {
			transacion.begin();
			em.persist(exame);
			transacion.commit();
		} catch (Exception e) {
			transacion.rollback();
			return false;
		}
		return true;
	}
	
	public boolean alter(Exame exame){
		try {
			transacion.begin();
			em.merge(exame);
			transacion.commit();
		} catch (Exception e) {
			transacion.rollback();
			return false;
		}
		return true;
	}
	
	public boolean delete(Exame exame){
		try {
			transacion.begin();
			em.remove(exame);
			transacion.commit();
		} catch (Exception e) {
			transacion.rollback();
			return false;
		}
		return true;
	}
	
	public Exame get(Integer codigo){
		return em.find(Exame.class, codigo);
	}
	
	public List<Exame> listarTodos(){
		TypedQuery<Exame> exames = em.createNamedQuery(Exame.LISTAR_EXAMES,Exame.class);
		return exames.getResultList();
	}
	
	public void close(){
		em.close();
		emf.close();
	}
}