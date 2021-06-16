CREATE TABLE Books(BookId int, BookName TEXT, Author TEXT, Price double, Quantity int);
CREATE TABLE Users(UserId int, UserName TEXT, UserAddress TEXT);
CREATE TABLE Catlog(Id int, UserId int, BookId int, IssueDate DATE, ReturnDate DATE);

INSERT INTO Books VALUES
(1, 'The Secret', 'Rhonda Byrne', 500.00, 2), (2, 'The Rise and Fall of the Black Hole Paradigm', 'Abhas Mitra', 386.00, 5), (3, 'Mein Kampf', 'Adolf Hilter', 195.00, 4), (4, 'Bb in History', 'Poonam Dahiya', 222.00, 2), (5, 'Medieval India', 'Satish Chandra', 329.00, 1);

INSERT INTO Users VALUES
(1, 'Kalyani', 'Karad'), (2, 'Sanika', 'Kolhapur'), (3, 'Harsh', 'Karad'), (4, 'Mayuri', 'Satara'),(5, 'Shubhangi', 'Kolhapur');

INSERT INTO Catlog VALUES
(1, 1, 1, '2021-06-15', '2021-06-16'),(2, 3, 5, '2021-06-09', '2021-06-14');

SELECT * FROM Books;

SELECT * FROM Users;

SELECT * FROM Catlog;

