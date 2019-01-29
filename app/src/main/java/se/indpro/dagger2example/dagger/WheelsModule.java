package se.indpro.dagger2example.dagger;

import dagger.Module;
import dagger.Provides;
import se.indpro.dagger2example.car.Rims;
import se.indpro.dagger2example.car.Tires;
import se.indpro.dagger2example.car.Wheels;

@Module
public class WheelsModule {

    @Provides
    Rims provideRims(){
        return new Rims();
    }

    @Provides
    Tires provideTires(){
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    Wheels provideWheels(Rims rims, Tires tires){
        return new Wheels(rims,tires);
    }
}
