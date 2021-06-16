CREATE TABLE Customer (
CustomerId integer,
Customername TEXT,
Contactname TEXT,
Address TEXT,
City TEXT,
PostalCode TEXT,
Country TEXT,
MarketCap double
);

INSERT INTO Customer VALUES
(1, 'Patil Grp', 'Sanket Patil', 'Patil Estate Bhor', 'Pune', '411001', 'India', 2789432879),
(2, 'Nikhar Brothers', 'Rahul Nikhar', 'Nikhar Mahal', 'Nagpur', '440001', 'India', 910052879),
(3, 'Gholap Org', 'Gauri Gholap', 'Gholap & Gholap', 'Nashik', '420005', 'India', 89152879),
(4, 'Patil Grp', 'Kalyani Patil', 'Patil Estate Pune', 'Pune', '411001', 'India', 789152879),
(5, 'Punekars', 'Sneha Punekar', 'Pune', 'Pune', '411001', 'India', 25349152879),
(6, 'Malve Grp', 'Pooja Malve', 'Malve Estate', 'Nashik', '420003', 'India',64539152879),
(7, 'Kere Properties', 'Dhanashree Kere', 'Kere Estate', 'Thane', '400080', 'India',2789152879),
(11, 'Patil Grp', 'Sanket Patil', 'Patil Estate Bhor', 'Osaka', '11001', 'Japan',6745352879),
(12, 'Nikhar Brothers', 'Rahul Nikhar', 'Nikhar Mahal', 'Oslo', '40001', 'Norway',27563152879),
(13, 'Gholap Org', 'Gauri Gholap', 'Gholap & Gholap', 'London', 'E0005', 'UK',915867585642879),
(14, 'Patil Grp', 'Kalyani Patil', 'Patil Estate Pune', 'Paris', '11001', 'France',2976789152879),
(15, 'Punekars', 'Sneha Punekar', 'NSW', 'New Jersey', '11001', 'USA',776589152879),
(16, 'Malve Grp', 'Pooja Malve', 'Malve Estate', 'Sydney', '20003', 'Australia',6349152879),
(17, 'Kere Properties', 'Dhanashree Kere', 'Kere Estate', 'Singapore', '422080', 'Singapore',2004552879);
 SELECT * FROM Customer;
 SELECT Customername, City FROM Customer;
 SELECT * FROM Customer
 WHERE Country = 'India';
 SELECT * FROM Customer
 WHERE Country='India' AND City='Pune';
 SELECT * FROM Customer
WHERE City='Nashik' OR City='Nagpur';
SELECT * FROM Customer
WHERE NOT Country='India';
SELECT * FROM Customer
WHERE Country='India' AND (City = 'Nagpur' OR City='Thane');
SELECT * FROM Customer
WHERE NOT Country='India' AND NOT Country='USA';
UPDATE Customer
SET Contactname = 'Patil Estate Karad', City='Karad'
WHERE CustomerId=4;
SELECT * FROM Customer
WHERE CustomerId=4;
INSERT INTO Customer(Customername, City, Country) VALUES('Kalyani', 'Karad', 'India');
SELECT * FROM Customer;
DELETE FROM Customer
WHERE City='Karad';
SELECT * FROM Customer;
SELECT COUNT(CustomerId)
FROM Customer
WHERE City='Pune';

SELECT AVG(MarketCap) FROM Customer
WHERE Country = 'USA';

SELECT SUM(MarketCap) FROM Customer
WHERE Country = 'Singapore';

SELECT MAX(MarketCap) FROM Customer
WHERE Country = 'India';

SELECT MIN(MarketCap) FROM Customer
WHERE Country = 'USA';

SELECT * FROM Customer
GROUP BY City;

SELECT COUNT(CustomerId), Country
FROM Customer
GROUP BY Country;