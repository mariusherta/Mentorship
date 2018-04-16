/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orange.otheatre.otheatre.controller;

import com.orange.otheatre.otheatre.entities.Event;
import com.orange.otheatre.otheatre.service.EventService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    @Autowired
    EventService eventService;

    @RequestMapping(method = RequestMethod.POST, path = {"/addevent"})
    public boolean addEvent(@RequestBody Event event) {
        
       return eventService.addEvent(event);
    }
    
    @RequestMapping(method = RequestMethod.GET, path = "/getevents")
    public List<Event> getEvents(){
        return eventService.getAllEvents();
    }
}

