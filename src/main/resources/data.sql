INSERT INTO SERVICE (nom) 
    VALUES ('Informatique'), ('Ressources Humaines');
    
INSERT INTO EQUIPEMENT (nom, num_serie, prix, service) VALUES 
('PC Portable Dev 01', 'SN-DEV-001', 1200.0, 1),
('Imprimante RH 01', 'SN-IMP-002', 450.0, 2);

INSERT INTO ORDINATEUR (id, ram_go, processeur, type_pc) VALUES (1, 16, 'Intel i7', 'PORTABLE');
INSERT INTO IMPRIMANTE (id, est_couleur) VALUES (2, true);
