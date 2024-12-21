-- Désactiver temporairement les contraintes de clé étrangère
SET FOREIGN_KEY_CHECKS = 0;

-- Supprimer les données et réinsérer les données
DELETE FROM stage;
DELETE FROM student;

-- Insertion des nouvelles données
INSERT INTO student (name, email) VALUES
                                      ('Seny', 'seny.martin@example.com'),
                                      ('Alice Dupont', 'alice.dupont@example.com'),
                                      ('Bob Martin', 'bob.martin@example.com'),
                                      ('Charlie Durand', 'charlie.durand@example.com');

INSERT INTO stage (title, description, student_id) VALUES
    ('Stage en développement web', 'Développement d\'une application web avec Spring Boot.', 1),
    ('Stage en data science', 'Analyse de données avec Python et Pandas.', 2),
    ('Stage en cybersécurité', 'Mise en place de mesures de sécurité pour un système réseau.', 3);

-- Réactiver les contraintes de clé étrangère après l'insertion
SET FOREIGN_KEY_CHECKS = 1;
