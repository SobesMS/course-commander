package com.mattsobek.coursecommander.database.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "terms")
public class TermEntity {

    @PrimaryKey(autoGenerate = true)
    private int termId;

    private final String termStartDate;

    private final String termEndDate;

    private final String termNotes;

    private final String userId;

    public TermEntity(String termStartDate, String termEndDate, String termNotes, String userId) {
        this.termStartDate = termStartDate;
        this.termEndDate = termEndDate;
        this.termNotes = termNotes;
        this.userId = userId;
    }

    public int getTermId() {
        return termId;
    }

    public void setTermId(int termId) {
        this.termId = termId;
    }

    public String getTermStartDate() {
        return termStartDate;
    }

    public String getTermEndDate() {
        return termEndDate;
    }

    public String getTermNotes() {
        return termNotes;
    }

    public String getUserId() {
        return userId;
    }
}
