package model;

public class Client {
    private String problem;
    private Service[] services;

    public Client(String problem, Service[] services) {
        this.problem = problem;
        this.services = services;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public Service[] getServices() {
        return services;
    }

    public void setServices(Service[] services) {
        this.services = services;
    }
    
    public void lihatService() {
        
    }
    
    public void lihatProfil() {
        
    }
}
