# Manuel Utilisateur pour l'Application de Gestion des Étudiants et des Stages

## Introduction

Bienvenue dans le manuel utilisateur de l'application de gestion des étudiants et des stages. Cette application permet de gérer les informations des étudiants et de leurs stages respectifs. Elle est développée en utilisant Spring Boot, Java, et Maven, avec MySQL comme base de données.

## Fonctionnalités

### 1. Gestion des Étudiants

- **Ajouter un Étudiant** : Permet d'ajouter un nouvel étudiant avec son nom et son email.
- **Lister les Étudiants** : Affiche la liste de tous les étudiants enregistrés.
- **Consulter un Étudiant** : Permet de consulter les détails d'un étudiant spécifique.
- **Supprimer un Étudiant** : Permet de supprimer un étudiant de la base de données.

### 2. Gestion des Stages

- **Ajouter un Stage** : Permet d'ajouter un nouveau stage avec un titre, une description, et l'étudiant associé.
- **Lister les Stages** : Affiche la liste de tous les stages enregistrés.
- **Consulter un Stage** : Permet de consulter les détails d'un stage spécifique.
- **Supprimer un Stage** : Permet de supprimer un stage de la base de données.

## Installation et Configuration

### Prérequis

- Java Development Kit (JDK) 8 ou supérieur
- Maven
- MySQL
- IntelliJ IDEA ou un autre IDE compatible avec Spring Boot

### Configuration de la Base de Données

1. Créez une base de données MySQL nommée `student_stage_db`.
2. Configurez les propriétés de la base de données dans le fichier `application.properties` :

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/student_stage_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### Démarrage de l'Application

1. Clonez le dépôt ou téléchargez le projet.
2. Ouvrez le projet dans IntelliJ IDEA.
3. Exécutez l'application en lançant la classe `StudentStageManagementApplication`.

## Utilisation de l'Application

### Endpoints pour la Gestion des Étudiants

- **Ajouter un Étudiant** :
  - **URL** : `POST /students`
  - **Body** :
    ```json
    {
      "name": "Nom de l'étudiant",
      "email": "email@example.com"
    }
    ```

- **Lister les Étudiants** :
  - **URL** : `GET /students`

- **Consulter un Étudiant** :
  - **URL** : `GET /students/{id}`

- **Supprimer un Étudiant** :
  - **URL** : `DELETE /students/{id}`

### Endpoints pour la Gestion des Stages

- **Ajouter un Stage** :
  - **URL** : `POST /stages`
  - **Body** :
    ```json
    {
      "title": "Titre du stage",
      "description": "Description du stage",
      "student_id": 1
    }
    ```

- **Lister les Stages** :
  - **URL** : `GET /stages`

- **Consulter un Stage** :
  - **URL** : `GET /stages/{id}`

- **Supprimer un Stage** :
  - **URL** : `DELETE /stages/{id}`

## Conclusion

Ce manuel vous a guidé à travers les fonctionnalités de l'application de gestion des étudiants et des stages. Vous pouvez maintenant ajouter, consulter, lister et supprimer des étudiants et des stages en utilisant les endpoints fournis. Pour toute question ou assistance supplémentaire, n'hésitez pas à contacter le support technique.

---
