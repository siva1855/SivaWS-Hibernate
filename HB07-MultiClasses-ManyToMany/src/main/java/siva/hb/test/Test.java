package siva.hb.test;

import java.util.Arrays;
import org.hibernate.Session;
import org.hibernate.Transaction;
import siva.hb.entity.Course;
import siva.hb.entity.Student;
import siva.hb.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		Transaction tx = null;
		Session ses = HibernateUtil.geSessionFactory().openSession();

		try {
			tx = ses.beginTransaction();

			Course course1 = new Course(101, "HB", 1200.50);
			Course course2 = new Course(102, "Spring", 2000.50);
			Course course3 = new Course(103, "Boot", 1500.50);

			Student student1 = new Student(1, "Siva", "siva@gmail.com", Arrays.asList(course1, course2));
			Student student2 = new Student(2, "kumar", "kumar@gmail.com", Arrays.asList(course2, course3));

			ses.save(course1);
			ses.save(course2);
			ses.save(course3);
			ses.save(student1);
			ses.save(student2);

			tx.commit();

		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		System.out.println("Record Inserted");
	}
}
