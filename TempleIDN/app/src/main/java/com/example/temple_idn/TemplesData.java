package com.example.temple_idn;

import java.util.ArrayList;

public class TemplesData {
    public static String[][] templeData = new String[][]{
            {"Candi Borobudur", "Magelang, Jawa Tengah", "https://raw.githubusercontent.com/danielprasaja/TempleList-dicoding-AP/master/img-temples/candi-borobudur.jpg"},
            {"Candi Prambanan", "Sleman, Daerah Istimewa Yogyakarta", "https://raw.githubusercontent.com/danielprasaja/TempleList-dicoding-AP/master/img-temples/candi-prambanan.jpg"},
            {"Candi Sewu", "Klaten, Jawa Tengah", "https://raw.githubusercontent.com/danielprasaja/TempleList-dicoding-AP/master/img-temples/candi-sewu.jpg"},
            {"Candi Mendut", "Magelang, Jawa Tengah", "https://raw.githubusercontent.com/danielprasaja/TempleList-dicoding-AP/master/img-temples/candi-mendut.jpg"},
            {"Candi Dieng", "Wonosobo, Jawa Tengah", "https://raw.githubusercontent.com/danielprasaja/TempleList-dicoding-AP/master/img-temples/candi-dieng.jpg"},
            {"Candi Ratu Boko", "Sleman, Daerah Istimewa Yogyakarta", "https://raw.githubusercontent.com/danielprasaja/TempleList-dicoding-AP/master/img-temples/candi-ratuboko.jpg"},
            {"Candi Gedong Songo", "Semarang, Jawa Tengah", "https://raw.githubusercontent.com/danielprasaja/TempleList-dicoding-AP/master/img-temples/candi-gedongsongo.jpg"},
            {"Candi Ijo", "Sleman, Daerah Istimewa Yogyakarta", "https://raw.githubusercontent.com/danielprasaja/TempleList-dicoding-AP/master/img-temples/candi-ijo.jpg"},
            {"Candi Sambisari", "Sleman, Daerah Istimewa Yogyakarta", "https://raw.githubusercontent.com/danielprasaja/TempleList-dicoding-AP/master/img-temples/candi-sambisari.jpg"},
            {"Candi Tikus", "Mojokerto, Jawa Timur", "https://raw.githubusercontent.com/danielprasaja/TempleList-dicoding-AP/master/img-temples/candi-tikus.jpg"},
            {"Candi Plaosan", "Klaten, Jawa Tengah", "https://raw.githubusercontent.com/danielprasaja/TempleList-dicoding-AP/master/img-temples/candi-plaosan.jpg"}
    };

    public static ArrayList<Temple> getListData(){
        ArrayList<Temple> list = new ArrayList<>();
        for (String[] data : templeData){
            Temple temple = new Temple();
            temple.setName(data[0]);
            temple.setLocation(data[1]);
            temple.setImage(data[2]);
            list.add(temple);
        }
        return list;
    }
}
