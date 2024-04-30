package com.example.praktikum5;

import java.util.ArrayList;

public class DataSource {

    public static ArrayList<Instagram> instagrams =generateDummyInstagram();

    private static ArrayList<Instagram> generateDummyInstagram() {
        ArrayList<Instagram> instagrams1 = new ArrayList<>();
        instagrams1.add(new Instagram("victoriasecretid", "Victoria Secret Official", "Find your perfect destination with this limited time offer of our Bombshell Isle Bundle and save up to 41%."
                ,R.drawable.victoria_profil, R.drawable.victoria_post));

        instagrams1.add(new Instagram("melissashoes_id", "Melissa Indonesia", "Elevate your style effortlessly with #MelissTownSandal's EVA platform sole, a fusion of lightweight comfort and chic sophistication!"
                ,R.drawable.melissa_profil, R.drawable.melissa_post));

        instagrams1.add(new Instagram("footlockerid", "Foot Locker Indonesia", "Bolder Superstar with amped-up comfort. Classic details, reworked proportions, ready to dress up or down."
                ,R.drawable.footlocker_profil, R.drawable.footlocker_post));

        instagrams1.add(new Instagram("guardian_id", "Guardian Indonesia", "Hi, Guardian Angels! Yuk, jaga badanmu tetap sehat dengan Holisticare! Dapatkan harga special dengan minimal belanja apa saja sebesar 50 Ribu!"
                ,R.drawable.guardian_profil, R.drawable.guardian_post));

        instagrams1.add(new Instagram("sociolla", "Sociolla Indonesia", "Bestie, ikutan Pink Monday GIVEAWAY & menangin A Care Kit Skincare & Greentea Small Jar"
                ,R.drawable.sociolla_profil, R.drawable.sociolla_post));

        return instagrams1;

    }

}

