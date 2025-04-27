package com.kotlindersleri.bootcamp.ödev2

class fonksiyonlar {
    fun FahrenihatDonusum (derece:Double) :Double {
        val C = derece
        val F = C*1.8+32
        return F

    }

    fun cevre (uzunKenar:Int,kisaKenar:Int) {
        val sonuc = (uzunKenar+kisaKenar)*2
        println("Dikdörtgenin çevresi : $sonuc")
    }

    fun faktoriyel (sayi:Int) : Int{
        if (sayi > 0) {
            var sonuc = 1
            for (i in 1..sayi) {
                sonuc *= i
            }
            return sonuc
        } else {
            println("lütfen pozitif bir sayı giriniz")
            return -1
        }
    }

    fun aHarfiBul (kelime:String) :Int {
        var sayac =0
        for (harf in kelime)
            if (harf == 'a' || harf == 'A'){
                sayac += 1
            }
        return sayac

    }

    fun icAcilarToplami (kenarSayisi:Int) :Int {
        val sonuc = (kenarSayisi -2) *180
        return sonuc
    }


    fun maas (gün:Int) : Int {
        val gunlukSaat = 8
        val gunlukCalisma = 10
        val mesaiUcreti = 20
        var toplamSaat = gün*gunlukSaat
        var ucret:Int
        if (toplamSaat > 160){
            ucret = 160*10 + (toplamSaat-160)*20

        }else {
            ucret = toplamSaat*10
        }
        return ucret

    }

    fun ucretHesapla (kotaMiktari: Int) : Int{
        if (kotaMiktari > 50){
            var ucret = 100+((kotaMiktari-50)*4)
            return ucret
        }else{
            return 100
        }
    }

}
