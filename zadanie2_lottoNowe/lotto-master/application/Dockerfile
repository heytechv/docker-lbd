# Komentarz nie moze byc na koncu linii!
# Wybieramy linuxa (obraz) na ktorym bedzie dzialal
FROM openjdk:11

# tworzymy sciezke w kontenerze
WORKDIR /src/java/

# kopiujemy ./target/ do /src/java/
COPY ./target/ /src/java/

# uruchamiamy
CMD ["java", "-jar", "./lotto-0.0.1-SNAPSHOT.jar"]