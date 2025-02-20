package br.com.nlw.events.repository;

import br.com.nlw.events.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, Integer> {
    public Event findByPrettyName(String prettyName);
}
