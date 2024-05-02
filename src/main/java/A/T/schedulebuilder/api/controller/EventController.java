package A.T.schedulebuilder.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import A.T.schedulebuilder.api.model.Event;
import A.T.schedulebuilder.api.service.EventService;

@RestController
public class EventController {
    private EventService eventService;


    @Autowired
    public EventController(EventService eventService){
        this.eventService = eventService;
    }

    @GetMapping("/events")
    @ResponseBody
    public List<Event> getEvent(@RequestParam(required = false) Integer id) {
        if (id != null) {
            ArrayList<Event> list = new ArrayList<>();
            Event e = eventService.getEvent(id);
            if (e != null) {
                list.add(e);
            } else {
                throw new ResponseStatusException(HttpStatus.NOT_FOUND, "entity not found");
            }
            return list;
        } else {
            return eventService.getEvents();
        }
    }

}
