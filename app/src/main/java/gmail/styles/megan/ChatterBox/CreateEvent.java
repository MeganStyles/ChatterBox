package gmail.styles.megan.ChatterBox;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;

/**
 * Created by stylesm on 20/09/2016.
 */
public class CreateEvent extends AppCompatActivity {

    //created a LinearLayout called newAddPersonButton
    private LinearLayout newLayoutAddPerson;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.new_event);

        //made newLayoutAddPerson equal to the add_person layout (with imagebutton and edittext)
        newLayoutAddPerson = (LinearLayout) findViewById(R.id.new_add_person);


        //create and object for the imagebutton
        ImageButton newPerson = (ImageButton) findViewById(R.id.new_person);


        //Set a clicklistener on that imagebutton.
        newPerson.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when newEvent view is clicked on.
            public void onClick(View view) {

                LayoutInflater inflater = LayoutInflater.from(getApplicationContext());
                View recordMeeting = inflater.inflate(R.layout.add_new_button, null);
                newLayoutAddPerson.addView(recordMeeting);

            }
        });

        //Make java object for submit button
        Button submitEvent = (Button) findViewById(R.id.submit_event);

        //set a clicklistenter for the submit button
        submitEvent.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                //create a java object from the EditText event_name.
                EditText addEventName = (EditText) findViewById(R.id.event_name);
                String eventNameText = addEventName.getText().toString();
                //trying to save the event name somewhere... confused
                SharedPreferences eventNamesDates = context.getSharedPreferences(
                        getString(eventNameText), Context.MODE_PRIVATE);

                //Log.v("ActiveEvent", "get names?" + eventNameText);

                //when clicked the button takes you to the event page
                Intent activeEvent = new Intent(CreateEvent.this, ActiveEvent.class);
                startActivity(activeEvent);

        }
    });

}
}
