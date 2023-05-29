package sg.edu.rp.c346.id22011587.demophoneforelderly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    // Button click event handling for Peter
    public void buttonPeterOnClick(View view) {
        String phoneNumber = "92240336";
        Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNumber));
        startActivity(intentCall);
    }

    // Button click event handling for Mary
    public void buttonMaryOnClick(View view) {
        String phoneNumber = "89675543";
        Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNumber));
        startActivity(intentCall);
    }

}