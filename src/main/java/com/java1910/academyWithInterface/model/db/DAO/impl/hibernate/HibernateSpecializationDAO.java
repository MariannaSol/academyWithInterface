package com.java1910.academyWithInterface.model.db.DAO.impl.hibernate;

import com.java1910.academyWithInterface.model.db.DAO.SpecializationDAO;
import com.java1910.academyWithInterface.model.db.entities.Specialization;
import com.java1910.academyWithInterface.model.db.utils.HibernateUtils;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class HibernateSpecializationDAO implements SpecializationDAO {
    HibernateUtils hibernateUtils;

    public HibernateSpecializationDAO(HibernateUtils hibernateUtils) {
        this.hibernateUtils = hibernateUtils;
    }

    @Override
    public Specialization findById(long id) {

        Session session = hibernateUtils.getSession();

        return (Specialization) session.get(Specialization.class, id);
    }

    @Override
    public List<Specialization> findAll() {
        Session session = hibernateUtils.getSession();

        return session.createQuery("from Specialization").list();
    }


    @Override
    public boolean save(Specialization specialization) {
        return saveOrDelete(specialization, false);
    }

    @Override
    public boolean delete(Specialization specialization) {
        return saveOrDelete(specialization, true);
    }

    private boolean saveOrDelete(Specialization specialization, boolean delete) {
        Session session = hibernateUtils.getSession();
        try {
            Transaction transaction = session.beginTransaction();
            if (delete) {
                session.delete(specialization);
            }
            else{
                session.saveOrUpdate(specialization);
            }
            transaction.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }
}
