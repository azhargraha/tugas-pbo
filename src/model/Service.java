package model;

public class Service implements ServiceStatus {
    private String type, problem, serviceStatus;
    private int serviceId, harga;
    private Client client;
    private Technician technician;
    private float rating;

    public Service(String type, String problem, String serviceStatus, int serviceId, int harga, Client client, Technician technician, float rating) {
        this.type = type;
        this.problem = problem;
        this.serviceStatus = serviceStatus;
        this.serviceId = serviceId;
        this.harga = harga;
        this.client = client;
        this.technician = technician;
        this.rating = rating;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Technician getTechnician() {
        return technician;
    }

    public void setTechnician(Technician technician) {
        this.technician = technician;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
    
    
    
    public void summary() {
        
    }
    
    @Override
    public String serviceStatus(String s) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
