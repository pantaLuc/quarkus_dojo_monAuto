FROM postgres
ENV POSTGRES_DB dojo-iard-sin-tranverse-db
ENV POSTGRES_PASSWORD postgres
COPY shema.sql /docker-entrypoint-initdb.d/
COPY data.sql /docker-entrypoint-initdb.d/
EXPOSE 5432