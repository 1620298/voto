-- phpMyAdmin SQL Dump
-- version 4.8.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 04-10-2019 a las 03:18:59
-- Versión del servidor: 10.1.34-MariaDB
-- Versión de PHP: 7.2.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `votacion`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `id_per` int(8) NOT NULL,
  `dni` int(8) NOT NULL,
  `password` varchar(50) NOT NULL,
  `nombres` varchar(100) NOT NULL,
  `apellidos` varchar(100) NOT NULL,
  `ubigeo` int(8) NOT NULL,
  `direccion` varchar(100) NOT NULL,
  `sexo` int(1) NOT NULL,
  `estado_civil` int(1) NOT NULL,
  `fecha_caducidad` date NOT NULL,
  `foto` varchar(50) NOT NULL,
  `firma` varchar(50) NOT NULL,
  `huella_digital` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`id_per`, `dni`, `password`, `nombres`, `apellidos`, `ubigeo`, `direccion`, `sexo`, `estado_civil`, `fecha_caducidad`, `foto`, `firma`, `huella_digital`) VALUES
(1, 71978865, '123', 'gianpiero', 'montemayor', 12345678, 'arequipa', 1, 1, '2021-01-20', 'foto', 'firma', 'huella');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
