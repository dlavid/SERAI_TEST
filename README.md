# SERAI_TEST
Coding challenge for interview process

1. Download JDK 8, https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html
2. clone the repository
3. cd to target path then mvnw spring-boot:run

Generate Order Message: 
GET http://localhost:8080/genPizzaOrder which will return order message in json format
e.g. 
{
    "quantity": 1,
    "price": 99,
    "name": "Pizza-47"
}

Save Order Message: 
POST http://localhost:8080/savePizzaOrder which will save the order message to h2 db
e.g.
POST
{
    "quantity": 1,
    "price": 99,
    "name": "Pizza-47"
}
-> Order saved successfully