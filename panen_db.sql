-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 10, 2025 at 04:24 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `panen_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `sayuran`
--

CREATE TABLE `sayuran` (
  `id` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `berat` int(11) NOT NULL,
  `tanggalPanen` date NOT NULL,
  `grade` char(1) NOT NULL,
  `lokasiLahan` varchar(50) NOT NULL,
  `tambahan` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `sayuran`
--

INSERT INTO `sayuran` (`id`, `nama`, `berat`, `tanggalPanen`, `grade`, `lokasiLahan`, `tambahan`) VALUES
(1, 'Wortel', 10, '2025-10-01', 'A', 'Lahan Timur', 'Umbi'),
(2, 'Bayam', 5, '2025-10-02', 'B', 'Lahan Barat', 'Hijau Muda'),
(3, 'Kentang', 15, '2025-09-30', 'A', 'Lahan Tengah', 'Umbi'),
(4, 'Sawi', 7, '2025-10-03', 'C', 'Lahan Selatan', 'Hijau Tua');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `sayuran`
--
ALTER TABLE `sayuran`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `sayuran`
--
ALTER TABLE `sayuran`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
