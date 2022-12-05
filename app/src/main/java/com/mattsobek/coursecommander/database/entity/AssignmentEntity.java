package com.mattsobek.coursecommander.database.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "assignments")
public class AssignmentEntity {

    @PrimaryKey(autoGenerate = true)
    private int assignmentId;

    private int instructorId;

    private int courseId;

    private final String assignmentName;

    private final String assignmentGoalDate;

    private final String assignmentNotes;

    public AssignmentEntity(String assignmentName, String assignmentGoalDate, String assignmentNotes) {
        this.assignmentName = assignmentName;
        this.assignmentGoalDate = assignmentGoalDate;
        this.assignmentNotes = assignmentNotes;
    }

    public int getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(int assignmentId) {
        this.assignmentId = assignmentId;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getAssignmentName() {
        return assignmentName;
    }

    public String getAssignmentGoalDate() {
        return assignmentGoalDate;
    }

    public String getAssignmentNotes() {
        return assignmentNotes;
    }
}
