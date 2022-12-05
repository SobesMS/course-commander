package com.mattsobek.coursecommander.database.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "courses")
public class CourseEntity {

    @PrimaryKey(autoGenerate = true)
    private int courseId;

    private int instructorId;

    private int termId;

    private final String courseName;

    private final String courseStartDate;

    private final String courseEndDate;

    private final String courseNotes;

    public CourseEntity(String courseName, String courseStartDate, String courseEndDate, String courseNotes) {
        this.courseName = courseName;
        this.courseStartDate = courseStartDate;
        this.courseEndDate = courseEndDate;
        this.courseNotes = courseNotes;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    public int getTermId() {
        return termId;
    }

    public void setTermId(int courseTermId) {
        this.termId = courseTermId;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseStartDate() {
        return courseStartDate;
    }

    public String getCourseEndDate() {
        return courseEndDate;
    }

    public String getCourseNotes() {
        return courseNotes;
    }
}
