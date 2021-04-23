package com.example.al_matsurat.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.al_matsurat.R


class ZipasuAdapter : RecyclerView.Adapter<ZipasuAdapter.ViewHolder>() {

    private val itemTitles = arrayOf(
        "~Surat Al-Fatihah~", "Al-Baqarah : 1 - 5", ""
    )

    private val itemArab = arrayOf(
        "بِسْمِ اللّٰهِ الرَّحْمٰنِ الرَّحِيْمِ\n" +
                "اَلْحَمْدُ لِلّٰهِ رَبِّ الْعٰلَمِيْنَۙ\n" +
                "الرَّحْمٰنِ الرَّحِيْمِۙ\n" +
                "مٰلِكِ يَوْمِ الدِّيْنِۗ\n" +
                "اِيَّاكَ نَعْبُدُ وَاِيَّاكَ نَسْتَعِيْنُۗ\n" +
                "اِهْدِنَا الصِّرَاطَ الْمُسْتَقِيْمَ ۙ\n" +
                "صِرَاطَ الَّذِيْنَ اَنْعَمْتَ عَلَيْهِمْ ەۙ غَيْرِ الْمَغْضُوْبِ عَلَيْهِمْ وَلَا الضَّاۤلِّيْنَ",
        "بِسْمِ اللّٰهِ الرَّحْمٰنِ الرَّحِيْمِ\n" +
                "الۤمّۤ ۚ\n" +
                "ذٰلِكَ الْكِتٰبُ لَا رَيْبَ ۛ فِيْهِ ۛ هُدًى لِّلْمُتَّقِيْنَۙ\n" +
                "الَّذِيْنَ يُؤْمِنُوْنَ بِالْغَيْبِ وَيُقِيْمُوْنَ الصَّلٰوةَ وَمِمَّا رَزَقْنٰهُمْ يُنْفِقُوْنَ ۙ\n" +
                "وَالَّذِيْنَ يُؤْمِنُوْنَ بِمَآ اُنْزِلَ اِلَيْكَ وَمَآ اُنْزِلَ مِنْ قَبْلِكَ ۚ وَبِالْاٰخِرَةِ هُمْ يُوْقِنُوْنَۗ\t\n" +
                "اُولٰۤىِٕكَ عَلٰى هُدًى مِّنْ رَّبِّهِمْ ۙ وَاُولٰۤىِٕكَ هُمُ الْمُفْلِحُوْنَ\n",
        ""
    )

    private val itemLatin = arrayOf(
        "Bismillāhir-raḥmānir-raḥīm ~ Al-ḥamdu lillāhi rabbil-'ālamīn ~ Ar-raḥmānir-raḥīm ~ māliki yaumid-dīn ~ Iyyāka na'budu wa iyyāka nasta'īn ~ Ihdinaṣ-ṣirāṭal-mustaqīm ~ Shirāṭallażīna an'amta 'alaihim gairil-magḍụbi 'alaihim wa laḍ-ḍāllīn.",
        "jumlah2"
    )

    private val itemTerjemah = arrayOf(
        "** Dengan nama Allah Yang Maha Pengasih, Maha Penyayang. ** Segala puji bagi Allah, Tuhan seluruh alam. ** Yang Maha Pengasih, Maha Penyayang. ** Pemilik hari pembalasan. ** Hanya kepada Engkaulah kami menyembah dan hanya kepada Engkaulah kami mohon pertolongan. ** Tunjukilah kami jalan yang lurus, ** (yaitu) jalan orang-orang yang telah Engkau beri nikmat kepadanya; bukan (jalan) mereka yang dimurkai, dan bukan (pula jalan) mereka yang sesat.",
        "kalimat2"
    )

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var textTitle: TextView
        var textArab: TextView
        var textLatin: TextView
        var textTerjemah: TextView

        init {
            textTitle = itemView.findViewById(R.id.titleZikir)
            textArab = itemView.findViewById(R.id.arabicZikir)
            textLatin = itemView.findViewById(R.id.latinZikir)
            textTerjemah = itemView.findViewById(R.id.terjemahanZikir)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_dzikir, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textTitle.text = itemTitles[position]
        holder.textArab.text = itemArab[position]
        holder.textLatin.text = itemLatin[position]
        holder.textTerjemah.text = itemTerjemah[position]

    }

    override fun getItemCount(): Int {
        return itemTitles.size
    }

}