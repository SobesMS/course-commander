package com.mattsobek.coursecommander.database.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "instructors")
public class InstructorEntity {

    @PrimaryKey(autoGenerate = true)
    private int instructorId;

    private final String instructorName;

    private final String instructorPhone;

    private final String instructorEmail;

    private final String instructorNotes;

    public InstructorEntity(String instructorName, String instructorPhone, String instructorEmail, String instructorNotes) {
        this.instructorName = instructorName;
        this.instructorPhone = instructorPhone;
        this.instructorEmail = instructorEmail;
        this.instructorNotes = instructorNotes;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public String getInstructorPhone() {
        return instructorPhone;
    }

    public String getInstructorEmail() {
        return instructorEmail;
    }

    public String getInstructorNotes() {
        return instructorNotes;
    }
}
