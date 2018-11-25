package model;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class HibernateActions {

    public static List<Employee> searchAll(Session session) {
        String hql = "from Employee";
        Query query = session.createQuery(hql);
        List<Employee> employees = null;

        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            employees = query.list();
            tx.commit();
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(ex);
        } finally {
            HibernateUtil.close();
        }
        return employees;
    }

    public static void addEmployee(Session session, Employee e) {
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.persist(e);
            tx.commit();
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(ex);
        } finally {
            HibernateUtil.close();
        }
    }

    public static void deleteEmployee(Session session, int id) {
        String hql = "delete from Employee as employee where employee_id = :id";
        Query query = session.createQuery(hql);
        query.setParameter("id", id);
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            query.executeUpdate();
            tx.commit();
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(ex);
        } finally {
            HibernateUtil.close();
        }
    }

    public static void updateEmployee(Session session, int id) {
        Employee e = (Employee) session.get(Employee.class, id);
        String hql = "update Employee as employee set employee_id = :id, employee.name = :name, employee.age = :age, employee.address = :address, employee.salary = :salary where employee_id = :id";
        Query query = session.createQuery(hql);
        query.setParameter("id", id);
        query.setParameter("name", e.getName());
        query.setParameter("age", e.getAge());
        query.setParameter("address", e.getAddress());
        query.setParameter("salary", e.getSalary());

        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            query.executeUpdate();
            tx.commit();
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(ex);
        } finally {
            HibernateUtil.close();
        }
    }

    public static Employee searchById(Session session, int id) {
        String hql = "from Employee as employee where employee_id = :id";
        Query query = session.createQuery(hql);
        query.setParameter("id", id);
        List<Employee> employees = null;
        Employee employee = null;

        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            employees = query.list();
            tx.commit();
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(ex);
        } finally {
            HibernateUtil.close();
        }
        if (employees != null && !employees.isEmpty()) {
            employee = employees.get(0);
        }
        return employee;
    }

    public static List<Employee> searchByName(Session session, String name) {
        String hql = "from Employee as employee where name like :name ";
        Query query = session.createQuery(hql);
        query.setParameter("name", "%" + name + "%");
        List<Employee> employees = null;

        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            employees = query.list();
            tx.commit();
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(ex);
        } finally {
            HibernateUtil.close();
        }
        return employees;
    }

    public static List<Employee> searchByAge(Session session, int age) {
        String hql = "from Employee as employee where age = :age";
        Query query = session.createQuery(hql);
        query.setParameter("age", age);
        List<Employee> employees = null;

        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            employees = query.list();
            tx.commit();
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(ex);
        } finally {
            HibernateUtil.close();
        }
        return employees;
    }

    public static List<Employee> searchByAddress(Session session, String address) {
        String hql = "from Employee as employee where address like :address ";
        Query query = session.createQuery(hql);
        query.setParameter("address", "%" + address + "%");
        List<Employee> employees = null;

        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            employees = query.list();
            tx.commit();
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(ex);
        } finally {
            HibernateUtil.close();
        }
        return employees;
    }

    public static List<Employee> searchBySalary(Session session, double salary) {
        String hql = "from Employee as employee where salary = :salary";
        Query query = session.createQuery(hql);
        query.setParameter("salary", salary);
        List<Employee> employees = null;

        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            employees = query.list();
            tx.commit();
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(ex);
        } finally {
            HibernateUtil.close();
        }
        return employees;
    }
}
