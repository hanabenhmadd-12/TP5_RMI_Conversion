# TP5 – Activité 5-1 : Service de conversion de devise avec Java RMI

**Étudiante** : Hana Ben Hmad
**Groupe** : LSI 3
**Matière** : Développement d'Applications Réparties
**Enseignante des TPs** : Zeineb DAOUD
**Année universitaire** : 2026 – 2027

## 1. Objectif
Développer une application répartie avec Java RMI permettant à un client de convertir
un montant en euros vers le dinar tunisien en invoquant une méthode sur un objet distant.

## 2. Structure du projet
```
hanabenhmad_LSI3_DevAppReparties/
├── RMIConversion_Server/
│   └── src/
│       ├── rmiService/   (IConversion, ConversionImpl)
│       └── rmiServer/    (ConversionServer)
├── RMIConversion_Client/
│   └── src/
│       └── rmiClient/    (ConversionClient)
├── captures/
├── conversionClient.jar
└── README.md
```

## 3. Travail réalisé

### 3.1 Projet serveur
Création du projet `RMIConversion_Server` avec les packages `rmiService` et `rmiServer`.

![Arborescence du serveur](captures/00_arborescence_serveur.png)

### 3.2 Interface distante `IConversion`
L'interface hérite de `Remote` et déclare la méthode
`double convertirMontant(double mt) throws RemoteException`.

![Interface](captures/01_interface.png)

### 3.3 Implémentation `ConversionImpl`
La classe étend `UnicastRemoteObject`, implémente `IConversion` et convertit un montant en
euros en dinars avec un taux fixe de 3.35 TND pour 1 EUR.

![Implémentation](capt