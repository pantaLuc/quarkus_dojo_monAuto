docker build -t dojo-iard-sin-tranverse-db .
docker run -d --rm -p 5430:5432 --name dojo-iard-sin-tranverse-monAuto dojo-iard-sin-tranverse-db
