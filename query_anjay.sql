CREATE DATABASE rs_amikomsehat_091;

USE rs_amikomsehat_091

CREATE  TABLE tbPasien (
idPasien VARCHAR (10) PRIMARY KEY,
namaPasien VARCHAR (40),
tanggalLahirPasien DATE,
alamatPasien VARCHAR(100),
telephone VARCHAR(15)
);

CREATE TABLE tbDokter (
idDokter VARCHAR (10) PRIMARY KEY,
namaDokter VARCHAR (40),
spesialisasi VARCHAR (20),
telephoneDokter VARCHAR (15)
);

CREATE TABLE tbPendaftaran (
idPendaftaran VARCHAR (10) PRIMARY KEY,
idPasien VARCHAR (10),
idDokter VARCHAR (10),
tanggalDaftar DATE,
waktudaftar TIME,
FOREIGN KEY (idPasien) REFERENCES tbPasien (idPasien),
FOREIGN KEY (idDokter) REFERENCES tbDokter (idDokter)
);

CREATE TABLE tbPemeriksaan (
idPemeriksaan VARCHAR (10) PRIMARY KEY,
idPendaftaran VARCHAR (10),
diagnosa VARCHAR (100),
tindakan VARCHAR (100),
biaya INT,
FOREIGN KEY (idPendaftaran) REFERENCES tbPendaftaran (idPendaftaran)
);

CREATE TABLE tbPembayaran (
idBayar VARCHAR (10) PRIMARY KEY,
idPemeriksaan VARCHAR (100),
tglBayar DATE,
jumlahBayar INT,
FOREIGN KEY (idPemeriksaan) REFERENCES tbPemeriksaan (idPemeriksaan)
);

CREATE TABLE tbObat (
idObat VARCHAR (10) PRIMARY KEY,
namaObat VARCHAR (20),
satuan VARCHAR (30),
harga INT,
tglExpired DATE
);

CREATE TABLE tbDetailBayar (
idBayar VARCHAR (10),
idObat VARCHAR (10),
harga INT,
FOREIGN KEY (idBayar) REFERENCES tbPembayaran (idPemeriksaan),
FOREIGN KEY (idObat) REFERENCES tbObat (idObat)
);


DROP TABLE tbDetailBayar, tbPembayaran, tbPemeriksaan, tbPendaftaran;

ALTER TABLE tbPasien
CHANGE telephone telephonePasien VARCHAR (15);

ALTER TABLE tbDokter
ADD COLUMN alamatDokter VARCHAR (100);

