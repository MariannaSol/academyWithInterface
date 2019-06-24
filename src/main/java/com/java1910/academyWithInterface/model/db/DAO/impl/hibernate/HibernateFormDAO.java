package com.java1910.academyWithInterface.model.db.DAO.impl.hibernate;

import com.java1910.academyWithInterface.model.db.DAO.FormDAO;
import com.java1910.academyWithInterface.model.db.entities.Form;
import com.java1910.academyWithInterface.model.db.utils.HibernateUtils;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class HibernateFormDAO implements FormDAO {

    HibernateUtils hibernateUtils;

    public HibernateFormDAO(HibernateUtils hibernateUtils) {
        this.hibernateUtils = hibernateUtils;
    }

    @Override
    public Form findById(long id) {
        Session session = hibernateUtils.getSession();
        return (Form) session.get(Form.class, id);
    }

    @Override
    public boolean save(Form form) {
        return saveOrDelete(form, false);
    }

    @Override
    public boolean delete(Form form) {
        return saveOrDelete(form, true);
    }

    private boolean saveOrDelete(Form form, boolean delete) {
        Session session = hibernateUtils.getSession();
        try {
            Transaction transaction = session.beginTransaction();
            if (delete) {
                session.delete(form);
            }
            else{
                session.saveOrUpdate(form);
            }
            transaction.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }
}
