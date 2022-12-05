package com.mattsobek.coursecommander.database.repository;

import androidx.lifecycle.LiveData;

import com.mattsobek.coursecommander.database.dao.AssignmentDao;
import com.mattsobek.coursecommander.database.entity.AssignmentEntity;

import java.util.List;

public class AssignmentRepository {
    private final AssignmentDao assignmentDao;
    private final LiveData<List<AssignmentEntity>> allAssignments;
}
