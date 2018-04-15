package com.orange.otheatre.otheatre.repositories;

import com.orange.otheatre.otheatre.beans.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 *
 * @author Shedzuke
 */
@Repository
public interface EventRepository extends JpaRepository <Event, Integer>, CrudRepository<Event, Integer>{
        
}