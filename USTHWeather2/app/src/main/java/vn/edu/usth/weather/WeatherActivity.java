package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class WeatherActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        ForecastFragment emptyFragment = new ForecastFragment();

        // Add the fragment to the container
        getSupportFragmentManager().beginTransaction()
                .add(R.id.container, emptyFragment)
                .commit();
        Log.i(TAG, "onCreate() method called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart() method called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume() method called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause() method called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop() method called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy() method called");
    }
}