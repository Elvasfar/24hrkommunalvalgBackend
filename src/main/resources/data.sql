use kommunalvalg;

    -- Insert Parties
INSERT INTO party (party_letter, party_name) VALUES ('A', 'Socialdemokratiet');
INSERT INTO party (party_letter, party_name) VALUES ('C', 'Det konservative Folkeparti');
INSERT INTO party (party_letter, party_name) VALUES ('F', 'SF, Socialistisk Folkeparti');
INSERT INTO party (party_letter, party_name) VALUES ('O', 'Dansk Folkeparti');
INSERT INTO party (party_letter, party_name) VALUES ('V', 'Venstre, Danmarks Liberale Parti');
INSERT INTO party (party_letter, party_name) VALUES ('OE', 'Enhedslisten + De Rød Grønne');

-- Insert Politicians for Socialdemokratiet
INSERT INTO politician (first_name, last_name, party_id) VALUES ('Marcel', 'Meijer', (SELECT id FROM party WHERE party_letter = 'A'));
INSERT INTO politician (first_name, last_name, party_id) VALUES ('Michael', 'Kristensen', (SELECT id FROM party WHERE party_letter = 'A'));
INSERT INTO politician (first_name, last_name, party_id) VALUES ('Helle', 'Hansen', (SELECT id FROM party WHERE party_letter = 'A'));
INSERT INTO politician (first_name, last_name, party_id) VALUES ('Karina', 'Knobelauch', (SELECT id FROM party WHERE party_letter = 'A'));
INSERT INTO politician (first_name, last_name, party_id) VALUES ('Stefan', 'Hafstein Wolffbrandt', (SELECT id FROM party WHERE party_letter = 'A'));
INSERT INTO politician (first_name, last_name, party_id) VALUES ('Robert V.', 'Rasmussen', (SELECT id FROM party WHERE party_letter = 'A'));
INSERT INTO politician (first_name, last_name, party_id) VALUES ('Pia', 'Ramsing', (SELECT id FROM party WHERE party_letter = 'A'));
INSERT INTO politician (first_name, last_name, party_id) VALUES ('Anders', 'Baun Sørensen', (SELECT id FROM party WHERE party_letter = 'A'));

-- Insert Politicians for Det konservative Folkeparti
INSERT INTO politician (first_name, last_name, party_id) VALUES ('Per Urban', 'Olsen', (SELECT id FROM party WHERE party_letter = 'C'));
INSERT INTO politician (first_name, last_name, party_id) VALUES ('Peter', 'Askjær', (SELECT id FROM party WHERE party_letter = 'C'));
INSERT INTO politician (first_name, last_name, party_id) VALUES ('Martin', 'Sørensen', (SELECT id FROM party WHERE party_letter = 'C'));
INSERT INTO politician (first_name, last_name, party_id) VALUES ('Louise', 'Bramstorp', (SELECT id FROM party WHERE party_letter = 'C'));
INSERT INTO politician (first_name, last_name, party_id) VALUES ('Sigfred', 'Jensen', (SELECT id FROM party WHERE party_letter = 'C'));
INSERT INTO politician (first_name, last_name, party_id) VALUES ('Jørn C.', 'Nissen', (SELECT id FROM party WHERE party_letter = 'C'));
INSERT INTO politician (first_name, last_name, party_id) VALUES ('Morten Ø.', 'Kristensen', (SELECT id FROM party WHERE party_letter = 'C'));
INSERT INTO politician (first_name, last_name, party_id) VALUES ('Susanne', 'Andersen', (SELECT id FROM party WHERE party_letter = 'C'));
INSERT INTO politician (first_name, last_name, party_id) VALUES ('Iulian V.', 'Paiu', (SELECT id FROM party WHERE party_letter = 'C'));
INSERT INTO politician (first_name, last_name, party_id) VALUES ('Per', 'Hingel', (SELECT id FROM party WHERE party_letter = 'C'));

-- Insert Politicians for SF, Socialistisk Folkeparti
INSERT INTO politician (first_name, last_name, party_id) VALUES ('Ulla', 'Holm', (SELECT id FROM party WHERE party_letter = 'F'));
INSERT INTO politician (first_name, last_name, party_id) VALUES ('Kjeld', 'Bønkel', (SELECT id FROM party WHERE party_letter = 'F'));
INSERT INTO politician (first_name, last_name, party_id) VALUES ('Anne Grethe', 'Olsen', (SELECT id FROM party WHERE party_letter = 'F'));
INSERT INTO politician (first_name, last_name, party_id) VALUES ('Lone', 'Krag', (SELECT id FROM party WHERE party_letter = 'F'));
INSERT INTO politician (first_name, last_name, party_id) VALUES ('Børge S.', 'Buur', (SELECT id FROM party WHERE party_letter = 'F'));

-- Insert Politicians for Dansk Folkeparti
INSERT INTO politician (first_name, last_name, party_id) VALUES ('Per', 'Mortensen', (SELECT id FROM party WHERE party_letter = 'O'));

-- Insert Politicians for Venstre, Danmarks Liberale Parti
INSERT INTO politician (first_name, last_name, party_id) VALUES ('Søren', 'Wiese', (SELECT id FROM party WHERE party_letter = 'V'));
INSERT INTO politician (first_name, last_name, party_id) VALUES ('Anita Elgaard', 'Højholt Olesen', (SELECT id FROM party WHERE party_letter = 'V'));
INSERT INTO politician (first_name, last_name, party_id) VALUES ('Carsten', 'Bruun', (SELECT id FROM party WHERE party_letter = 'V'));
INSERT INTO politician (first_name, last_name, party_id) VALUES ('Mogens', 'Exner', (SELECT id FROM party WHERE party_letter = 'V'));
INSERT INTO politician (first_name, last_name, party_id) VALUES ('Anja', 'Guldborg', (SELECT id FROM party WHERE party_letter = 'V'));
INSERT INTO politician (first_name, last_name, party_id) VALUES ('Klaus', 'Holdorf', (SELECT id FROM party WHERE party_letter = 'V'));

-- Insert Politicians for Enhedslisten + De Rød Grønne
INSERT INTO politician (first_name, last_name, party_id) VALUES ('Katrine Høegh', 'Mc Quaid', (SELECT id FROM party WHERE party_letter = 'OE'));
INSERT INTO politician (first_name, last_name, party_id) VALUES ('Jette M.', 'Søgaard', (SELECT id FROM party WHERE party_letter = 'OE'));
INSERT INTO politician (first_name, last_name, party_id) VALUES ('Søren', 'Caspersen', (SELECT id FROM party WHERE party_letter = 'OE'));
INSERT INTO politician (first_name, last_name, party_id) VALUES ('Pia', 'Birkmand', (SELECT id FROM party WHERE party_letter = 'OE'));

INSERT INTO vote (politician_id, party_id) VALUES (NULL, 1);
INSERT INTO vote (politician_id, party_id) VALUES (2, NULL);
INSERT INTO vote (politician_id, party_id) VALUES (NULL, 2);
INSERT INTO vote (politician_id, party_id) VALUES (5, NULL);
INSERT INTO vote (politician_id, party_id) VALUES (NULL, 3);
INSERT INTO vote (politician_id, party_id) VALUES (8, NULL);
INSERT INTO vote (politician_id, party_id) VALUES (NULL, 4);
INSERT INTO vote (politician_id, party_id) VALUES (12, NULL);
INSERT INTO vote (politician_id, party_id) VALUES (NULL, 5);
INSERT INTO vote (politician_id, party_id) VALUES (15, NULL);
INSERT INTO vote (politician_id, party_id) VALUES (NULL, 6);
INSERT INTO vote (politician_id, party_id) VALUES (18, NULL);
INSERT INTO vote (politician_id, party_id) VALUES (NULL, 1);
INSERT INTO vote (politician_id, party_id) VALUES (21, NULL);
INSERT INTO vote (politician_id, party_id) VALUES (NULL, 2);
INSERT INTO vote (politician_id, party_id) VALUES (23, NULL);
INSERT INTO vote (politician_id, party_id) VALUES (NULL, 3);
INSERT INTO vote (politician_id, party_id) VALUES (25, NULL);
INSERT INTO vote (politician_id, party_id) VALUES (NULL, 4);
INSERT INTO vote (politician_id, party_id) VALUES (27, NULL);
INSERT INTO vote (politician_id, party_id) VALUES (NULL, 5);
INSERT INTO vote (politician_id, party_id) VALUES (29, NULL);
INSERT INTO vote (politician_id, party_id) VALUES (NULL, 6);
INSERT INTO vote (politician_id, party_id) VALUES (31, NULL);
INSERT INTO vote (politician_id, party_id) VALUES (NULL, 1);
INSERT INTO vote (politician_id, party_id) VALUES (33, NULL);
INSERT INTO vote (politician_id, party_id) VALUES (NULL, 2);
INSERT INTO vote (politician_id, party_id) VALUES (1, NULL);
INSERT INTO vote (politician_id, party_id) VALUES (NULL, 3);
INSERT INTO vote (politician_id, party_id) VALUES (3, NULL);
INSERT INTO vote (politician_id, party_id) VALUES (NULL, 4);
INSERT INTO vote (politician_id, party_id) VALUES (6, NULL);
INSERT INTO vote (politician_id, party_id) VALUES (NULL, 5);
INSERT INTO vote (politician_id, party_id) VALUES (9, NULL);
INSERT INTO vote (politician_id, party_id) VALUES (NULL, 6);
INSERT INTO vote (politician_id, party_id) VALUES (11, NULL);
INSERT INTO vote (politician_id, party_id) VALUES (NULL, 1);
INSERT INTO vote (politician_id, party_id) VALUES (14, NULL);
INSERT INTO vote (politician_id, party_id) VALUES (NULL, 2);
INSERT INTO vote (politician_id, party_id) VALUES (16, NULL);
INSERT INTO vote (politician_id, party_id) VALUES (NULL, 3);
INSERT INTO vote (politician_id, party_id) VALUES (19, NULL);
INSERT INTO vote (politician_id, party_id) VALUES (NULL, 4);
INSERT INTO vote (politician_id, party_id) VALUES (22, NULL);
INSERT INTO vote (politician_id, party_id) VALUES (NULL, 5);
INSERT INTO vote (politician_id, party_id) VALUES (24, NULL);
INSERT INTO vote (politician_id, party_id) VALUES (NULL, 6);
INSERT INTO vote (politician_id, party_id) VALUES (26, NULL);
INSERT INTO vote (politician_id, party_id) VALUES (NULL, 1);
INSERT INTO vote (politician_id, party_id) VALUES (28, NULL);
INSERT INTO vote (politician_id, party_id) VALUES (NULL, 2);
INSERT INTO vote (politician_id, party_id) VALUES (30, NULL);
INSERT INTO vote (politician_id, party_id) VALUES (NULL, 3);
INSERT INTO vote (politician_id, party_id) VALUES (32, NULL);
INSERT INTO vote (politician_id, party_id) VALUES (NULL, 4);
INSERT INTO vote (politician_id, party_id) VALUES (34, NULL);
INSERT INTO vote (politician_id, party_id) VALUES (NULL, 5);
INSERT INTO vote (politician_id, party_id) VALUES (1, NULL);
INSERT INTO vote (politician_id, party_id) VALUES (NULL, 6);
INSERT INTO vote (politician_id, party_id) VALUES (3, NULL);
INSERT INTO vote (politician_id, party_id) VALUES (NULL, 1);
INSERT INTO vote (politician_id, party_id) VALUES (5, NULL);
INSERT INTO vote (politician_id, party_id) VALUES (NULL, 2);
INSERT INTO vote (politician_id, party_id) VALUES (7, NULL);
INSERT INTO vote (politician_id, party_id) VALUES (NULL, 3);
INSERT INTO vote (politician_id, party_id) VALUES (9, NULL);
INSERT INTO vote (politician_id, party_id) VALUES (NULL, 4);
INSERT INTO vote (politician_id, party_id) VALUES (11, NULL);
INSERT INTO vote (politician_id, party_id) VALUES (NULL, 5);
INSERT INTO vote (politician_id, party_id) VALUES (13, NULL);
INSERT INTO vote (politician_id, party_id) VALUES (NULL, 6);
INSERT INTO vote (politician_id, party_id) VALUES (15, NULL);
INSERT INTO vote (politician_id, party_id) VALUES (NULL, 1);
INSERT INTO vote (politician_id, party_id) VALUES (17, NULL);
INSERT INTO vote (politician_id, party_id) VALUES (NULL, 2);
INSERT INTO vote (politician_id, party_id) VALUES (19, NULL);
INSERT INTO vote (politician_id, party_id) VALUES (NULL, 3);
INSERT INTO vote (politician_id, party_id) VALUES (21, NULL);
INSERT INTO vote (politician_id, party_id) VALUES (NULL, 4);
INSERT INTO vote (politician_id, party_id) VALUES (23, NULL);
INSERT INTO vote (politician_id, party_id) VALUES (NULL, 5);
INSERT INTO vote (politician_id, party_id) VALUES (25, NULL);
INSERT INTO vote (politician_id, party_id) VALUES (NULL, 6);
INSERT INTO vote (politician_id, party_id) VALUES (27, NULL);
INSERT INTO vote (politician_id, party_id) VALUES (NULL, 1);
INSERT INTO vote (politician_id, party_id) VALUES (29, NULL);
INSERT INTO vote (politician_id, party_id) VALUES (NULL, 2);
INSERT INTO vote (politician_id, party_id) VALUES (31, NULL);
INSERT INTO vote (politician_id, party_id) VALUES (NULL, 3);
INSERT INTO vote (politician_id, party_id) VALUES (33, NULL);
INSERT INTO vote (politician_id, party_id) VALUES (NULL, 4);
INSERT INTO vote (politician_id, party_id) VALUES (1, NULL);
INSERT INTO vote (politician_id, party_id) VALUES (NULL, 5);
INSERT INTO vote (politician_id, party_id) VALUES (2, NULL);
INSERT INTO vote (politician_id, party_id) VALUES (NULL, 6);
INSERT INTO vote (politician_id, party_id) VALUES (3, NULL);
INSERT INTO vote (politician_id, party_id) VALUES (NULL, 1);
