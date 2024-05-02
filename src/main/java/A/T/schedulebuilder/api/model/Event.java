package A.T.schedulebuilder.api.model;
import java.time.LocalDateTime;
public class Event {
    private Integer id;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Location location;
    private String name;
    private String description;

    public Event(Integer id, LocalDateTime startTime, LocalDateTime endTime, Location location, String name,
            String description) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.location = location;
        this.name = name;
        this.description = description;
    }
    
    public Event(Integer id, LocalDateTime startTime, LocalDateTime endTime, String name) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.name = name;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }
    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }
    public LocalDateTime getEndTime() {
        return endTime;
    }
    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
    public Location getLocation() {
        return location;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public void setLocation(Location location) {
        this.location = location;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }   
    
}
