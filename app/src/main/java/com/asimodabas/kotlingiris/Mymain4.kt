package com.asimodabas.kotlingiris

import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val girdi = Scanner(System.`in`)
    val dersNotlari = ArrayList<DersNotlar>()


    while (true) {

        println("Ders giriniz")
        var ders = girdi.next()

        println("Ders notu giriniz")
        val not = girdi.nextInt()

        val yeninot = DersNotlar(ders, not)

        dersNotlari.add(yeninot)

        println("Çıkmak için 1e bas")
        println("Devam için başka sayılara bas")
        val tercih = girdi.nextInt()

        if (tercih == 1) {
            println("************")

            var toplam=0

        for (dn in dersNotlari) {
                println("${dn.ders} : ${dn.not}")
                toplam = toplam+dn.not
            }
             val ortalama=toplam/dersNotlari.size
            println("************")
            println("Ortalama:$ortalama")

            if (ortalama>=50){
                println("Geçer")
            }
            else{
                print("Kalır")
            }
            println("Çıkış yapıldı")
            break
        }

    }

}