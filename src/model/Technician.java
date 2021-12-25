package model;

public class Technician {
    private int jobFinished, pemasukan;
    private String mastery;
    private Certificate[] certificate;
    private float rating;
    private Service[] services;

    public Technician(int jobFinished, int pemasukan, String mastery, Certificate[] certificate, float rating, Service[] services) {
        this.jobFinished = jobFinished;
        this.pemasukan = pemasukan;
        this.mastery = mastery;
        this.certificate = certificate;
        this.rating = rating;
        this.services = services;
    }

    public int getJobFinished() {
        return jobFinished;
    }

    public void setJobFinished(int jobFinished) {
        this.jobFinished = jobFinished;
    }

    public int getPemasukan() {
        return pemasukan;
    }

    public void setPemasukan(int pemasukan) {
        this.pemasukan = pemasukan;
    }

    public String getMastery() {
        return mastery;
    }

    public void setMastery(String mastery) {
        this.mastery = mastery;
    }

    public Certificate[] getCertificate() {
        return certificate;
    }

    public void setCertificate(Certificate[] certificate) {
        this.certificate = certificate;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public Service[] getServices() {
        return services;
    }

    public void setServices(Service[] services) {
        this.services = services;
    }
    
    public float avgRating(Service[] services) {
       return (float) 0.1; 
    }
    
    public void lihatProfil() {
        
    }
    
    public void addCertificate(String[] certificate) {
        
    }
        
}
