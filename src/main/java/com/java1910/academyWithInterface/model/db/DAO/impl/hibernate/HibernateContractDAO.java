package com.java1910.academyWithInterface.model.db.DAO.impl.hibernate;


import com.java1910.academyWithInterface.model.db.DAO.ContractDAO;
import com.java1910.academyWithInterface.model.db.entities.Contract;
import com.java1910.academyWithInterface.model.db.utils.HibernateUtils;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class HibernateContractDAO implements ContractDAO {
    private HibernateUtils hibernateUtils;

    public HibernateContractDAO(HibernateUtils hibernateUtils) {
        this.hibernateUtils = hibernateUtils;
    }

    @Override
    public List<Contract> findAll() {
        return null;
    }

    @Override
    public Contract findById(long id) {
        return null;
    }

    @Override
    public boolean save(Contract c) {
        return saveOrDelete(c, false);
    }

    @Override
    public boolean delete(Contract c) {
        return false;
    }

    private boolean saveOrDelete(Contract p, boolean delete) {
        Session session = hibernateUtils.getSession();
        try {
            Transaction t = session.beginTransaction();
            if (delete) {
                session.delete(p);
            }
            else{
                session.saveOrUpdate(p);
            }
            t.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }
}
