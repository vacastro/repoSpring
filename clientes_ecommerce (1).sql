-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 04-03-2020 a las 19:56:49
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
  `id` int(11) NOT NULL,
  `producto_id` int(11) DEFAULT NULL,
  `usuario_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE `categoria` (
  `id` int(11) NOT NULL,
  `nombre` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`id`, `nombre`) VALUES
(1, 'Espejos'),
(2, 'Macetas'),
(3, 'Cuadros'),
(4, 'Almohadones'),
(5, 'CoffeTime');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes_ecommerce`
--

CREATE TABLE `clientes_ecommerce` (
  `id` int(11) NOT NULL,
  `contrasenia` varchar(30) DEFAULT NULL,
  `email` varchar(255) NOT NULL,
  `nombre` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

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
(1),
(1),
(1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `id` int(11) NOT NULL,
  `descripcion` varchar(255) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `precio` double NOT NULL,
  `stock_activo` bit(1) NOT NULL,
  `categoria_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`id`, `descripcion`, `nombre`, `precio`, `stock_activo`, `categoria_id`) VALUES
(1, 'Almohadon Winterfell y Almohadon King\'s Landing', 'Almohadon - GOT', 1200, b'1', 4),
(2, 'Maceta Aérea para pared con suculenta a elección', 'Maceta', 500, b'1', 2),
(3, 'Espejo Reliquias de la muerte - Harry Potter', 'Espejo', 1300, b'1', 1),
(4, 'Cuadro bastidor - Valar Morghulis - Valar Dohaeris', 'Cuadro - GOT', 1500, b'1', 3),
(5, 'Juego de tazas con individuales de madera', 'Tazas de Café', 3100, b'1', 5),
(6, 'Cuadro Estación 9 3-4 Harry Potter', 'Cuadro - HP', 1000, b'1', 3);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `carrito`
--
ALTER TABLE `carrito`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKg0fspf9ac00r9i2m9wgmy4914` (`producto_id`),
  ADD KEY `FK4dy7rgjpk9nb7wjj2odohg0wv` (`usuario_id`);

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
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKodqr7965ok9rwquj1utiamt0m` (`categoria_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `carrito`
--
ALTER TABLE `carrito`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `carrito`
--
ALTER TABLE `carrito`
  ADD CONSTRAINT `FK4dy7rgjpk9nb7wjj2odohg0wv` FOREIGN KEY (`usuario_id`) REFERENCES `clientes_ecommerce` (`id`),
  ADD CONSTRAINT `FKg0fspf9ac00r9i2m9wgmy4914` FOREIGN KEY (`producto_id`) REFERENCES `producto` (`id`);

--
-- Filtros para la tabla `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `FKodqr7965ok9rwquj1utiamt0m` FOREIGN KEY (`categoria_id`) REFERENCES `categoria` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
