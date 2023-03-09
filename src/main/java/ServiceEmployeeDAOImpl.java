import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.*;
import java.util.List;

public class ServiceEmployeeDAOImpl implements EmployeeDAO {

    @Override
    public void createEmployee(Employee employee) {
        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(employee);
            transaction.commit();
        }
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Employee.class, id);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return HibernateSessionFactoryUtil
                .getSessionFactory().openSession().createQuery("From Employee", Employee.class).list();
    }

    @Override
    public void updateEmployeeByIdInConstructor(Employee employee) {
        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.update(employee);
            transaction.commit();
        }
    }

    @Override
    public void deleteEmployeeByIdInConstructor(Employee employee) {
        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.delete(employee);
            transaction.commit();
        }
    }
}
