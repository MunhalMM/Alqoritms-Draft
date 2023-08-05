package com.example.algorithmsdraft.testOne;

import java.util.ArrayList;
import java.util.List;

public class Ex13{
    public static void main(String[] args) {
        List<PictureType> list = new ArrayList<>();
        list.add(PictureType.AI);
        list.add(PictureType.CDR);
        list.add(PictureType.EPS);
        list.add(PictureType.ICO);
        list.add(PictureType.INDD);
        list.add(PictureType.JPEG);
        list.add(PictureType.PNG);
        list.add(PictureType.PSD);
        list.add(PictureType.RAW);
        list.add(PictureType.SVG);
        list.add(PictureType.TIFF);
        list.add(PictureType.WebP);
        list.add(PictureType.GIF);


        System.out.println(list);
    }
}
