public class Application {
    public static void main(String[] args) {
        Employee employee = new Employee("Keith", "Flint", "male", 55, 3);
        ServiceEmployeeDAOImpl service = new ServiceEmployeeDAOImpl();
        //service.createEmployee(employee);
        //service.getAllEmployees();
        //service.getEmployeeById(1);
        //service.updateEmployee(new Employee(19, "Egor", "Letov", "male", 53, 2));
        Employee employee1 = new Employee(27, "Monica", "Teron", "female", 45, 2);
        service.deleteEmployee(employee1);
    }
}
