package in.aboutaakash.DemoHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EmployeeName ename = new EmployeeName();
    	ename.setFname("Harsh");
    	ename.setMname("Aditya");
    	ename.setLname("Vatsa");
    	
        Employee emp = new Employee();
        
        emp.setEmpId(101);
        emp.setEmpName(ename);
        emp.setEmpSalary(75000);
        
        Configuration configuration = new Configuration().configure().addAnnotatedClass(Employee.class);
        
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
        SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        Session session = sessionFactory.openSession();
        
        Transaction transaction = session.beginTransaction();
        
        session.save(emp); 
        
//        emp = (Employee)session.get(Employee.class, 101);
        
        transaction.commit();
        
//        System.out.println(emp);
        
    }
}
