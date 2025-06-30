-- MySQL dump 10.11
--
-- Host: localhost    Database: bds
-- ------------------------------------------------------
-- Server version	5.0.77-community-nt

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
-- Table structure for table `assignproject`
--

DROP TABLE IF EXISTS `assignproject`;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
CREATE TABLE `assignproject` (
  `projectID` int(11) default NULL,
  `empCode` int(11) default NULL,
  KEY `empCode` (`empCode`),
  KEY `projectID` (`projectID`),
  CONSTRAINT `assignproject_ibfk_1` FOREIGN KEY (`empCode`) REFERENCES `employee` (`empCode`),
  CONSTRAINT `assignproject_ibfk_2` FOREIGN KEY (`projectID`) REFERENCES `project` (`projectID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
SET character_set_client = @saved_cs_client;

--
-- Dumping data for table `assignproject`
--

LOCK TABLES `assignproject` WRITE;
/*!40000 ALTER TABLE `assignproject` DISABLE KEYS */;
INSERT INTO `assignproject` VALUES (345,4567);
/*!40000 ALTER TABLE `assignproject` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bugreport`
--

DROP TABLE IF EXISTS `bugreport`;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
CREATE TABLE `bugreport` (
  `bugNo` int(11) NOT NULL default '0',
  `bugCode` int(11) default NULL,
  `projectID` int(11) default NULL,
  `TCode` int(11) default NULL,
  `ECode` int(11) default NULL,
  `status` varchar(20) default NULL,
  `bugDes` varchar(100) default NULL,
  PRIMARY KEY  (`bugNo`),
  KEY `bugCode` (`bugCode`),
  KEY `TCode` (`TCode`),
  KEY `ECode` (`ECode`),
  KEY `projectID` (`projectID`),
  CONSTRAINT `bugreport_ibfk_1` FOREIGN KEY (`bugCode`) REFERENCES `bugtype` (`bugCode`),
  CONSTRAINT `bugreport_ibfk_2` FOREIGN KEY (`TCode`) REFERENCES `employee` (`empCode`),
  CONSTRAINT `bugreport_ibfk_3` FOREIGN KEY (`ECode`) REFERENCES `employee` (`empCode`),
  CONSTRAINT `bugreport_ibfk_4` FOREIGN KEY (`projectID`) REFERENCES `project` (`projectID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
SET character_set_client = @saved_cs_client;

--
-- Dumping data for table `bugreport`
--

LOCK TABLES `bugreport` WRITE;
/*!40000 ALTER TABLE `bugreport` DISABLE KEYS */;
/*!40000 ALTER TABLE `bugreport` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bugtype`
--

DROP TABLE IF EXISTS `bugtype`;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
CREATE TABLE `bugtype` (
  `bugCode` int(11) NOT NULL default '0',
  `bugCatgory` varchar(30) default NULL,
  `bugSeverty` varchar(20) default NULL,
  PRIMARY KEY  (`bugCode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
SET character_set_client = @saved_cs_client;

--
-- Dumping data for table `bugtype`
--

LOCK TABLES `bugtype` WRITE;
/*!40000 ALTER TABLE `bugtype` DISABLE KEYS */;
INSERT INTO `bugtype` VALUES (1,'','jfsl'),(2,'','severe'),(123,'','severs'),(678,'','jgjk'),(789,'','kgdsla');
/*!40000 ALTER TABLE `bugtype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
CREATE TABLE `employee` (
  `empCode` int(11) NOT NULL default '0',
  `empName` varchar(30) default NULL,
  `empEmail` varchar(40) default NULL,
  `empPassword` varchar(20) default NULL,
  `gender` varchar(10) default NULL,
  `DOB` varchar(20) default NULL,
  `mobileNo` bigint(20) default NULL,
  `Role` varchar(20) default NULL,
  PRIMARY KEY  (`empCode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
SET character_set_client = @saved_cs_client;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (118,'ravi','ravi@gmail.com','123','male','1990',9848022338,'ADMIN'),(567,'','nav@gmail.com','123','','14-08-1987',9848022338,'gghh'),(4567,'','nv@gmail.com','123','male','14-08-1987',9848022338,'tester');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `project`
--

DROP TABLE IF EXISTS `project`;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
CREATE TABLE `project` (
  `projectID` int(11) NOT NULL default '0',
  `projectName` varchar(30) default NULL,
  `SDate` varchar(30) default NULL,
  `EDate` varchar(30) default NULL,
  `projectDec` varchar(200) default NULL,
  PRIMARY KEY  (`projectID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
SET character_set_client = @saved_cs_client;

--
-- Dumping data for table `project`
--

LOCK TABLES `project` WRITE;
/*!40000 ALTER TABLE `project` DISABLE KEYS */;
INSERT INTO `project` VALUES (345,'','56-87-9088','34=3000-87','ev vehicle');
/*!40000 ALTER TABLE `project` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
CREATE TABLE `users` (
  `id` int(11) NOT NULL auto_increment,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `role` enum('EMPLOYEE','MANAGER','ADMIN') NOT NULL,
  PRIMARY KEY  (`id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
SET character_set_client = @saved_cs_client;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'ravi','123','ADMIN'),(2,'phani','234','MANAGER'),(3,'kumar','345','EMPLOYEE');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-06-27 14:03:03
