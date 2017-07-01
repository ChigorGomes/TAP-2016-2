-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.7.14-log


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema clinica
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ clinica;
USE clinica;

--
-- Table structure for table `clinica`.`agendamento`
--

DROP TABLE IF EXISTS `agendamento`;
CREATE TABLE `agendamento` (
  `IDAGENDAMENTO` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `IDMEDICO` int(10) unsigned NOT NULL DEFAULT '0',
  `IDPACIENTE` int(10) unsigned NOT NULL DEFAULT '0',
  `DATACONSULTA` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `HORARIO` varchar(45) NOT NULL DEFAULT '',
  `STATUSS` varchar(45) NOT NULL DEFAULT '',
  `OBSERVACOES` varchar(500) NOT NULL DEFAULT '',
  PRIMARY KEY (`IDAGENDAMENTO`),
  KEY `FK_consulta_medico_idx` (`IDMEDICO`),
  KEY `FK_consulta_paciente_idx` (`IDPACIENTE`),
  CONSTRAINT `FK_consulta_medico` FOREIGN KEY (`IDMEDICO`) REFERENCES `medico` (`IDMEDICO`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_consulta_paciente` FOREIGN KEY (`IDPACIENTE`) REFERENCES `paciente` (`IDPACIENTE`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=69 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `clinica`.`agendamento`
--

/*!40000 ALTER TABLE `agendamento` DISABLE KEYS */;
INSERT INTO `agendamento` (`IDAGENDAMENTO`,`IDMEDICO`,`IDPACIENTE`,`DATACONSULTA`,`HORARIO`,`STATUSS`,`OBSERVACOES`) VALUES 
 (67,56,19,'2017-01-04 00:00:00','14:00','Aberto','dor de barriga'),
 (68,57,18,'2017-01-04 00:00:00','15:00','Aberto','dor de dente');
/*!40000 ALTER TABLE `agendamento` ENABLE KEYS */;


--
-- Table structure for table `clinica`.`horarioconsulta`
--

DROP TABLE IF EXISTS `horarioconsulta`;
CREATE TABLE `horarioconsulta` (
  `IDHORARIOC` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `HORA` varchar(20) NOT NULL DEFAULT '0000-00-00 00:00:00',
  `IDCONSULTA` int(10) unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`IDHORARIOC`),
  KEY `fk_horario_consulta_idx` (`IDCONSULTA`),
  CONSTRAINT `FK_horario_medico` FOREIGN KEY (`IDCONSULTA`) REFERENCES `medico` (`IDMEDICO`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `clinica`.`horarioconsulta`
--

/*!40000 ALTER TABLE `horarioconsulta` DISABLE KEYS */;
INSERT INTO `horarioconsulta` (`IDHORARIOC`,`HORA`,`IDCONSULTA`) VALUES 
 (15,'14:00',56),
 (16,'14:30',56),
 (17,'15:00',56),
 (18,'15:30',56),
 (19,'16:00',56),
 (20,'16:30',56),
 (21,'17:00',56),
 (22,'14:00',57),
 (23,'14:30',57),
 (24,'15:00',57),
 (25,'15:30',57),
 (26,'16:00',57),
 (27,'16:30',57),
 (28,'17:00',57);
/*!40000 ALTER TABLE `horarioconsulta` ENABLE KEYS */;


--
-- Table structure for table `clinica`.`medico`
--

DROP TABLE IF EXISTS `medico`;
CREATE TABLE `medico` (
  `IDMEDICO` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `NOMEMEDICO` varchar(70) NOT NULL DEFAULT '',
  `RG` varchar(25) NOT NULL DEFAULT '0',
  `CPF` varchar(25) NOT NULL DEFAULT '0',
  `ESPECIALIDADE` varchar(100) NOT NULL DEFAULT '',
  `CRM` varchar(20) NOT NULL DEFAULT '',
  `EMAIL` varchar(100) NOT NULL DEFAULT '',
  `TELEFONE` varchar(20) NOT NULL DEFAULT '0',
  `CELULAR` varchar(20) NOT NULL DEFAULT '0',
  `CODLAUDO` int(11) DEFAULT NULL,
  PRIMARY KEY (`IDMEDICO`)
) ENGINE=InnoDB AUTO_INCREMENT=58 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `clinica`.`medico`
--

/*!40000 ALTER TABLE `medico` DISABLE KEYS */;
INSERT INTO `medico` (`IDMEDICO`,`NOMEMEDICO`,`RG`,`CPF`,`ESPECIALIDADE`,`CRM`,`EMAIL`,`TELEFONE`,`CELULAR`,`CODLAUDO`) VALUES 
 (56,'Fulano de tal','9898989-8','842.948.928-94','Cardiologia','3938193819-8','fulanodetal@gmail.com','7878-7878','87787-8787',NULL),
 (57,'Joao dos Santos','0909090-9','909.090.909-09','Urulogia','4881948108-4','joao@gmail.com','8989-8989','89898-9898',NULL);
/*!40000 ALTER TABLE `medico` ENABLE KEYS */;


--
-- Table structure for table `clinica`.`paciente`
--

DROP TABLE IF EXISTS `paciente`;
CREATE TABLE `paciente` (
  `IDPACIENTE` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `NOMEPAC` varchar(70) NOT NULL DEFAULT '',
  `RG` varchar(20) NOT NULL DEFAULT '0',
  `CPF` varchar(20) NOT NULL DEFAULT '0',
  `EMAIL` varchar(100) NOT NULL DEFAULT '',
  `TELEFONE` varchar(20) NOT NULL DEFAULT '0',
  `CELULAR` varchar(20) NOT NULL DEFAULT '0',
  `ENDERECO` varchar(100) NOT NULL DEFAULT '',
  `CEP` varchar(50) NOT NULL DEFAULT '',
  `NASCIMENTO` date NOT NULL DEFAULT '0000-00-00',
  PRIMARY KEY (`IDPACIENTE`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `clinica`.`paciente`
--

/*!40000 ALTER TABLE `paciente` DISABLE KEYS */;
INSERT INTO `paciente` (`IDPACIENTE`,`NOMEPAC`,`RG`,`CPF`,`EMAIL`,`TELEFONE`,`CELULAR`,`ENDERECO`,`CEP`,`NASCIMENTO`) VALUES 
 (18,'Maria dos Santos','3989898-9','898.989.890-89','maria@gmail.com','9089-0890','89890-8908','rua j',' 89890-890','1971-01-04'),
 (19,'Pedro dos Santos','9090909-0','909.090.909-09','pedro@gmail.com','0909-0909','09090-9090','rua k',' 09090-909','1999-01-04');
/*!40000 ALTER TABLE `paciente` ENABLE KEYS */;


--
-- Table structure for table `clinica`.`prontuario`
--

DROP TABLE IF EXISTS `prontuario`;
CREATE TABLE `prontuario` (
  `IDPRONTUARIO` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `MEDICAMENTO` varchar(50) NOT NULL DEFAULT '',
  `RESULTADO` varchar(500) NOT NULL DEFAULT '',
  `POSOLOGIA` varchar(50) NOT NULL DEFAULT '',
  `IDCONSULTA` int(10) unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`IDPRONTUARIO`),
  KEY `FK_pront_agenda_idx` (`IDCONSULTA`),
  CONSTRAINT `FK_pront_agenda` FOREIGN KEY (`IDCONSULTA`) REFERENCES `agendamento` (`IDAGENDAMENTO`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `clinica`.`prontuario`
--

/*!40000 ALTER TABLE `prontuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `prontuario` ENABLE KEYS */;


--
-- Table structure for table `clinica`.`usuario`
--

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE `usuario` (
  `IDUSUARIO` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `NOME` varchar(50) NOT NULL DEFAULT '',
  `USUARIO` varchar(20) NOT NULL DEFAULT '',
  `SENHA` varchar(20) NOT NULL DEFAULT '0',
  `TIPOUSUARIO` varchar(50) NOT NULL DEFAULT '',
  PRIMARY KEY (`IDUSUARIO`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `clinica`.`usuario`
--

/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` (`IDUSUARIO`,`NOME`,`USUARIO`,`SENHA`,`TIPOUSUARIO`) VALUES 
 (31,' Cicero Higor Gomes de Sousa','medico','123','Medico'),
 (32,' Cicero Higor Gomes de Sousa','atendente','123','Atendente'),
 (33,' Cícero Higor Gomes de Sousa','administrador','123','Administrador');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
