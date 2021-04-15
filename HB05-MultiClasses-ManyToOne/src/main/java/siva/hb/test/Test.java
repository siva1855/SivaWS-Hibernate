package siva.hb.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import siva.hb.entity.Contracts;
import siva.hb.entity.Quote;
import siva.hb.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		Transaction tx = null;
		Session ses = HibernateUtil.geSessionFactory().openSession();

		try {
			tx = ses.beginTransaction();

			Quote quote = new Quote();
			quote.setQuoteId(25);
			quote.setQuoteMinAmount(25000.50);
			quote.setQuoteTenderCode("EP Migration");

			Contracts contract1 = new Contracts();
			contract1.setContractId(101);
			contract1.setContractVendor("YASH Technologies");
			contract1.setContractRegCode("YASHHYD123");
			contract1.setQuote(quote);

			Contracts contract2 = new Contracts();
			contract2.setContractId(102);
			contract2.setContractVendor("Valuedge Solutions");
			contract2.setContractRegCode("VEHYD123");
			contract2.setQuote(quote);
			ses.save(quote);
			ses.save(contract1);
			ses.save(contract2);
			tx.commit();

		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		System.out.println("Record Inserted");
	}
}
