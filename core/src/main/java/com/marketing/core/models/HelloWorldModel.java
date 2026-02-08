package com.marketing.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;

import javax.annotation.PostConstruct;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HelloWorldModel {

    private String message;

    @PostConstruct
    protected void init() {
        message = "Hello from Marketing!";
    }

    public String getMessage() {
        return message;
    }
}
