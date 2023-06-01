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
           2.  [Based on Spring data](#imma-spring-data)
           3.  [Based on Rest](#imma-rest)
           4.  [Based on GraphQl](#imma-graphql)
           5.  [Based on SOAP](#imma-soap)
           6.  [Based on GRPC](#imma-grpc)
      - [Infraction Service](#infraction-service)
        1.  [Dependencies](#dependencies-infraction)
        2.  [Based on Spring data]()
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
-   Spring for GraphQL
<a name="imma-spring-data"></a>
#####   2. Immatriculation Service Based on Spring data
-   Owners:
![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/b5ceb795-921d-49f0-bb56-f19ea48e4eae)
-   Vehicles:
![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/4114b26a-b7b8-4d94-9ee9-8fb568e8a476)

<a name="imma-rest"></a>
#####   3. Immatriculation Service Based on RESt

<a name="imma-graphql"></a>
#####   4. Immatriculation Service Based on GraphQL

<a name="imma-soap"></a>
#####   5. Immatriculation Service Based on SOAP

<a name="imma-grpc"></a>
#####   6. Immatriculation Service Based on GRPC
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
-   
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
