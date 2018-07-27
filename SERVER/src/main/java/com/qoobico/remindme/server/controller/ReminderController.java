package com.qoobico.remindme.server.controller;

import com.qoobico.remindme.server.entity.Remind;
import com.qoobico.remindme.server.service.ReminderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@RequestMapping("/reminder")
public class ReminderController {

    @Autowired
    private ReminderService service;

    @RequestMapping(value = "/get", method = GET)
    @ResponseBody
    public List<Remind> getAllReminders() {
        return service.getAll();
    }

    @RequestMapping(value = "/get-by-id", params = "id", method = GET)
    @ResponseBody
    public Remind getReminder(@RequestParam(value = "id") long remindID) {
        return service.getByID(remindID);
    }

    @RequestMapping(value = "/get-by-type", params = "type", method = GET)
    @ResponseBody
    public List<Remind> getListByType(@RequestParam(value = "type") String typeRemind) {
        return service.getListByType(typeRemind);
    }

    @RequestMapping(value = "/add", method = POST)
    @ResponseBody
    public Remind saveReminder(@RequestBody Remind remind) {
        return service.save(remind);
    }

    @RequestMapping(value = "/delete/{id}", method = DELETE)
    @ResponseBody
    public void delete(@PathVariable long id) {
        service.delete(id);
    }
}