package com.hasan.myBudget.service;

import com.hasan.myBudget.dao.Entry.EntryDao;
import com.hasan.myBudget.model.Entry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntryService {
    @Autowired
    EntryDao entryDao;

    public EntryService(@Qualifier("EntryDao") EntryDao entryDao) {
        this.entryDao = entryDao;
    }

    public List<Entry> getAll() {
        return entryDao.getAll();
    }

    public int addEntry(Entry entry) {
        return entryDao.addEntry(entry);
    }

    public double getAvg() {
        return entryDao.getavg();
    }

    public int updateAmount(Entry entry) {
        return entryDao.updateAmount(entry);
    }
}
