/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orange.otheatre.otheatre.beans;

import java.util.List;

/**
 *
 * @author Shedzuke
 */
public class Theatre {
    
    private List<Event> events;
    private List<TheatreParticipant> participants;

    private static final class SingletonHolder {

        private static final Theatre INSTANCE = new Theatre();
        
    }
    
    public Theatre getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
