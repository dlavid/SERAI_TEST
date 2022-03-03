# SERAI_TEST
Coding challenge for interview process

1. Download JDK 8, https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html
2. Clone the repository
3. Cd to target path then run "mvnw spring-boot:run"

Generate Order Message: </br>
GET http://localhost:8080/genPizzaOrder which will return order message in json format </br>
e.g. 
{
    "quantity": 1,
    "price": 99,
    "name": "Pizza-47"
}

Save Order Message: </br>
POST http://localhost:8080/savePizzaOrder which will save the order message to h2 db </br>
e.g.
POST
{
    "quantity": 1,
    "price": 99,
    "name": "Pizza-47"
}
-> Order saved successfully

Read the content from H2: </br>
On the browser, go to http://localhost:8080/h2/login.jsp. (login details can be found in application.properties) </br>
select * from PIZZA;
