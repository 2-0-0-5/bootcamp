package com.kotlindersleri.bootcamp.ödev2

fun main() {
    val fonksiyon =  fonksiyonlar()

    println(fonksiyon.faktoriyel(-1))

    val sonuc2 = fonksiyon.aHarfiBul("Ahmet")
    println("Kelime de $sonuc2 tane a harfi bulunmaktadır")

    val fahrenheit = fonksiyon.FahrenihatDonusum(25.5)
    println("Derecenizin Fahrenheite dönüşüömü : $fahrenheit")

    println(fonksiyon.cevre(40,50))

    val icAci = fonksiyon.icAcilarToplami(5)
    println("Şeklinizin iç açılar toplamı : $icAci")

    val maas = fonksiyon.maas(30)
    println("maasınız: $maas")

    val platformUcret = fonksiyon.ucretHesapla(75)
    println("ucretiniz : $platformUcret")


}

