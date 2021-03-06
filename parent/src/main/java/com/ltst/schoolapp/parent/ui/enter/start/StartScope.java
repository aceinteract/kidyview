package com.ltst.schoolapp.parent.ui.enter.start;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

import dagger.Module;
import dagger.Provides;
import dagger.Subcomponent;

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface StartScope {

    @StartScope
    @Subcomponent(modules = StartModule.class)
    interface StartComponent {

        void inject(StartFragment fragment);
    }

    @Module
    class StartModule {
        private final StartContract.View view;

        public StartModule(StartContract.View view) {
            this.view = view;
        }

        @Provides
        @StartScope
        StartContract.View provideView() {
            return this.view;
        }
    }
}
