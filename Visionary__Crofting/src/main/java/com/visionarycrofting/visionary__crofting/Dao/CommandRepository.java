package com.visionarycrofting.visionary__crofting.Dao;

import com.visionarycrofting.visionary__crofting.Entities.Command;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommandRepository extends JpaRepository<Command,Integer> {
    //@Query("SELECT c FROM Command c WHERE CONCAT(c.reference,' ',c.commandxTotalPrice,' ',c.commandDate) LIKE %?1%")
    @Query("SELECT c FROM Command c WHERE c.reference like '%:reference%' ")
    public List<Command> search(String keyword);
}

