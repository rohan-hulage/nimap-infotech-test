CREATE TABLE Category (Category_id int primary key, Category_Desc VARCHAR);
INSERT INTO Category (Category_id, Category_Desc) VALUES (1, 'Electronics');
INSERT INTO Category (Category_id, Category_Desc) VALUES (2, 'Fashion');
INSERT INTO Category (Category_id, Category_Desc) VALUES (3, 'Kitchen');
INSERT INTO Category (Category_id, Category_Desc) VALUES (4, 'Beauty');
INSERT INTO Category (Category_id, Category_Desc) VALUES (5, 'Sports');
INSERT INTO Category (Category_id, Category_Desc) VALUES (6, 'Books');
INSERT INTO Category (Category_id, Category_Desc) VALUES (7, 'Movies');
INSERT INTO Category (Category_id, Category_Desc) VALUES (8, 'Kids');
INSERT INTO Category (Category_id, Category_Desc) VALUES (9, 'Pets');
INSERT INTO Category (Category_id, Category_Desc) VALUES (10, 'Grocery');


CREATE TABLE Product (product_id int primary key, Product_Name VARCHAR, product_price DECIMAL(10,2), product_category int,
 foreign key (product_category) references Category(Category_id));
 
 
 INSERT INTO Product (product_id, Product_Name,product_price,product_category) VALUES (1, 'Samsung S21 FE',32000.00,1);
 INSERT INTO Product (product_id, Product_Name,product_price,product_category) VALUES (2, 'Samsung S21 FE',33000.00,1);
 INSERT INTO Product (product_id, Product_Name,product_price,product_category) VALUES (3, 'Samsung S21 FE',34000.00,1);
 INSERT INTO Product (product_id, Product_Name,product_price,product_category) VALUES (4, 'Samsung S21 FE',35000.00,1);
 INSERT INTO Product (product_id, Product_Name,product_price,product_category) VALUES (5, 'Samsung S21 FE',36000.00,1);
 INSERT INTO Product (product_id, Product_Name,product_price,product_category) VALUES (6, 'Samsung S21 FE',37000.00,1);

 INSERT INTO Product (product_id, Product_Name,product_price,product_category) VALUES (7, 'Samsung S21 FE',37000.00,2);
 INSERT INTO Product (product_id, Product_Name,product_price,product_category) VALUES (8, 'Samsung S21 FE',37000.00,2);
 INSERT INTO Product (product_id, Product_Name,product_price,product_category) VALUES (9, 'Samsung S21 FE',37000.00,2);


 INSERT INTO Product (product_id, Product_Name,product_price,product_category) VALUES (10, 'Samsung S21 FE',37000.00,3);
INSERT INTO Product (product_id, Product_Name,product_price,product_category) VALUES (11, 'Samsung S21 FE',37000.00,3);
INSERT INTO Product (product_id, Product_Name,product_price,product_category) VALUES (12, 'Samsung S21 FE',37000.00,4);




