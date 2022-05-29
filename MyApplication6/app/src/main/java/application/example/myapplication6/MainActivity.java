package application.example.myapplication6;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("MainActivity", "Hello World");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}