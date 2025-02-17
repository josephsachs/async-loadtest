package com.minare.example;

import com.minare.controller.AbstractEntityController;
import com.minare.core.models.annotations.Entity;
import com.minare.core.models.annotations.Field;
import com.minare.persistence.EntityStore;
import io.vertx.core.json.JsonObject;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ExampleEntityController extends AbstractEntityController {
    // Define the structure of entities this controller manages
    //@Entity(name = "example")
    public static class ExampleEntity {
        //@Field(name = "count")
        private int value = 0;
    }

    @Inject
    public ExampleEntityController(EntityStore entityStore) {
        super(entityStore);
    }

    @Override
    protected boolean hasAccess(String connectionId, String entityId) {
        return true;  // Example implementation grants access to all
    }

    @Override
    protected boolean validateUpdate(JsonObject currentState, JsonObject proposedUpdate) {
        return true;  // Example implementation accepts all updates
    }
}