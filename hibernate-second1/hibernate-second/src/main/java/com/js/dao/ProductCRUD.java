package com.js.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.js.dto.Product;

public class ProductCRUD {

	final static EntityManagerFactory emf = Persistence.createEntityManagerFactory("uday");

	public boolean insertProduct(Product p) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin();
		em.persist(p);
		et.commit();

		if (em.find(Product.class, p.getId()) != null) {
			return true;

		} else {

			return false;
		}

	}

	// getproductby id

	public Product getProductById(int id) {
		EntityManager em = emf.createEntityManager();
		return em.find(Product.class, id);
	}

	// deleteproductbyid

	public boolean deleteProductById(int id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Product p = em.find(Product.class, id);
		if (p != null) {
			et.begin();
			em.remove(p);
			et.commit();
			return true;
		} else {
			return false;
		}

	}

	// getallproudct
	public List<Product> getAllproduct() {
		EntityManager em = emf.createEntityManager();
		String query = "select p from Product p";
		Query  q = em.createQuery(query);
		return q.getResultList();

	}

	public boolean UpdateProductById(int id, Product pro) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Product p = em.find(Product.class, id);
		if (p != null) {

			pro.setId(id);
			et.begin();
			em.merge(p);
			et.commit();
			return true;
		} else {
			return false;
		}

	}

}
