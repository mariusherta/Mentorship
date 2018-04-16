package com.orange.otheatre.otheatre.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Event implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    private Date date;
    
    @OneToMany(mappedBy = "event")
    private List<Review> eventReviews;
    
    @OneToMany(mappedBy = "event")
    private List<Comment> eventComments;
    
    @ManyToMany
    private List<TheatreParticipant> participants;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.title);
        hash = 59 * hash + Objects.hashCode(this.date);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Event other = (Event) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        return true;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Review> getEventReviews() {
        return eventReviews;
    }

    public void setEventReviews(List<Review> eventReviews) {
        this.eventReviews = eventReviews;
    }

    public List<Comment> getEventComments() {
        return eventComments;
    }

    public void setEventComments(List<Comment> eventComments) {
        this.eventComments = eventComments;
    }

    
}