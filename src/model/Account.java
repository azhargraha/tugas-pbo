package model;

public class Account {
    private String id, username, password, namaLengkap, email, alamat;
    private int noTelp;

    public Account(String id, String username, String password, String namaLengkap, String email, String alamat, int noTelp) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.namaLengkap = namaLengkap;
        this.email = email;
        this.alamat = alamat;
        this.noTelp = noTelp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(int noTelp) {
        this.noTelp = noTelp;
    }
    
    public void login(String username, String password) {
        
    }
    
    public void register(String username, String password) {
        
    }
    
    public void editProfil() {
        
    }
}
