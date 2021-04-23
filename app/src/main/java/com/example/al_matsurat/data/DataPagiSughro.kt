package com.example.al_matsurat.data

import com.example.al_matsurat.model.ModelDzikir

object DataPagiSughro {
    private val txtPagiSughro = arrayOf(
        "Alhamdulillah",
        "Tabarakallah",
        "Allahuakbar",
        "Alhamdulillah",
        "Tabarakallah",
        "Allahuakbar"
    )

    private val txtArabicSughro = arrayOf(
        "الحمد لله",
        "تبارك الله",
        "الله أكبر",
        "الحمد لله",
        "تبارك الله",
        "الله أكبر"
    )

    private val txtLatinSughro = arrayOf(
        "Alhamdulillah",
        "Tabarakallah",
        "Allahuakbar",
        "Alhamdulillah",
        "Tabarakallah",
        "Allahuakbar"
    )

    private val txtDescSughro = arrayOf(
        "Segala Puji Bagi Allah",
        "Terpujilah Allah",
        "Allah Maha Besar",
        "Segala Puji Bagi Allah",
        "Terpujilah Allah",
        "Allah Maha Besar"
    )

    val listData: ArrayList<ModelDzikir>
        get() {
            val list = arrayListOf<ModelDzikir>()
            for (position in txtPagiSughro.indices) {
                val dzikir = ModelDzikir()
                dzikir.title = txtPagiSughro[position]
                dzikir.arabic = txtArabicSughro[position]
                dzikir.latin = txtLatinSughro[position]
                dzikir.desc = txtDescSughro[position]
                list.add(dzikir)
            }
            return list
        }
}