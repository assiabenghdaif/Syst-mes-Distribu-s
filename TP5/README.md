# 1. Créer le micro service Customer-service 
  - Tester le Micro service
    - http://localhost:2001/customers
  ![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/cd334800-aef2-4e74-99df-4e4210975cc0)
    - http://localhost:2001/actuator
  ![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/ad9f2812-3b73-44d1-a5d2-2b71b1bcc448)

# 2. Créer le micro service Inventory-service 
  - Tester le Micro service
    - http://localhost:2002/products
  ![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/869dcfbb-60f0-4e5a-9171-ed7962311b50)

# 3. Créer la Gateway service en utilisant Spring Cloud Gateway
  ## - Tester la Service proxy en utilisant une configuration Statique basée sur le fichier application.yml
  ![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/155a4e79-9bc5-45a8-acfd-ed4f1062358a)

    1.  Products
   ![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/e300ee04-d643-4ecf-b566-36f98b762084)

    2.  Customers
   ![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/4f77d863-4028-4523-bab6-44e35771033d)
    
  ## - Tester la Service proxy en utilisant une configuration Statique basée une configuration Java
  ![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/f5a06b06-4ed4-4e47-87ea-821ce48fcb80)

  1.  Products:
 ![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/40a2c67d-b776-43f3-a8a6-a9a6e6ceaa77)
  2.  Customers:
![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/b30e4f89-4dd2-4510-b64d-9185e9c888c8)
    

# 4. Créer l’annuaire Registry Service basé sur NetFlix Eureka Server
![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/0ef4fbe1-8020-4af0-8c5b-fcd3aba77bce)

# 5. Tester le proxy en utilisant une configuration dynamique de Gestion des routes vers les micro services enregistrés dans l’annuaire Eureka Server
  - http://localhost:8888/CUSTOMER-SERVICE/customers
  ![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/3a2c583a-3e5a-4e44-b4c0-a3641b19904e)

  - http://localhost:8888/PRODUCT-SERVICE/products
  ![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/b9767037-e694-4146-8097-86aaeb9b31a3)

# 6. Créer Le service Billing-Service en utilisant Open Feign pour communiquer avec les services Customer-service et Inventory-service
![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/988f5de3-9658-4ca6-a9ef-e2d39f73b8b5)

  - http://localhost:8888/BILLING-SERVICE/fullbill/1
  ![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/e45300df-0119-43d7-b7ee-fed6a50a6b5a)

# 7. Créer un client Angular qui permet d’afficher une facture




