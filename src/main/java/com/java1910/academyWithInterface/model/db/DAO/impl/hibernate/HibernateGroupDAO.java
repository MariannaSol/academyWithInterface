package com.java1910.academyWithInterface.model.db.DAO.impl.hibernate;


import com.java1910.academyWithInterface.model.db.DAO.GroupDAO;
import com.java1910.academyWithInterface.model.db.entities.Group;
import com.java1910.academyWithInterface.model.db.utils.HibernateUtils;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class HibernateGroupDAO implements GroupDAO {
    private HibernateUtils hibernateUtils;

    public HibernateGroupDAO(HibernateUtils hibernateUtils) {
        this.hibernateUtils = hibernateUtils;
    }

    @Override
    public Group findById(long id) {
        Session session = hibernateUtils.getSession();

        return (Group) session.get(Group.class, id);
    }

    @Override
    public boolean save(Group p) {
        return saveOrDelete(p, false);
    }

    @Override
    public boolean delete(Group p) {
        return saveOrDelete(p, true);
    }

    private boolean saveOrDelete(Group g, boolean delete) {
        Session session = hibernateUtils.getSession();
        try {
            Transaction transaction = session.beginTransaction();
            if (delete) {
                session.delete(g);
            }
            else{
                session.saveOrUpdate(g);
            }
            transaction.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }
}
