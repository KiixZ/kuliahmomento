CREATE DATABASE perpustakaan
USE Perpustakaan

CREATE TABLE buku(
id_buku INT,
judul VARCHAR(100),
pengarang VARCHAR(100),
tahun_terbit INT,
jumlah INT)

INSERT INTO buku VALUES(2, 'buku buat','aye',2019,17),
(2, 'buku buat','aye',2019,17),
(2, 'buku buat','aye',2019,17);

SELECT * FROM buku
#DROP database perpustakaan#`anggota`

CREATE TABLE anggota(
id_anggota INT,
nama VARCHAR(100),
alamat VARCHAR(255),
telepon INT)
INSERT INTO anggota VALUES(3,'rifki sapu','jauh dah',0813),
(3,'rifki sapu','jauh dah',0813),
(3,'rifki sapu','jauh dah',0813);
SELECT * FROM anggota
DROP DATABASE perpustakaan