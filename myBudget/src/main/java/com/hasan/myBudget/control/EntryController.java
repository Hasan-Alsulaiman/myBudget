package com.hasan.myBudget.control;

import com.hasan.myBudget.model.Entry;
import com.hasan.myBudget.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/entry")
public class EntryController {
    @Autowired
    EntryService entryService;

    public EntryController(EntryService entryService) {
        this.entryService = entryService;
    }

    @GetMapping(path = "getAll")
    public List<Entry> getAll() {
        return entryService.getAll();
    }

    @PostMapping(path = "addEntry")
    public int addEntry(@RequestBody Entry entry) {
        return entryService.addEntry(entry);
    }

    @GetMapping(path = "average")
    public double getAvg() {
        return entryService.getAvg();
    }

    @PostMapping(path = "updateAmount")
    public int updateAmount(@RequestBody Entry entry) {
        return entryService.updateAmount(entry);
    }

    @PostMapping(path = "updateDescription")
    public int updateDescription(@RequestBody Entry entry) {
        return entryService.updateDescription(entry);
    }

    @DeleteMapping(path = "deleteEntry{id}")
    public int deleteEntry(@PathVariable int id) {
        return entryService.deleteEntry(id);
    }
}
