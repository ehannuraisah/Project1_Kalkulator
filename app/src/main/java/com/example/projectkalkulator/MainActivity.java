package com.example.projectkalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
// deklarasi variable

   EditText MasukkanAngkaPertama, MasukkanAngkaKedua;
   Button Tambah, Kurang, Kali, Bagi, BERSIHKAN;
   TextView HASIL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MasukkanAngkaPertama = (EditText) findViewById(R.id.txtMasukkanAngkaPertama);
        MasukkanAngkaKedua = (EditText) findViewById(R.id.txtMasukkanAngkaKedua);
        Tambah = (Button) findViewById(R.id.btntambah);
        Kurang = (Button) findViewById(R.id.btnKurang);
        Kali = (Button) findViewById(R.id.btnKali);
        Bagi = (Button) findViewById(R.id.btnBagi);
        BERSIHKAN = (Button)  findViewById(R.id.btnBersihkan);
        HASIL = (Button) findViewById(R.id.txtHasil);
        tambah.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick (View v){
                if ((MasukkanAngkaPertama.getText().length()>0)&& (MasukkanAngkaKedua.getText()>0)) {
                    double angka1 = Double.parseDouble(MasukkanAngkaPertama.getText().toString());
                    double angka2 = Double.parseDouble(MasukkanAngkaKedua.getText().toString());
                    double result = angka1 + angka2;
                    HASIL.setText(Double.toString(result));
                }
                else {
                    Toast toast = Toast.makeText(Context: MainActivity.this, Text
                    "Mohon Masukkan Angka Pertama dan Kedua", Toast.LENGTH_LONG);
                    toast.show();
                }

            }
        })
        Kurang.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick (View v){
                if ((MasukkanAngkaPertama.getText().length()>0)&& (MasukkanAngkaKedua.getText()>0)) {
                    double angka1 = Double.parseDouble(MasukkanAngkaPertama.getText().toString());
                    double angka2 = Double.parseDouble(MasukkanAngkaKedua.getText().toString());
                    double result = angka1 - angka2;
                    HASIL.setText(Double.toString(result));
                }
                else {
                    Toast toast = Toast.makeText(Context: MainActivity.this, Text
                    "Mohon Masukkan Angka Pertama dan Kedua", Toast.LENGTH_LONG);
                    toast.show();  }}}
                Kali.setOnClickListener (new View.OnClickListener(){
                    @Override
                    public void onClick (View v){
                        if ((MasukkanAngkaPertama.getText().length()>0)&& (MasukkanAngkaKedua.getText()>0)) {
                            double angka1 = Double.parseDouble(MasukkanAngkaPertama.getText().toString());
                            double angka2 = Double.parseDouble(MasukkanAngkaKedua.getText().toString());
                            double result = angka1 * angka2;
                            HASIL.setText(Double.toString(result));
                        }
                        else {
                            Toast toast = Toast.makeText(Context: MainActivity.this, Text
                            "Mohon Masukkan Angka Pertama dan Kedua", Toast.LENGTH_LONG);
                            Bagi.setOnClickListener (new View.OnClickListener(){
                                @Override
                                public void onClick (View v){
                                    if ((MasukkanAngkaPertama.getText().length()>0)&& (MasukkanAngkaKedua.getText()>0)) {
                                        double angka1 = Double.parseDouble(MasukkanAngkaPertama.getText().toString());
                                        double angka2 = Double.parseDouble(MasukkanAngkaKedua.getText().toString());
                                        double result = angka1 / angka2;
                                        HASIL.setText(Double.toString(result));
                                    }
                                    else {
                                        Toast toast = Toast.makeText(Context: MainActivity.this, Text
                                        "Mohon Masukkan Angka Pertama dan Kedua", Toast.LENGTH_LONG);
                                        toast.show();                   toast.show();     }}}}
                        BERSIHKAN.setOnClickListener (new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                MasukkanAngkaPertama.setText("");
                                MasukkanAngkaKedua.setText("");
                                HASIL.setText("0");
                                MasukkanAngkaPertama.requestFocus();
                            }
                        }}


    }



}