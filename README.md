Automation Testing Project

Proyek ini adalah automation testing untuk aplikasi web menggunakan Java, Selenium, Cucumber, dan Gradle.

🧰 Teknologi yang Digunakan

Java - Bahasa pemrograman utama

Selenium WebDriver - Untuk mengotomasi web

Cucumber - Framework untuk penulisan tes berbasis BDD (Behavior Driven Development)

Gradle - Untuk manajemen dependensi dan build automation

🚀 Cara Instalasi

Ikuti langkah-langkah berikut untuk menyiapkan proyek ini di mesin lokal Anda:
1.  Clone Repository
    git clone https://github.com/taufik000achmad/SeleniumCucumberGradle
    cd nama-repo

2. Install Dependensi
   Jalankan perintah berikut untuk mengunduh semua dependensi yang diperlukan:
   ./gradlew build

3. Menjalankan Test
   Untuk menjalankan semua test, gunakan perintah berikut:
   ./gradlew test
   Untuk menjalankan test dengan tag tertentu:
   ./gradlew test -Dcucumber.options="--tags @regression"

4. Laporan Test
   Setelah test selesai dijalankan, Anda dapat melihat laporan hasilnya di:
   build/reports/tests/test/index.html

🧪 Struktur Proyek

    │── src 
    │   └── test
    │       ├── java
    │       │   ├── page                    # Page Object Models (POM)
    │       │   │   ├── HomePage.java
    │       │   │   └── LoginPage.java
    │       │   ├── stepdef                 # Step Definitions
    │       │   │   ├── BaseTest.java
    │       │   │   ├── CucumberHooks.java
    │       │   │   ├── HomeStepDef.java
    │       │   │   ├── LoginStepDef.java
    │       │   │   └── CucumberTest.java
    │       └── resources
    │           └── features               # Feature Files (BDD)
    │               └── login.feature
    ├── .gitignore                          # File untuk mengecualikan file tertentu dari git
    ├── build.gradle                        # File konfigurasi Gradle
    ├── gradlew                             # Wrapper untuk Gradle (Linux/Mac)
    ├── gradlew.bat                         # Wrapper untuk Gradle (Windows)
    ├── config.properties                   # File konfigurasi proyek
    └── README.md                           # Dokumentasi proyek

📋 Contoh Penulisan Feature File (Cucumber)
    Feature: Login Feature
    Scenario: Login dengan kredensial valid
    Given User membuka halaman login
    When User memasukkan username dan password yang valid
    Then User berhasil masuk ke halaman dashboard

    Kontak
    Jika Anda memiliki pertanyaan, silakan ajukan issue atau hubungi saya secara langsung.
    email : taufik000achmad@gmail.com
    Happy Testing! 🚀