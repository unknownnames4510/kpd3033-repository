<?php
session_start();

// Jika sesi 'admin_logged_in' tidak wujud, maksudnya dia belum login
if (!isset($_SESSION['admin_logged_in'])) {
    header("Location: LogMasukAdmin.php"); // Tendang ke page login
    exit();
}

$con = mysqli_connect("localhost", "root", "", "db_lostfound");

// Logik Padam
if(isset($_GET['padam'])) {
    $id = $_GET['padam'];
    mysqli_query($con, "DELETE FROM barangan WHERE id_barang = $id");
    header("Location: admin.php?status=deleted");
}

// Ambil data untuk statistik
$total_barang = mysqli_num_rows(mysqli_query($con, "SELECT * FROM barangan"));
$total_jumpa = mysqli_num_rows(mysqli_query($con, "SELECT * FROM barangan WHERE status='Dijumpai'"));
$total_hilang = mysqli_num_rows(mysqli_query($con, "SELECT * FROM barangan WHERE status='Hilang'"));

// Ambil senarai barangan
$query = "SELECT * FROM barangan ORDER BY id_barang DESC";
$result = mysqli_query($con, $query);
?>

<!DOCTYPE html>
<html lang="ms">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Dashboard | Lost & Found KVKS</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">
    <style>
        :root {
            --primary-color: #1a365d;
            --secondary-color: #2b6cb0;
            --bg-color: #f8fafc;
            --text-dark: #2d3748;
            --danger: #e53e3e;
            --success: #38a169;
        }

        * { margin: 0; padding: 0; box-sizing: border-box; font-family: 'Inter', sans-serif; }
        body { background-color: var(--bg-color); display: flex; }

        /* Sidebar */
        .sidebar { width: 260px; height: 100vh; background: var(--primary-color); color: white; position: fixed; padding: 20px; }
        .sidebar h2 { font-size: 1.5rem; margin-bottom: 30px; text-align: center; border-bottom: 1px solid rgba(255,255,255,0.1); padding-bottom: 15px; }
        .sidebar a { display: block; color: #cbd5e0; text-decoration: none; padding: 12px; border-radius: 8px; margin-bottom: 10px; transition: 0.3s; }
        .sidebar a:hover, .sidebar a.active { background: var(--secondary-color); color: white; }
        .sidebar i { margin-right: 10px; }

        /* Main Content */
        .main-content { margin-left: 260px; width: calc(100% - 260px); padding: 30px; }
        
        /* Stats Cards */
        .stats-grid { display: grid; grid-template-columns: repeat(3, 1fr); gap: 20px; margin-bottom: 30px; }
        .stat-card { background: white; padding: 20px; border-radius: 12px; box-shadow: 0 4px 6px rgba(0,0,0,0.05); display: flex; align-items: center; justify-content: space-between; }
        .stat-info h3 { font-size: 0.9rem; color: #718096; text-transform: uppercase; }
        .stat-info p { font-size: 1.8rem; font-weight: bold; color: var(--text-dark); }
        .stat-icon { width: 50px; height: 50px; border-radius: 10px; display: flex; align-items: center; justify-content: center; font-size: 1.5rem; }

        /* Table Style */
        .table-container { background: white; padding: 20px; border-radius: 12px; box-shadow: 0 4px 6px rgba(0,0,0,0.05); }
        .table-header { display: flex; justify-content: space-between; align-items: center; margin-bottom: 20px; }
        table { width: 100%; border-collapse: collapse; }
        th { text-align: left; padding: 15px; background: #f7fafc; color: #4a5568; font-weight: 600; border-bottom: 2px solid #edf2f7; }
        td { padding: 15px; border-bottom: 1px solid #edf2f7; color: #4a5568; vertical-align: middle; }
        
        .img-preview { width: 50px; height: 50px; border-radius: 8px; object-fit: cover; }
        
        /* Status Badges */
        .badge { padding: 5px 12px; border-radius: 20px; font-size: 0.75rem; font-weight: bold; text-transform: uppercase; }
        .badge-dijumpai { background: #c6f6d5; color: #22543d; }
        .badge-hilang { background: #fed7d7; color: #822727; }

        /* Action Buttons */
        .btn-action { padding: 8px; border-radius: 6px; text-decoration: none; font-size: 0.9rem; transition: 0.2s; }
        .btn-edit { color: var(--secondary-color); background: #ebf4ff; margin-right: 5px; }
        .btn-delete { color: var(--danger); background: #fff5f5; }
        .btn-action:hover { opacity: 0.8; }

    </style>
</head>
<body>

    <div class="sidebar">
        <h2>Admin KVKS</h2>
        <a href="#" class="active"><i class="fa-solid fa-gauge"></i> Dashboard</a>
        <a href="LamanUtama.php"><i class="fa-solid fa-house"></i> Lihat Website</a>
        <a href="Laporan.php"><i class="fa-solid fa-plus"></i> Tambah Laporan</a>
        <a href="Logout.php" style="margin-top: 50px; color: #feb2b2;"><i class="fa-solid fa-right-from-bracket"></i> Keluar</a>
    </div>

    <div class="main-content">
        <div class="table-header">
            <h1>Ringkasan Pengurusan</h1>
            <p>Selamat datang, Admin!</p>
        </div>

        <div class="stats-grid">
            <div class="stat-card">
                <div class="stat-info">
                    <h3>Jumlah Laporan</h3>
                    <p><?php echo $total_barang; ?></p>
                </div>
                <div class="stat-icon" style="background: #e2e8f0; color: #4a5568;"><i class="fa-solid fa-box"></i></div>
            </div>
            <div class="stat-card">
                <div class="stat-info">
                    <h3>Barang Dijumpai</h3>
                    <p><?php echo $total_jumpa; ?></p>
                </div>
                <div class="stat-icon" style="background: #c6f6d5; color: #2f855a;"><i class="fa-solid fa-hand-holding-heart"></i></div>
            </div>
            <div class="stat-card">
                <div class="stat-info">
                    <h3>Barang Hilang</h3>
                    <p><?php echo $total_hilang; ?></p>
                </div>
                <div class="stat-icon" style="background: #fed7d7; color: #c53030;"><i class="fa-solid fa-magnifying-glass"></i></div>
            </div>
        </div>

        <div class="table-container">
            <div class="table-header">
                <h2>Senarai Barangan Terkini</h2>
            </div>
            <table>
                <thead>
                    <tr>
                        <th>Barang</th>
                        <th>Kategori</th>
                        <th>Tarikh</th>
                        <th>Lokasi</th>
                        <th>Status</th>
                        <th>Tindakan</th>
                    </tr>
                </thead>
                <tbody>
                    <?php while($row = mysqli_fetch_assoc($result)): ?>
                    <tr>
                        <td style="display: flex; align-items: center; gap: 15px;">
                            <img src="Gambar/<?php echo $row['gambar']; ?>" class="img-preview" onerror="this.src='https://via.placeholder.com/50'">
                            <strong><?php echo $row['nama_barang']; ?></strong>
                        </td>
                        <td><?php echo $row['kategori']; ?></td>
                        <td><?php echo date('d/m/Y', strtotime($row['tarikh_dijumpai'])); ?></td>
                        <td><?php echo $row['lokasi']; ?></td>
                        <td>
                            <?php 
                                $st = strtolower($row['status']);
                                $class = ($st == 'dijumpai') ? 'badge-dijumpai' : 'badge-hilang';
                            ?>
                            <span class="badge <?php echo $class; ?>"><?php echo $row['status']; ?></span>
                        </td>
                        <td>
    <a href="Edit.php?id=<?php echo $row['id_barang']; ?>" class="btn-action btn-edit" title="Edit">
        <i class="fa-solid fa-pen-to-square"></i>
    </a>
    
    <a href="admin.php?padam=<?php echo $row['id_barang']; ?>" 
       class="btn-action btn-delete" 
       onclick="return confirm('Adakah anda pasti mahu memadam rekod ini?')" title="Padam">
       <i class="fa-solid fa-trash"></i>
    </a>
</td>
                    </tr>
                    <?php endwhile; ?>
                </tbody>
            </table>
        </div>
    </div>

</body>
</html>