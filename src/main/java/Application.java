public class Application {
    public static void main(String[] args) {
        City city = new City("Moscow", 6);
        Employee employee = new Employee("Keith", "Flint", "male", 55, new City("Moscow"));
        Employee employee1 = new Employee(28, "Keith", "Flint", "male", 55, city);

        ServiceEmployeeDAOImpl service = new ServiceEmployeeDAOImpl();
        //service.createEmployee(employee);
        //service.getAllEmployees();
        //service.getEmployeeById(1);
        service.updateEmployee(new Employee(19, "Egor", "Letov", "male", 50, new City("New York")));
        //service.deleteEmployee(employee1);

        ServiceCityDAOImpl serviceCity = new ServiceCityDAOImpl();
        //serviceCity.deleteCity(city);
    }
}
