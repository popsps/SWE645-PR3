FROM mysql:latest
ENV MYSQL_USER=javaadmin
ENV MYSQL_ROOT_PASSWORD=admin
ENV MYSQL_DATABASE=swedb
COPY ./table_init.sql /docker-entrypoint-initdb.d
EXPOSE 3306