Tugas inheritance 

inheritance adalah pewarisan yang akan diturunkan pada class anak (subclass). 
pada hubungan inheritance semua member dalam class induk bisa diakses oleh class anak, kecuali pada modifier private. 

Langkah-langkah codingan tersebut adalah: 

1. membuat kelas pertama (sebagai kelas induk) lalu diisi dengan atribut dan method. 

2. setelah itu me-refactor atribut tersebut untuk membuat setter dan getter. 
   setter dan getter berada pada encapsulate fields adalah fungsi yang dikemas dalam      suatu objek sehingga fungsi dari luar tidak bisa mengakses. 

3. lalu salah atribut tersebut berubah menjadi private dan protected yang awalnya public. 
4. membuat kelas kedua (anak kelas) untuk mewarisi turunan dari kelas induk. 
5. sama seperti tahap diatas yaitu me-refactor atribut tersebut. 

pada materi ini terdapat 3 modifier dalam java: 
- public: bisa diakses semuanya 
- private: hanya bisa diakses dalam kelas itu sendiri 
- protected: hanya bisa diakses kelas itu sendiri, sub class, dan kelas yang ada pada satu package yg sama)



