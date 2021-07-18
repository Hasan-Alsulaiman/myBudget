package com.hasan.myBudget.service;

import com.hasan.myBudget.dao.EntryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class EntryService {
    @Autowired
    EntryDao entryDao;

    public EntryService(@Qualifier("EntryDao") EntryDao entryDao) {
        this.entryDao = entryDao;
    }
}
