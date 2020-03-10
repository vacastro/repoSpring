-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: clientes_ecommerce
-- ------------------------------------------------------
-- Server version	5.5.5-10.1.36-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `carrito`
--

DROP TABLE IF EXISTS `carrito`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `carrito` (
  `usuario_id` int(11) NOT NULL,
  `producto_id` int(11) NOT NULL,
  `id` int(11) NOT NULL,
  KEY `FKg0fspf9ac00r9i2m9wgmy4914` (`producto_id`),
  KEY `FK8ymop2vbmxmjq6ehl5vj3hpqm` (`usuario_id`),
  CONSTRAINT `FK8ymop2vbmxmjq6ehl5vj3hpqm` FOREIGN KEY (`usuario_id`) REFERENCES `usuario` (`id`),
  CONSTRAINT `FKg0fspf9ac00r9i2m9wgmy4914` FOREIGN KEY (`producto_id`) REFERENCES `producto` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carrito`
--

LOCK TABLES `carrito` WRITE;
/*!40000 ALTER TABLE `carrito` DISABLE KEYS */;
INSERT INTO `carrito` VALUES (2,1,0),(2,4,0),(2,1,0),(2,1,0);
/*!40000 ALTER TABLE `carrito` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `categoria`
--

DROP TABLE IF EXISTS `categoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `categoria` (
  `id` int(11) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categoria`
--

LOCK TABLES `categoria` WRITE;
/*!40000 ALTER TABLE `categoria` DISABLE KEYS */;
INSERT INTO `categoria` VALUES (1,'Espejos'),(2,'Macetas'),(3,'Cuadros'),(4,'Almohadones'),(5,'CoffeTime');
/*!40000 ALTER TABLE `categoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clientes_ecommerce_productos`
--

DROP TABLE IF EXISTS `clientes_ecommerce_productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clientes_ecommerce_productos` (
  `usuario_id` int(11) NOT NULL,
  `productos_id` int(11) NOT NULL,
  KEY `FK31268w0oe4lp0mycuqbdcenn7` (`productos_id`),
  CONSTRAINT `FK31268w0oe4lp0mycuqbdcenn7` FOREIGN KEY (`productos_id`) REFERENCES `producto` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes_ecommerce_productos`
--

LOCK TABLES `clientes_ecommerce_productos` WRITE;
/*!40000 ALTER TABLE `clientes_ecommerce_productos` DISABLE KEYS */;
/*!40000 ALTER TABLE `clientes_ecommerce_productos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (3),(3),(3);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producto`
--

DROP TABLE IF EXISTS `producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `producto` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(500) NOT NULL,
  `nombre` varchar(500) NOT NULL,
  `precio` varchar(500) NOT NULL,
  `stock_activo` varchar(500) NOT NULL,
  `url_image` varchar(500) NOT NULL,
  `categoria_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `categoria_id_idx` (`categoria_id`),
  CONSTRAINT `categoria_id` FOREIGN KEY (`categoria_id`) REFERENCES `categoria` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto`
--

LOCK TABLES `producto` WRITE;
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` VALUES (1,'Almohadon Winterfell','Almohadon - GOT','1200','1','/IMAGENES/ALMO-GOT.JPG',4),(2,'Maceta Aérea para pared','Maceta Aérea','500','1','/IMAGENES/MACETAS-AEREAS.JPG',2),(3,'Espejo Reliquias','Espejo Reliquias','1300','1','/IMAGENES/ESPEJO-HP.JPG',1),(4,'Cuadro bastidor','Cuadro - GOT','1500','1','/IMAGENES/CUADRO-GOT.JPG',3),(5,'Juego de tazas ','Tazas de Café','3100','1','/IMAGENES/CAFE-SET.JPG',5),(6,'Cuadro Estación 9 3-4 Harry','Cuadro - HP','1000','1','/IMAGENES/CUADRO9-3-4.JPG',3),(7,'Almohadon Fire and Blood','Almo-FB','400','1','/IMAGENES/ALMO-FIRE-AND-BLOOD.JPG',4),(8,'Almohadon GOT','Almohadon-GOT','500','1','/IMAGENES/ALMO-GOT-GOT.JPG',4),(9,'Almohadon Not Today','Almohadon-NotToday','600','1','/IMAGENES/ALMO-GOT-NOT-TODAY.JPG',4),(10,'Almohadon WALKERS','Almohadon WALKERS','500','1','/IMAGENES/ALMO-GOT-WALKERS.JPG',4),(11,'Almohadon Reinos GOT','Almohadon Reinos','400','1','/IMAGENES/ALMO-LANDING-GOT.JPG',4),(12,'Cuadro de Colores','Cuadro colores','800','1','/IMAGENES/CUADROS-3.JPG',3),(13,'Cuadro con forma de árbol','Cuadro Árbol','1200','1','/IMAGENES/CUADROS-4.JPG',3),(14,'Cuadro Tríptico','Cuadro Mandala','2100','1','/IMAGENES/CUADROS-5.JPG',3),(15,'Cuadro Naturaleza','Cuadro Naturaleza','1800','1','/IMAGENES/CUADROS-6.JPG',3),(16,'Espejo con forma de Hoja','Espejo Hoja','4000','1','/IMAGENES/ESPEJO-2.JPG',1),(17,'Espejo geométrico','Espejo Geométrico','2500','1','/IMAGENES/ESPEJO-3.JPG',1),(18,'Juego de espejos circulares','Espejos Circulares','5000','1','/IMAGENES/ESPEJO-4.JPG',1),(19,'Espejo forma de raíces','Espejo Raíces','3500','1','/IMAGENES/ESPEJO-5.JPG',1),(20,'Espejo de pie','Espejo de Pie','6000','1','/IMAGENES/ESPEJO-6.JPG',1),(21,'Macetas pintadas a mano','Macetas Pintadas','500','1','/IMAGENES/MACETAS-2.JPG',2),(22,'Maceta de piedra volcánica','Maceta de Piedra','700','1','/IMAGENES/MACETAS-3.JPG',2),(23,'Maceta de cobre  geométrica','Maceta de Cobre','750','1','/IMAGENES/MACETAS-4.JPG',2),(24,'Maceta de animales','Maceta Puercoespín','800','1','/IMAGENES/MACETAS-5.JPG',2),(25,'Maceta geométrica divisible','Maceta divisible','700','1','/IMAGENES/MACETAS-6.JPG',2),(26,'Taza carita feliz','Taza Feliz','400','1','/IMAGENES/TAZAS-2.JPG',5),(27,'Taza con temática musical','Taza Musical','500','1','/IMAGENES/TAZAS-3.JPG',5),(28,'Taza clásica','Taza Clásica','400','1','/IMAGENES/TAZAS-4.JPG',5),(29,'Set de tazas GAUDI','Tazas Gaudi','3000','1','/IMAGENES/TAZAS-5.JPG',5),(30,'Taza simil loza','Tazas loza','500','1','/IMAGENES/TAZAS-6.JPG',5);
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `id` int(11) NOT NULL,
  `contrasenia` varchar(30) DEFAULT NULL,
  `email` varchar(255) NOT NULL,
  `nombre` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_5171l57faosmj8myawaucatdw` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (2,'12345678','ery_m87@yahoo.com.ar','ery');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-03-09 21:22:50
