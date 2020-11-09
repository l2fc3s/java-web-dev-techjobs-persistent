## Part 1: Test it with SQL
SELECT * FROM techjobs.job;
Columns:
    id: int PK
    employer: varchar(255)
    name: varchar(255)
    skills: varchar(255)

## Part 2: Test it with SQL
SELECT name, location
FROM techjobs.employer
WHERE location = "St. Louis";

## Part 3: Test it with SQL

DROP TABLE `techjobs`.`job`;


## Part 4: Test it with SQL