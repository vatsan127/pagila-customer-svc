-- Address Table
INSERT INTO address
	(id, address, district, postal_code, phone)
VALUES
	(5, '1913 Hanoi Way', 'Nagasaki', '35200', '28303384290'),
	(6, '1121 Loja Avenue', 'California', '17886', '838635286649'),
	(7, '692 Joliet Street', 'Attika', '83579', '448477190408'),
	(8, '1566 Inegl Manor', 'Mandalay', '53561', '705814003527'),
	(9, '53 Idfu Parkway', 'Nantou', '42399', '10655648674'),
	(10, '1795 Santiago de Compostela Way', 'Texas', '18743', '860452626434'),
	(11, '900 Santiago de Compostela Parkway', 'Central Serbia', '93896', '716571220373'),
	(12, '478 Joliet Way', 'Hamilton', '77948', '657282285970'),
	(13, '613 Korolev Drive', 'Masqat', '45844', '380657522649'),
	(14, '1531 Sal Drive', 'Esfahan', '53628', '648856936185');

-- Customer Table
INSERT INTO customer
	(id, first_name, last_name, address_id, email)
values
	('1', 'MARY', 'SMITH', '5', 'MARY.SMITH@sakilacustomer.org'),
	('2', 'PATRICIA', 'JOHNSON', '6', 'PATRICIA.JOHNSON@sakilacustomer.org'),
	('3', 'LINDA', 'WILLIAMS', '7', 'LINDA.WILLIAMS@sakilacustomer.org'),
	('4', 'BARBARA', 'JONES', '8', 'BARBARA.JONES@sakilacustomer.org'),
	('5', 'ELIZABETH', 'BROWN', '9', 'ELIZABETH.BROWN@sakilacustomer.org'),
	('6', 'JENNIFER', 'DAVIS', '10', 'JENNIFER.DAVIS@sakilacustomer.org'),
	('7', 'MARIA', 'MILLER', '11', 'MARIA.MILLER@sakilacustomer.org'),
	('8', 'SUSAN', 'WILSON', '12', 'SUSAN.WILSON@sakilacustomer.org'),
	('9', 'MARGARET', 'MOORE', '13', 'MARGARET.MOORE@sakilacustomer.org'),
	('10', 'DOROTHY', 'TAYLOR', '14', 'DOROTHY.TAYLOR@sakilacustomer.org');

-- Rental Table
INSERT INTO rental
    (customer_id, id, film_name, store_name )
values
    (50, 1, 'Fast And Furious', 'Pagila'),
    (50, 2, 'Need For Speed', 'Pagila');
