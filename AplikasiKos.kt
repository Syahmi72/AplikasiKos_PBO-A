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