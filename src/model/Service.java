package model;

public class Service implements ServiceStatus {
    private String type, problem, serviceStatus;
    private int serviceId, harga;
    private String client;
    private String technician;

    public Service(String type, String problem, String serviceStatus, int serviceId, int harga, String client, String technician) {
        this.type = type;
        this.problem = problem;
        this.serviceStatus = serviceStatus;
        this.serviceId = serviceId;
        this.harga = harga;
        this.client = client;
        this.technician = technician;
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

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getTechnician() {
        return technician;
    }

    public void setTechnician(String technician) {
        this.technician = technician;
    }
    
    @Override
    public String serviceStatus(String s) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
