/* Copyright (C) 2015 Oracle and/or its affiliates. All rights reserved. */
package application;

import java.util.Optional;

import org.apache.catalina.startup.Tomcat;

public class Main {
    
    public static final Optional<String> PORT = Optional.ofNullable(System.getenv("PORT"));
    public static final Optional<String> HOSTNAME = Optional.ofNullable(System.getenv("HOSTNAME"));
    
    public static void main(String[] args) throws Exception {
        String contextPath = "/" ;
        String appBase = ".";
        Tomcat tomcat = new Tomcat();   
        int port = Integer.valueOf(PORT.orElse("8080"));
        tomcat.setPort( port );
        String host = HOSTNAME.orElse("localhost");
        tomcat.setHostname( host );
        System.out.println("Tomcat server running on http://" + host +":" + port );
        tomcat.getHost().setAppBase(appBase);
        tomcat.addWebapp(contextPath, appBase);
        tomcat.start();
        tomcat.getServer().await();
    }
}