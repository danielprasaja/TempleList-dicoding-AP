package com.example.temple_idn;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class TempleDetailActivity extends AppCompatActivity {
    public static final String TEMPLE_NAME = "temple_name";
    public static final String TEMPLE_LOCATION = "temple_location";
    public static final String TEMPLE_IMAGE = "temple_image";
    public static final String TEMPLE_IMAGE_SRC = "temple_image_source";
    public static final String TEMPLE_DETAIL_INFO = "temple_detail_information";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temple_detail);

        TextView templeName = findViewById(R.id.temple_name_dtl);
        TextView templeLocation = findViewById(R.id.temple_location_dtl);
        ImageView templeImage = findViewById(R.id.temple_img_dtl);
        TextView templeSrcImg = findViewById(R.id.temple_source_img);
        TextView templeInfoDtl = findViewById(R.id.temple_info_dtl);

        String name_temple = getIntent().getStringExtra(TEMPLE_NAME);
        String location_temple = getIntent().getStringExtra(TEMPLE_LOCATION);
        String image_temple = getIntent().getStringExtra(TEMPLE_IMAGE);
        String img_src_temple = getIntent().getStringExtra(TEMPLE_IMAGE_SRC);
        String detail_info_temple = getIntent().getStringExtra(TEMPLE_DETAIL_INFO);

        Glide.with(getBaseContext())
                .load(Uri.parse(image_temple))
                .into(templeImage);

        String img_src_temple_full = getString(R.string.sumber_gambar, img_src_temple);
        templeSrcImg.setText(img_src_temple_full);
        templeName.setText(name_temple);
        templeLocation.setText(location_temple);
        templeInfoDtl.setText(detail_info_temple);
    }
}
