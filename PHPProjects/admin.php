<?php session_start(); ?>
<div class="container" style="padding: 50px;">
    <h2>Panel Pengurusan Admin</h2>
    <table border="1" style="width: 100%; border-collapse: collapse; margin-top: 20px;">
        <tr style="background: #283772; color: white;">
            <th style="padding: 10px;">Item</th>
            <th>Status Asal</th>
            <th>Tindakan</th>
        </tr>
        <tr>
            <td style="padding: 10px;">Dompet Kulit Hitam</td>
            <td><span class="badge badge-found">DIJUMPAI</span></td>
            <td>
                <button onclick="Swal.fire('Berjaya', 'Status telah ditukar kepada TELAH DITUNTUT', 'success')">Set Telah Dituntut</button>
                <button style="background:red; color:white;">Padam</button>
            </td>
        </tr>
    </table>
    <br>
    <a href="LamanUtama.php">Kembali ke Laman Utama</a>
</div>