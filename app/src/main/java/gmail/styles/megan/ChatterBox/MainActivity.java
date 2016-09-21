package gmail.styles.megan.ChatterBox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Set content of the activity to use the activity_main.xml layout file.
        setContentView(R.layout.activity_main);

        //Find the view that starts a new event.
        TextView newEvent = (TextView) findViewById(R.id.new_event);

        //Set a clicklistener on that view.
        newEvent.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when newEvent view is clicked on.
            @Override
            public void onClick(View view){
                Intent newEvent = new Intent(MainActivity.this, CreateEvent.class);
                startActivity(newEvent);
            }
        });

        TextView oldEvent = (TextView) findViewById(R.id.old_event);

        oldEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oldEvent = new Intent(MainActivity.this, OldEvent.class);
                startActivity(oldEvent);
            }
        });
    }
}
