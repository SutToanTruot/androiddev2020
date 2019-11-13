    package vn.edu.usth.weather;

    import androidx.appcompat.app.AppCompatActivity;

    import android.os.Bundle;
    import android.util.Log;

    public class WeatherActivity extends AppCompatActivity{
            private static final String TAG = "WeatherTAG";

            @Override
            protected void onCreate (Bundle saveInstanceState){
                super.onCreate(saveInstanceState)
                setContentView(R.layout.activity_weather);
                Log.i("create", "call create");
                ForecastFragment firstFragment = new ForecastFragment();
                getSupportFragmentManager().beginTransaction().add(
                        R.id.container, firstfragment).commit();
                )
            }
        }
        Log.i(TAG), msg: "onCreate() is called");

        ForecastFragment firstFragment = new ForecastFragment();
        getSupportFragmentManager().beginTransaction().add(
                R.id.container, firstFragment).commit();
        )
    }
