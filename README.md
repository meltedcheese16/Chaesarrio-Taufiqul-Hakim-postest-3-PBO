# Sistem Pencatatan Hasil Panen (Manajemen Sayuran)

## Deskripsi Singkat
Program ini adalah aplikasi **Java** untuk mencatat hasil panen sayuran menggunakan konsep **OOP**.  
Fitur utama:
- **Encapsulation**: Semua atribut menggunakan `private` dengan getter & setter.
- **Inheritance**: `Umbi` dan `Daun` merupakan subclass dari `Sayuran`.
- **Polymorphism & Overriding**: Method `getDetail()` menampilkan informasi sesuai jenis sayuran.
- **CRUD**: Tambah, lihat, ubah, dan hapus data hasil panen.
- **Abstraction (Abstract Class)**: `Sayuran` dijadikan abstract class dengan method abstract `tampilkanInfo()` yang wajib diimplementasikan oleh subclass.
- **Interface**: Interface `Gradeable` digunakan untuk menentukan grade kualitas sayuran berdasarkan berat.
Tujuan program ini adalah membantu pengguna untuk mencatat dan mengelola hasil panen secara sederhana dan terstruktur.


## Alur Program
1. **Menu Utama**  
   Menampilkan pilihan: Tambah, Lihat, Update, Hapus, Keluar.

<img width="514" height="173" alt="image" src="https://github.com/user-attachments/assets/f74e4e55-a4aa-4fd0-bde2-3791b3a06f15" />


2. **Tambah Sayuran**  
   - User mengisi data: nama, berat, tanggal, grade, lokasi.  
   - Memilih jenis sayuran: **Umbi** atau **Daun**.  
   - Data disimpan di `ArrayList`.
  
<img width="773" height="242" alt="image" src="https://github.com/user-attachments/assets/4fdde073-6d22-44a1-b4b1-9819b5f254b8" />

  
3. **Lihat Semua Sayuran**  
   - Menampilkan daftar hasil panen dalam format tabel yang rapi.
   - Menampilkan info tambahan (jenis umbi atau warna daun).
  
<img width="1095" height="178" alt="image" src="https://github.com/user-attachments/assets/4f5c8492-e9da-44ab-b12a-e4294a99ddd1" />


4. **Update Sayuran**  
   - User memilih data yang ingin diubah, lalu mengisi data baru.
  
<img width="1203" height="395" alt="image" src="https://github.com/user-attachments/assets/6cb5f11e-957f-4a1b-9bba-cd39169993a8" />


5. **Hapus Sayuran**  
   - User memilih data yang ingin dihapus dari daftar.
  
<img width="1158" height="213" alt="image" src="https://github.com/user-attachments/assets/8284ce1b-f92f-4b6a-b7f6-e49fd76cc996" />

6. **Keluar**  
   - Program berhenti dengan pesan terima kasih.

<img width="808" height="199" alt="image" src="https://github.com/user-attachments/assets/c7cf100a-a19e-4bce-9979-63c4c9159304" />


## Penerapan Konsep OOP

### 1. Abstraction
- Program ini menggunakan **abstract class `Sayuran`** yang memiliki method abstract `tampilkanInfo()`.  
  Class turunan seperti `Umbi` dan `Daun` wajib mengimplementasikan method tersebut sesuai dengan karakteristiknya.

<img width="1434" height="440" alt="image" src="https://github.com/user-attachments/assets/8e966440-2d15-4710-9e65-3906a17b780b" />

<pre>method abstract pada daun :
<img width="925" height="166" alt="image" src="https://github.com/user-attachments/assets/950c951d-5697-4145-955d-934750ce80fd" /></pre>

<pre>method abstract pada umbi :
<img width="852" height="138" alt="image" src="https://github.com/user-attachments/assets/2cd1d817-9005-412c-976d-250011afb068" /></pre>


- Selain itu juga ada **interface `Gradeable`** yang mendefinisikan method `tentukanGrade()`.  
  Class `Umbi` dan `Daun` mengimplementasikan interface ini untuk menentukan grade kualitas sayuran berdasarkan berat.

<img width="1434" height="440" alt="image" src="https://github.com/user-attachments/assets/8e966440-2d15-4710-9e65-3906a17b780b" />

<pre>mengimplementasikan interface Daun :
<img width="783" height="160" alt="image" src="https://github.com/user-attachments/assets/758cb877-e20b-41d2-803d-6e059838acdf" /></pre>


<pre>mengimplementasikan interface Umbi :
<img width="774" height="163" alt="image" src="https://github.com/user-attachments/assets/bdb2e8d4-dc68-46cd-947a-4b81a12bb1c2" /></pre>


### 2. Polymorphism
- **Overriding**:  
  Method `getDetail()` dioverride pada class `Umbi` dan `Daun` untuk menampilkan informasi tambahan yang berbeda.  
  Method `tampilkanInfo()` juga dioverride sesuai dengan jenis sayuran.
- **Overloading**:  
  Pada class `PanenManager`, method `tambahHasil()` bisa dibuat dalam beberapa versi (misalnya menerima parameter `Sayuran` atau data mentah seperti `String nama, int berat, ...`).  
  Hal ini menunjukkan penggunaan overloading dalam program.

### 3. Nilai Tambah
- Program mengombinasikan penggunaan **abstract class dan interface secara bersamaan**, sehingga lebih fleksibel dan sesuai dengan konsep **multiple inheritance** di Java.

<img width="786" height="120" alt="image" src="https://github.com/user-attachments/assets/e64aae9f-42f0-4b9e-9e30-ec8a4fc6a763" />

<img width="800" height="126" alt="image" src="https://github.com/user-attachments/assets/d96d8267-b8bf-4fb7-a171-715fbc0b7473" />


## Penerapan JDBC & ORM

- **JDBC**
  - Lokasi: `manager/PanenJDBC.java`
  - Digunakan untuk mengakses database secara manual menggunakan query SQL (`SELECT`, `INSERT`, `UPDATE`, `DELETE`).

- **ORM (Hibernate)**
  - Lokasi: `manager/PanenORM.java` dan `entity/*.java`
  - Digunakan untuk mengelola data melalui entity class (`UmbiEntity`, `DaunEntity`) tanpa menulis SQL secara langsung.



