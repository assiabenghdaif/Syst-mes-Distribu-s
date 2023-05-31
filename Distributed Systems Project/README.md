# project
# Table of content

1.  [Introduction](#introduction)
2.  [Technologies used](#technologies-used)
3.  [Technical Architecture](#technical-architecture)
4.  [Class Diagram](#class-diagram)
5.  [BackEnd](#backend)
    - [Micro Services](#micro-services)
      - [Immatriculation Service](#immatriculation-service)
           1.  [Dependencies](#dependencies-immatriculation)
           2.  
      - [Infraction Service](#infraction-service)
        1.  [Dependencies](#dependencies-infraction)
        2.  
      - [Radar Service](#radar-service)
        1.  [Dependencies](#dependencies-radar)
        2.  
      - [Gateway Service](#gateway-service)
        1.  [Dependencies](#dependencies-gateway)
      - [Eureka Discovery](#eureka-discovery)
        1.  [Dependencies](#dependencies-eureka)

6.  [FrontEnd](#frontend)
7.  

 
 
## 1.   Introduction

    This is a web application built using Spring Boot and Angular.
    We want to create a distributed system based on microservices. 
    This application should allow for managing and automating the process of handling vehicle 
    offenses resulting from speed violations detected by automatic radars.
    
    
## 2.   Technologies used

 - Spring Boot
 - Spring Cloud (Gateway)
 - Eureka Descovery
 - Angular
 - Bootstrap
 - MySql DB
    
## 3.   Technical Architecture

    Introduction
    Technologies used
    Technical Architecture
    Class Diagram
    
## 4.   Class Diagram

    Introduction
    Technologies used
    Technical Architecture
    Class Diagram
##  5.  BackEnd
### Micro Services
####    Immatriculation Service
<a name="dependencies-immatriculation"></a>
#####   1.  Dependencies
-   Spring Web
-   Spring Data JPA
-   MySQL Driver
-   Rest Repositories
-   Lombok
-   Spring Boot DevTools 
-   Eureka Discovery Client
-   Spring Boot Actuator
####    Infraction Service
#####   1.  Dependencies
<a name="dependencies-infraction"></a>
-   Spring Web
-   Spring Data JPA
-   MySQL Driver
-   Rest Repositories
-   Lombok
-   Spring Boot DevTools 
-   Eureka Discovery Client
-   Spring Boot Actuator
####    Radar Service
<a name="dependencies-radar"></a>
#####   1.  Dependencies
-   Spring Web
-   Spring Data JPA
-   MySQL Driver
-   Rest Repositories
-   Lombok
-   Spring Boot DevTools 
-   Eureka Discovery Client
-   Spring Boot Actuator
####    Gateway Service
<a name="dependencies-gateway"></a>
#####   1.  Dependencies
-   Gateway
-   Spring Boot Actuator
-   Eureka Discovery Client
####    Eureka Discovery
<a name="dependencies-eureka"></a>
#####   1.  Dependencies
-   Eureka Server
