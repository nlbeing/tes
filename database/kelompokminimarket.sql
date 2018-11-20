-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 20 Nov 2018 pada 09.20
-- Versi Server: 5.6.20
-- PHP Version: 5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `kelompokminimarket`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `barang_barang`
--

CREATE TABLE IF NOT EXISTS `barang_barang` (
  `kodebarang` varchar(10) NOT NULL,
  `namabarang` varchar(35) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `harga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `barang_barang`
--

INSERT INTO `barang_barang` (`kodebarang`, `namabarang`, `jumlah`, `harga`) VALUES
('GSF23JK665', 'Kirham Obat Nyamuk', 87, 12000),
('JSK201010R', 'Dishamun DX 77', 23, 50000),
('KF5677GR32', 'Jahannam Mobile Suit', 12, 120000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `kasir`
--

CREATE TABLE IF NOT EXISTS `kasir` (
  `id_pegawai` varchar(10) NOT NULL,
  `Nama` varchar(30) NOT NULL,
  `Umur` int(3) NOT NULL,
  `Password` varchar(15) NOT NULL,
  `id_manager` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `kasir`
--

INSERT INTO `kasir` (`id_pegawai`, `Nama`, `Umur`, `Password`, `id_manager`) VALUES
('KSR-00-001', 'Ahmidun', 22, 'qwerty', 'MNG-00-001');

-- --------------------------------------------------------

--
-- Struktur dari tabel `manager`
--

CREATE TABLE IF NOT EXISTS `manager` (
  `id_pegawai` varchar(10) NOT NULL,
  `Nama` varchar(30) NOT NULL,
  `Umur` int(3) NOT NULL,
  `Password` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `manager`
--

INSERT INTO `manager` (`id_pegawai`, `Nama`, `Umur`, `Password`) VALUES
('MNG-00-001', 'Izmudin', 76, 'asdfghjkl');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pembeli`
--

CREATE TABLE IF NOT EXISTS `pembeli` (
  `No_Pengunjung` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pembeli`
--

INSERT INTO `pembeli` (`No_Pengunjung`) VALUES
(1),
(2);

-- --------------------------------------------------------

--
-- Struktur dari tabel `pembelian`
--

CREATE TABLE IF NOT EXISTS `pembelian` (
`no_pembelian` int(11) NOT NULL,
  `id_pegawai` varchar(10) NOT NULL,
  `No_Pengunjung` int(11) NOT NULL,
  `kodebarang` varchar(10) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `tanggal` date NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data untuk tabel `pembelian`
--

INSERT INTO `pembelian` (`no_pembelian`, `id_pegawai`, `No_Pengunjung`, `kodebarang`, `jumlah`, `tanggal`) VALUES
(1, 'KSR-00-001', 1, 'KF5677GR32', 1, '2018-11-01'),
(2, 'KSR-00-001', 2, 'GSF23JK665', 1, '2018-11-04'),
(3, 'KSR-00-001', 2, 'JSK201010R', 2, '2018-11-04');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang_barang`
--
ALTER TABLE `barang_barang`
 ADD PRIMARY KEY (`kodebarang`);

--
-- Indexes for table `kasir`
--
ALTER TABLE `kasir`
 ADD PRIMARY KEY (`id_pegawai`), ADD KEY `id_manager` (`id_manager`);

--
-- Indexes for table `manager`
--
ALTER TABLE `manager`
 ADD PRIMARY KEY (`id_pegawai`);

--
-- Indexes for table `pembeli`
--
ALTER TABLE `pembeli`
 ADD PRIMARY KEY (`No_Pengunjung`);

--
-- Indexes for table `pembelian`
--
ALTER TABLE `pembelian`
 ADD PRIMARY KEY (`no_pembelian`), ADD KEY `id_pegawai` (`id_pegawai`), ADD KEY `kodebarang` (`kodebarang`), ADD KEY `No_Pengunjung` (`No_Pengunjung`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `pembelian`
--
ALTER TABLE `pembelian`
MODIFY `no_pembelian` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `kasir`
--
ALTER TABLE `kasir`
ADD CONSTRAINT `kasir_fk1` FOREIGN KEY (`id_manager`) REFERENCES `manager` (`id_pegawai`);

--
-- Ketidakleluasaan untuk tabel `pembelian`
--
ALTER TABLE `pembelian`
ADD CONSTRAINT `pembelian_fk1` FOREIGN KEY (`id_pegawai`) REFERENCES `kasir` (`id_pegawai`),
ADD CONSTRAINT `pembelian_fk2` FOREIGN KEY (`kodebarang`) REFERENCES `barang_barang` (`kodebarang`),
ADD CONSTRAINT `pembelian_fk3` FOREIGN KEY (`No_Pengunjung`) REFERENCES `pembeli` (`No_Pengunjung`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
