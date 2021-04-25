package com.example.taskcare;

import java.util.Date;

public class Task {
    private String tugas;
    private String deskripsi;
    private String tanggal;
    private String waktu;

    public Task( String tugas, String deskripsi, String tanggal, String waktu) {
        this.tugas = tugas;
        this.deskripsi = deskripsi;
        this.tanggal = tanggal;
        this.waktu = waktu;
    }

    public String getTugas() {
        return tugas;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public String getTanggal() {
        return tanggal;
    }

    public String getWaktu() {
        return waktu;
    }
}
