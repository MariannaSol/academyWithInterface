package com.java1910.academyWithInterface.model.db.DAO.impl.hibernate;


import com.java1910.academyWithInterface.model.db.DAO.StudentDAO;
import com.java1910.academyWithInterface.model.db.entities.Student;
import com.java1910.academyWithInterface.model.db.utils.HibernateUtils;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class HibernateStudentDAO implements StudentDAO {
    private HibernateUtils hibernateUtils;

    public HibernateStudentDAO(HibernateUtils hibernateUtils) {
        this.hibernateUtils = hibernateUtils;
    }


    @Override
    public List<Student> findAll() {
        Session session = hibernateUtils.getSession();

        return session.createQuery("from Student").list();
    }

    @Override
    public Student findById(long id) {
        Session session = hibernateUtils.getSession();

        return (Student) session.get(Student.class, id);
    }

    @Override
    public boolean save(Student s) {
        return saveOrDelete(s, false);
    }

    @Override
    public boolean delete(Student s) {
        return saveOrDelete(s, true);
    }

    private boolean saveOrDelete(Student s, boolean delete) {
        Session session = hibernateUtils.getSession();
        try {
            Transaction transaction = session.beginTransaction();
            if (delete) {
                session.delete(s);
            }
            else{
                session.saveOrUpdate(s);
            }
            transaction.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }
}
