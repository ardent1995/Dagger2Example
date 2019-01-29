package se.indpro.dagger2example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

import se.indpro.dagger2example.car.Car;
import se.indpro.dagger2example.dagger.CarComponent;
import se.indpro.dagger2example.dagger.DaggerCarComponent;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component = DaggerCarComponent.create();
        component.inject(this);
    }
}
