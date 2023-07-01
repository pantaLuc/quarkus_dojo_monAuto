#!/bin/bash

# Construire l'image Docker
docker build -t dojo_iard_sin_tranverse_db .

# Exécuter le conteneur Docker
docker run -d --rm -p 5430:5432 --name dojo_iard_sin_tranverse_db dojo_iard_sin_tranverse_db
