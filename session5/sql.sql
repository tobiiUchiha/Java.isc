CREATE TABLE department (
    depid INT PRIMARY KEY,
    name VARCHAR(100)
);

CREATE TABLE employee (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    salary DECIMAL(10, 2),
    birthday DATE,
    depid INT,
    FOREIGN KEY (depid) REFERENCES department(depid)
);
-- Insert into department table
INSERT INTO department (depid, name)
VALUES
(1, 'Human Resources'),
(2, 'Finance'),
(3, 'Engineering'),
(4, 'Marketing');

-- Insert into employee table
INSERT INTO employee (name, salary, birthday, depid)
VALUES
('Alice', 55000.00, '1990-05-15', 1),
('Bob', 65000.00, '1985-07-20', 2),
('Charlie', 75000.00, '1992-08-30', 3),
('Diana', 60000.00, '1995-12-12', 1),
('Edward', 70000.00, '1991-03-11', 4);
-- queries
SELECT  *
FROM  employee e 
WHERE depid = 1;

---------  

SELECT 
    e.name AS employee_name,
    e.salary,
    e.birthday,
    d.name AS department_name
FROM 
    employee e
JOIN 
    department d
ON 
    e.depid = d.depid

WHERE e.depid = 1 and e.salary > 55000;
