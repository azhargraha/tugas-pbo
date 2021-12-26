package model;

public class Payment {
    private int paymentId, serviceId, harga;

    public Payment(int paymentId, int serviceId, int harga) {
        this.paymentId = paymentId;
        this.serviceId = serviceId;
        this.harga = harga;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
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
    
}
