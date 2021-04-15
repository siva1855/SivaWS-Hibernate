package siva.hb.test;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import siva.hb.entity.Student;

public class StudentTest {

	public static void main(String[] args) {
		try {
			Configuration configuration = new Configuration();
			configuration.configure();
			SessionFactory sessionFactory = configuration.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			Student student = new Student();
			student.setStudentId(102);
			student.setStudentName("praveen");
			student.setStudentQualification("B-Tech");
			student.setStudentCourse("Gate");
			student.setStudentAddress("AP");
			Serializable serializable = session.save(student);
			Integer id = (Integer) serializable;
			transaction.commit();
			session.close();
			System.out.println("saved successfully ID is: " + id);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
