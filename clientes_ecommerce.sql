-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-03-2020 a las 22:50:58
-- Versión del servidor: 10.4.8-MariaDB
-- Versión de PHP: 7.3.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `clientes_ecommerce`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `carrito`
--

CREATE TABLE `carrito` (
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE `categoria` (
  `id` int(11) NOT NULL,
  `nombre` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes_ecommerce`
--

CREATE TABLE `clientes_ecommerce` (
  `id` int(11) NOT NULL,
  `contrasenia` varchar(255) DEFAULT NULL,
  `email` varchar(255) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `clientes_ecommerce`
--

INSERT INTO `clientes_ecommerce` (`id`, `contrasenia`, `email`, `nombre`) VALUES
(12, '12345678', 'mariaf.arenas@hotmail.com', 'fer'),
(13, '1234555ed', 'ery_m87@hotmail.com', 'Eru'),
(14, 'abcd1122', 'ana@hotmail.com', 'ana laura'),
(16, 'fafa2525', 'fer@gmail.com', 'fer'),
(18, 'titi2525', 'mfa@eru.com', 'Eru');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(34),
(34),
(34);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `id` int(11) NOT NULL,
  `descripcion` varchar(255) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `precio` double NOT NULL,
  `stock_activo` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`id`, `descripcion`, `nombre`, `precio`, `stock_activo`) VALUES
(19, 'Escandinava', 'silla', 1200, b'1'),
(20, 'verde', 'mesa', 5000, b'1'),
(21, 'Harry Potter - Reliquia', 'espejo', 1300, b'1'),
(22, 'Juego de sillas', 'silla', 3500, b'1'),
(23, 'Escandinava', 'silla', 3100, b'1'),
(24, 'Escandinava', 'silla', 3100, b'1'),
(25, 'Romana', 'silla', 3100, b'0'),
(26, 'Roble', 'silla', 1200, b'0'),
(27, 'Aéreas', 'Maceta', 800, b'1'),
(28, 'Cerámica', 'Maceta', 600, b'0'),
(29, 'Plástico', 'Maceta', 500, b'0'),
(30, 'Plástico', 'Maceta', 500, b'0'),
(31, 'GOT', 'Almohadon', 400, b'1'),
(32, 'Maceta de piedra', 'Maceta', 800, b'0'),
(33, 'GOT', 'Silla', 1600, b'0');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `carrito`
--
ALTER TABLE `carrito`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `clientes_ecommerce`
--
ALTER TABLE `clientes_ecommerce`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_iar9h7ak7ke5vfrmql6a9i6gb` (`email`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `carrito`
--
ALTER TABLE `carrito`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
