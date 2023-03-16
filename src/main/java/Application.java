public class Application {
    public static void main(String[] args) {
        Employee employee = new Employee("Keith", "Flint", "male", 55, new City("Moscow"));
        ServiceEmployeeDAOImpl service = new ServiceEmployeeDAOImpl();
        //service.createEmployee(employee);
        //service.getAllEmployees();
        //service.getEmployeeById(1);
        //service.updateEmployee(new Employee(19, "Egor", "Letov", "male", 53, new City("New York")));
        Employee employee1 = new Employee(28, "Monica", "Teron", "female", 45, new City("Moscow"));
        service.deleteEmployee(employee1);
        ServiceCityDAOImpl serviceCity = new ServiceCityDAOImpl();
        City city = new City("Moscow", 8);
        //serviceCity.deleteCity(city);
    }
}
