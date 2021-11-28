-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 28, 2021 at 09:10 AM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `studentmanagement`
--

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('admin', '123@123');

-- --------------------------------------------------------

--
-- Table structure for table `professor`
--

CREATE TABLE `professor` (
  `proId` int(15) NOT NULL,
  `proName` varchar(50) NOT NULL,
  `proGender` varchar(50) NOT NULL,
  `proDob` varchar(50) NOT NULL,
  `proAddress` varchar(200) NOT NULL,
  `proPhone` int(11) NOT NULL,
  `proDepartment` varchar(50) NOT NULL,
  `proSalary` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `professor`
--

INSERT INTO `professor` (`proId`, `proName`, `proGender`, `proDob`, `proAddress`, `proPhone`, `proDepartment`, `proSalary`) VALUES
(1, 'Tran Linh', 'Female', '11/01/1989', 'nb', 5487965, 'IT', 40000000),
(3, 'Linh', 'Male', '11/11/1988', 'ha noi', 154885, 'Buseness', 145876);

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `stuId` int(15) NOT NULL,
  `stuName` varchar(50) NOT NULL,
  `stuGender` varchar(50) NOT NULL,
  `stuDob` varchar(50) NOT NULL,
  `stuAddress` varchar(200) NOT NULL,
  `stuPhone` int(11) NOT NULL,
  `stuDepartment` varchar(200) NOT NULL,
  `stuGpa` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`stuId`, `stuName`, `stuGender`, `stuDob`, `stuAddress`, `stuPhone`, `stuDepartment`, `stuGpa`) VALUES
(1, 'Tran Linh', 'female', '24/06/1999', 'ninh binh', 845687, 'Information Technology', 4);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `professor`
--
ALTER TABLE `professor`
  ADD PRIMARY KEY (`proId`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`stuId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `professor`
--
ALTER TABLE `professor`
  MODIFY `proId` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
  MODIFY `stuId` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
