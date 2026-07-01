open class User(val userId: String, val nama: String, val email: String) {
    fun login() { println("[Login] $nama ($userId) berhasil masuk.") }
}

class Pencarikos(userId: String, nama: String, email: String): User(userId, nama, email)
class Pemilikkos(userId: String, nama: String, email: String, val rekening: String): User(userId, nama, email)