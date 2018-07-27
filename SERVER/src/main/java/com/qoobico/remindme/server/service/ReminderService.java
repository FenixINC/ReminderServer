package com.qoobico.remindme.server.service;

import com.qoobico.remindme.server.entity.Remind;

import java.util.List;

public interface ReminderService {

    List<Remind> getAll();

    List<Remind> getListByType(String typeRemind);

    Remind getByID(long id);

    Remind save(Remind remind);

    void delete(long id);
}