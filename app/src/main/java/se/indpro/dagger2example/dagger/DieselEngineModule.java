package se.indpro.dagger2example.dagger;

import dagger.Binds;
import dagger.Module;
import se.indpro.dagger2example.car.DieselEngine;
import se.indpro.dagger2example.car.Engine;

@Module
public abstract class DieselEngineModule {
    @Binds
    abstract Engine provideEngine(DieselEngine engine);
}
