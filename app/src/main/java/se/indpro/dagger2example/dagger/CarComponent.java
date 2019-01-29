package se.indpro.dagger2example.dagger;

import dagger.Component;
import se.indpro.dagger2example.MainActivity;
import se.indpro.dagger2example.car.Car;

@Component(modules = {WheelsModule.class,DieselEngineModule.class})
public interface CarComponent {
    Car getCar();

    void inject(MainActivity mainActivity);
}
