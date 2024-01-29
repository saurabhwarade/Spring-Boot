package Dao;

import Model.Abc;
import Model.User;
import Util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class UserDao {
    public User login(String email, int password) {
        User user = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from Userdetail where email=:em and password=:pass");

        query.setParameter("em", email);
        query.setParameter("pass", password);
        user = (User) query.uniqueResult();
        transaction.commit();
        return user;
    }

    public boolean addUser(User user) {
        boolean msg = false;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        int i = (int) session.save(user);

        transaction.commit();

        if (i > 0) {
            msg = true;
        }

        return msg;
    }

    public boolean addReservationDetail(Abc reservation) {
        boolean msg = false;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        int i = (int) session.save(reservation);

        transaction.commit();
        if (i > 0) {
            msg = true;
        }

        return msg;
    }
}
