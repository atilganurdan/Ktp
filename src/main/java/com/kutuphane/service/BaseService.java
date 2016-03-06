/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kutuphane.service;

import com.kutuphane.framework.DbException;
import com.kutuphane.hibernate.NHibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author vektorel
 */
public class BaseService {

    public List getAll(Class cl) {
        Session session = NHibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(cl);//select yapma class a göre where clause
        return criteria.list();

    }

    public Object getById(Class cl,Long id) {
        Session session = NHibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(cl);
        criteria.add(Restrictions.eq("id", id)); // select from Class (Kisi)where id = +id anlamında
        return criteria.uniqueResult();
    }

    public Object save(Object obj) throws DbException {
        Session session = NHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(obj);
        transaction.commit();
        session.close();
        return obj;
    }

    public Boolean delete(Object obj) throws DbException {
        Session session = NHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(obj);
        transaction.commit();
        session.close();
        return true;
    }

    public Object update(Object obj) throws DbException {
        Session session = NHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(obj);
        transaction.commit();
        session.close();
        return obj;
    }
}
