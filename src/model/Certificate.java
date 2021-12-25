/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author rizqiramadhannnn
 */
public class Certificate {
    private String teknisi, tipe, pemberi, status;
    private Date tanggal;

    public Certificate(String teknisi, String tipe, String pemberi, String status, Date tanggal) {
        this.teknisi = teknisi;
        this.tipe = tipe;
        this.pemberi = pemberi;
        this.status = status;
        this.tanggal = tanggal;
    }

    public String getTeknisi() {
        return teknisi;
    }

    public void setTeknisi(String teknisi) {
        this.teknisi = teknisi;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getPemberi() {
        return pemberi;
    }

    public void setPemberi(String pemberi) {
        this.pemberi = pemberi;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }
}
