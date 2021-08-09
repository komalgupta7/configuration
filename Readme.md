#Building this project AND running it

./mvnw package && java -jar target/configuration-0.0.1-SNAPSHOT.jar

#Dockerizing image
docker build -t komal/configuration .

#Runinng Docker Container
docker run -p 8080:8080 komal/configuration