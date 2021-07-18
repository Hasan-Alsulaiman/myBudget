package com.hasan.myBudget.control;

import com.hasan.myBudget.model.Entry;
import com.hasan.myBudget.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("entry")
public class EntryController {
    @Autowired
    EntryService entryService;

    public EntryController(EntryService entryService) {
        this.entryService = entryService;
    }

    @GetMapping("getAll")
    public List<Entry> getAll() {
        return entryService.getAll();
    }
}
