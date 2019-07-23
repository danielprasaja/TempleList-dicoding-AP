package com.example.temple_idn;

import java.util.ArrayList;

public class TemplesData {
    public static String[][] templeData = new String[][]{
            {"Test1","Test_info1","https://raw.githubusercontent.com/danielprasaja/TempleList-dicoding-AP/master/img-placeholder/placeholder-red.png"},
            {"Test2","Test_info2","https://raw.githubusercontent.com/danielprasaja/TempleList-dicoding-AP/master/img-placeholder/placeholder-red.png"},
            {"Test3","Test_info3","https://raw.githubusercontent.com/danielprasaja/TempleList-dicoding-AP/master/img-placeholder/placeholder-red.png"},
            {"Test4","Test_info4","https://raw.githubusercontent.com/danielprasaja/TempleList-dicoding-AP/master/img-placeholder/placeholder-red.png"},
            {"Test5","Test_info5","https://github.com/danielprasaja/TempleList-dicoding-AP/blob/master/img-placeholder/placeholder-red.png"},
            {"Test6","Test_info6","https://github.com/danielprasaja/TempleList-dicoding-AP/blob/master/img-placeholder/placeholder-red.png"},
            {"Test7","Test_info7","https://github.com/danielprasaja/TempleList-dicoding-AP/blob/master/img-placeholder/placeholder-red.png"},
            {"Test8","Test_info8","https://github.com/danielprasaja/TempleList-dicoding-AP/blob/master/img-placeholder/330px-Presiden_Sukarno.jpg"},
            {"Test9","Test_info9","https://github.com/danielprasaja/TempleList-dicoding-AP/blob/master/img-placeholder/placeholder-red.png"},
            {"Test10","Test_info10","https://github.com/danielprasaja/TempleList-dicoding-AP/blob/master/img-placeholder/placeholder-red.png"},
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
