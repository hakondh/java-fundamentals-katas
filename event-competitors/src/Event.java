import java.util.ArrayList;

public class Event {
    private String name;
    private Attendee[] attendees;
    ArrayList<String> resultList = new ArrayList<>();

    public Event(String name, Attendee[] attendees) {
        this.name = name;
        this.attendees = attendees;
    }

    public void startEvent() {
        for(Attendee attendee : attendees) {
            attendee.startCompeting(resultList);
        }
        for(String result : resultList) System.out.println(result);
    }

    public void renderAllAttendees() {
        for(Attendee attendee : attendees) {
            attendee.render();
        }
    }
}
