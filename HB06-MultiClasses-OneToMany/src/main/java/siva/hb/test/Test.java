package siva.hb.test;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import siva.hb.entity.Modules;
import siva.hb.entity.Project;
import siva.hb.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		Transaction tx = null;
		Session ses = HibernateUtil.geSessionFactory().openSession();

		try {
			tx = ses.beginTransaction();

			Modules module1 = new Modules();
			module1.setModuleId(103);
			module1.setModuleName("Courses");
			module1.setModuleCode("COU12");

			Modules module2 = new Modules();
			module2.setModuleId(101);
			module2.setModuleName("Student");
			module2.setModuleCode("STD12");

			Modules module3 = new Modules();
			module3.setModuleId(102);
			module3.setModuleName("Faculty");
			module3.setModuleCode("FAC12");
			/*
			 * List<Modules> moduleObjects = new ArrayList<Modules>();
			 * moduleObjects.add(module1); moduleObjects.add(module2);
			 * moduleObjects.add(module3);
			 */
			List<Modules> moduleObjects = Arrays.asList(module1, module2, module3);

			Project project = new Project();
			project.setProjectId(121);
			project.setProjectName("Naresh IT");
			project.setProjectVendor("NIT");
			project.setModules(moduleObjects);

			ses.save(module1);
			ses.save(module2);
			ses.save(module3);
			ses.save(project);
			tx.commit();

		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		System.out.println("Record Inserted");
	}
}
