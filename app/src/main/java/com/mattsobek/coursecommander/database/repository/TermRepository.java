package com.mattsobek.coursecommander.database.repository;

import androidx.lifecycle.LiveData;

import com.mattsobek.coursecommander.database.dao.TermDao;
import com.mattsobek.coursecommander.database.entity.TermEntity;

import java.util.List;

public class TermRepository {
    private final TermDao termDao;
    private final LiveData<List<TermEntity>> allTerms;
}
