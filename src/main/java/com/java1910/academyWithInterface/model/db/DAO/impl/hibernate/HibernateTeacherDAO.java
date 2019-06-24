package com.java1910.academyWithInterface.model.db.DAO.impl.hibernate;


import com.java1910.academyWithInterface.model.db.DAO.TeacherDAO;
import com.java1910.academyWithInterface.model.db.entities.Teacher;
import com.java1910.academyWithInterface.model.db.utils.HibernateUtils;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class HibernateTeacherDAO implements TeacherDAO {
    private HibernateUtils hibernateUtils;

    public HibernateTeacherDAO(HibernateUtils hibernateUtils) {
        this.hibernateUtils = hibernateUtils;
    }

    @Override
    public List<Teacher> findAll() {
        Session session = hibernateUtils.getSession();

        return session.createQuery("from Teacher ").list();
    }

    @Override
    public Teacher findById(long id) {
        Session session = hibernateUtils.getSession();

        return (Teacher) session.get(Teacher.class, id);
    }

    @Override
    public boolean save(Teacher teacher) {
        return saveOrDelete(teacher, false);
    }

    @Override
    public boolean delete(Teacher teacher) {
        return saveOrDelete(teacher, true);
    }

    private boolean saveOrDelete(Teacher t, boolean delete) {
        Session session = hibernateUtils.getSession();
        try {
            Transaction transaction = session.beginTransaction();
            if (delete) {
                session.delete(t);
            }
            else{
                session.saveOrUpdate(t);
            }
            transaction.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }
}
