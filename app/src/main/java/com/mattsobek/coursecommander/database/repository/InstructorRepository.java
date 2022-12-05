package com.mattsobek.coursecommander.database.repository;

import androidx.lifecycle.LiveData;

import com.mattsobek.coursecommander.database.dao.InstructorDao;
import com.mattsobek.coursecommander.database.entity.InstructorEntity;

import java.util.List;

public class InstructorRepository {
    private final InstructorDao instructorDao;
    private final LiveData<List<InstructorEntity>> allInstructors;
}
