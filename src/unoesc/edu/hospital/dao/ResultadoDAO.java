package unoesc.edu.hospital.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import unoesc.edu.hospital.model.Resultado;


public class ResultadoDAO implements Serializable {

	private static final long serialVersionUID = -5222666151223924388L;

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("unidade");
	private EntityManager em = emf.createEntityManager();
	private EntityTransaction transacion = em.getTransaction();
	
	public boolean store(Resultado resultado){
		try {
			transacion.begin();
			em.persist(resultado);
			transacion.commit();
		} catch (Exception e) {
			transacion.rollback();
			return false;
		}
		return true;
	}
	
	public boolean alter(Resultado resultado){
		try {
			transacion.begin();
			em.merge(resultado);
			transacion.commit();
		} catch (Exception e) {
			transacion.rollback();
			return false;
		}
		return true;
	}
	
	public boolean delete(Resultado resultado){
		try {
			transacion.begin();
			em.remove(resultado);
			transacion.commit();
		} catch (Exception e) {
			transacion.rollback();
			return false;
		}
		return true;
	}
	
	public Resultado get(Integer codigo){
		return em.find(Resultado.class, codigo);
	}
	
	public List<Resultado> listarTodos(){
		TypedQuery<Resultado> resultados = em.createNamedQuery(Resultado.LISTAR_RESULTADOS,Resultado.class);
		return resultados.getResultList();
	}
	
	public void close(){
		em.close();
		emf.close();
	}
}
