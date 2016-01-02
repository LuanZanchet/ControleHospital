package unoesc.edu.hospital.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import unoesc.edu.hospital.model.Hospital;


public class HospitalDAO implements Serializable{

	private static final long serialVersionUID = 9183189490608985753L;

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("unidade");
	private EntityManager em = emf.createEntityManager();
	private EntityTransaction transacion = em.getTransaction();
	
	public boolean store(Hospital hospital){
		try {
			transacion.begin();
			em.persist(hospital);
			transacion.commit();
		} catch (Exception e) {
			transacion.rollback();
			return false;
		}
		return true;
	}
	
	public boolean alter(Hospital hospital){
		try {
			transacion.begin();
			em.merge(hospital);
			transacion.commit();
		} catch (Exception e) {
			transacion.rollback();
			return false;
		}
		return true;
	}
	
	public boolean delete(Hospital hospital){
		try {
			transacion.begin();
			em.remove(hospital);
			transacion.commit();
		} catch (Exception e) {
			transacion.rollback();
			return false;
		}
		return true;
	}
	
	public Hospital get(Integer codigo){
		return em.find(Hospital.class, codigo);
	}
	
	public List<Hospital> listarTodos(){
		TypedQuery<Hospital> hospitais = em.createNamedQuery(Hospital.TODOS_HOSPITAIS,Hospital.class);
		return hospitais.getResultList();
	}
	
	public void close(){
		em.close();
		emf.close();
	}
}

