INSERT INTO SERVICE (nom) 
    VALUES ('Informatique'), ('Ressources Humaines');
    
INSERT INTO EQUIPEMENT (nom, num_serie, prix, service) VALUES 
('PC Portable Dev 01', 'SN-DEV-001', 1200.0, 1),
('Imprimante RH 01', 'SN-IMP-002', 450.0, 2);

INSERT INTO ORDINATEUR (id, ram_go, processeur, type_pc) VALUES (1, 16, 'Intel i7', 'PORTABLE');
INSERT INTO IMPRIMANTE (id, est_couleur) VALUES (2, true);
INSERT INTO UTILISATEUR (id, nom, pseudo, commentaire, mot_de_passe_hash, role) VALUES 
('1', 'Alice Dupont', 'alice', 'Administrateur du système', '$2a$10$7Q9e5J8k1Z6F1Y3K9G8eOe5J8k1Z6F1Y3K9G8eOe5J8k1Z6F1Y3K9G8eO', 'ADMIN'),
('2', 'Bob Martin', 'bob', 'Utilisateur standard', '$2a$10$7Q9e5J8k1Z6F1Y3K9G8eOe5J8k1Z6F1Y3K9G8eOe5J8k1Z6F1Y3K9G8eO', 'STANDARD') ,
('3', 'Charlie Durand', 'charlie', 'Utilisateur standard', '$2a$10$7Q9e5J8k1Z6F1Y3K9G8eOe5J8k1Z6F1Y3K9G8eOe5J8k1Z6F1Y3K9G8eO', 'STANDARD');
