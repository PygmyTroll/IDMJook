-- phpMyAdmin SQL Dump
-- version 4.0.6
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Oct 21, 2014 at 08:46 PM
-- Server version: 5.5.33
-- PHP Version: 5.5.3
--
-- Database: `BASE_IDM`
--

-- --------------------------------------------------------

--
-- Table structure for table `Etudiant`
--

CREATE TABLE `Etudiant` (
  `ID_ETU` int(100) NOT NULL,
  `ID_FORMA` int(100) NOT NULL,
  `NOM_ETU` varchar(100) NOT NULL,
  `PRENOM_ETU` varchar(100) NOT NULL
)

--
-- Dumping data for table `Etudiant`
--

INSERT INTO `Etudiant` (`ID_ETU`, `ID_FORMA`, `NOM_ETU`, `PRENOM_ETU`) VALUES
(1, 1, 'Alexandre', 'Geoffrey'),
(2, 2, 'Jean', 'Martin');

-- --------------------------------------------------------

--
-- Table structure for table `Formation`
--

CREATE TABLE `Formation` (
  `ID_FORMATION` int(100) NOT NULL,
  `ID_UNI` int(100) NOT NULL,
  `NOM_FORMA` varchar(100) NOT NULL
)

--
-- Dumping data for table `Formation`
--

INSERT INTO `Formation` (`ID_FORMATION`, `ID_UNI`, `NOM_FORMA`) VALUES
(1, 1, 'MIAGE de Rennes'),
(2, 2, 'MIAGE de Nantes');

-- --------------------------------------------------------

--
-- Table structure for table `Universite`
--

CREATE TABLE `Universite` (
  `ID_UNIV` int(10) NOT NULL,
  `NOM_UNIV` varchar(100) NOT NULL
)

--
-- Dumping data for table `Universite`
--

INSERT INTO `Universite` (`ID_UNIV`, `NOM_UNIV`) VALUES
(1, 'Université de Rennes'),
(2, 'Université de Nantes');
