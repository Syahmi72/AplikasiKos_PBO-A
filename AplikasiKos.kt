open class User(val userId: String, val nama: String, val email: String) {
    fun login() { println("[Login] $nama ($userId) berhasil masuk.") }
}

class Pencarikos(userId: String, nama: String, email: String): User(userId, nama, email)
class Pemilikkos(userId: String, nama: String, email: String, val rekening: String): User(userId, nama, email)

class Kamarkos(val nomorkamar: String, val harga: Int) {
    var isTersedia: Boolean = true
    fun ubahStatus() { isTersedia = !isTersedia }
}

// Menambahkan fungsi pencarian kamar untuk Pencarikos
fun Pencarikos.cariKamar(list: List<Kamarkos>) = list.filter { it.isTersedia }

class Pesanan(val pesananId: String, val kamar: Kamarkos) {
    val totalHarga = kamar.harga
    fun buatPesanan() {
        kamar.ubahStatus()
        println("[Pesanan] Kamar ${kamar.nomorkamar} berhasil dipesan.")
    }
}

class Transaksi(val transaksiId: String, val jumlahBayar: Int, val metode: String) {
    fun proses() { println("Memproses pembayaran Rp$jumlahBayar via $metode...") }
    
    fun getStruk(nama: String, nim: String) = """
        ====================================
        STRUK LUNAS APLIKASI KOS ITK
        ====================================
        ID Transaksi: $transaksiId
        Nama Penyewa: $nama
        NIM         : $nim
        Total Bayar : Rp$jumlahBayar
        Status      : LUNAS
        ====================================
    """.trimIndent()
}