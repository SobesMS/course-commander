package com.mattsobek.coursecommander.database;

import android.content.Context;

import androidx.room.RoomDatabase;

import com.mattsobek.coursecommander.database.dao.AssignmentDao;
import com.mattsobek.coursecommander.database.dao.CourseDao;
import com.mattsobek.coursecommander.database.dao.InstructorDao;
import com.mattsobek.coursecommander.database.dao.TermDao;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class Database extends RoomDatabase {
    public static volatile Database instance;
    public abstract TermDao termDao();
    public abstract CourseDao courseDao();
    public abstract AssignmentDao assignmentDao();
    public abstract InstructorDao instructorDao();

    public static final int NUMBER_OF_THREADS = 4;
    static final ExecutorService databaseWriteExecutor = Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    public static synchronized Database getInstance(Context context) {
        if (instance == null) {

        }
        return instance;
    }
}
