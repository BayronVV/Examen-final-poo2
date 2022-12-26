-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 26-12-2022 a las 17:50:59
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `museos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `Cedula` int(20) NOT NULL,
  `Nombre` varchar(20) COLLATE utf8_bin NOT NULL,
  `Apellido` varchar(20) COLLATE utf8_bin NOT NULL,
  `Genero` varchar(20) COLLATE utf8_bin NOT NULL,
  `Profesion` varchar(20) COLLATE utf8_bin NOT NULL,
  `Ciudad` varchar(20) COLLATE utf8_bin NOT NULL,
  `Museo` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`Cedula`, `Nombre`, `Apellido`, `Genero`, `Profesion`, `Ciudad`, `Museo`) VALUES
(2222, 'hernando', 'zuluaga', 'masc', 'ing sist', 'bogota', 2),
(1005029200, 'Bayron', 'Vargas', 'Bayron', 'Bayron', 'Bayron', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `museo`
--

CREATE TABLE `museo` (
  `Codigo` int(20) NOT NULL,
  `Nombre` varchar(20) COLLATE utf8_bin NOT NULL,
  `Municipio` varchar(20) COLLATE utf8_bin NOT NULL,
  `Departamento` varchar(20) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `museo`
--

INSERT INTO `museo` (`Codigo`, `Nombre`, `Municipio`, `Departamento`) VALUES
(1, 'Museo Rafael Nuñez', 'Cartagena', 'Bolivar'),
(2, 'La gran Convencion', 'Ocaña', 'Norte de Santander'),
(3, 'Anton Garcia', 'Ocaña', 'Norte deSantander'),
(4, 'Casa natal Gnral San', 'Villa del Rosario', 'Norte de Santander');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`Cedula`),
  ADD KEY `Museo` (`Museo`);

--
-- Indices de la tabla `museo`
--
ALTER TABLE `museo`
  ADD PRIMARY KEY (`Codigo`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD CONSTRAINT `cliente_ibfk_1` FOREIGN KEY (`Museo`) REFERENCES `museo` (`Codigo`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
