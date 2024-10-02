CREATE DATABASE animal;
USE animal;
CREATE TABLE wild_animal
( id INT AUTO_INCREMENT PRIMARY KEY, 
name VARCHAR(255), 
age INT,
 food VARCHAR(255),);

 SELECT id, name, age, food FROM wild_animal;
  INSERT INTO wild_animal (id, name, age, food)
VALUES(001, "Shark", "12", "fish");
VALUES(002, "Lion", "2", "meet");
VALUES(003, "Cheetah', "4", "meet");
VALUES(004, "Panda", "1", "bamboo");

