TheaterBooking


# Overview

A SpringBoot Web Application that will allow users to view what theater Otheater events are available, to attend to them a(nd to review them. Theater directors will be able to create those events. There will be four kinds of users: Guest, TheaterParticipant, TheaterPlayOrganizer, Admin.

Guest - view events, view comments for an event, reviews etc.
TheaterParticipant:
- view events, comments, reviews, your profile
- profile ( bio, email, firstname, lastname, birthday, profile picture, passed events attended)
- attend event - buy ticket - choose available seat or get a random seat
- let comments, review for an event attended ( after the event is finished ) 

TheaterPlayOrganizer:
- view events, comments, review, your profile
- add event ( edit event ) 
- profile( bio, email, firstname, lastname, birthday, profile picture, passed events and future events)
- let comments for theis events

Admin:
- manage user accounts
- manage events
- delete comments

Minimal viable product:
- guest user to view events ( created by TheaterPlayOrganizer) 
- TheaterPlayOrganizer create events ( profile with details and created passed events )

# Database
MySQL - TBD architecture of the database

#Logging
logback.xml logging configuration

#Deployment
Will build for the app a jar file that will be deployed on a server ( VM ? )

#Interface contract
TBD

#Configuration and Profiling
application-dev.yml
application-prod.yml

# Front-end is not so important for now 

#Techonologies used
Java, Spring Boot, JPA, Hibernate, MySQL, Thymeleaf, Versioning - Github

