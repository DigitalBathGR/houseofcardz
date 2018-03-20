# houseofcardz

This is the complete House of Cards Lite app, created as specified by the coursework instructions on
Software Development for Mobile Devices unit of the MSc in Advanced Software Engineering of City College, International Faculty 
of the University of Sheffield.

It works as such:

- Player pushes the Generate! button to generate a new random number between 1 and 10 (both inclusive).
- Generate button becomes unusable, player must then tap one of the four "House" buttons to add the number to the relevant sum.
- Upon adding the number to the sum of the selected house, all House buttons become unusable and the Generate! button becomes
active again.
- The process is then repeated accordingly.

Checks are made on each sum during every move. As such, 
- if a House reaches sum of 21, it gets cleared (sum returns to 0) and the relevant score (10) is added to the total. 
- if a House reaches sum of 30, it gets eliminated ( an "X" appears on the sum), the House is no longer usable and the 
relevant score (30) is added to the total.
- if a House reaches sum of more than 30, it gets eliminated ( an "X" appears on the sum), the House is no longer usable and the 
relevant score (-20) is added to the total.

If on of the last two conditions is met (house eliminated), an internal counter is updated. If the counter reaches 4 (all houses
eliminated), the game is over, a relevant toast appears with the message and the final score and the board is reset.

The game also holds its state during changes, such as device rotation (this was not, however, implemented with the utilization of 
the View Model + Live Data way, but by adding in the manifest file the line

android:configChanges="keyboardHidden|orientation|screenSize" ).

Feel free to check it out and comment on it, thank you!
