package com.chimpee.com.emlekpont_kavezo;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Open the google maps and show Emlékpont Kávézó location on it , when you click on the address text
        TextView address = (TextView)findViewById(R.id.address);
        address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.hu/maps/place/Eml%C3%A9kpont+K%C3%A1v%C3%A9z%C3%B3/@46.4147033,20.3228938,17z/data=!3m1!4b1!4m5!3m4!1s0x47446f708807ccb9:0x72f1515c8b80cc17!8m2!3d46.4147033!4d20.3250825";
                Uri gmmIntentUri = Uri.parse(url);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
         }
        });
        //Open the dial window and the phone number , when you click on the phone number text
        TextView phoneNumber = (TextView)findViewById(R.id.phone);
        phoneNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = "+36203245585";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });
        //Open the browser and show Emlékpont Kávéző facebook page , when you click on the facebbok address text
        TextView facebook = (TextView)findViewById(R.id.facebook);
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.facebook.com/emlekpontkavezo/";
                Uri webpage = Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
            }
        });
    }
}
