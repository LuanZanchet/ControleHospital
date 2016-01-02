package unoesc.edu.hospital.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import unoesc.edu.hospital.model.Paciente;

public class PacienteDAO implements Serializable {

	private static final long serialVersionUID = 6337983326799534603L;

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("unidade");
	private EntityManager em = emf.createEntityManager();
	private EntityTransaction transacion = em.getTransaction();
	
	public boolean store(Paciente paciente){
		try {
			transacion.begin();
			em.persist(paciente);
			transacion.commit();
		} catch (Exception e) {
			transacion.rollback();
			return false;
		}
		return true;
	}
	
	public boolean alter(Paciente paciente){
		try {
			transacion.begin();
			em.merge(paciente);
			transacion.commit();
		} catch (Exception e) {
			transacion.rollback();
			return false;
		}
		return true;
	}
	
	public boolean delete(Paciente paciente){
		try {
			transacion.begin();
			em.remove(paciente);
			transacion.commit();
		} catch (Exception e) {
			transacion.rollback();
			return false;
		}
		return true;
	}
	
	public Paciente get(Integer codigo){
		return em.find(Paciente.class, codigo);
	}
	
	public List<Paciente> listarTodos(){
		TypedQuery<Paciente> clientes = em.createNamedQuery(Paciente.LISTAR_PACIENTES,Paciente.class);
		return clientes.getResultList();
	}
	
	public void close(){
		em.close();
		emf.close();
	}
}
