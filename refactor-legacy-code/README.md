# refactor-legacy-code

A different kind of kata, where the point was to practice SOLID principles by finding some problems in the code, and then solve these problems by refactoring the code. The original code can be found in the "scenario1" folder, and the solution can be found in the "soloution" folder. I have commented both the issue and the soulution. 

The main issue I found was the tight coupling between the Alarm and Sensor class. The way it was structured would make it impossible to switch to a different sensor without making changes to the alarm class.

To solve this, I used dependency inversion. By creating a Sensor interface, which the Alarm takes in its constructor, then any type of sensor could be used in Alarm, as long as it implements the Sensor interface. I changed the name of the original Sensor class to "StandardSensor" to avoid name conflicts.

