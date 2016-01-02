package unoesc.edu.hospital.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import unoesc.edu.hospital.model.Medico;

public class MedicoDAO implements Serializable{

	private static final long serialVersionUID = 8646938246264080626L;

	
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("unidade");
	private EntityManager em = emf.createEntityManager();
	private EntityTransaction transacion = em.getTransaction();
	
	public boolean store(Medico medico){
		try {
			transacion.begin();
			em.persist(medico);
			transacion.commit();
		} catch (Exception e) {
			transacion.rollback();
			return false;
		}
		return true;
	}
	
	public boolean alter(Medico medico){
		try {
			transacion.begin();
			em.merge(medico);
			transacion.commit();
		} catch (Exception e) {
			transacion.rollback();
			return false;
		}
		return true;
	}
	
	public boolean delete(Medico medico){
		try {
			transacion.begin();
			em.remove(medico);
			transacion.commit();
		} catch (Exception e) {
			transacion.rollback();
			return false;
		}
		return true;
	}
	
	public Medico get(Integer codigo){
		return em.find(Medico.class, codigo);
	}
	
	public List<Medico> listarTodos(){
		TypedQuery<Medico> medicos = em.createNamedQuery(Medico.LISTAR_MEDICOS,Medico.class);
		return medicos.getResultList();
	}
	
	public void close(){
		em.close();
		emf.close();
	}
}
