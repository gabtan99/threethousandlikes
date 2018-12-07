/*
1. Retrieve all user accounts
Functions: loginUser(email, password), getAllUsers()
*/

SELECT * 
FROM useraccounts;

/*
2. Reigster new account
Functions: registerUser(email, password, first_name, last_name, contact_number, gender)
*/

INSERT INTO `zaloradb`.`useraccounts` (`user_id`, `email`, `password`, `first_name`, `last_name`, `contact_number`, `gender`, `register_date`) 
VALUES ('12', 'intesys@dlsu.edu.ph', 'quatro', 'Pau', 'Rivera', '09179999999', 'F', '2018-12-06 23:59:30');

/*
3. Retrieve all products
Functions: getAllProducts();
*/

 SELECT *
 FROM products;

/* 
4. Retrieve all products when searched with keyword or brand name
Ex. keyword = Backpack
Functions: getProductsWithKeyword(keyword)
*/

SELECT products.* 
FROM products INNER JOIN brands 
ON brands.brand_id = products.brand_id 
WHERE brands.brand_name = 'Backpack' OR products.product_name LIKE '%Backpack%'; 

/*
5. Retrieve all products under specified apparel type
Ex. Apparel Type = Clothing
Functions: getProductsUnderAType (AType)
*/

SELECT * 
FROM products 
WHERE apparel_type = 'Clothing';

/*
6. Retrieve all products of specified gender
Ex. Gender = Men
Functions: getProductsUnderGender(gender)
*/

SELECT * 
FROM products 
WHERE classification = 'Men';

/*
7. Retrieve all products of brand
Ex. Brand id = 1
Functions: getProductsOfBrand(brand_id)
*/

SELECT * 
FROM products 
WHERE brand_id = '1';

/*
8. Retrieve the products  and its quantity of specified order of the current user
Ex. Order id  = 3 and User id = 1
Functions: getProductsInOrder(order_id)
*/

SELECT products.*, carts.quantity 
FROM carts INNER JOIN products 
ON products.product_id = carts.product_id 
WHERE  carts.user_id = '1' AND carts.order_id = '3';

/*
9. Retrive products in current cart
Ex. user_id = 1
Functions: getCurrentCart()
*/ 

SELECT products.*, carts.session_id, carts.quantity 
FROM carts INNER JOIN products 
ON products.product_id = carts.product_id 
WHERE carts.checked_out = 0 AND carts.user_id = 1;

/*
10. Retrive all brands
Functions: getAllBrands()
*/

SELECT * 
FROM brands;

/* 
11.  Retrieve order history
Functions: getOrderHistory()
*/

SELECT orderdetails.* 
FROM orderdetails 
WHERE user_id = 1;

/*
12. Remove from cart
Functions: removeFromCart(session_id)
*/ 

DELETE FROM `zaloradb`.`carts` 
WHERE (`session_id` = 1);

/*
13. Add to product to cart
Ex. product_id = 23, quantity  = 2
Functions: addToCart(product_id, quantity)
*/

INSERT INTO `zaloradb`.`carts` (`session_id`, `user_id`, `product_id`, `quantity`, `checked_out`) 
VALUES ('29', '8', '23', '2', '0');

/*
14. Checkout current cart items to orders without total amount
Functions: checkoutCart(payment_method, shipping_address, billing_address)
*/

INSERT INTO `zaloradb`.`orderdetails` (`order_id`, `payment_method`, `order_date`, `shipping_address`, `billing_address`) 
VALUES ('17', 'Wallet Credit', '2018-12-06 23:49:45', 'Makati', 'Manila');

UPDATE `zaloradb`.`carts` SET `checked_out` = '1', `order_id` = 17
WHERE (`session_id` = 18);

UPDATE `zaloradb`.`orderdetails` SET `total_amount` =  '1900', `user_id` =  '2'  WHERE (`order_id` =  '17');

/*
15. Calculate total order price based on order id
Functions: getTotalOrderPrice(order_id)
*/

SELECT SUM(products.price*carts.quantity) as 'total' 
FROM products INNER JOIN carts 
ON products.product_id = carts.product_id 
WHERE carts.user_id = 1 AND carts.order_id = 17;

/*
16. Calculate total of products ijn current cart
Functions: getMyCartTotal()
*/

SELECT products.price, carts.quantity
FROM carts INNER JOIN products 
ON products.product_id = carts.product_id 
WHERE carts.checked_out = 0 AND carts.user_id = 1;

/*
17. Retrieve new session ID
Functions: getNewSessionID()
*/
SELECT MAX(session_id) as 'max' 
FROM carts;

/*
18. Retrieve new order ID
Functions: getNewOrderID()
*/

SELECT MAX(order_id) as 'max' 
FROM carts;

/*
19.  Retrieve new product ID
Functions: getNewProductID()
*/

SELECT MAX(product_id) as 'max' 
FROM products;

/*
20. Retrieve new user ID
Functions: getNewUserID()
*/

SELECT MAX(user_id) as 'max' 
FROM useraccounts;

/* 
21. Retrieve new brand ID
Functions: getNewBrandID()
*/

SELECT MAX(brand_id) as 'max' 
FROM brands;

/*
22. Get current date 
Functions getDate()
*/

SELECT NOW();

/*
23. Retrieve all orders
Functions: getAllOrders()
*/

SELECT *
FROM orderdetails;

/*
24. Add new brand
Functions: addNewBrand(brand_name, address, email, contact_number)
*/

INSERT INTO `zaloradb`.`brands` (`brand_id`, `brand_name`, `address`, `email`, `contact_number`) 
VALUES ('6', 'Apple', 'California', 'apple@apple.com', '123 4567');

/*
25. Add new product
Functions: addNewProduct(product_name, brand_name, price, classification, apparel_type)
*/

INSERT INTO `zaloradb`.`products` (`product_id`, `product_name`, `brand_id`, `price`, `classification`, `apparel_type`) 
VALUES ('29', 'Apple pencil', '6', '10000', 'Men', 'Clothing');

/*
25. Return brand id from brand name
Functions: verifyBrand(brand_name)
*/

SELECT brand_id
FROM brands 
WHERE brand_name = 'Nike';

/*
26. Edit user details
Functions: editUser(email, password, first_name, last_name, contact_number, gender)
*/

UPDATE `zaloradb`.`useraccounts` 
SET `email` = 'intesys@gmail.com', `password` = 'password', `first_name` = 'Rivera', `last_name` = 'Pau', `contact_number` = '09178392948', `gender` = 'M', `register_date` = '2018-12-06 23:59:31' 
WHERE (`user_id` = '12');

/*
27. Edit brand details
Functions: editBrand (brand_id, brand_name, address, email, contact_number)
*/

UPDATE `zaloradb`.`brands` 
SET `brand_name` = 'Samsung', `address` = 'Ortigas Center, Pasig City', `email` = 'dm2rwm@silverworks.com', `contact_number` = '632 0096' 
WHERE (`brand_id` = '5');

/*
28. Edit product details
Functions: editProduct(product_id, product_name, brand_name, price, classification, apparel_type)
*/

UPDATE `zaloradb`.`products` 
SET `product_name` = 'Apple Pencil', `brand_id` = '5', `price` = '1000', `classification` = 'Women', `apparel_type` = 'Accessories' 
WHERE (`product_id` = '28');















