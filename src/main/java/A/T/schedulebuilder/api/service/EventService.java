package A.T.schedulebuilder.api.service;
/* private Integer id;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Location location;
    private String name;
    private String description;
 */

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import A.T.schedulebuilder.api.model.Event;


@Service
public class EventService {

    private List<Event> eventList;

    public EventService() {
        Event event = new Event(1, LocalDateTime.of(2019, Month.MARCH, 28, 14, 30), LocalDateTime.of(2019, Month.MARCH, 28, 16, 45), null, "Tori", null);
        Event event2 = new Event(2, LocalDateTime.of(2024, Month.MARCH, 23, 12, 30), LocalDateTime.of(2024, Month.MARCH, 23, 14, 30), "Austin");
        eventList = new ArrayList<Event>();
        eventList.add(event);
        eventList.add(event2);
    }

    public Event getEvent(Integer id) { 
        for(int i=0; i < eventList.size(); i++) {
            if(eventList.get(i).getId().equals(id)) {
                return eventList.get(i);
            }
        }
        return null;
    }

    public List<Event> getEvents() {
        return eventList;
    }


}
