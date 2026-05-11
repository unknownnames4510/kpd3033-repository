<?php
$con = mysqli_connect("localhost", "root", "", "db_lostfound");

if (mysqli_connect_errno()) {
    echo "Gagal menyambung ke MySQL: " . mysqli_connect_error();
    exit();
}
$query = "SELECT * FROM barangan ORDER BY id_barang DESC LIMIT 6";
$items = mysqli_query($con, $query);
?>

<!DOCTYPE html>
<html lang="ms">
<head>
    <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Homepage | Sistem Lost & Found KVKS</title>
    <style>
        * {
             margin: 0;
              padding: 0;
               box-sizing: border-box;
                font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
             }
        body { 
            background-color: #f0f2f5;
             color: #333; 
            }

        nav {
             background: white;
              padding: 15px 5%;
               display: flex;
                justify-content: space-between;
                 align-items: center;
                  box-shadow: 0 2px 5px rgba(0,0,0,0.1);
                   position: sticky;
                    top: 0; z-index: 1000;
                 }
        .logo {
             font-weight: bold;
              color: #2a2669;
               font-size: 1.2rem;
                display: flex;
                 align-items: center;
                  gap: 10px; 
                }
        .nav-links a {
             text-decoration: none;
              color: #555;
               margin-left: 20px;
                font-weight: 500;
                 transition: 0.3s
                 ; }
        .nav-links a:hover {
             color: #283772;
             }

        .moving-text-container {
            background: #dc663e;
            color: white;
            padding: 8px 0;
            overflow: hidden;
            position: relative;
            white-space: nowrap;
            font-weight: bold;
            font-size: 0.9rem;
        }
        .moving-text {
            display: inline-block;
            padding-left: 100%;
            animation: marquee 20s linear infinite;
        }
        @keyframes marquee {
            0% { transform: translate(0, 0); }
            100% { transform: translate(-100%, 0); }
        }

        .hero {
             background: linear-gradient(rgba(26, 54, 93, 0.8),
              rgba(26, 54, 93, 0.8)),
               url('herobanner.jpg') no-repeat;
                background-size: cover; background-position: center;
                 padding: 100px 5%;
                  text-align: center; color: white;
                 }
        .hero h1 { 
            font-size: 2.5rem;
             margin-bottom: 20px; }
        
        .search-box { background: white;
         padding: 10px;
          border-radius: 50px;
           max-width: 600px;
            margin: 0 auto 30px;
             display: flex; 
             box-shadow: 0 4px 15px rgba(0,0,0,0.2);
             }
        .search-box input {
             border: none; padding: 10px 20px;
              flex: 1;
               border-radius: 50px; 
               outline: none; font-size: 1rem;
                color: #333; }
        .search-box button { background: #283772;
         color: white;
          border: none;
           padding: 10px 25px;
            border-radius: 50px;
             cursor: pointer;
              transition: 0.3s;
               font-weight: bold;
             }

        .hero-btns .btn { padding: 12px 25px;
         border-radius: 5px;
          text-decoration: none; 
          font-weight: bold; margin:
           0 10px; display:
            inline-block;
             transition: 0.3s;
             }
        .btn-primary { background: #283772;
         color: white;

         }

        .btn-secondary {
             background: #2b6cb0;
         color: white;
         }

        .container {
             padding: 50px 5%; 
            }
        .grid {
             display: grid; grid-template-columns: repeat(auto-fill, minmax(250px, 1fr));
              gap: 25px;
             }
        .card { background: white;
         border-radius: 10px;
          overflow: hidden;
           box-shadow: 0 3px 10px rgba(0,0,0,0.1);
         }
        .card img { width: 100%;
         height: 200px;
          object-fit: cover;
         }
        .card-body { padding: 20px; }
        
        .badge {
             display: inline-block;
              padding: 5px 12px;
               border-radius: 20px;
                font-size: 0.75rem; 
                font-weight: bold;
             }
        .badge-found {
             background: #e6fffa;
              color: #2c7a7b; 
            }
        .badge-claimed {
             background: #edf2f7;
              color: #4a5568;
             }

        .badge-lost {
                background: #fff5f5;
                color: #c53030;
                border: 1px solid #feb2b2;
            }
        .filter-container {
    display: flex;
    justify-content: center;
    gap: 10px;
    margin: 20px 0;
}
        .filter-btn {
    padding: 8px 20px;
    border: none;
    background: white;
    border-radius: 20px;
    cursor: pointer;
    box-shadow: 0 2px 5px rgba(0,0,0,0.1);
    transition: 0.3s;
    font-weight: 500;
}
.filter-btn:hover, .filter-btn.active {
    background: #283772;
    color: white;
}
       .main-footer { background-color: #1a1a5e; color: white; padding: 50px 5% 20px 5%; margin-top: 50px; }
        .footer-container { display: flex; justify-content: space-between; flex-wrap: wrap; gap: 30px; }
        .footer-column { flex: 1; min-width: 220px; }
        .footer-column h3 { font-size: 16px; margin-bottom: 20px; color: #ffffff; position: relative; padding-bottom: 10px; }
        .footer-column h3::after { content: ''; position: absolute; left: 0; bottom: 0; width: 40px; height: 2px; background: #dc663e; }
        .footer-column ul { list-style: none; }
        .footer-column ul li { margin-bottom: 12px; }
        .footer-column a { color: #d1d1d1; text-decoration: none; transition: 0.3s; }
        .footer-column a:hover { color: white; padding-left: 5px; }
        .footer-column p { font-size: 14px; line-height: 1.6; color: #d1d1d1; }
        .footer-logo { background: white; padding: 10px; border-radius: 4px; max-width: 200px; margin-bottom: 15px; }
        .footer-line { border: 0; border-top: 1px solid rgba(255,255,255,0.1); margin: 30px 0 20px 0; }
        .footer-bottom { text-align: center; font-size: 13px; color: #aaa; }
    </style>
</head>
<body>

    <nav>
        <div class="logo">
            <img src="banner.png" alt="Logo" style="width: 140px;" onerror="this.style.display='none'">
            Lost & Found KVKS
        </div>
        <div class="nav-links">
            <a href="LamanUtama.php">Laman Utama</a>
            <a href="Laporan.php">Daftar Laporan</a>
            <a href="LihatSemua.php">Lihat Semua</a>
            <a href="LogMasuk.php" style="background: #2a2669; color: white; padding: 8px 15px; border-radius: 5px;">Log Masuk/Sertai Kami</a>
        </div>
    </nav>

    <div class="moving-text-container">
        <div class="moving-text">
            Selamat datang ke Lost & Found KVKS! Masih dalam percubaan lagi! &nbsp;&nbsp;&nbsp; | &nbsp;&nbsp;&nbsp; 
            Sila lapor barangan yang dijumpai untuk membantu rakan kolej anda. &nbsp;&nbsp;&nbsp; | &nbsp;&nbsp;&nbsp;
            Selamat datang ke Lost & Found KVKS! Masih dalam percubaan lagi!
        </div>
    </div>

    <div class="hero">
        <h1>Cari Barangan Anda Yang Hilang Di Sini</h1>
        <form class="search-box" action="LihatSemua.php" method="GET">
            <input type="text" name="search" placeholder="Cari barang (cth: dompet, kunci, beg)..." required>
            <button type="submit">Cari</button>
        </form>
        <div class="filter-container">
    <button class="filter-btn active">Semua</button>
    <button class="filter-btn">Elektronik</button>
    <button class="filter-btn">Dokumen/Kad</button>
    <button class="filter-btn">Beg/Pakaian</button>
</div>
        <div class="hero-btns">
            <a href="HantarLaporan.php" class="btn btn-primary">Laporan Jumpa Barang</a>
            <a href="KehilanganBarang.php" class="btn btn-secondary">Daftar Kehilangan (Barang Hilang)</a>
        </div>
    </div>

    <div class="container">
        <div class="section-header" style="display: flex; justify-content: space-between; align-items: center; margin-bottom: 30px; border-left: 5px solid #2b6cb0; padding-left: 15px;">
            <h2>Barangan Terkini Dijumpai</h2>
            <a href="LihatSemua.php" style="text-decoration: none; color: #2a2669; font-weight: bold;">Lihat Semua &rarr;</a>
        </div>
        
        
        <div class="grid">
    <?php while($item = mysqli_fetch_assoc($items)): ?>
    <div class="card">
        <img src="Gambar/<?php echo $item['gambar']; ?>" alt="<?php echo $item['nama_barang']; ?>" onerror="this.src='https://via.placeholder.com/400x250?text=Imej+Tiada'">
        
        <<div class="card-body">
    <h3><?php echo $item['nama_barang']; ?></h3>
    <p style="font-size: 0.9rem; color: #666;">📅 Tarikh: <?php echo date('d M Y', strtotime($item['tarikh_dijumpai'])); ?></p>
    
    <p style="margin: 10px 0; font-size: 0.9rem; color: #25d366; font-weight: bold;">
        <a href="https://wa.me/6<?php echo $item['no_tel']; ?>" target="_blank" style="text-decoration: none; color: inherit;">
            📞 WhatsApp: <?php echo $item['no_tel']; ?>
        </a>
    </p>

    <?php 
        $status = strtoupper($item['status']);
        $badge_class = ($status == 'TERSEDIA' || $status == 'DIJUMPAI') ? 'badge-found' : 'badge-claimed';
        if ($status == 'HILANG') $badge_class = 'badge-lost';
    ?>
    <span class="badge <?php echo $badge_class; ?>">
        <?php echo $status; ?>
    </span>
</div>
    </div>
    <?php endwhile; ?>
</div>

    <footer class="main-footer">
        <div class="footer-container">
            <div class="footer-column">
                <div class="footer-logo">
                    <img src="banner.png" alt="Logo KVKS" style="width: 100%;">
                </div>
                <p>Membantu warga Kolej Vokasional Kuala Selangor menguruskan barangan hilang dan dijumpai dengan lebih efisien.</p>
            </div>

            <div class="footer-column">
                <h3>INFO RASMI</h3>
                <ul>
                    <li><a href="LamanUtama.php">Laman Utama</a></li>
                    <li><a href="https://ms.wikipedia.org/wiki/Kolej_Vokasional_Kuala_Selangor" target="_blank">Wikipedia</a></li>
                </ul>
            </div>

            <div class="footer-column">
                <h3>HUBUNGI KAMI</h3>
                <p>Kolej Vokasional Kuala Selangor<br>
                   Bestari Jaya, 45600<br>
                   Selangor, Malaysia</p>
                <p style="margin-top: 10px;">Telefon: 03-32718370<br>
                   Fax: 03-32718371</p>
            </div>

            <div class="footer-column">
                <h3>SOCIAL MEDIA</h3>
                <ul>
                    <li><a href="https://www.facebook.com/kvks.sel/">Facebook</a></li>
                    <li><a href="https://www.instagram.com/kvkualaselangor_official/">Instagram</a></li>
                    <li><a href="https://www.youtube.com/@kvkualaselangor_official8551">Youtube</a></li>
                    <li><a href="https://www.google.com/maps/dir/2.9229056,101.6929667/google+maps+kv+kuala+selangor/@3.1457593,101.3959934,11z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x31cc60db623bb93d:0x3c9391707e336109!2m2!1d101.3981924!2d3.3831747?entry=ttu" target="_blank">Google Maps</a></li>
                </ul>
            </div>
        </div>

        <hr class="footer-line">

        <div class="footer-bottom">
            <p>&copy; 2026 Kolej Vokasional Kuala Selangor. Hak Cipta Terpelihara.</p>
        </div>
    </footer>

</body>
</html>