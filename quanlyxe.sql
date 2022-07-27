-- phpMyAdmin SQL Dump
-- version 4.9.7
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1:3306
-- Thời gian đã tạo: Th12 13, 2021 lúc 06:49 PM
-- Phiên bản máy phục vụ: 5.7.36
-- Phiên bản PHP: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `quanlyxe`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hoadon`
--

DROP TABLE IF EXISTS `hoadon`;
CREATE TABLE IF NOT EXISTS `hoadon` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `hoTen` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `diaChi` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `sdt` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `tenXe` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `tenLoai` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `dungTich` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `xuatXu` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `gia` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `soLuong` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `thanhTien` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `hoadon`
--

INSERT INTO `hoadon` (`ID`, `hoTen`, `diaChi`, `sdt`, `tenXe`, `tenLoai`, `dungTich`, `xuatXu`, `gia`, `soLuong`, `thanhTien`) VALUES
(39, 'Ngoc Thach', 'Long An', '048764548', 'Mercedes-Benz GLC 300 4MATIC', 'Mercedes-Benz', '2.0 L', 'Duc', '2499000000', '3', '7497000000'),
(40, 'Han Phan', 'Da Nang', '0456789465', 'VinFast President', 'VINFAST', '85 L', 'Viet Nam', '4600000000', '1', '4600000000'),
(41, 'Nguoi Nao Do', 'Ha Noi', '0124645486', 'Ford Everest', 'Ford', '2.0 L', 'Hoa Ky', '1112000000', '5', '5560000000');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `loaixe`
--

DROP TABLE IF EXISTS `loaixe`;
CREATE TABLE IF NOT EXISTS `loaixe` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `maLoai` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `tenLoai` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `xuatXu` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `loaixe`
--

INSERT INTO `loaixe` (`ID`, `maLoai`, `tenLoai`, `xuatXu`) VALUES
(1, 'VF3575', 'VINFAST', 'Viet Nam'),
(2, 'MB5842', 'Mercedes-Benz', 'Duc'),
(3, 'F9565', 'Ford', 'Hoa Ky'),
(7, 'L4574', 'Lexus', 'Nhat Ban');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `admin` int(10) NOT NULL AUTO_INCREMENT,
  `userName` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `passWord` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`admin`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `user`
--

INSERT INTO `user` (`admin`, `userName`, `passWord`) VALUES
(10, 'hanphan', '111'),
(11, 'thachnguyen', '222'),
(12, 'test', '123');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `xe`
--

DROP TABLE IF EXISTS `xe`;
CREATE TABLE IF NOT EXISTS `xe` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `maXe` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `tenXe` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `tenLoai` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `xuatXu` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `dungTich` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `soLuong` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `gia` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `xe`
--

INSERT INTO `xe` (`ID`, `maXe`, `tenXe`, `tenLoai`, `xuatXu`, `dungTich`, `soLuong`, `gia`) VALUES
(1, 'X001', 'VinFast President', 'VINFAST', 'Viet Nam', '8.0 L', '26', '4600000000'),
(2, 'X002', 'Mercedes-Benz GLC 300 4MATIC', 'Mercedes-Benz', 'Duc', '2.0 L', '93', '2499000000'),
(3, 'X003', 'Ford Everest', 'Ford', 'Hoa Ky', '2.0 L', '0', '1112000000'),
(7, 'X004', 'LX570', 'Lexus', 'Nhat Ban', '5.0 L', '3', '8340000000');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
