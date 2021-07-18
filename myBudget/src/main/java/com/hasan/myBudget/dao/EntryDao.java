package com.hasan.myBudget.dao;

import com.hasan.myBudget.model.Entry;

import java.util.List;

public interface EntryDao {
    List<Entry> getAll();
}
