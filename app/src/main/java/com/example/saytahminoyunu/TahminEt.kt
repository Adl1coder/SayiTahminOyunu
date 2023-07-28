package com.example.saytahminoyunu

import kotlin.random.Random

fun main() {
    println("Sayı Tahmin Oyununa Hoş Geldiniz!")
    println("Bilgisayar rastgele bir sayı tutacak, siz de bu sayıyı tahmin etmeye çalışacaksınız.")
    println("Sayı aralığını belirleyin (min-max):")

    // Kullanıcıdan min ve max değerleri okuyarak aralığı belirliyoruz
    val (min, max) = readLine()!!.split("-").map { it.toInt() }

    // Bilgisayar tarafından rastgele tutulan sayıyı belirliyoruz
    val targetNumber = Random.nextInt(min, max + 1)
    var guess: Int
    var attempts = 0

    println("Tahmininizi girin:")
    do {
        guess = readLine()!!.toInt()
        attempts++

        // Tahminin doğruluğunu kontrol ediyoruz ve kullanıcıya geri bildirim veriyoruz
        when {
            guess == targetNumber -> println("Tebrikler! Doğru tahmin ettiniz. Sayı: $targetNumber")
            guess < targetNumber -> println("Daha yüksek bir sayı dene.")
            else -> println("Daha düşük bir sayı dene.")
        }
    } while (guess != targetNumber)

    // Doğru tahmin edildiğinde kaç deneme yapıldığını bildiriyoruz
    println("Tahmin sayısı: $attempts")
}
