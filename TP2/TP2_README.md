# 1- Un Web service SOAP :

C’est un projet java maven composer de 3 classes:

•  model.Compte, contient 3 attributs code, solde DateCreation

• ws.BanqueService, classe de type WebService, contient 3 methodes (WebMethode) ; 
une pour convertir <M[1]>, 
une pour get one Compte <M[2]>,
une pour avoir la liste des comptes <M[3]>.

• serveur.ServeurIWS, pour déployer le service sur l’URL http://localhost:2001/BankWS.

## a) WSDL :
![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/0cb8c1b2-f8aa-46b6-bfc0-6a911130cf5c)
 ## b) SoapUI :
  • M1
  
  ![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/c5897bc5-78b9-4604-86ff-be453c5e50d1)
  • M2
  ![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/0e71d8af-7d74-4e8b-9f1f-f0995b88d7ad)

  • M3
  ![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/47293713-cc56-4d06-b347-ad22b95d573c)
## c) Client SOAP Java :
![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/21a14fc7-2346-421a-92fb-75c7b8551a59)

## d) Client SOAP Dot Net :
![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/c4e9d14e-c4fa-40c0-b291-92296d2e433d)

## e) Client SOAP PHP :
![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/2c18562d-a957-4d7d-adfa-748360e180fe)

# 2- Déployer le Web Service dans un Projet Spring Boot
C’est un projet Spring boot composer de :

  • classe models.Compte,
  
  • controllers.CompteController, classe de type WebService, contient 3 methodes (WebMethode) ; 
  une pour convertir <M[1]>, 
  une pour get one Compte <M[2]>, 
  une pour avoir la liste des comptes <M[3]>, 
  
  • MyConfig
  
## a) WSDL :
![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/a47412d9-c801-4d92-82cf-9307ead475a4)

## b) SoapUI :
  • M1 :
  ![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/bd8f3c82-0b8c-4eb4-b907-6e677e966aa9)

  • M2 :
  ![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/f1e53b95-6094-427e-a8d0-fbd31bfe77c7)

  • M3 :
  ![image](https://github.com/assiabenghdaif/Syst-mes-Distribu-s/assets/99361390/8e7d8f90-1e2c-48b4-85d1-859dd9711995)

