package com.sau.db;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.metamodel.Type;


public class AppDb {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");

    public static void main(String[] args) {

    }

    public static Kitap getir(int id){
        EntityManager em = emf.createEntityManager();
        // Getir
        em.getTransaction().begin();
        Kitap st = em.find(Kitap.class, id);
        em.getTransaction().commit();
        return st;
    }

    public static void  insert(Kitap s){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(s);
        em.getTransaction().commit();
    }


}

