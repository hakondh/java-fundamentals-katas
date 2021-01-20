import CompeteStrategies.CompeteInRun;
import CompeteStrategies.CompeteInTri;
import CompeteStrategies.DontCompete;

public class SportingEventProgram {
    public void run() {
        Attendee attendee1 = new Attendee("Nick", new CompeteInRun(), "Athlete");
        Attendee attendee2 = new Attendee("Dewald", new CompeteInTri(), "Athlete");
        Attendee attendee3 = new Attendee("Spectator Dude", new DontCompete(), "Spectator");

        Event event1 = new Event("The Iron Man", new Attendee[]{attendee1, attendee2,attendee3});
        System.out.println();
        event1.renderAllAttendees();
        System.out.println("\nStart event and print result list: ");
        event1.startEvent();
    }
}

