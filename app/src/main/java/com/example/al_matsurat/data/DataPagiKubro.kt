package com.example.al_matsurat.data

import com.example.al_matsurat.model.ModelDzikir

object DataPagiKubro {
    private val txtTitlePagiKubro = arrayOf(
        //Demo Title
        "Ta'awudz",
        "QS. Al-Fatihah",
        "QS.Al-Baqarah : 1 - 5",
        "QS. Al-Baqarah : 255 - 257",
        "QS. Al-Baqarah : 284 - 286",
        "QS. Al-Ikhlas 1 - 4 (3x)",
        "QS. Al-Falaq 1 5 (3x)",
        "QS. An-Nas : 1 - 6 (3x)",
        "Dzikir (3x)",
        "Dzikir (3X)",
        "Dzikir & Do’a (3X)",
        "Dzikir (3X)",
        "Dzikir (3X)",
        "Dzikir (3X)",
        "Dzikir (3X)",
        "Dzikir (3X)",
        "Dzikir & Do’a (3X)",
        "Dzikir & Do’a (3X)",
        "Dzikir & Do’a (3X)",
        "Dzikir & Do’a (3X)",
        "Dzikir & Do’a (3X)",
        "Dzikir & Do’a (3X)",
        "Dzikir & Do’a (3X)",
        "Sholawat (10X)",
        "Dzikir (100X)",
        "Dzikir & Do’a (10X)",
        "Dzikir & Do’a (3X)",
        "Dzikir, Do’a & Sholawat",
        "QS. Al - Imran : 26-27",
        "Do’a Robithoh",
        "Do’a Robithoh"
    )

    private val txtArabicPagiKubro = arrayOf(
        //Demo Ayat
        "أَعُوْذُ بِاللّٰهِ السَّمِيْعِ العَلِيْمِ مِنَ الشَّيْطَانِ الرَّجِيْم",
        "بِسْمِ اللّٰهِ الرَّحْمٰنِ الرَّحِيْمِ\n" +
                "اَلْحَمْدُ لِلّٰهِ رَبِّ الْعٰلَمِيْنَۙ * الرَّحْمٰنِ الرَّحِيْم * مٰلِكِ يَوْمِ الدِّيْنِۗ * اِيَّاكَ نَعْبُدُ وَاِيَّاكَ نَسْتَعِيْنُۗ * اِهْدِنَا الصِّرَاطَ الْمُسْتَقِيْمَ ۙ * صِرَاطَ الَّذِيْنَ اَنْعَمْتَ عَلَيْهِمْ ەۙ غَيْرِ الْمَغْضُوْبِ عَلَيْهِمْ وَلَا الضَّاۤلِّيْنَ",
        "بِسْمِ اللّٰهِ الرَّحْمٰنِ الرَّحِيْمِ\n" +
                "الۤمّۤ ۚ * ذٰلِكَ الْكِتٰبُ لَا رَيْبَ ۛ فِيْهِ ۛ هُدًى لِّلْمُتَّقِيْنَۙ * الَّذِيْنَ يُؤْمِنُوْنَ بِالْغَيْبِ وَيُقِيْمُوْنَ الصَّلٰوةَ وَمِمَّا رَزَقْنٰهُمْ يُنْفِقُوْنَ ۙ * وَالَّذِيْنَ يُؤْمِنُوْنَ بِمَآ اُنْزِلَ اِلَيْكَ وَمَآ اُنْزِلَ مِنْ قَبْلِكَ ۚ وَبِالْاٰخِرَةِ هُمْ يُوْقِنُوْنَۗ * اُولٰۤىِٕكَ عَلٰى هُدًى مِّنْ رَّبِّهِمْ ۙ وَاُولٰۤىِٕكَ هُمُ الْمُفْلِحُوْنَ\n",
        "اَللّٰهُ لَآ اِلٰهَ اِلَّا هُوَۚ اَلْحَيُّ الْقَيُّوْمُ ەۚ لَا تَأْخُذُهٗ سِنَةٌ وَّلَا نَوْمٌۗ لَهٗ مَا فِى السَّمٰوٰتِ وَمَا فِى الْاَرْضِۗ مَنْ ذَا الَّذِيْ يَشْفَعُ عِنْدَهٗٓ اِلَّا بِاِذْنِهٖۗ يَعْلَمُ مَا بَيْنَ اَيْدِيْهِمْ وَمَا خَلْفَهُمْۚ وَلَا يُحِيْطُوْنَ بِشَيْءٍ مِّنْ عِلْمِهٖٓ اِلَّا بِمَا شَاۤءَۚ وَسِعَ كُرْسِيُّهُ السَّمٰوٰتِ وَالْاَرْضَۚ وَلَا يَـُٔوْدُهٗ حِفْظُهُمَاۚ وَهُوَ الْعَلِيُّ الْعَظِيْمُ * لَآ اِكْرَاهَ فِى الدِّيْنِۗ قَدْ تَّبَيَّنَ الرُّشْدُ مِنَ الْغَيِّ ۚ فَمَنْ يَّكْفُرْ بِالطَّاغُوْتِ وَيُؤْمِنْۢ بِاللّٰهِ فَقَدِ اسْتَمْسَكَ بِالْعُرْوَةِ الْوُثْقٰى لَا انْفِصَامَ لَهَا ۗوَاللّٰهُ سَمِيْعٌ عَلِيْمٌ * اَللّٰهُ وَلِيُّ الَّذِيْنَ اٰمَنُوْا يُخْرِجُهُمْ مِّنَ الظُّلُمٰتِ اِلَى النُّوْرِۗ وَالَّذِيْنَ كَفَرُوْٓا اَوْلِيَاۤؤُهُمُ الطَّاغُوْتُ يُخْرِجُوْنَهُمْ مِّنَ النُّوْرِ اِلَى الظُّلُمٰتِۗ اُولٰۤىِٕكَ اَصْحٰبُ النَّارِۚ هُمْ فِيْهَا خٰلِدُوْنَ",
        "لِلّٰهِ مَا فِى السَّمٰوٰتِ وَمَا فِى الْاَرْضِ ۗ وَاِنْ تُبْدُوْا مَا فِيْٓ اَنْفُسِكُمْ اَوْ تُخْفُوْهُ يُحَاسِبْكُمْ بِهِ اللّٰهُ ۗ فَيَغْفِرُ لِمَنْ يَّشَاۤءُ وَيُعَذِّبُ مَنْ يَّشَاۤءُ ۗ وَاللّٰهُ عَلٰى كُلِّ شَيْءٍ قَدِيْرٌ * اٰمَنَ الرَّسُوْلُ بِمَآ اُنْزِلَ اِلَيْهِ مِنْ رَّبِّهٖ وَالْمُؤْمِنُوْنَۗ كُلٌّ اٰمَنَ بِاللّٰهِ وَمَلٰۤىِٕكَتِهٖ وَكُتُبِهٖ وَرُسُلِهٖۗ لَا نُفَرِّقُ بَيْنَ اَحَدٍ مِّنْ رُّسُلِهٖ ۗ وَقَالُوْا سَمِعْنَا وَاَطَعْنَا غُفْرَانَكَ رَبَّنَا وَاِلَيْكَ الْمَصِيْرُ * لَا يُكَلِّفُ اللّٰهُ نَفْسًا اِلَّا وُسْعَهَا ۗ لَهَا مَا كَسَبَتْ وَعَلَيْهَا مَا اكْتَسَبَتْ ۗ رَبَّنَا لَا تُؤَاخِذْنَآ اِنْ نَّسِيْنَآ اَوْ اَخْطَأْنَا ۚ رَبَّنَا وَلَا تَحْمِلْ عَلَيْنَآ اِصْرًا كَمَا حَمَلْتَهٗ عَلَى الَّذِيْنَ مِنْ قَبْلِنَا ۚ رَبَّنَا وَلَا تُحَمِّلْنَا مَا لَا طَاقَةَ لَنَا بِهٖۚ وَاعْفُ عَنَّاۗ وَاغْفِرْ لَنَاۗ وَارْحَمْنَا ۗ اَنْتَ مَوْلٰىنَا فَانْصُرْنَا عَلَى الْقَوْمِ الْكٰفِرِيْنَ",
        "بِسْمِ اللّٰهِ الرَّحْمٰنِ الرَّحِيْمِ \n" +
                "قُلْ هُوَ اللّٰهُ اَحَدٌۚ * اَللّٰهُ الصَّمَدُۚ * لَمْ يَلِدْ وَلَمْ يُوْلَدْۙ * وَلَمْ يَكُنْ لَّهٗ كُفُوًا اَحَدٌ\n",
        " بِسْمِ اللّٰهِ الرَّحْمٰنِ الرَّحِيْمِ\n" +
                "قُلْ اَعُوْذُ بِرَبِّ الْفَلَقِۙ * مِنْ شَرِّ مَا خَلَقَۙ * وَمِنْ شَرِّ غَاسِقٍ اِذَا وَقَبَۙ * وَمِنْ شَرِّ النَّفّٰثٰتِ فِى الْعُقَدِۙ * وَمِنْ شَرِّ حَاسِدٍ اِذَا حَسَدَ",
        " بِسْمِ اللّٰهِ الرَّحْمٰنِ الرَّحِيْمِ\n" +
                "ْ اَعُوْذُ بِرَبِّ النَّاسِۙ * مَلِكِ النَّاسِۙ * اِلٰهِ النَّاسِۙ * مِنْ شَرِّ الْوَسْوَاسِ ەۙ الْخَنَّاسِۖ * الَّذِيْ يُوَسْوِسُ فِيْ صُدُوْرِ النَّاسِۙ * مِنَ الْجِنَّةِ وَالنَّاسِ",
        "أَصْبَحْنَا وَأَصْبَحَ الْمُلْكُ لِلَّهِ وَلْحَمْدُ لِلهِ لَا شَرِيْكَ لَهُ لَا إِلَهَ إِلَّاهُوَ وَإِلَيْهِ النُّشُوْرُ.",
        "أَصْبَحْنَا عَلَى فِطْرَةِ الْإِسْلَامْ وَكَلِمَةِ الْإخْلَاصْ وَعَلَى دِيْنِ نَبِيِّنَا مُحَمَّدٍ صَلَّ اللهُ عَلَيْهِ وَسَلَّمَ وَعَلَى مِلَّةِ أَبِيْنَا إِبْرَاهِيْمَ حَنِيْفًا وَمَاكَانَ مِنَ الْمُشْرِكِيْنَ.",
        "أَللَّهُمَّ إِنِّىْ أَصْبَحْتُ مِنْكَ فِىْ مِنْ نِعْمَةٍ وَعَافِيَةٍ وَسِتْرٍ فَأَتِمَّ عَلَىَّ نِعْمَتَكَ وَعَافِيَتَكَ وَسِتْرَكَ فِىْ الدِّيْنِ وَالدُّنْيَا وَالْأَخِرَة.",
        "اَللَّهُمَّ مَا أَصْبَح بِى مِنْ نِعْمَتٍ أَوْبِأَحَدٍ مِنْ خَلْقِكَ فَمِنْكَ وَحْدَكَ لَاشَرِيْكَ لَكَ فَلَكَ الْحَمْدُ وَلَكَ الشُّكْرُ.",
        "يَارَبِّىْ لَكَ الْحَمْدُ كَمَا يَنْبَغِىْ لِجَلَالِ وَجْهِكَ الْكَرِيْمِ وَعَظِيْمِ سُلْطَانِكَ.",
        "رَضِيْتُ بِاللهِ رَبًّا وَبِالْإِسْلَامِ دِيْنًا وَبِامُحَمَّدٍ نَبِيًّا وَرَسُوْلًا.",
        "سُبْحَانَ اللَّهِ وَبِحَمْدِهِ عَدَدَ خَلْقِهِ وَرِضَا نَفْسِهِ وَزِنَةَ عَرْشِهِ وَمِدَادَ كَلِمَاتِهِ.",
        "بِسْمِ اللهِ الَّذِىْ لَايَضُرُّ مَعَ اسْمِهِ شَىْءٌ فِى لْأَرْضِ وَلَا فِى السَّمَاءِ وَهُوَالسَّمِيعُ الْعَلِيمُ.",
        "اَللَّهُمَّ إِنَّا نَعُوْذُبِكَ مِنْ أَنْ نُشْرِكَ بِكَ شَيْئًا نَعْمَلُهُ وَنَسْتَغْفِرُكَ لِمَا لَا نَعْلَمُه.",
        "أَعُوْذُبِكَلِمَاتِ اللهِ التَّامَّاتِ مِنْ شَرِّمَاخَلَقَ.",
        "اللَّهُمَّ إِنِّي أَعُوذُ بِكَ مِنَ الْهَمِّ وَالْحَزَنِ وَأَعُوذُ بِكَ مِنَ الْعَجْزِ وَالْكَسَلِ وَأَعُوذُبِكَ مِنَ الْجُبْنِ وَالْبُخْلِ وَأَعُوذُ بِكَ مِنْ غَلَبَةِ الدَّيْنِ وَقَهْرِ الرِّجَالِ.",
        "اَلَّلهُمَّ عَافِنِىْ فِىْ بَدَنِىْ اَلَّلهُمَّ عَافِنِىْ فِىْ سَمْعِى اَلَّلهُمَّ عَافِنِىْ فِىْ بَصَرِىْ.",
        "اَلَّلهُمَّ إِنِّىْ أَعُوْذُبِكَ مَنَ الْكُفْرِ وَالْفَقْرِ اَلَّلهُمَّ إِنِّىْ أَعُوْذُبِكَ مِنْ عَذَابِ الْقَبْرِ لَا إِلَهَ إِلَّا أَنْتَ.",
        "اَلَّلهُمَّ أَنْتَ رَبِّى لَاإِلَهَ إِلَّا أَنْتَ خَلَقْتَنِىْ وَأَنَا عَلَىْ عَهْدِكَ وَوَعْدِكَ مَااسْتَطَعْتُ أَعُوْذُبِكَ مِنْ شَرِّمَا صَنَعْتُ أَبُوْءُلَكَ بِنِعْمَتِكَ عَلَىَّ وَأَبُوْءُ بِذَنْبِى فَاغْفِرْلِىْ فَاإِنَّهُ لَايَغفِرُ الذُّنُوْبَ إِلَّا أَنْتَ.",
        "أَسْتَغْفِرُاللهَ الَّذِىْ لَا إِلَّهَ إَلَّا هُوَ الْحَيُّ الْقًيُّمُ وَأَتُوْبُ إِلَيْهِ.",
        "اللَّهُمَّ صَلِّ عَلَى سَيِّدِنَا مُحَمَّدٍ ، وَعَلَى آلِ  سَيِّدِنَا مُحَمَّدٍ ، كَمَا صَلَّيْتَ عَلَى سَيِّدِنَا إِبْرَاهِيمَ وَعَلَى آلِ  سَيِّدِنَا إِبْرَاهِيمَ وَبَارِكْ عَلَى سَيِّدِنَا مُحَمَّدٍ وَعَلَى آلِ عَلَى سَيِّدِنَا مُحَمَّدٍ، كَمَا بَارَكْتَ عَلَى سَيِّدِنَا إِبْرَاهِيمَ وَعَلَى آلِ  سَيِّدِنَا إِبْرَاهِيمَ فِىْ الْعَالَمِيْنَ إِنَّكَ حَمِيدٌ مَجِيدٌ.",
        "سُبْحَنَ اللهِ وَالْحَمْدُ اللهِ وَلَا إِلَهَ إِلَّا اللهُ أَكْبَرْ.",
        "لَا إِلَهَ إِلَّا اللهُ وَحْدَهُ لَا شَرِكَ لَهُ , لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَىْ كُلِّ شَيْءٍ قَدِيْرٌ.",
        "سُبْحَانَكَ الّلهُمَّ وَبِحَمْدِكَ أَشْهَدُ أَنْ لَا إِلَهَ إِلَّا أَنْتَ أَسْتَغْفِرُكَ وَأَتُوْبُ إِلَيْكَ.",
        "اَللَّهُمَّ صَلِّ عَلَى سَيِّدِنَا مُحَمَّدٍ عَبْدِكَ وَرَسُوْلِكَ النَّبِيِّ الأُمِّيِّ وَعَلَى آلِهِ وَصَحْبِهِ وَسَلِّمْ تَسْلِيْمًا عَدَدَ مَا أَحَاطَ بِهِ عِلْمُكَ وَخَطَّ بِهِ قَلَمُكَ وَأَحْصَاهُ كِتَابُكَ، وَارْضَ اللَّهُمَّ عَنْ سَادَاتِنَا أَبِيْ بَكْرٍ وَعُمَرَ وَعُثْمَانَ وَعَلِيْ، وَعَنِ الصَّحَابَةِ أَجْمَعِيْنَ، وَعَنِ التَّابِعِيْنَ وَتَابِعِيْهِمْ بِإِحْسَانٍ إِلَى يَوْمِ الدِّيْن سُبْحَانَ رَبِّك رَبِّ العِزَّةِ عَمَّا يَصِفُوْنَ، وَسَلَامٌ عَلَى المُرْسَلِيْنَ، وَالحَمْدُ لِلَّهِ رَبِّ  العَالَمِيْنَ.",
        "قُلِ اللَّهُمَّ مَالِكَ الْمُلْكِ تُؤْتِي الْمُلْكَ مَنْ تَشَاءُ وَتَنْزِعُ الْمُلْكَ مِمَّنْ تَسَاءَ وَتُعِزُّ مَنْ تَشَاءَ وَتُذِلُّ مَنْ تَشَاءَ بِيَدِكَ الْخَيْرُ إِنَّكَ عَلَىَ كُلِّ شَيْءٍ قَدِيْرٌ. تُوْلِجُ الَّيْلَ فِي النَّهَارِ وَتُوْلِجُ النَّهَارَ فِيْ الَّيْلِ وَتُحْرِجُ الْحَيَّ مِنَ الْمَيِّتِ وَتُحْرِجُ الْمَيِّتَ مِنَ الْحَيِّ وَتَرْزُقُ مَنْ تَشَاء بِغَيْرِ حِسَابٍ.",
        "اَلَّلهُمَّ إِنَّ هَذَا إِقْبَالُ نَهَارِكَ وَإِدْبَارُ لَيْلِكَ وَأَصْوَاةُ دُعَاتِكَ فَغْفِرْلِى.",
        "اَللّهُمَّ إِنَّكَ تَعْلَمُ أَنَّ هَذِهِ الْقُلُوْبَ، قَدِ اجْتَمَعَتْ عَلَى مَحَبَّتِكَ وَالْتَقَتْ عَلَى طَاعَتِكَ، وَتَوَحَّدَتْ عَلَى دَعْوَتِكَ وَتَعَاهَدَتْ عَلَى نُصْرَةِ شَرِيْعَتِكَ فَوَثِّقِ اللَّهُمَّ رَابِطَتَهَا، وَأَدِمْ وُدَّهَا، وَاهْدِهَا سُبُلَهَا وَامْلَأَهَا بِنُوْرِكَ الَّذِيْ لاَ يَخْبُوْا وَاشْرَحْ صُدُوْرَهَا بِفَيْضِ الْإِيْمَانِ بِكَ، وَجَمِيْلِ التَّوَكُّلِ عَلَيْكَ وَاَحْيِهَا بِمَعْرِفَتِكَ، وَأَمِتْهَا عَلَى الشَّهَادَةِ فِي سَبِيْلِكَ إِنَّكَ نِعْمَ الْمَوْلَى وَنِعْمَ النَّصِيْرِ. اَللَّهُمَّ أَمِيْنَ. وَصَلِّ اللَّهُمَّ عَلَى سَيِّدَنَا مُحَمَّدٍ وَعَلَى آلِهِ وَصَحْبِهِ وَسَلِّمَ."
    )

    private val txtLatinPagiKubro = arrayOf(
        //Demo Latin
        "A'uudzu billahissami'il 'aliimi minasy-syaithoonirrojiim",
        "Bismillāhir-raḥmānir-raḥīm * Al-ḥamdu lillāhi rabbil-'ālamīn * Ar-raḥmānir-raḥīm * māliki yaumid-dīn * Iyyāka na'budu wa iyyāka nasta'īn * Ihdinaṣ-ṣirāṭal-mustaqīm * Shirāṭallażīna an'amta 'alaihim gairil-magḍụbi 'alaihim wa laḍ-ḍāllīn.",
        "Bismillāhir-raḥmānir-raḥīm * alif lām mīm *  żālikal-kitābu lā raiba fīh, hudal lil-muttaqīn * al-lażīna yu`minụna bil-gaibi wa yuqīmụnaṣ-ṣalāta wa mimmā razaqnāhum yunfiqụn * wallażīna yu`minụna bimā unzila ilaika wa mā unzila ming qablik, wa bil-ākhirati hum yụqinụn * ulā`ika 'alā hudam mir rabbihim wa ulā`ika humul-mufliḥụn.",
        "Allāhu lā ilāha illā huw, al-ḥayyul-qayyụm, lā ta`khużuhụ sinatuw wa lā na`ụm, lahụ mā fis-samāwāti wa mā fil-arḍ, man żallażī yasyfa'u 'indahū illā bi`iżnih, ya'lamu mā baina aidīhim wa mā khalfahum, wa lā yuḥīṭụna bisyai`im min 'ilmihī illā bimā syā`, wasi'a kursiyyuhus-samāwāti wal-arḍ, wa lā ya`ụduhụ ḥifẓuhumā, wa huwal-'aliyyul-'aẓīm * lā ikrāha fid-dīn, qat tabayyanar-rusydu minal-gayy, fa may yakfur biṭ-ṭāgụti wa yu`mim billāhi fa qadistamsaka bil-'urwatil-wuṡqā lanfiṣāma lahā, wallāhu samī'un 'alīm * allāhu waliyyullażīna āmanụ yukhrijuhum minaẓ-ẓulumāti ilan-nụr, wallażīna kafarū auliyā`uhumuṭ-ṭāgụtu yukhrijụnahum minan-nụri ilaẓ-ẓulumāt, ulā`ika aṣ-ḥābun-nār, hum fīhā khālidụn",
        "Lillāhi mā fis-samāwāti wa mā fil-arḍ, wa in tubdụ mā fī anfusikum au tukhfụhu yuḥāsibkum bihillāh, fa yagfiru limay yasyā`u wa yu'ażżibu may yasyā`, wallāhu 'alā kulli syai`ing qadīr * āmanar-rasụlu bimā unzila ilaihi mir rabbihī wal-mu`minụn, kullun āmana billāhi wa malā`ikatihī wa kutubihī wa rusulih, lā nufarriqu baina aḥadim mir rusulih, wa qālụ sami'nā wa aṭa'nā gufrānaka rabbanā wa ilaikal-maṣīr * lā yukallifullāhu nafsan illā wus'ahā, lahā mā kasabat wa 'alaihā maktasabat, rabbanā lā tu`ākhiżnā in nasīnā au akhṭa`nā, rabbanā wa lā taḥmil 'alainā iṣrang kamā ḥamaltahụ 'alallażīna ming qablinā, rabbanā wa lā tuḥammilnā mā lā ṭāqata lanā bih, wa'fu 'annā, wagfir lanā, war-ḥamnā, anta maulānā fanṣurnā 'alal-qaumil-kāfirīn\n",
        "Qul huwallāhu aḥad * allāhuṣ-ṣamad * lam yalid wa lam yụlad * wa lam yakul lahụ kufuwan aḥad",
        "Qul a'ụżu birabbil-falaq * min syarri mā khalaq * wa min syarri gāsiqin iżā waqab * wa min syarrin-naffāṡāti fil-'uqad * wa min syarri ḥāsidin iżā ḥasad",
        "Qul a'ụżu birabbin-nās * malikin-nās * ilāhin-nās * min syarril-waswāsil-khannās * allażī yuwaswisu fī ṣudụrin-nās * minal-jinnati wan-nās",
        "Ash-bahnaa wa ash-bahal mulku lillaahi walhamdu lillaahi la syariika lahu laa ilaaha ilaa huwa wa ilaihi-nusyuur.",
        "Ash-bahnaa ‘alaa fithrotil islaami wakalimatil ikhlaashi wa ‘alaa diini nabiyyinaa muhammadin shollallohu ‘alaihi wa sallama wa ‘alaa millati abiinaa ibroohiima haniifaw wa maa kaana minal musyrikiin.",
        "Alloohumma innii ash-bahtu minka fii ni’matin wa ‘aafiyatin wa sitrin, fa atimma ‘alayya ni’mataka wa ‘aafiyataka wa sitroka fid-dunyaa wal- aakhiroh.",
        "Alloohumma maa ashbaha (amsaa) bii min ni’matin aw bi ahadin min kholqika faminka wahdaka laa syariika laka falakal-hamdu walakasy-syukr.",
        "Yaa Robbi lakal hamdu kamaa yambaghii lijalaali wajhika wa ‘azhiimi sulthonik.",
        "Rodhitu billahi robba wabil islaamidiinaa wabi Muhammadin nabiyya warosuula.",
        "Subhaanalloohi wabihamdihi kholqihi wa ridhoo nafsihi wazinata ‘arsyihi wa midaada kalimaatih.",
        "Bismillaahil-ladzii laa yadhurru ma’asmihi syai-un fil-ardhi walaa fis-samaa i wahuwas-samii’ul ‘aliim.",
        "Alloohumma innaa na’uudzubika min an-nusyrika bika syai-an na’lamuhu wa nastaghfiruka limaa laa na’lamuh.",
        "A’uudzu bikalimaatillaahit-taammaaati min syarri maa kholaq.",
        "Alloohumma innii a’uudzubika minal hammi wal hazan, wa a’uudzubika minal ‘ajzi wal kasal, wa a’uudzubika minal jubni wal bukhli, wa a’uudzubika min gholabatid-daini wa qohrir-rijaal.",
        "Alloohumma ‘aafinii fii badanii. Alloohumma ‘aafini fi sam’ii. Alloohumma ‘aafinini fi bashorii.",
        "Alloohumma innii a’uudzubika minal kufri wal faqri, wa a’uudzubika min’adzaabil qobri, laa ilaaha ilaa anta.",
        "Alloohumma anta robbii laa ilaaha illaa anta kholaqtanii wa ana abduka wa ana ‘alaa ‘ahdika wawa’dika mastatho’tu, a’uudzubika min syarri maa shona’tu abuu-ulaka bini’matika ‘alayya wa abuu-u bidzambii faghfirlii fa innahuu laa yaghfirudz-dzunuuba ilaa anta.",
        "Astaghfirullohal-ladzii laa ilaaha illaa huwal-hayyul-qoyyuumu wa atuubu ilaih.",
        "Alloohumma sholli ‘alaa muhammadin wa ‘alaa alii muhammad, kamaa shollaita ‘alaa ibroohiima wa ‘alaa aali ibroohiim, wa baarik ‘alaa muhammadin wa ‘alaa alii muhammad, kamaa baarokta ‘alaa ibroohiima wa ‘alaa aali ibroohiim, fil ‘aalamiina innaka hamiidum majiid.",
        "Subhaanalloohi wal hamdu lillaahi wa laa ilaaha illalloohu walloohu akbar.",
        "Laa ilaaha illallahu wahdahu laa syariikalah, lahul mulku walahul hamdu wa huwa ‘alaa kulli syai-in qodiir.",
        "Subhaanakalloohumma wabihamdika asyhadu alla ilaaha illaa anta astaghfiruka wa atuubu ilaik.",
        "Alloohumma sholli ‘alaa sayyidina muhammadin ‘abdika wa nabiyyika wa rosuulikan-nabiyyil ummiyyi wa ‘alaa aalihi wa shohbihi wa sallim tasliiman ‘adada maa ahada bihi ‘ilmuka wa khoth tho bihi qolamuka wa ahshoohu kitaabuka, wardhollohumma ‘an saadaatinaa abii bakrin wa ‘umaro wa ‘utsmaana wa ‘aliyy, wa ‘anishshohaabati ajma’iin, wa ‘anit-taabi’iina wa taabi’iihim bi ihsaanin ilaa yaumid-diin. Subhaana robbika robbil ‘izzati ‘ammaa yashifuun, wa salaamun ‘alal mursaliin, wal-hamdu lillaahi robbil ‘aalamiin.",
        "Qulillahumma maalikal mulki tu’til mulka man tasyaa, wa tanji’ul mulka mimman tasyaa, wa tu’izzu man tasyaa-u wa tudzillu man tasyaa, biyadikal khoiru innaka ‘alaa kulli syai-in qodiir. Tuulijul-laila fin nahaari wa tuulijun- nahaaro fil-laili, wa tukhrijul hayya minal mayyiti, wa tukhrijul mayyita minal hayyim wa tarzuqu man tasyaa-u bighoiri hisaaab.",
        "Alloohumma inna haadzaa iqbaalu lailika wa idbaaru nahaarika wa ashwaatu du’aatika, faghfirlii.",
        "Allohumma innaka ta’lamu anna haadzihil quluub, qodijtama’at ‘alaa mahabbatik, wal taqot ‘alaa thoo’atik, wa tawahhadat ‘alaaa da’watik, wa ta’aahadat ‘alaa nashroti syarii’atik, fawats-tsiqillaahumma roobithotahaa, wa- adim wuddahaa, wahdihaa subulahaa, wamla’haa binuurikal ladzii laa yakhbuu, wasyroh shuduurikal ladzii laa yakhbuu, wasyroh shuduurohaa, bifaidhil iimaanibik, wa jamiilit-tawakkuli ‘alaik, wa ahyihaa bima’rifathik, wa amit-haa ‘alasy-syahadaati fii sabiilik, innaka ni’mal maula wa ni’man-nashiir. Aamiin. Alloohumma aamiin. Wa shollillaahumma ‘alaa sayyidina muhammadin wa ‘alaa aalihi wa shohbihi wa sallam."
    )

    private val txtDescPagiKubro = arrayOf(
        //Demo Terjemahan
        "Aku berlindung kepada Allah yang maha mendengar lagi maha mengetahui, dari godaan setan yang terkutuk.",
        "Dengan nama Allah Yang Maha Pengasih, Maha Penyayang. ** Segala puji bagi Allah, Tuhan seluruh alam. ** Yang Maha Pengasih, Maha Penyayang. ** Pemilik hari pembalasan. ** Hanya kepada Engkaulah kami menyembah dan hanya kepada Engkaulah kami mohon pertolongan. ** Tunjukilah kami jalan yang lurus, ** (yaitu) jalan orang-orang yang telah Engkau beri nikmat kepadanya; bukan (jalan) mereka yang dimurkai, dan bukan (pula jalan) mereka yang sesat.",
        "Dengan nama Allah Yang Maha Pengasih, Maha Penyayang. ** Alif Lam Mim. ** Kitab (Al-Qur'an) ini tidak ada keraguan padanya; petunjuk bagi mereka yang bertakwa, ** (yaitu) mereka yang beriman kepada yang gaib, melaksanakan salat, dan menginfakkan sebagian rezeki yang Kami berikan kepada mereka, ** dan mereka yang beriman kepada (Al-Qur'an) yang diturunkan kepadamu (Muhammad) dan (kitab-kitab) yang telah diturunkan sebelum engkau, dan mereka yakin akan adanya akhirat. ** Merekalah yang mendapat petunjuk dari Tuhannya, dan mereka itulah orang-orang yang beruntung.",
        "Allah, tidak ada tuhan selain Dia. Yang Mahahidup, Yang terus menerus mengurus (makhluk-Nya), tidak mengantuk dan tidak tidur. Milik-Nya apa yang ada di langit dan apa yang ada di bumi. Tidak ada yang dapat memberi syafaat di sisi-Nya tanpa izin-Nya. Dia mengetahui apa yang di hadapan mereka dan apa yang di belakang mereka, dan mereka tidak mengetahui sesuatu apa pun tentang ilmu-Nya melainkan apa yang Dia kehendaki. Kursi-Nya meliputi langit dan bumi. Dan Dia tidak merasa berat memelihara keduanya, dan Dia Mahatinggi, Mahabesar. ** Tidak ada paksaan dalam (menganut) agama (Islam), sesungguhnya telah jelas (perbedaan) antara jalan yang benar dengan jalan yang sesat. Barang siapa ingkar kepada Tagut dan beriman kepada Allah, maka sungguh, dia telah berpegang (teguh) pada tali yang sangat kuat yang tidak akan putus. Allah Maha Mendengar, Maha Mengetahui. ** Allah pelindung orang yang beriman. Dia mengeluarkan mereka dari kegelapan kepada cahaya (iman). Dan orang-orang yang kafir, pelindung-pelindungnya adalah setan, yang mengeluarkan mereka dari cahaya kepada kegelapan. Mereka adalah penghuni neraka. Mereka kekal di dalamnya.",
        "Milik Allah-lah apa yang ada di langit dan apa yang ada di bumi. Jika kamu nyatakan apa yang ada di dalam hatimu atau kamu sembunyikan, niscaya Allah memperhitungkannya (tentang perbuatan itu) bagimu. Dia mengampuni siapa yang Dia kehendaki dan mengazab siapa yang Dia kehendaki. Allah Mahakuasa atas segala sesuatu. ** Rasul (Muhammad) beriman kepada apa yang diturunkan kepadanya (Al-Qur'an) dari Tuhannya, demikian pula orang-orang yang beriman. Semua beriman kepada Allah, malaikat-malaikat-Nya, kitab-kitab-Nya dan rasul-rasul-Nya. (Mereka berkata), “Kami tidak membeda-bedakan seorang pun dari rasul-rasul-Nya.” Dan mereka berkata, “Kami dengar dan kami taat. Ampunilah kami Ya Tuhan kami, dan kepada-Mu tempat (kami) kembali.” ** Allah tidak membebani seseorang melainkan sesuai dengan kesanggupannya. Dia mendapat (pahala) dari (kebajikan) yang dikerjakannya dan dia mendapat (siksa) dari (kejahatan) yang diperbuatnya. (Mereka berdoa), “Ya Tuhan kami, janganlah Engkau hukum kami jika kami lupa atau kami melakukan kesalahan. Ya Tuhan kami, janganlah Engkau bebani kami dengan beban yang berat sebagaimana Engkau bebankan kepada orang-orang sebelum kami. Ya Tuhan kami, janganlah Engkau pikulkan kepada kami apa yang tidak sanggup kami memikulnya. Maafkanlah kami, ampunilah kami, dan rahmatilah kami. Engkaulah pelindung kami, maka tolonglah kami menghadapi orang-orang kafir.”",
        "Katakanlah (Muhammad), “Dialah Allah, Yang Maha Esa. ** Allah tempat meminta segala sesuatu. ** (Allah) tidak beranak dan tidak pula diperanakkan. ** Dan tidak ada sesuatu yang setara dengan Dia.”",
        "Katakanlah, “Aku berlindung kepada Tuhan yang menguasai subuh (fajar), ** dari kejahatan (makhluk yang) Dia ciptakan, ** dan dari kejahatan malam apabila telah gelap gulita, ** dan dari kejahatan (perempuan-perempuan) penyihir yang meniup pada buhul-buhul (talinya), ** dan dari kejahatan orang yang dengki apabila dia dengki.” ** dan dari kejahatan orang yang dengki apabila dia dengki.”",
        "Katakanlah, “Aku berlindung kepada Tuhannya manusia, ** Raja manusia, ** ilāhin-nās ** min syarril-waswāsil-khannās ** allażī yuwaswisu fī ṣudụrin-nās ** dari (golongan) jin dan manusia.”",
        "Kami berpagi hari dan berpagi hari pula kerajaan milik Allah. Segala puji bagi Allah, tiada sekutu bagi-Nya, tiada Tuhan melainkan Dia dan kepada-Nya tempat kembali.",
        "Kami berpagi (sore) hari di atas fitrah Islam, di atas kata keikhlasan, di atas agama Nabi kami: Muhammad saw, dan diatas millah bapak kami: Ibrahim yang hanif. Dan ia bukan termasuk golongan orang – orang yang musyrik.",
        "Ya Allah, sesungguhnya aku memulai pagi ini dengan kenikmatan, kesehatan dan perlindungan-Mu. Maka sempurnakanlah untukku kenikmatan, kesehatan dan perlindungan-Mu itu dalam agamaku, dunia dan juga akhirat.",
        "Ya Allah, kenikmatan yang aku atau salah seorang dari makhluk-Mu berpagi hari dengannya, adalah dari-Mu semata; tiada sekutu bagi-Mu. Maka bagi-Mu segala puji dan rasa syukur.",
        "Ya Rabbi, bagi-Mu segala puji sebagaimana seyogyanya bagi kemuliaan wajah-Mu dan keagungan kekuasaan-Mu.",
        "Aku ridho Allah sebagai Rabb, Islam sebagai agama, Muhammad sebagai Nabi dan Rasul.",
        "Maha Suci Allah dan pujian bagi-Nya; sebanyak bilangan makhluk-Nya serela diri-Nya setimbangan ‘Arasy-Nya dan sebanyak tinta (bagi) kata – kata-Nya.",
        "Dengan nama Allah, yang bersama nama-Nya tidak celaka sesuatupun yang ada di bumi dan di langit. Dan Dia-lah Yang Maha Mendengar lagi Maha Mengetahui.",
        "Ya Allah, sesungguhnya kami berlindung kepada-Mu dari menyekutukan-Mu dengan sesuatu yang kami ketahui, dan kami mohon ampun kepada-Mu untuk sesuatu yang tidak kami ketahui.",
        "Aku berlindung dengan Kalimatullah yang sempurna, dari kejahatan (makhluk) yang Dia ciptakan.",
        "Ya Allah, aku berlindung kepada-Mu dari rasa gelisah dan sedih, dari kelemahan dan kemalasan, dan sifat pengecut dan bakhil, dan dari tekanan hutang dan kesewenang – wenangan orang.",
        "Ya Allah, sehatkan badanku; Ya Allah, sehatkan pendengaranku; Ya Allah, sehatkan penglihatanku.",
        "Ya Allah, aku berlindung kepada-Mu dari kekufuran dan kefakiran; ya Allah, aku berlindung kepada-Mu dari adzab kubur. Tiada Tuhan kecuali Engkau.",
        "Ya Allah, Engkaulah Tuhanku, tiada Tuhan kecuali Engkau. Engkau ciptakan aku dan aku adalah hamba-Mu. Aku berada di atas janji-Mu, semampuku. Aku mohon perlindungan dari kejelekan perbuatku. Aku mengakui banyaknya nikmat-Mu (yang Engkau anugerahkan) kepadaku dan aku mengakui dosa – dosaku, maka ampunilah aku. Karena sesungguhnya tiada yang mengampuni dosa – dosa melainkan Engkau.",
        "Aku mohon ampun kepada Allah, yang tiada Tuhan kecuali Dia, Yang Maha Hidup kekal dan senantiasa mengurus (makhluk-Nya) dan kepada-Nya aku bertaubat.\n",
        "Ya Allah berikanlah shalawat kepada Muhammad dan keluarga Muhammad, sebagaimana telah Engkau berikan kepada Ibrahim dan keluarga Ibrahim. Berikanlah barakah kepada Muhammad dan keluarga Muhammad, sebagaimana telah Engkau berikan kepada Ibrahim dan keluarga Ibrahim. Dia alam ini, Engkaulah yang Maha Terpuji lagi Maha Mulia.",
        "Maha suci Allah, segala puji bagi Allah, tiada Tuhan melainkan Allah dan Allah Maha Besar.",
        "Tiada Tuhan melainkan Allah semata, yang tiada sekutu bagi-Nya, bagi- Nya kerajaan dan bagi-Nya segala puji, dan Dia berkuasa atas segala sesuatu.",
        "Maha suci Engkau ya Allah, dan segala puji bagi-Mu. Aku bersaksi bahwa tiada Tuhan melainkan Engkau. aku mohon ampun dan bertaubat kepada- Mu.",
        "Ya Allah berikanlah shalawat kepada Nabi Muhammad; hamba-Mu, nabi- Mu, dan Rasul-Mu; Nabi yang ummi. Juga kepada keluarga dan para sahabatnya serta berilah keselamatan sebanyak yang terjangkau oleh ilmu- Mu; yang tergores oleh pena-Mu, dan yang terangkum oleh kitab-MU. Ridhailah ya Allah, para pemimpin kami: Abu Bakar, Umar, Utsman, dan Ali, semua sahabat, semua tabi’in dan orang – orang yang mengikuti mereka sampai hari pembalasan. Mahasuci Tuhanmu; Tuhan kemuliaan, dari apa – apa yang mereka sifatkan. Keselamatan semoga tercurah kepada para utusan dan segala puji bagi Allah, Tuhan sekalian Alam.",
        "Katakanlah: “Ya Allah, Tuhan Yang mempunyai kerajaan, Engkau berikan kerajaan kepada orang yang Engkau kehendaki dan Engkau cabut kerajaan dari orang yang Engkau kehendaki. Engkau muliakan orang yang Engkau kehendaki dan Engkau hinakan orang yang Engkau kehendaki. Di tangan Engkaulah segala kebajikan. Sesungguhnya Engkau Maha Kuasa atas segala sesuatu. Engkau masukkan malam ke dalam siang dan Engkau masukkan siang ke dalam malam. Engkau keluarkan yang hidup dari yang mati, dan Engkau keluarkan yang mati dari yang hidup. Dan Engkau beri rezeki siapa yang Engkau kehendaki tanpa hisab (batas).”",
        "Ya Allah, sesungguhnya ini adalah malam-Mu yang telah menjelang dan siang-Mu yang tengah berlalu serta suara – suara penyeru-Mu, maka ampunilah aku.",
        "Ya Allah, sesungguhnya Engkau Maha Mengetahui bahwa hati – hati ini telah berkumpul untuk mencurahkan mahabbah hanya kepada-Mu, bertemu untuk taat kepada-Mu, bersatu dalam rangka menyeru (di jalan)-Mu, dan berjanji setia untuk membela syariat-Mu, maka kuatkanlah ikatan pertaliannya, ya Allah, abadikanlah kasih sayangnya, tunjukkkanlah jalannya dan penuhilah dengan cahaya-Mu yang tidak pernah redup, lapangkanlah dadanya dengan limpahan iman dan keindahan tawakal kepada-Mu, hidupkanlah dengan ma’rifah-Mu. Sesungguhnya Engkau sebaik – baik pelindung dan sebaik – baik penolong. Amin. Dan semoga shalawat serta salam selalu tercurah kepada Muhammad, kepada keluarganya, dan kepada semua sahabatnya."
    )

    val listData: ArrayList<ModelDzikir>
        get() {
            val list = arrayListOf<ModelDzikir>()
            for (position in txtTitlePagiKubro.indices) {
                val dzikir = ModelDzikir()
                dzikir.title = txtTitlePagiKubro[position]
                dzikir.arabic = txtArabicPagiKubro[position]
                dzikir.latin = txtLatinPagiKubro[position]
                dzikir.desc = txtDescPagiKubro[position]
                list.add(dzikir)
            }
            return list
        }
}
