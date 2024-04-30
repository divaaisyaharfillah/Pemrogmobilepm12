package com.example.praktikum4;

import java.util.ArrayList;

public class DataSource {

    public static ArrayList<Instagram> instagrams = generateDummyInstagrams();

    private static ArrayList<Instagram> generateDummyInstagrams() {
        ArrayList<Instagram> instagrams1 = new ArrayList<>();
        instagrams1.add(new Instagram("guardian_id","Guardian Indonesia"
                ,"Hi, Guardian Angels! Yuk, jaga badanmu tetap sehat dengan Holisticare! Dapatkan harga special dengan minimal belanja apa saja sebesar 50 Ribu! \uD83D\uDE0F☀\uFE0F"
                ,R.drawable.guardian_profil,R.drawable.guardian_post));

        instagrams1.add(new Instagram("sociolla", "Sociolla"
                ,"Bestie, ikutan Pink Monday GIVEAWAY & menangin A Care Kit Skincare & Greentea Small Jar \uD83D\uDE4C\uD83C\uDFFD\uD83E\uDD0D"
                ,R.drawable.sociolla_profil,R.drawable.sociolla_post));

        instagrams1.add(new Instagram("victoriasecretid", "Victoria's Secret Indonesia"
                ,"Find your perfect destination with this limited time offer of our Bombshell Isle Bundle and save up to 41%."
                ,R.drawable.sociolla_profil, R.drawable.sociolla_post));

        instagrams1.add((new Instagram("melissashoes_id","Melissa Indonesia"
                ,"Elevate your style effortlessly with #MelissTownSandal's EVA platform sole, a fusion of lightweight comfort and chic sophistication!"
                ,R.drawable.melissa_profil,R.drawable.melissa_post)));

        instagrams1.add(new Instagram("watsonsindo", "Watsons Indonesia"
                ,"Kamu udah jadi membernya Watsons belum? Soalnya Watsons bakalan bagi-bagi voucher potongan up to 100rb loh khusus untuk member baru"
                ,R.drawable.watsons_profil,R.drawable.watsons_post));

        instagrams1.add(new Instagram("kkvindo","Kkv Official Indonesia"
                ,"Nggak tahan banget kalau liat makeup tester di KKV!"
                ,R.drawable.kkv_profil, R.drawable.kkv_post));

        instagrams1.add(new Instagram("minisoindonesia","Official Miniso Indonesia"
                , "Ada bantal leher, travel kit, kacamata, powerbank, dan barang lainnya yang pasti wajib banget kamu bawa loh!"
                ,R.drawable.miniso_profil,R.drawable.miniso_post));

        instagrams1.add(new Instagram("footlockerid","Foot Locker Indonesia"
                ,"Bolder Superstar with amped-up comfort. Classic details, reworked proportions, ready to dress up or down."
                ,R.drawable.footlocker_profil, R.drawable.footlocker_post));

        instagrams1.add(new Instagram("boots_idn", "Boots Indonesia"
                ,"Hi Boots Friends! Jangan lupa untuk tampil percaya diri sepanjang puasa dengan cara merawat diri. Boots punya kabar baik nih, sekarang Boots lagi ada diskon hemat hingga 50% loh!"
                ,R.drawable.boots_profil, R.drawable.boots_post));

        instagrams1.add(new Instagram("beautyhaulofficial", "Beauty Haul Indonesia"
                ,"Jangan lupa borong semua produk Somethinc di #BeautyHaulMart karena bakal ada diskon gede-gedean anti boncos dan udah pasti cuan cuan cuan"
                ,R.drawable.beautyhaul_profil, R.drawable.beautyhaul_post));
        return instagrams1;
    }
}


