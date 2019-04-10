package beans;

public class FactoryBean {
    public Employee createEmployeeInstance(){
        System.out.println("FactoryBean::createEmployeeInstance() method called...");
        return new Employee();
    }
}
