package com.example.taskcare;

import java.util.Date;

public class Task {
    private String tugas;
    private String description;
    private String matkul;
    private String dueDate;
    private String dueTime;

    public Task(String matkul, String tugas, String description, String dueDate, String dueTime) {
        this.matkul = matkul;
        this.tugas = tugas;
        this.description = description;
        this.dueDate = dueDate;
        this.dueTime = dueTime;
    }

    public String getTugas() {
        return tugas;
    }

    public String getMatkul() {
        return matkul;
    }

    public String getDueDate() {
        return dueDate;
    }

    public String getDueTime() {
        return dueTime;
    }
}
