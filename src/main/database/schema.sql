CREATE TABLE vehicules (
                           IDVehicule BIGSERIAL PRIMARY KEY,
                           marque VARCHAR,
                           type VARCHAR,
                           energie VARCHAR,
                           serie VARCHAR,
                           NbPLACECAB INT,
                           NbPlaceHCAB INT
);

CREATE TABLE categories (
                           idCategorie BIGSERIAL PRIMARY KEY ,
                           nomCategorie VARCHAR
);

