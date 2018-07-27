package com.qoobico.remindme.server.repository;

import com.qoobico.remindme.server.entity.Remind;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RemindRepository extends JpaRepository<Remind, Long> {

    List<Remind> getAllByTypeRemind(String type);
}