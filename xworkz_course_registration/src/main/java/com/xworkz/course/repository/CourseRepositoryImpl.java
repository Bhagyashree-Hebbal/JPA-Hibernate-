package com.xworkz.course.repository;

import com.xworkz.course.entity.CourseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Repository
public class CourseRepositoryImpl implements CourseRepository{

    @Autowired
    EntityManagerFactory emf;

    @Override
    public boolean save(CourseEntity courseEntity) {

        System.out.println("repoImpl"+courseEntity);

        EntityManager em= emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try {
            et.begin();
            em.persist(courseEntity);
            et.commit();
        }catch (Exception e){
            if(et.isActive()){
                et.rollback();
            }
        }finally {
            em.close();
        }
        return false;
    }

    @Override
    public String getNameByEmailAndPassword(String email, String password) {
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        String name=null;
        try{
            et.begin();
            Query query=em.createNamedQuery("getNameByEmailAndPassword");
            query.setParameter("byEmail",email).setParameter("byPassword",password);
            name=(String)query.getSingleResult();
            et.commit();
        } catch (Exception e) {
            if(et.isActive()){
                et.rollback();
            }
        }
        finally {
            em.close();
        }
        return name;
    }
}
