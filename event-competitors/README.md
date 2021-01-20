# event-competitors

The point of this kata was to implement a simple sporting 
event system, where the strategy pattern is in use.

The program can create different types of attendees for 
events. The attendees of the event have different *compete
behaviours*, which is achieved through the strategy pattern. 
The attendees also have different roles: *marshals, 
athletes and spectators*. 

When the attendees compete, the result is added to 
a result list of the event - as long as it isn't a *non-competitor*.
The attendees are also able to render information about
themselves. 