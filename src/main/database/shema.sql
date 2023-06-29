CREATE TABLE Client (
    idClient BIGSERIAL PRIMARY KEY,
    nomClient VARCHAR,
    prenomClient VARCHAR,
    adresseClient VARCHAR,
    telephoneClient VARCHAR
);

CREATE TABLE Vehicule (
    IDVehicule BIGSERIAL PRIMARY KEY,
    Marque VARCHAR,
    type VARCHAR,
    energie VARCHAR,
    serie VARCHAR,
    NbPLACECAB NUMERIC(12,2),
    NbPlaceHCAB NUMERIC(12,2)
);
