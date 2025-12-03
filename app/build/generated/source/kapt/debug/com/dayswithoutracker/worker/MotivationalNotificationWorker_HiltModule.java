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
    topLevelClass = MotivationalNotificationWorker.class
)
public interface MotivationalNotificationWorker_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.dayswithoutracker.worker.MotivationalNotificationWorker")
  WorkerAssistedFactory<? extends ListenableWorker> bind(
      MotivationalNotificationWorker_AssistedFactory factory);
}
