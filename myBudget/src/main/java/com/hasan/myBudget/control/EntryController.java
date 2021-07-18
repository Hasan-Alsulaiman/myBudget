package com.hasan.myBudget.control;

import com.hasan.myBudget.model.Entry;
import com.hasan.myBudget.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("addEntry")
    public int addEntry(@RequestBody Entry entry) {
        return entryService.addEntry(entry);
    }
}
