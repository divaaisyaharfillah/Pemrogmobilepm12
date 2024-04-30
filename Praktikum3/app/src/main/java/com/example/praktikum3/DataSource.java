package com.example.praktikum3;

import java.util.ArrayList;

public class DataSource { //Ini adalah kelas yang bertanggung jawab untuk menyediakan data postingan dan cerita.

    public static ArrayList<Postingan> postingans = generateDummyPostingans(); //ArrayList yang berisi objek-objek Postingan

    private static ArrayList<Postingan> generateDummyPostingans() {
        ArrayList<Postingan> postingans = new ArrayList<>();
        postingans.add(new Postingan(R.drawable.guardian,"guardian_id", R.drawable.postgr, "Beauty Days"));
        postingans.add(new Postingan(R.drawable.sociolla,"sociolla", R.drawable.postsc, "As you breathe"));
        postingans.add(new Postingan(R.drawable.beauty,"beauty Haul", R.drawable.postbeauty, "Tetap harum seharian!"));
        postingans.add(new Postingan(R.drawable.boots,"boots_idn", R.drawable.postbo, "Halo boots Friends!"));
        postingans.add(new Postingan(R.drawable.foot,"fottlockerid", R.drawable.postfl, "Polished meets preppy"));
        postingans.add(new Postingan(R.drawable.miniso,"minisofficial", R.drawable.postmin, "Tersedia barang lucu"));
        postingans.add(new Postingan(R.drawable.kkv,"kkvindo", R.drawable.postkk, "Apakah kamu mau jalan-jalan?"));
        postingans.add(new Postingan(R.drawable.watsons,"watsonsindo", R.drawable.postwat, "Bagi-bagi voucher"));
        postingans.add(new Postingan(R.drawable.melissa,"melisaindo", R.drawable.postmel, "Temukan model kesukaan kamu"));
        postingans.add(new Postingan(R.drawable.vs,"victoriasecret", R.drawable.postvic, "Valid in store & online"));
        postingans.add(new Postingan(R.drawable.vs,"guardian_id", R.drawable.postgr, "Valid in store & online"));
        return postingans;
    }

    public static ArrayList<Story> stories = generateDummyStorys(); //ArrayList yang berisi objek-objek Story

    private static ArrayList<Story> generateDummyStorys() {
        ArrayList<Story> stories = new ArrayList<>();
        stories.add(new Story("guardian",R.drawable.guardian));
        stories.add(new Story("sociolla",R.drawable.sociolla));
        stories.add(new Story("beautyhaul",R.drawable.beauty));
        stories.add(new Story("boots",R.drawable.boots));
        stories.add(new Story("footlocker",R.drawable.foot));
        stories.add(new Story("minisopink",R.drawable.miniso));
        stories.add(new Story("kkv",R.drawable.kkv));
        stories.add(new Story("watsons",R.drawable.watsons));
        stories.add(new Story("melissa",R.drawable.melissa));
        stories.add(new Story("victoria",R.drawable.vs));
        return stories;
    }
}
