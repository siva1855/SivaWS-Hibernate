package siva.hb.dao.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import siva.hb.dao.IStudentDao;
import siva.hb.model.Student;
import siva.hb.util.HibernateUtil;

public class StudentDaoImpl implements IStudentDao {
	@Override
	public Integer saveStudent(Student s) {
		Session ses = HibernateUtil.getSf().openSession();
		Transaction tx = null;
		Integer id = null;
		try (ses) {
			tx = ses.beginTransaction();

			// operations
			id = (Integer) ses.save(s);

			tx.commit();
		} catch (Exception e) {
			if (tx != null && tx.getStatus().canRollback()) {
				tx.rollback();
			}
			e.printStackTrace();
		}
		return id;
	}
}
