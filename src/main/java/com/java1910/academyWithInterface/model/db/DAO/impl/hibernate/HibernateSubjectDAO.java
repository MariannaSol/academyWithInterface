package com.java1910.academyWithInterface.model.db.DAO.impl.hibernate;

import com.java1910.academyWithInterface.model.db.DAO.SubjectDAO;
import com.java1910.academyWithInterface.model.db.entities.Subject;
import com.java1910.academyWithInterface.model.db.utils.HibernateUtils;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class HibernateSubjectDAO implements SubjectDAO {
    HibernateUtils hibernateUtils;

    public HibernateSubjectDAO(HibernateUtils hibernateUtils) {
        this.hibernateUtils = hibernateUtils;
    }

    @Override
    public Subject findById(long id) {
        Session session = hibernateUtils.getSession();

        return (Subject) session.get(Subject.class, id);
    }

    @Override
    public List<Subject> findAll() {
        Session session = hibernateUtils.getSession();

        return session.createQuery("from Subject").list();
    }

    @Override
    public boolean save(Subject subject) {
        return saveOrDelete(subject, false);
    }

    @Override
    public boolean delete(Subject subject) {
        return saveOrDelete(subject, true);
    }

    private boolean saveOrDelete(Subject subject, boolean delete) {
        Session session = hibernateUtils.getSession();
        try {
            Transaction transaction = session.beginTransaction();
            if (delete) {
                session.delete(subject);
            }
            else{
                session.saveOrUpdate(subject);
            }
            transaction.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }
}
