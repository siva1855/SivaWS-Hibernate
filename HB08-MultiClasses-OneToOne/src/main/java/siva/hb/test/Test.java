package siva.hb.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import siva.hb.entity.Employee;
import siva.hb.entity.Pancard;
import siva.hb.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		Transaction tx = null;
		Session ses = HibernateUtil.geSessionFactory().openSession();

		try {
			tx = ses.beginTransaction();

			Pancard pancard1 = new Pancard(111, "CEXPM25897", "09/02/1993");
			Pancard pancard2 = new Pancard(112, "ABCDE12345", "09/03/1993");
			Pancard pancard3 = new Pancard(113, "ZYXRP98765", "19/02/1991");

			Employee employee1 = new Employee();
			employee1.setEmployeeId(1);
			employee1.setEmployeeName("siva");
			employee1.setEmployeeDesignation("Jr Developer");
			employee1.setEmployeeSalary(3.8);
			employee1.setEmployeeAddress("AP");
			employee1.setPancardObj(pancard1);

			Employee employee2 = new Employee();
			employee2.setEmployeeId(2);
			employee2.setEmployeeName("kumar");
			employee2.setEmployeeDesignation("Sr Developer");
			employee2.setEmployeeSalary(8.5);
			employee2.setEmployeeAddress("TS");
			employee2.setPancardObj(pancard2);

			Employee employee3 = new Employee();
			employee3.setEmployeeId(3);
			employee3.setEmployeeName("Praveen");
			employee3.setEmployeeDesignation("Digital Assistant");
			employee3.setEmployeeSalary(2.5);
			employee3.setEmployeeAddress("AP");
			employee3.setPancardObj(pancard3);

			ses.save(employee1);
			ses.save(employee2);
			ses.save(employee3);
			ses.save(pancard1);
			ses.save(pancard2);
			ses.save(pancard3);

			tx.commit();

		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		System.out.println("Record Inserted");
	}
}
