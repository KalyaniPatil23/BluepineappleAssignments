CREATE TABLE Employee(EmployeeId int, EmployeeName TEXT, DepartmentId int);
CREATE TABLE Department(DepartmentId int, DepartmentName TEXT);
INSERT INTO Employee VALUES
(1, 'Nitin', 2), (2, 'Rahul', 1), (3, 'Nilesh',1),(4, 'Harsh', 2);
INSERT INTO Department VALUES
(1, 'Production'), (2, 'Sells'), (3,'Development'), (4, 'Management'), (5, 'Maintainance');

SELECT * FROM Employee;
SELECT * from Department;
SELECT e.EmployeeName, d.DepartmentName 
FROM  Employee e
CROSS JOIN Department d;


SELECT e.EmployeeName, d.DepartmentName 
FROM  Employee e
INNER JOIN Department d
ON e.DepartmentId = d.DepartmentId;


SELECT e.EmployeeName, d.DepartmentName 
FROM  Department d
LEFT OUTER JOIN Employee e
ON e.DepartmentId = d.DepartmentId;

//NOT SUPPORTED
SELECT e.EmployeeName, d.DepartmentName 
FROM  Department d
RIGHT OUTER JOIN Employee e
ON e.DepartmentId = d.DepartmentId;

SELECT e.EmployeeName, d.DepartmentName 
FROM  Department d
LEFT OUTER JOIN Employee e
ON e.DepartmentId = d.DepartmentId
UNION ALL
SELECT e.EmployeeName, d.DepartmentName 
FROM  Department d
RIGHT OUTER JOIN Employee e
ON e.DepartmentId = d.DepartmentId;