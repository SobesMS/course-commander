package com.mattsobek.coursecommander.database.repository;

import androidx.lifecycle.LiveData;

import com.mattsobek.coursecommander.database.dao.CourseDao;
import com.mattsobek.coursecommander.database.entity.CourseEntity;

import java.util.List;

public class CourseRepository {
    private final CourseDao courseDao;
    private final LiveData<List<CourseEntity>> allCourses;
}
