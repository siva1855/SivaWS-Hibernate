package siva.hb.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import siva.hb.entity.Employee;
import siva.hb.entity.Person;
import siva.hb.entity.Student;
import siva.hb.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		Transaction tx = null;
		Session ses = HibernateUtil.geSessionFactory().openSession();

		try {
			tx = ses.beginTransaction();

			Person person = new Person();
			person.setPersonId(101);
			person.setPersonName("Sivakumar");

			Student student = new Student();
			student.setPersonId(103);
			student.setPersonName("Anjireddy");
			student.setStudentFee(2000.80);
			student.setStudentGrade("C");

			Employee employee = new Employee();
			employee.setPersonId(102);
			employee.setPersonName("Preveen");
			employee.setEmployeeSalary(35000.50);
			employee.setEmployeeDepartment("Development");

			ses.save(person);
			ses.save(student);
			ses.save(employee);
			
			tx.commit();
			
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
         System.out.println("Record Inserted");
	}
}
