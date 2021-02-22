insert into customer(id, name) values (1000, 'Ashish');
insert into customer(id, name) values (1001, 'Amit');
insert into customer(id, name) values (1002, 'Raj');

insert into my_transaction(id, description, total, save_date, customer_id) values (1001, 'Order 1', 100, '2021-01-20 10:20:10', 1000);
insert into my_transaction(id, description, total, save_date, customer_id) values (1002, 'Order 2', 50, '2021-01-20 10:20:10', 1000);
insert into my_transaction(id, description, total, save_date, customer_id) values (1003, 'Order 3', 120, '2021-02-20 10:20:10', 1000);
insert into my_transaction(id, description, total, save_date, customer_id) values (1004, 'Order 7', 175.32, '2021-01-20 10:20:10', 1000);
insert into my_transaction(id, description, total, save_date, customer_id) values (1005, 'Order 11', 65.75, '2021-02-20 10:20:10', 1000);
insert into my_transaction(id, description, total, save_date, customer_id) values (1006, 'Order 8', 210.50, '2021-02-20 10:20:10', 1000);
insert into my_transaction(id, description, total, save_date, customer_id) values (1009, 'Order 31', 42.80, '2021-02-20 17:10:10', 1000);

insert into my_transaction(id, description, total, save_date, customer_id) values (1200, 'Order 20', 25.60, '2021-02-20 12:20:10', 1002);
insert into my_transaction(id, description, total, save_date, customer_id) values (1201, 'Order 21', 80.50, '2021-02-20 15:00:10', 1002);
insert into my_transaction(id, description, total, save_date, customer_id) values (1202, 'Order 22', 116.14, '2021-03-20 11:30:10', 1002);
insert into my_transaction(id, description, total, save_date, customer_id) values (1203, 'Order 23', 25.60, '2021-03-20 12:20:10', 1002);
insert into my_transaction(id, description, total, save_date, customer_id) values (1204, 'Order 24', 80.50, '2021-04-20 15:00:10', 1002);
insert into my_transaction(id, description, total, save_date, customer_id) values (1205, 'Order 25', 116.14, '2021-05-20 11:30:10', 1002);

insert into my_transaction(id, description, total, save_date, customer_id) values (1008, 'Order 5', 200, '2021-02-20 10:20:10', 1001);