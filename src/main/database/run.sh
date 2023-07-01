#!/bin/bash

# Set the image and container names
IMAGE_NAME="dojo_iard_sin_tranverse_db"
CONTAINER_NAME="dojo_iard_sin_tranverse_db"

# Build the Docker image
docker build -t $IMAGE_NAME .

# Run the Docker container
docker run -d --rm -p 5430:5432 --name $CONTAINER_NAME $IMAGE_NAME

