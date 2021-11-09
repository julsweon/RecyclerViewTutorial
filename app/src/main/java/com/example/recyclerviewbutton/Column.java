package com.example.recyclerviewbutton;

import android.widget.Button;

public class Column {

    String label;
    int guidePics;
    int previewPic;
    Button openCam;

    public Column(String label, int guidePics, int previewPic, Button openCam) {
        this.label = label;
        this.guidePics = guidePics;
        this.previewPic = previewPic;
        this.openCam = openCam;
    }
}
