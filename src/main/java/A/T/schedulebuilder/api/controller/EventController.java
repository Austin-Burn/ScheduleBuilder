package A.T.schedulebuilder.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import A.T.schedulebuilder.api.model.Event;
import A.T.schedulebuilder.api.service.EventService;

@RestController
public class EventController {
    private EventService eventService;


    @Autowired
    public EventController(EventService eventService){
        this.eventService = eventService;
    }

    @GetMapping("/")
    public Event getEvent(@RequestParam Integer id){
        return eventService.getEvent(id);
    }

}