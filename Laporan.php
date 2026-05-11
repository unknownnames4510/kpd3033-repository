<?php
// Langkah 1: Sambung ke Database (Nama db mesti sama dengan yang anda cipta)
$con = mysqli_connect("localhost", "root", "", "db_lostfound");

// Semak jika sambungan gagal
if (!$con) {
    die("Sambungan gagal: " . mysqli_connect_error());
}

// Langkah 2: Ambil data dari jadual 'barangan'
// Kita susun supaya barang paling baru dijumpai muncul dulu (DESC)
$query = "SELECT * FROM barangan ORDER BY id_barang DESC LIMIT 6";
$items = mysqli_query($con, $query);

if (isset($_POST['hantar_laporan'])) {
    
    $jenis_laporan = $_POST['jenis_laporan'];
    $nama_barang   = mysqli_real_escape_string($con, $_POST['nama_barang']);
    $kategori      = $_POST['kategori'];
    $tarikh        = $_POST['tarikh'];
    $lokasi        = mysqli_real_escape_string($con, $_POST['lokasi']);
    $description   = mysqli_real_escape_string($con, $_POST['description']);
    
    $nama_fail_gambar = $_FILES['gambar_barang']['name'];
    $lokasi_sementara = $_FILES['gambar_barang']['tmp_name'];
    $folder_tujuan    = "Gambar/" . $nama_fail_gambar;
    move_uploaded_file($lokasi_sementara, $folder_tujuan);

   $sql = "INSERT INTO barangan (nama_barang, kategori, tarikh_dijumpai, gambar, status, lokasi, description) 
        VALUES ('$nama_barang', '$kategori', '$tarikh', '$nama_fail_gambar', '$jenis_laporan', '$lokasi', '$description')";
    if (mysqli_query($con, $sql)) {
        $mesej_berjaya = "Laporan anda telah berjaya dihantar!";
    } else {
        echo "Ralat: " . mysqli_error($con);
    }
}
?>

<!DOCTYPE html>
<html lang="ms">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Daftar Laporan | KVS Lost & Found</title>
    <style>
        * { margin: 0; padding: 0; box-sizing: border-box; font-family: 'Segoe UI', sans-serif; }
        body { background-color: #f0f2f5; }
        
        /* Navigasi */
        header { background: white; padding: 15px 5%; display: flex; justify-content: space-between; align-items: center; box-shadow: 0 2px 5px rgba(0,0,0,0.1); }
        .logo-kvs { height: 50px; }
        .nav-links a { text-decoration: none; color: #333; margin-left: 20px; font-weight: 500; }

        .container { max-width: 800px; margin: 40px auto; padding: 0 20px; }
        .form-card { background: white; padding: 30px; border-radius: 12px; box-shadow: 0 4px 15px rgba(0,0,0,0.05); }
        h2 { color: #1a365d; margin-bottom: 20px; border-bottom: 2px solid #edf2f7; padding-bottom: 10px; }
        
        .form-group { margin-bottom: 20px; }
        label { display: block; margin-bottom: 8px; font-weight: bold; color: #4a5568; font-size: 0.9rem; }
        input[type="text"], input[type="date"], select, textarea {
            width: 100%; padding: 12px; border: 1px solid #e2e8f0; border-radius: 8px; font-size: 1rem; outline: none;
        }
        input:focus, select:focus, textarea:focus { border-color: #2b6cb0; box-shadow: 0 0 0 3px rgba(66, 153, 225, 0.2); }
        
        .radio-group { display: flex; gap: 20px; margin-top: 5px; }
        .radio-item { display: flex; align-items: center; gap: 8px; }

        .btn-hantar { 
            width: 100%; padding: 15px; background: #2b6cb0; color: white; border: none; 
            border-radius: 8px; font-size: 1rem; font-weight: bold; cursor: pointer; transition: 0.3s;
        }
        .btn-hantar:hover { background: #1a365d; }

        .alert-success { 
            background: #f0fff4; color: #2f855a; padding: 15px; border-radius: 8px; 
            border: 1px solid #c6f6d5; margin-bottom: 20px; 
        }
    </style>
</head>
<body>

    <header>
        <img src="banner.png" alt="Logo KVS" class="logo-kvs" onerror="this.src='https://via.placeholder.com/150x50?text=LOGO+KVKS'">
        <div class="nav-links">
            <a href="LamanUtama.php">Laman Utama</a>
            <a href="lihatSemua.php">Lihat Semua</a>
            <a href="logout.php">Keluar</a>
        </div>
    </header>

    <div class="container">
        <div class="form-card">
            <h2>Daftar Laporan Barang</h2>
            <h2>Daftar Laporan Barang</h2>

<?php 
if (isset($mesej_berjaya)): ?>
    <div class="alert-success">
        <?php echo $mesej_berjaya; ?>
    </div>
<?php endif; ?>


            <form action="" method="POST" enctype="multipart/form-data">
                
                <div class="form-group">
                    <label>Jenis Laporan</label>
                    <div class="radio-group">
                        <div class="radio-item">
                            <input type="radio" name="jenis_laporan" value="Dijumpai" id="jumpa" checked>
                            <label for="jumpa" style="margin:0; font-weight:normal;">Saya Jumpa Barang</label>
                        </div>
                        <div class="radio-item">
                            <input type="radio" name="jenis_laporan" value="Hilang" id="hilang">
                            <label for="hilang" style="margin:0; font-weight:normal;">Saya Hilang Barang</label>
                        </div>
                    </div>
                </div>

                <div class="form-group">
                    <label>Nama Barangan</label>
                    <input type="text" name="nama_barang" placeholder="Contoh: Dompet Kulit, Kunci Fob" required>
                </div>

                <div class="form-group">
                    <label>Kategori</label>
                    <select name="kategori">
                        <option value="Aksesori">Aksesori</option>
                        <option value="Elektronik">Elektronik</option>
                        <option value="Dokumen">Dokumen / Kad</option>
                        <option value="Beg">Beg</option>
                        <option value="Lain-lain">Lain-lain</option>
                    </select>
                </div>

                <div class="form-group">
                    <label>Tarikh Kejadian</label>
                    <input type="date" name="tarikh" required>
                </div>

                <div class="form-group">
                    <label>Lokasi (Anggaran)</label>
                    <input type="text" name="lokasi" placeholder="Contoh: Surau, Blok A, Kantin" required>
                </div>

                <div class="form-group">
                    <label>Deskripsi Tambahan</label>
                    <textarea name="deskripsi" rows="3" placeholder="Warna, jenama, atau sebarang tanda khas..."></textarea>
                </div>

                <div class="form-group">
                    <label>Muat Naik Gambar (Jika ada)</label>
                    <input type="file" name="gambar_barang" accept="image/*">
                </div>

                <button type="submit" name="hantar_laporan" class="btn-hantar">HANTAR LAPORAN</button>
            </form>
        </div>
    </div>

</body>
</html>