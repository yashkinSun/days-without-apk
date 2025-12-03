package com.dayswithoutracker.worker;

import androidx.hilt.work.WorkerAssistedFactory;
import androidx.work.ListenableWorker;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;

@Module
@InstallIn(SingletonComponent.class)
@OriginatingElement(
    topLevelClass = WidgetUpdateWorker.class
)
public interface WidgetUpdateWorker_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.dayswithoutracker.worker.WidgetUpdateWorker")
  WorkerAssistedFactory<? extends ListenableWorker> bind(
      WidgetUpdateWorker_AssistedFactory factory);
}
