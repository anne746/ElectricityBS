-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 04, 2025 at 08:27 AM
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
-- Database: `sasuman_ebs`
--

-- --------------------------------------------------------

--
-- Table structure for table `logs`
--

CREATE TABLE `logs` (
  `logID` int(11) NOT NULL,
  `userID` int(11) NOT NULL,
  `action` varchar(255) NOT NULL,
  `date_time` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `logs`
--

INSERT INTO `logs` (`logID`, `userID`, `action`, `date_time`) VALUES
(4, 9, 'User logged in', '2025-04-30 15:56:44'),
(5, 8, 'User logged in', '2025-04-30 15:56:57'),
(6, 8, 'User logged in', '2025-04-30 16:01:19'),
(7, 8, 'User logged in', '2025-04-30 16:01:30'),
(8, 8, 'User logged in', '2025-04-30 16:02:19'),
(10, 9, 'User logged in', '2025-04-30 16:05:40'),
(11, 8, 'User logged in', '2025-04-30 16:05:46'),
(12, 8, 'User logged in', '2025-05-01 05:48:03'),
(13, 8, 'User logged in', '2025-05-01 05:50:03'),
(14, 8, 'User logged in', '2025-05-01 06:21:43'),
(15, 8, 'User logged in', '2025-05-01 06:21:56'),
(16, 8, 'User logged in', '2025-05-01 06:23:42'),
(17, 8, 'User logged in', '2025-05-01 06:30:10'),
(18, 8, 'User logged in', '2025-05-01 06:30:18'),
(19, 8, 'Admin Logged Out.', '2025-05-01 06:30:20'),
(20, 8, 'User logged in', '2025-05-01 06:30:23'),
(21, 8, 'User logged in', '2025-05-01 06:30:30'),
(22, 8, 'User logged in', '2025-05-01 06:30:41'),
(23, 9, 'User logged in', '2025-05-01 06:30:52'),
(24, 8, 'User logged in', '2025-05-01 06:30:58'),
(25, 8, 'Admin Logged Out.', '2025-05-01 06:30:59'),
(26, 9, 'User logged in', '2025-05-01 06:31:44'),
(27, 8, 'User logged in', '2025-05-01 06:31:54'),
(28, 9, 'User logged in', '2025-05-01 06:32:47'),
(29, 8, 'User logged in', '2025-05-01 06:33:13'),
(30, 9, 'User logged in', '2025-05-01 06:36:00'),
(31, 9, 'User logged out', '2025-05-01 06:36:01'),
(32, 8, 'User logged in', '2025-05-01 06:36:08'),
(33, 8, 'Admin logged in', '2025-05-01 06:36:51'),
(34, 9, 'User logged in', '2025-05-01 07:06:00'),
(35, 9, 'User logged in', '2025-05-01 07:08:35'),
(36, 9, 'User logged in', '2025-05-01 07:12:30'),
(37, 9, 'User logged in', '2025-05-01 07:37:20'),
(38, 9, 'User logged in', '2025-05-01 07:38:07'),
(39, 9, 'User logged in', '2025-05-01 07:41:44'),
(40, 9, 'User logged in', '2025-05-01 07:44:08'),
(41, 9, 'User logged in', '2025-05-01 07:45:10'),
(42, 9, 'User logged in', '2025-05-01 07:46:40'),
(43, 9, 'User logged in', '2025-05-01 10:34:20'),
(44, 9, 'User logged in', '2025-05-01 10:35:01'),
(45, 9, 'User logged in', '2025-05-01 10:41:42'),
(46, 9, 'User logged in', '2025-05-01 10:43:14'),
(47, 9, 'User logged in', '2025-05-01 11:21:18'),
(48, 9, 'User logged in', '2025-05-01 11:21:46'),
(49, 9, 'User logged in', '2025-05-01 11:33:56'),
(50, 9, 'User logged in', '2025-05-01 11:36:26'),
(51, 9, 'User logged in', '2025-05-01 11:37:59'),
(52, 9, 'User logged in', '2025-05-01 11:39:46'),
(53, 9, 'User logged in', '2025-05-01 11:41:04'),
(54, 9, 'User logged in', '2025-05-01 11:46:03'),
(55, 8, 'Admin logged in', '2025-05-01 12:04:22'),
(56, 9, 'User logged in', '2025-05-01 12:05:58'),
(57, 9, 'User logged in', '2025-05-01 12:06:56'),
(58, 9, 'User logged in', '2025-05-01 12:11:07'),
(59, 9, 'User logged in', '2025-05-01 12:13:31'),
(60, 8, 'Admin logged in', '2025-05-01 12:19:12'),
(61, 8, 'Admin Logged Out.', '2025-05-01 12:19:16'),
(63, 8, 'Admin logged in', '2025-05-01 13:09:12'),
(64, 8, 'Admin logged in', '2025-05-01 13:09:51'),
(65, 8, 'Admin logged in', '2025-05-01 13:10:57'),
(66, 8, 'Admin logged in', '2025-05-01 13:11:47'),
(67, 8, 'Admin logged in', '2025-05-01 13:15:14'),
(68, 8, 'Admin logged in', '2025-05-01 13:18:12'),
(69, 8, 'Admin logged in', '2025-05-01 13:19:51'),
(70, 8, 'Admin logged in', '2025-05-01 13:20:22'),
(71, 8, 'Admin logged in', '2025-05-01 13:20:52'),
(72, 8, 'Admin logged in', '2025-05-01 13:22:37'),
(73, 8, 'Admin Logged Out.', '2025-05-01 13:22:51'),
(74, 9, 'User logged in', '2025-05-01 13:22:55'),
(75, 9, 'User logged in', '2025-05-01 13:27:26'),
(76, 9, 'User logged in', '2025-05-01 13:30:00'),
(77, 9, 'User logged in', '2025-05-01 13:33:49'),
(78, 9, 'User logged in', '2025-05-01 13:39:02'),
(79, 9, 'User logged in', '2025-05-01 13:44:16'),
(80, 9, 'User logged in', '2025-05-01 13:52:31'),
(81, 9, 'User logged in', '2025-05-01 13:53:45'),
(82, 9, 'User logged in', '2025-05-01 13:57:32'),
(83, 9, 'User logged in', '2025-05-01 14:02:12'),
(84, 9, 'User logged in', '2025-05-01 14:03:16'),
(85, 9, 'User logged in', '2025-05-01 14:06:33'),
(86, 9, 'User logged in', '2025-05-01 14:07:01'),
(87, 9, 'User logged in', '2025-05-01 14:07:32'),
(88, 9, 'User logged in', '2025-05-01 14:11:55'),
(89, 9, 'User logged in', '2025-05-01 14:12:20'),
(90, 9, 'User logged in', '2025-05-01 14:12:46'),
(91, 9, 'User logged in', '2025-05-01 14:21:18'),
(92, 9, 'User logged in', '2025-05-01 14:21:45'),
(93, 9, 'User logged in', '2025-05-01 14:54:37'),
(94, 9, 'User logged in', '2025-05-01 14:55:15'),
(95, 9, 'User logged in', '2025-05-01 14:56:37'),
(96, 9, 'User logged in', '2025-05-01 14:57:10'),
(97, 9, 'User logged in', '2025-05-01 14:58:50'),
(98, 9, 'User logged in', '2025-05-01 15:06:57'),
(99, 9, 'User logged in', '2025-05-01 15:08:57'),
(100, 9, 'User logged in', '2025-05-01 15:09:19'),
(101, 9, 'User logged in', '2025-05-01 15:23:00'),
(102, 9, 'User logged in', '2025-05-01 15:26:41'),
(103, 9, 'User logged in', '2025-05-01 15:27:19'),
(104, 9, 'User logged in', '2025-05-01 15:33:55'),
(105, 9, 'User logged in', '2025-05-01 15:35:13'),
(106, 9, 'User logged in', '2025-05-01 15:38:04'),
(107, 9, 'User logged in', '2025-05-02 07:20:24'),
(108, 9, 'User logged in', '2025-05-02 07:21:31'),
(109, 8, 'Admin logged in', '2025-05-02 07:22:05'),
(110, 8, 'Admin logged in', '2025-05-02 07:23:03'),
(111, 8, 'Admin logged in', '2025-05-02 07:23:58'),
(112, 8, 'Admin logged in', '2025-05-02 07:24:28'),
(113, 8, 'Admin logged in', '2025-05-02 07:41:34'),
(114, 8, 'Admin logged in', '2025-05-02 07:43:58'),
(115, 8, 'Admin logged in', '2025-05-02 07:44:46'),
(116, 9, 'User logged in', '2025-05-02 07:45:37'),
(117, 9, 'User logged in', '2025-05-02 07:48:32'),
(118, 9, 'User logged in', '2025-05-02 07:49:21'),
(119, 8, 'Admin logged in', '2025-05-02 07:50:00'),
(120, 8, 'Admin Logged Out.', '2025-05-02 07:50:37'),
(121, 9, 'User logged in', '2025-05-02 07:50:45'),
(122, 8, 'Admin logged in', '2025-05-02 08:02:00'),
(123, 8, 'Admin logged in', '2025-05-02 08:03:57'),
(124, 8, 'Admin logged in', '2025-05-02 08:08:10'),
(125, 9, 'User logged in', '2025-05-02 08:09:31'),
(126, 9, 'User logged in', '2025-05-02 08:11:25'),
(127, 9, 'User logged in', '2025-05-02 13:22:22'),
(128, 9, 'User logged in', '2025-05-02 13:24:18'),
(129, 8, 'Admin logged in', '2025-05-02 13:27:50'),
(130, 8, 'Admin Logged Out.', '2025-05-02 13:28:27'),
(131, 9, 'User logged in', '2025-05-02 13:28:33'),
(132, 9, 'User logged in', '2025-05-02 13:29:58'),
(133, 9, 'User logged in', '2025-05-02 13:31:04'),
(134, 9, 'User logged in', '2025-05-02 13:52:41'),
(135, 8, 'Admin logged in', '2025-05-02 13:53:43'),
(136, 8, 'Admin logged in', '2025-05-02 13:54:23'),
(137, 8, 'Admin logged in', '2025-05-02 13:54:56'),
(138, 8, 'Admin logged in', '2025-05-02 13:58:46'),
(139, 8, 'Admin logged in', '2025-05-02 14:03:22'),
(140, 8, 'Admin logged in', '2025-05-02 14:05:00'),
(141, 8, 'Admin logged in', '2025-05-02 14:05:56'),
(142, 8, 'Admin logged in', '2025-05-02 14:06:46'),
(143, 8, 'Admin logged in', '2025-05-02 14:12:35'),
(144, 8, 'Admin logged in', '2025-05-02 14:15:15'),
(145, 8, 'Admin logged in', '2025-05-02 14:19:04'),
(146, 8, 'Admin logged in', '2025-05-02 14:21:45'),
(147, 8, 'Admin logged in', '2025-05-02 14:22:45'),
(148, 9, 'User logged in', '2025-05-02 14:25:43'),
(149, 8, 'Admin logged in', '2025-05-03 00:59:41'),
(150, 8, 'Admin Logged Out.', '2025-05-03 00:59:49'),
(151, 13, 'User logged in', '2025-05-03 00:59:55'),
(152, 13, 'User logged in', '2025-05-03 01:02:55'),
(153, 9, 'User logged in', '2025-05-03 01:15:23'),
(154, 9, 'User logged in', '2025-05-03 01:24:04'),
(155, 8, 'Admin logged in', '2025-05-04 06:21:41'),
(156, 8, 'Admin Logged Out.', '2025-05-04 06:21:45');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_bill`
--

CREATE TABLE `tbl_bill` (
  `b_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `bill_month` varchar(50) NOT NULL,
  `rate_perkWh` decimal(10,2) NOT NULL DEFAULT 13.00,
  `kwh_used` int(11) NOT NULL,
  `amount_due` decimal(10,2) NOT NULL,
  `due_date` date NOT NULL,
  `status` enum('Pending','Paid') DEFAULT 'Pending'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_bill`
--

INSERT INTO `tbl_bill` (`b_id`, `user_id`, `bill_month`, `rate_perkWh`, `kwh_used`, `amount_due`, `due_date`, `status`) VALUES
(1, 9, 'January', 13.00, 24, 252.00, '2025-02-02', 'Paid'),
(2, 9, 'February', 13.00, 1000, 10500.00, '2025-03-04', 'Paid'),
(3, 9, 'March', 13.00, 100, 1050.00, '2025-04-05', 'Paid'),
(4, 9, 'January', 13.00, 500, 5250.00, '2025-02-03', 'Pending'),
(5, 9, 'January', 13.00, 1, 0.00, '2025-02-05', 'Pending'),
(6, 9, 'January', 13.00, 13, 0.00, '2025-02-03', 'Pending'),
(7, 9, 'April', 13.00, 10, 0.00, '2025-05-05', 'Pending'),
(8, 9, 'February', 13.00, 9, 0.00, '2025-03-03', 'Pending'),
(9, 9, 'March', 13.00, 9, 117.00, '2025-04-03', 'Pending');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_payment`
--

CREATE TABLE `tbl_payment` (
  `payment_id` int(11) NOT NULL,
  `bill_id` int(11) NOT NULL,
  `amount_paid` decimal(10,2) NOT NULL,
  `payment_date` date NOT NULL,
  `payment_method` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_payment`
--

INSERT INTO `tbl_payment` (`payment_id`, `bill_id`, `amount_paid`, `payment_date`, `payment_method`) VALUES
(1, 2, 10500.00, '2025-05-02', 'Gcash'),
(2, 1, 252.00, '2025-05-02', 'Gcash'),
(3, 3, 1050.00, '2025-05-02', 'Gcash');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `firstname` varchar(255) NOT NULL,
  `lastname` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `account_number` varchar(255) DEFAULT NULL,
  `role` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `status` varchar(50) DEFAULT NULL,
  `image` text NOT NULL,
  `recovery_phrase` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `firstname`, `lastname`, `address`, `username`, `email`, `account_number`, `role`, `password`, `status`, `image`, `recovery_phrase`) VALUES
(8, 'admin', 'admin', 'North Korea', 'admin', 'admin@gmail.com', '90001', 'Admin', 'JAvlGPq9JyTdtvBO6x2llnRI1+gxwIyPqCKAn3THIKk=', 'Active', '', 'IqfW+BJkfGDVQmptt+Z5AxBDKWzzjeGjQuaZmmx0rRk='),
(9, 'user', 'user', 'North Korea', 'user', 'user@gmail.com', '90002', 'User', '14XWNRGmRaJIdaEJ4O8dplYN2U0Um2c0lJqWVWyzRJ8=', 'Active', 'src/images/logor.png', 'IqfW+BJkfGDVQmptt+Z5AxBDKWzzjeGjQuaZmmx0rRk='),
(11, 'Hatsune', 'Miku', 'Naga', 'miku', 'hatsune', '90004', 'User', 'gxwjeSjmISvtqkRRpRSs4xdFYvZ2H2oVei/lCCs24vs=', 'Active', 'src/images/logor.png', 'IqfW+BJkfGDVQmptt+Z5AxBDKWzzjeGjQuaZmmx0rRk='),
(12, 'Windows', '10', 'Microsoft', 'win10', 'windows@gmail.com', '1234567890', 'User', 'sVLY2+kTYBdEY2gDPuXxfnvvIEvDOHucJDC3HxBOheA=', 'Active', 'src/images/logor.png', 'IqfW+BJkfGDVQmptt+Z5AxBDKWzzjeGjQuaZmmx0rRk='),
(13, 'Windows', 'Server', 'Microsoft', 'server', 'server@gmail.com', '12345678901', 'User', 'FL8HXJBGCr+ZLt7V6Adm3EdCKezDOnK2PmhEzOSl8yw=', 'Active', 'src/images/logor.png', 'IqfW+BJkfGDVQmptt+Z5AxBDKWzzjeGjQuaZmmx0rRk='),
(14, 'qweqwe', 'qweqw', 'eqweq', 'qweqwe', 'weqweqwe@gmail.com', '12345678902', 'User', 'yf6FTqafwKJSNA4VKGS1ObEWw2zxrEGWUuGCbDBx1e0=', 'Pending', 'src/images/logor.png', 'IqfW+BJkfGDVQmptt+Z5AxBDKWzzjeGjQuaZmmx0rRk='),
(15, 'qweqwe', 'qweqweq', 'weqeqwe', 'qweqw', 'qweqwe@gmail.com', '1234567891', 'User', 'yf6FTqafwKJSNA4VKGS1ObEWw2zxrEGWUuGCbDBx1e0=', 'Pending', 'src/images/logor.png', 'IqfW+BJkfGDVQmptt+Z5AxBDKWzzjeGjQuaZmmx0rRk='),
(16, 'Hello', 'World', 'Earth', 'hello', 'hello@gmail.com', '9876543561', 'User', 'iafm6rvEyUdyd+ybJGxkF9w1LmlBi/PvTXXpwZu77dY=', 'Active', 'src/images/logor.png', 'IqfW+BJkfGDVQmptt+Z5AxBDKWzzjeGjQuaZmmx0rRk=');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `logs`
--
ALTER TABLE `logs`
  ADD PRIMARY KEY (`logID`),
  ADD KEY `userID` (`userID`);

--
-- Indexes for table `tbl_bill`
--
ALTER TABLE `tbl_bill`
  ADD PRIMARY KEY (`b_id`),
  ADD KEY `user_id` (`user_id`);

--
-- Indexes for table `tbl_payment`
--
ALTER TABLE `tbl_payment`
  ADD PRIMARY KEY (`payment_id`),
  ADD KEY `bill_id` (`bill_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `logs`
--
ALTER TABLE `logs`
  MODIFY `logID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=157;

--
-- AUTO_INCREMENT for table `tbl_bill`
--
ALTER TABLE `tbl_bill`
  MODIFY `b_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `tbl_payment`
--
ALTER TABLE `tbl_payment`
  MODIFY `payment_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `logs`
--
ALTER TABLE `logs`
  ADD CONSTRAINT `logs_ibfk_1` FOREIGN KEY (`userID`) REFERENCES `users` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `tbl_bill`
--
ALTER TABLE `tbl_bill`
  ADD CONSTRAINT `tbl_bill_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);

--
-- Constraints for table `tbl_payment`
--
ALTER TABLE `tbl_payment`
  ADD CONSTRAINT `tbl_payment_ibfk_1` FOREIGN KEY (`bill_id`) REFERENCES `tbl_bill` (`b_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
