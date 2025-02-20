package br.com.nlw.events.service;

import br.com.nlw.events.model.Event;
import br.com.nlw.events.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    @Autowired
    private EventRepository repository;

    public Event addNewEvent(Event event){
        // gerando o pretty name
        event.setPrettyName(event.getTitle().toLowerCase().replaceAll(" ", "-"));
        return repository.save(event);
    }

    public List<Event> getAllEvents(){
        return (List<Event>)repository.findAll();
    }

    public Event getByPrettyName(String prettyName){
        return repository.findByPrettyName(prettyName);
    }
}
