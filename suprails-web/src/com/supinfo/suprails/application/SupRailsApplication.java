package com.supinfo.suprails.application;

import com.sun.jersey.api.core.PackagesResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/resources")
public class SupRailsApplication extends PackagesResourceConfig {

    public SupRailsApplication() {
        super("com.supinfo.suprails.resources");
    }
}
