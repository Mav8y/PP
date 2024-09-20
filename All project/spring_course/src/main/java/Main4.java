import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main4 {
    public static void main(String[] args) {
        /*Employee file1 = new Employee();
        String all = file1.toString();
        String d = file1.getDate();
        int id = file1.getId();
        String n = file1.getName();
        String sur = file1.getDescription();
        int i = 2;
        while(id <= i)
        {
            System.out.println(id + ":" + sur + ":" + n + ":" + d);
            id++;
        }
        System.out.println(all);*/
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try{
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            Employee emp = session.get(Employee.class, 9);
            session.delete(emp);
            session.getTransaction().commit();
            System.out.println("Done!");
        }
        finally {
            factory.close();
        }
    }
}