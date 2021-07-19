package com.hasan.myBudget.dao.Entry;

import com.hasan.myBudget.model.Entry;

import java.util.List;

public interface EntryDao {
    List<Entry> getAll();

    int addEntry(Entry entry);

    int updateAmount(Entry entry);

    int updateDescription(Entry entry);

    double getavg();

}
