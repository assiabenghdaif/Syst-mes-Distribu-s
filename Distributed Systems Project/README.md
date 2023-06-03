#   Under development... 🚀
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
        2.  [Based on Rest](#infraction-rest)
      - [Radar Service](#radar-service)
        1.  [Dependencies](#dependencies-radar)
        2.  
      - [Gateway Service](#gateway-service)
        1.  [Dependencies](#dependencies-gateway)
      - [Eureka Discovery](#eureka-discovery)
        1.  [Dependencies](#dependencies-eureka)

6.  [FrontEnd](#frontend)
7.  

 
<a name="introduction"></a> 
## 1.   Introduction

    This is a web application built using Spring Boot and Angular.
    We want to create a distributed system based on microservices. 
    This application should allow for managing and automating the process of handling vehicle 
    offenses resulting from speed violations detected by automatic radars.
    
<a name="technologies-used"></a>     
## 2.   Technologies used

 - Spring Boot
 - Spring Cloud (Gateway)
 - Eureka Descovery
 - Angular
 - Bootstrap
 - H2 DB 

<a name="technical-architecture"></a> 
## 3.   Technical Architecture

    Introduction
    Technologies used
    Technical Architecture
    Class Diagram

<a name="class-diagram"></a> 
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
-   H2 DB
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
#####   3. Immatriculation Service Based on RESt [*]
-   Owners:
    -   get All Owners
    
    ![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/310fa49a-3aaf-4a65-8db5-5fd2392bc393)

    -   get One Owner
    
    ![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/596cdf80-fedf-40d0-9382-8d07d18ea12e)

    -   Add Owner
   
   ![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/44159ecd-2817-4ab4-977f-a55425f1d39e)

-    -   Edit Owner
    
     ![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/cefcc936-2a05-4863-9e91-d4d237226d89)

-    -   Delete Owner : if you have to delete the owner all his vehicles are deleted too (cascade = CascadeType.ALL) 
    
   ![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/c10ecead-ad6f-48ed-96bd-3434b4758d32)

 
      
-   Vehicles:
    -   get All Vehicles
    
    ![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/030e80e4-01fd-4a26-a8dc-4948fc2bf1a7)

    -   get One Vehicle
    
    ![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/65e7783f-09af-474d-bf72-277b8967211d)
    -   Add Vehicle and Add it in the same time to the owner add before
    ![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/75d321ab-8daf-40dc-85dd-1e565be33399)
    
    ![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/47f324f1-5b79-44ae-9bcf-9cfbff7c37e1)


    -   Edit Vehicle
    
    ![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/e208bdb3-0508-49e8-8629-ed99e74e1596)   
    
    -   Delete Vehicle
    
    ![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/035b1a13-27d4-4e69-bb71-72df81fba390)

      

<a name="imma-graphql"></a>
#####   4. Immatriculation Service Based on GraphQL [**]
-   Owners:
    -   get all Owners:
    ![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/033d9cd1-49de-4940-8311-37ffca4abb63)

    -   Add Owner:
    
    ![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/5f3aa971-4ec9-452a-b965-70657ea04db9)

    -   Update Owner :
    
    ![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/841a0a68-7290-4a51-bd6f-c2409feee339)

    -   delete Owner:
    
    ![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/7278a77f-d0d4-4bb7-8a2b-46b33955bf50)

-   Vehicles:
    -   Add Vehicle and affect it to the owner created before:
    
    ![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/4226be58-7fc4-41bd-a2f4-3b1c74a62b75)

    -   Update Vehicle:
    
    ![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/d6c29838-e2fa-4795-acdb-8f1f354a5e3c)

    -   delete vehicle:
    
    ![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/5a30b227-a707-4e3e-9c9d-03cada2eacaf)


<a name="imma-soap"></a>
#####   5. Immatriculation Service Based on SOAP [***]
-   WSDL : http://localhost:1234/immatriculation-service/soap?wsdl

![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/dd5dbc54-c5f6-44ef-9214-f15fe37daa07)

-   Add Owner :

![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/7a475f90-a964-4617-acaa-4053e973049a)

-   Add Vehicle:

![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/c9057b85-6963-4f05-ba27-e02ec737dd6e)

<a name="imma-grpc"></a>
#####   6. Immatriculation Service Based on GRPC [*]
-   Owners:
    -   get all Owners:
    ![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/519892d4-c6eb-4e40-8e5e-7c4c2908177a)
    -   get Owner by ID
    ![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/32f34ca7-514b-446c-8450-a34770a5ca06)

    -   add Owner
    ![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/6ad495a8-6ca5-42c9-b283-3e4cda4eec0e)

    -   Update Owner
    ![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/88d7e8d4-bd32-4056-bf44-6330a0a26ecd)

    -   delete Owner 
    ![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/76140478-28cf-4fd5-9ec6-8a1b8e56776a)


-   Vehicles:
    -   get all Vehicles:
    
    ![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/2cd6838b-bdb6-4bde-957c-3b159c5cdd5d)

    -   add vehicle:
    
    ![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/44f3f19d-af24-44e0-97f3-3c49856a9d28)

    -   update vehicle:
   
   ![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/c271bb42-9a15-411e-90e4-de1774e10d8f)

   -   delete VEhicle:
   
   ![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/7d245d7b-3b09-4572-942b-678aab61284e)

####    Infraction Service
#####   1.  Dependencies
<a name="dependencies-infraction"></a>
-   Spring Web
-   Spring Data JPA
-   H2 DB
-   Rest Repositories
-   Lombok
-   Spring Boot DevTools 
-   Eureka Discovery Client
-   Spring Boot Actuator

<a name="infraction-rest "></a>
#####   2.  Based on Rest [*]
-   All infraction:

![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/9a491bf7-2805-46e3-b050-4535e5387a1b)

-   add infraction:

![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/ea748404-db9a-4c82-8524-631e892cb981)

-   get one infraction by id:

![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/4aae7e17-31af-457a-a12b-9b5815801946)

-   edit infraction:

![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/e1df6c3e-db61-4eb5-8283-78e99b47a580)

-   delete infraction :

![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/198f0212-7461-46d4-a446-8df40b2d2501)


####    Radar Service
<a name="dependencies-radar"></a>
#####   1.  Dependencies
-   Spring Web
-   Spring Data JPA
-   H2 DB
-   Rest Repositories
-   Lombok
-   Spring Boot DevTools 
-   Eureka Discovery Client
-   Spring Boot Actuator
-   openfeign
#####   2.  Based on Rest and Open Feign [*]
-   get all radars:

![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/3ae3a2c9-7d6a-4d97-83f8-2a983375731b)

-   add radar:

![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/a16e17c2-0763-47e5-be2d-6b3ac5308410)

-   get one radar:

![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/efb8d9b6-5358-45e8-ab37-cf054db45b05)

-   edit radar:

![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/179c746f-401b-4c91-abf0-f3659a8a09ac)

-   delete radar :

![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/7fffc81a-1fdb-4190-9827-12e248d4eea4)



#####   2.  Dependencies
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


##### * tested with POSTMAN [https://www.postman.com/downloads/] (REST, GRPC)
##### ** tested with the interface [http://localhost:1111/graphiql?path=/graphql] (GraphQl)
##### *** tested with SoapUI [https://www.soapui.org/downloads/soapui/] (SOAP)
