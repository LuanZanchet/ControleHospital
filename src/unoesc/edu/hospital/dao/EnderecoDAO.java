package unoesc.edu.hospital.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import unoesc.edu.hospital.model.Endereco;

public class EnderecoDAO implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("unidade");
	private EntityManager em = emf.createEntityManager();
	private EntityTransaction transacion = em.getTransaction();
	
	public boolean store(Endereco endereco){
		try {
			transacion.begin();
			em.persist(endereco);
			transacion.commit();
		} catch (Exception e) {
			transacion.rollback();
			return false;
		}
		return true;
	}
	
	public boolean alter(Endereco endereco){
		try {
			transacion.begin();
			em.merge(endereco);
			transacion.commit();
		} catch (Exception e) {
			transacion.rollback();
			return false;
		}
		return true;
	}
	
	public boolean delete(Endereco endereco){
		try {
			transacion.begin();
			em.remove(endereco);
			transacion.commit();
		} catch (Exception e) {
			transacion.rollback();
			return false;
		}
		return true;
	}
	
	public Endereco get(Integer codigo){
		return em.find(Endereco.class, codigo);
	}
	
	public List<Endereco> listarTodos(){
		TypedQuery<Endereco> enderecos = em.createNamedQuery(Endereco.LISTAR_ENDERECOS,Endereco.class);
		return enderecos.getResultList();
	}
	
	public void close(){
		em.close();
		emf.close();
	}
}