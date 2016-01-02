package unoesc.edu.hospital.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import unoesc.edu.hospital.model.TipoExame;


public class TipoExameDAO implements Serializable {

	private static final long serialVersionUID = -2027080522401983185L;

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("unidade");
	private EntityManager em = emf.createEntityManager();
	private EntityTransaction transacion = em.getTransaction();
	
	public boolean store(TipoExame tipoExame){
		try {
			transacion.begin();
			em.persist(tipoExame);
			transacion.commit();
		} catch (Exception e) {
			transacion.rollback();
			return false;
		}
		return true;
	}
	
	public boolean alter(TipoExame tipoExame){
		try {
			transacion.begin();
			em.merge(tipoExame);
			transacion.commit();
		} catch (Exception e) {
			transacion.rollback();
			return false;
		}
		return true;
	}
	
	public boolean delete(TipoExame tipoExame){
		try {
			transacion.begin();
			em.remove(tipoExame);
			transacion.commit();
		} catch (Exception e) {
			transacion.rollback();
			return false;
		}
		return true;
	}
	
	public TipoExame get(Integer codigo){
		return em.find(TipoExame.class, codigo);
	}
	
	public List<TipoExame> listarTodos(){
		TypedQuery<TipoExame> tiposExames = em.createNamedQuery(TipoExame.LISTAR_TIPOEXAME,TipoExame.class);
		return tiposExames.getResultList();
	}
	
	public void close(){
		em.close();
		emf.close();
	}
}
