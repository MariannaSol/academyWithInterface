package com.java1910.academyWithInterface.model.db.DAO.impl.hibernate;


import com.java1910.academyWithInterface.model.db.DAO.PersonDAO;
import com.java1910.academyWithInterface.model.db.entities.Person;
import com.java1910.academyWithInterface.model.db.utils.HibernateUtils;
import org.hibernate.*;
import org.hibernate.criterion.Restrictions;

import java.util.Date;
import java.util.List;

public class HibernatePersonDAO implements PersonDAO {

    private HibernateUtils hibernateUtils;

    public HibernatePersonDAO(HibernateUtils hibernateUtils) {
        this.hibernateUtils = hibernateUtils;
    }

    @Override
    public List<Person> findAll() {
        Session session = hibernateUtils.getSession();

        return session.createQuery("from Person").list();
    }

    @Override
    public Person findById(long id) {
        Session session = hibernateUtils.getSession();

        return (Person) session.get(Person.class, id);
    }

    @Override
    public List<Person> findByName(String name) {
        Session session = hibernateUtils.getSession();
        Query query = session.createQuery("from Person as p where p.name=?");
        query.setString(0, name);

        return query.list();
    }

    @Override
    public List<Person> findByPassport(String passport) {
        Session session = hibernateUtils.getSession();
        Query query = session.createQuery("from Person as p where p.passport=?");
        query.setString(0, passport);

        return query.list();
    }

    @Override
    public List<Person> findByBirthday(Date birthday) {
        Session session = hibernateUtils.getSession();
        Query query = session.createQuery("from Person as p where p.birthday=?");
        query.setString(0, String.valueOf(birthday));

        return query.list();
    }

    @Override
    public boolean save(Person person) {
        return saveOrDelete(person, false);
    }

    @Override
    public boolean delete(Person person) {
        return saveOrDelete(person, true);
    }

    private boolean saveOrDelete(Person p, boolean delete) {
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

    @Override
    public List<Person> findBy(int flags, Object... values) {
        Session session = hibernateUtils.getSession();
        Criteria criteria = session.createCriteria(Person.class);

        for(Object value: values) {
            if((flags & FLAG_NAME) != 0) {
                criteria.add(Restrictions.eq("name", value));
                flags = flags ^ FLAG_NAME;
            } else if ((flags & FLAG_PASSPORT) != 0) {
                criteria.add(Restrictions.eq("passport", value));
                flags = flags ^ FLAG_PASSPORT;
            } else if ((flags & FLAG_PHONE) != 0) {
                criteria.add(Restrictions.eq("phone", value));
                flags = flags ^ FLAG_PHONE;
            }
        }

        return criteria.list();
    }
}
