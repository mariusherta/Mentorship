/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orange.otheatre.otheatre.service;

import com.orange.otheatre.otheatre.entities.Event;
import com.orange.otheatre.otheatre.repositories.EventRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Marius Herta <marius.herta@gmail.com>
 */
@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public EventService() {

    }

    public boolean addEvent(Event event) {
        boolean rez = false;
        if(!seeIfEventExists(event)){
            eventRepository.save(event);
            rez = true;
        }
        
        return rez;
    }

    public List<Event> getAllEvents() {
        List<Event> eventsList = new ArrayList<>();
        Iterable<Event> allEvents = eventRepository.findAll();
        allEvents.forEach(e->eventsList.add(e));
        return eventsList;
    }

    public boolean seeIfEventExists(Event event) {
        return (getAllEvents().contains(event));
    }
}
