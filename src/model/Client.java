package model;

public class Client extends Account {
    private String problem;
    private Service[] services;

    public Client(String id, String username, String password, String namaLengkap, String email, String alamat, String noTelp, String problem, Service[] services) {
        super(id, username, password, namaLengkap, email, alamat, noTelp);
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
}
