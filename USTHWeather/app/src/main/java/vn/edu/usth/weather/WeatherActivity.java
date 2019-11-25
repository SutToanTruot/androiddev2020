package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        ForecastFragment firstFragment = new ForecastFragment();
        WeatherFragment secondFragment = new WeatherFragment();
        Log.i("create", "Create done");
        ForecastFragment firstFragment = new ForecastFragment ();
        getSupportFragmentManager().beginTransaction().add(R.id.container, firstFragment).commit();

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
