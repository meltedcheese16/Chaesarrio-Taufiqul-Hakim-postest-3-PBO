# Sistem Pencatatan Hasil Panen (Manajemen Sayuran)

## Deskripsi Singkat
Program ini adalah aplikasi **Java** untuk mencatat hasil panen sayuran menggunakan konsep **OOP**.  
Fitur utama:
- **Encapsulation**: Semua atribut menggunakan `private` dengan getter & setter.
- **Inheritance**: `Umbi` dan `Daun` merupakan subclass dari `Sayuran`.
- **Polymorphism & Overriding**: Method `getDetail()` menampilkan informasi sesuai jenis sayuran.
- **CRUD**: Tambah, lihat, ubah, dan hapus data hasil panen.

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
