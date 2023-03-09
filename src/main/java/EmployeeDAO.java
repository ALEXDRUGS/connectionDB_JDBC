import java.util.List;

public interface EmployeeDAO {

    void createEmployee(Employee employee);

    Employee getEmployeeById(Integer id);

    List<Employee> getAllEmployees();

    void updateEmployeeByIdInConstructor(Employee employee);

    void deleteEmployeeByIdInConstructor(Employee employee);
}
