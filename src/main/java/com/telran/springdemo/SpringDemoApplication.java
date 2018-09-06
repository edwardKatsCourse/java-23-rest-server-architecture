package com.telran.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDemoApplication {

    /**
     * Reference implementation
     * - documentation
     * - interfaces
     *
     * Java SE
     *
     * J2EE (Java 2 EE) -> Java Enterprise Edition
     * JBoss, Glassfish, WebSphere, WebLogic
     *
     * - Mail API
     * - JDBC (Java Data Base Connectivity) -> MySQL, MSSQL, DB2 connector
     * - JPA (Java Persistence API) -> Hibernate, EclipseLink
     * - Servlet API -> Tomcat, Jetty (application server, servlet container) -> .war (web archive)
     *  HttpServlet .doGet() .doPost()
     *
     *  1.0
     *  1.1
     *
     *  1.2 -> 2
     *  --------------- 2014 --------------------
     *  2014 -> Spring Boot
     *  - Tomcat -> embedded (встроенный) Tomcat
     *  - .war -> .jar (Make JAR, not WAR)
     *  - convention over configuration
     *  - starters (scanning classpath)
     *  - dependency hell -> NEVER AGAIN (Bill Of Materials: BOM)
     *
     *  A (1.11) B (2.46) SuperProcessor doAll()
     *           B (2.5)  SuperMegaProcessor doEverything()
     *  A (1.3)  B (2.47)
     *  C D E F
     *
     *
     *
     *  MySQL   localhost:3306
     *  MongoDB localhost:27017
     */

    public static void main(String[] args) {
        SpringApplication.run(SpringDemoApplication.class, args);
    }
}
