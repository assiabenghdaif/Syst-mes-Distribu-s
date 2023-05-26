# TP3_GRPC
pour les testes sont faites avec Postman

=> Première Partie : BenghdaifAssia_GRPC/

Reprendre les mêmes exemple de la démonstration vidéo pour implémenter les 4 modèles :
- Unary Model

![image](https://user-images.githubusercontent.com/99361390/235738142-a6b493ea-3d04-4d3c-ab3c-a8fe8f81a0f6.png)


- Server Sreaming Model

![image](https://user-images.githubusercontent.com/99361390/235739425-f8c33238-e10a-46d6-8405-6c0a111ab2ad.png)


- Client Streaming Model

![image](https://user-images.githubusercontent.com/99361390/235739505-1573b977-d013-4fae-b7d5-7387317dc771.png)


- BiDirectional Streaming Model

![image](https://user-images.githubusercontent.com/99361390/235739547-b19abfb7-504c-4ccf-b120-6eec0bbae969.png)


Pour le cas d'une conversion de monnaie

=> Deuxième partie : BenghdaifAssia_ChatGRPC/
 1. Créer un serveur Chat GRPC
 
![image](https://user-images.githubusercontent.com/99361390/235740060-e161c782-f8bf-4640-a9c6-10710998ba65.png)


 
 2. Tester le serveur Chat avec un client GRPC comme BloomRPC/ postman
 
 ![image](https://user-images.githubusercontent.com/99361390/235740213-21067881-4d2d-459e-9c59-42b9563e9643.png)



 3. Créer un client GRPC Java

![image](https://user-images.githubusercontent.com/99361390/235740125-e92e7572-8af5-4550-a20b-d120f1e8634a.png)


=> Troisième partie : JeuGRPC_BenghdaifAssia/
 1. Créer un serveur JEU GRPC :
     - Au démarrage le serveur choisit un nombre aléatoire entre 1 et 1000. 
     - Ensuite les clients GRPC doivent deviner en compétition le nombre secret.
     - le serveur répond à chaque fois avec les éventualités suivantes :
        . Votre nombre est plus grand
        . Votre nombre est plus petit
        . BRAVO vous avez gagné et envoyer le gagnant aux clients
        . Jeu terminé, le gagnant est ""Numéro du gagnant"
        
Server :===>

![image](https://user-images.githubusercontent.com/99361390/235741325-9b5a3bdc-21e5-4ae7-ba35-cb3e53fe0055.png)

Client 1:===>
![image](https://user-images.githubusercontent.com/99361390/235740479-b2b9dbc7-c46a-4ac0-a041-73d4f7601a37.png)

Client 2:===>
![image](https://user-images.githubusercontent.com/99361390/235740531-af5aca3d-de36-457e-94b2-80136d6d7b0e.png)

Client 3:===>Winner
![image](https://user-images.githubusercontent.com/99361390/235740639-7d5f79e7-7f67-4a33-aea6-e4d922513402.png)



