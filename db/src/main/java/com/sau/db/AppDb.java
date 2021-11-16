package com.sau.db;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.metamodel.Type;


public class AppDb {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");

    public static void main(String[] args) {

        //Select
        Ogrenciler s = getir(1);
        System.out.println("Gelen kayıt:"+s.getOgrenciAd());

    }

    public static Ogrenciler getir(int id){
        EntityManager em = emf.createEntityManager();
        // Getir
        em.getTransaction().begin();
        Ogrenciler st = em.find(Ogrenciler.class, id);
        em.getTransaction().commit();
        return st;
    }

    public static void insert(Ogrenciler s){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        System.out.println("INSERT -> [" +s.getOgrenciNo()+ " : " + s.getOgrenciAd()+ " : " + s.getOgrenciSoyad()+"]");
        em.persist(s);
        em.getTransaction().commit();
    }


}

