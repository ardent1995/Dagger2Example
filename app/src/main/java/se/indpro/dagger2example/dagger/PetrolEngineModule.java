package se.indpro.dagger2example.dagger;

import dagger.Binds;
import dagger.Module;
import se.indpro.dagger2example.car.Engine;
import se.indpro.dagger2example.car.PetrolEngine;

@Module
public abstract class PetrolEngineModule {
    @Binds
    abstract Engine provideEngine(PetrolEngine engine);
}
