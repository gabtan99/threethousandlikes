CREATE DATABASE  IF NOT EXISTS `zaloradb` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `zaloradb`;
-- MySQL dump 10.13  Distrib 8.0.12, for Win64 (x86_64)
--
-- Host: localhost    Database: zaloradb
-- ------------------------------------------------------
-- Server version	8.0.12

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `brands`
--

DROP TABLE IF EXISTS `brands`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `brands` (
  `brand_id` int(11) NOT NULL,
  `brand_name` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `contact_number` varchar(45) NOT NULL,
  PRIMARY KEY (`brand_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

ALTER TABLE `zaloradb`.`brands` 
ADD UNIQUE INDEX `brand_name_UNIQUE` (`brand_name` ASC) VISIBLE;
;


--
-- Dumping data for table `brands`
--

LOCK TABLES `brands` WRITE;
/*!40000 ALTER TABLE `brands` DISABLE KEYS */;
INSERT INTO `brands` VALUES (1,'REGATTA','North Edsa, Quezon City, Philippines','shop@regattalifestyle.com','09178828282'),(2,'Herschel','North Ave., Quezon City, Philippines','customerservice@herschel.com','09221771718'),(3,'Nike','Poblacion, Makati  City, Philippines','contact@nike.com','662 1345'),(4,'Maybelline','New Manila, Quezon City, Philippines','consumer.care@ph.loreal.com','672 7200'),(5,'Silverworks','Ortigas Center, Pasig City, Philippines','dmm@silverworks.com','634 0096');
/*!40000 ALTER TABLE `brands` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `carts`
--

DROP TABLE IF EXISTS `carts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `carts` (
  `session_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `product_id` int(11) NOT NULL,
  `quantity` int(11) NOT NULL,
  `checked_out` int(11) NOT NULL,
  `order_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`session_id`),
  KEY `carts-products_idx` (`product_id`),
  KEY `carts-orderdetails_idx` (`order_id`),
  KEY `carts-useraccounts_idx` (`user_id`),
  CONSTRAINT `carts-orderdetails` FOREIGN KEY (`order_id`) REFERENCES `orderdetails` (`order_id`),
  CONSTRAINT `carts-products` FOREIGN KEY (`product_id`) REFERENCES `products` (`product_id`),
  CONSTRAINT `carts-useraccounts` FOREIGN KEY (`user_id`) REFERENCES `useraccounts` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carts`
--

LOCK TABLES `carts` WRITE;
/*!40000 ALTER TABLE `carts` DISABLE KEYS */;
INSERT INTO `carts` VALUES (1,2,3,1,1,1),(2,3,6,1,0,NULL),(3,3,7,1,0,NULL),(4,2,15,1,1,2),(5,2,17,1,1,2),(6,1,25,1,1,3),(7,3,28,1,1,4),(8,5,23,2,1,5),(9,4,22,1,1,6),(10,4,23,1,1,6),(11,4,26,1,1,6),(12,4,8,1,1,7),(13,1,20,1,1,8),(14,1,24,1,0,NULL),(15,1,28,1,0,NULL);
/*!40000 ALTER TABLE `carts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orderdetails`
--

DROP TABLE IF EXISTS `orderdetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `orderdetails` (
  `order_id` int(11) NOT NULL,
  `payment_method` enum('Cash on Delivery','Credit Card/Debit Card','E-Gift Card','Wallet Credit','Paypal') NOT NULL,
  `order_date` datetime NOT NULL,
  `shipping_address` varchar(45) NOT NULL,
  `billing_address` varchar(45) NOT NULL,
  `total_amount` float NOT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`order_id`),
  KEY `orderdetails-useraccounts_idx` (`user_id`),
  CONSTRAINT `orderdetails-useraccounts` FOREIGN KEY (`user_id`) REFERENCES `useraccounts` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

ALTER TABLE `zaloradb`.`orderdetails` 
DROP FOREIGN KEY `orderdetails-useraccounts`;
ALTER TABLE `zaloradb`.`orderdetails` 
CHANGE COLUMN `total_amount` `total_amount` FLOAT NOT NULL DEFAULT 0 ,
CHANGE COLUMN `user_id` `user_id` INT(11) NULL DEFAULT NULL ;
ALTER TABLE `zaloradb`.`orderdetails` 
ADD CONSTRAINT `orderdetails-useraccounts`
  FOREIGN KEY (`user_id`)
  REFERENCES `zaloradb`.`useraccounts` (`user_id`);


--
-- Dumping data for table `orderdetails`
--

LOCK TABLES `orderdetails` WRITE;
/*!40000 ALTER TABLE `orderdetails` DISABLE KEYS */;
INSERT INTO `orderdetails` VALUES (1,'Credit Card/Debit Card','2016-04-15 09:23:09','Quezon City, Philippines','Quezon City, Philippines',1095,2),(2,'Cash on Delivery','2016-12-25 12:45:58','Quezon City, Philippines','Quezon City, Philippines',974,2),(3,'E-Gift Card','2018-01-01 10:10:12','Makati City, Philippines','Makati City, Philippines',5990,1),(4,'Wallet Credit','2016-12-23 17:44:01','Taguig City, Philippines','Taguig City, Philippines',1695,3),(5,'Credit Card/Debit Card','2018-10-12 22:54:23','Quezon City, Philippines','Quezon City, Philippines',1500,5),(6,'Paypal','2016-11-29 17:45:09','Pasay City, Philippines','Pasay City, Philippines',5170,4),(7,'Paypal','2017-11-30 19:21:17','Pasay City, Philippines','Pasay City, Philippines',3695,4),(8,'E-Gift Card','2018-01-02 13:33:27','Manila, Philippines','Makati City, Philippines',550,1);
/*!40000 ALTER TABLE `orderdetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `products` (
  `product_id` int(11) NOT NULL,
  `product_name` varchar(45) NOT NULL,
  `brand_id` int(11) NOT NULL,
  `price` float NOT NULL,
  `classification` enum('Men','Women') NOT NULL,
  `apparel_type` enum('Clothing','Shoes','Bags','Sports','Accessories','Beauty') NOT NULL,
  PRIMARY KEY (`product_id`),
  KEY `products-brands_idx` (`brand_id`),
  CONSTRAINT `products-brands` FOREIGN KEY (`brand_id`) REFERENCES `brands` (`brand_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES (1,'Little America Backpack',2,5990,'Men','Bags'),(2,'Whaler Mesh Patch Cap',2,1290,'Men','Accessories'),(3,'Poplin Blouse',1,1095,'Women','Clothing'),(4,'Oxford Shirt with Contrast Trim',1,995,'Men','Clothing'),(5,'Mid Rise 5-Pocket Shorts',1,895,'Men','Clothing'),(6,'Nike Air Huarache Run Ultra Men\'s Shoes',3,6295,'Men','Shoes'),(7,'Rise Dri-Fit Tank',3,1395,'Men','Sports'),(8,'Nike Flex Contact 2 Shoes',3,3695,'Women','Shoes'),(9,'Women\'s Nike Radiate Training',3,2795,'Women','Bags'),(10,'Nike Lightweight Running Sleeves AP',3,1295,'Men','Accessories'),(11,'Harbor Body Spray',1,175,'Men','Beauty'),(12,'Skinny Fit Jeggins',1,795,'Women','Clothing'),(13,'Nova Mini Flight Satin Backpack',2,3290,'Women','Bags'),(14,'Chapter Carry On',2,1490,'Women','Accessories'),(15,'Blush Nude Pallete',4,675,'Women','Beauty'),(16,'The Nudes Eyeshadow Palette',4,675,'Women','Beauty'),(17,'Creamy Matte Lipstick - Bold Crimson',4,299,'Women','Beauty'),(18,'Creamy Matte Lipstick - Mysterious Mocha',4,229,'Women','Beauty'),(19,'BB Cushion 3',4,749,'Women','Beauty'),(20,'B1340 Medium Thick Figaro Bracelet',5,550,'Men','Accessories'),(21,'Figaro Chain Necklace',5,4620,'Men','Accessories'),(22,'Prismatic Gem Bangle',5,3625,'Women','Accessories'),(23,'North Node Stud Earrings',5,750,'Women','Accessories'),(24,'Roy RFID Offset Wallet',2,1990,'Men','Accessories'),(25,'Novel Aspect Duffle Bag',2,5990,'Men','Bags'),(26,'Chambray Shirt with All-Over Print',1,795,'Women','Clothing'),(27,'Regular Length A-Line Skirt',1,795,'Women','Clothing'),(28,'Twill Parka ',1,1695,'Men','Clothing');
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `useraccounts`
--

DROP TABLE IF EXISTS `useraccounts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `useraccounts` (
  `user_id` int(11) NOT NULL,
  `email` varchar(45) NOT NULL,
  `password` varchar(20) NOT NULL,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `contact_number` varchar(45) NOT NULL,
  `gender` enum('M','F') NOT NULL,
  `register_date` datetime NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;


ALTER TABLE `zaloradb`.`useraccounts` 
ADD UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE;
;


--
-- Dumping data for table `useraccounts`
--

LOCK TABLES `useraccounts` WRITE;
/*!40000 ALTER TABLE `useraccounts` DISABLE KEYS */;
INSERT INTO `useraccounts` VALUES (1,'nate_pascual@gmail.com','156basura','Nate','Pascual','09224578596','M','2017-12-23 09:23:12'),(2,'matilda_singson@yahoo.com','MASTYsissy223','Matilda','Singson','09174356698','F','2016-03-30 08:56:37'),(3,'baste_matias@gmail.com','basteBASTE0912','Baste','Matias','09997542019','M','2016-10-09 18:17:05'),(4,'lisa_g@gmail.com','BLACKpink4ever','Lisa','Garay','09436774783','F','2015-01-12 21:22:04'),(5,'nikkie_santos@yahoo.com','never.AGAIN143','Nikkie','Santos','09320912888','F','2018-02-15 16:01:44');
/*!40000 ALTER TABLE `useraccounts` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-11-30  1:10:35
