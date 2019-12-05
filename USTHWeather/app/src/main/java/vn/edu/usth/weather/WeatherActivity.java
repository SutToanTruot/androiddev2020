package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import android.util.Log;
import android.content.Context;
import android.media.MediaPlayer;
import java.io.FileInputStream;
import com.google.android.material.tabs.TabLayout;

public class WeatherActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private Adapter adapter;
    private TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i("create", "Create done");
        viewPager = findViewById(R.id.WeatherForecastViewPager);
        adapter = new Adapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        MediaPlayer mediaPlayer;
        mediaPlayer = MediaPlayer.create(WeatherActivity.this, R.raw.modernfuturebass);
        mediaPlayer.start();

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("start", "Start done");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("resume", "Resume done");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Pause", "Pause done");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Stop", "Okayyyy");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Destroy", "Oh nooooo!!!");
    }
}
