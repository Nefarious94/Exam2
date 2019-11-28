package com.example.exam2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView pantalla;
    Button B1, B2, B3, B4, B5, B6, B7, B8, B9, B0, suma, resta, mult, div, c, fin, BI2;
    double ans;
    String tipo;
    Boolean calculo = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pantalla = findViewById(R.id.Pantalla);
        B1 = findViewById(R.id.B1);
        B2 = findViewById(R.id.B2);
        B3 = findViewById(R.id.B3);
        B4 = findViewById(R.id.B4);
        B5 = findViewById(R.id.B5);
        B6 = findViewById(R.id.B6);
        B7 = findViewById(R.id.B7);
        B8 = findViewById(R.id.B8);
        B9 = findViewById(R.id.B9);
        B0 = findViewById(R.id.B0);
        suma = findViewById(R.id.suma);
        resta = findViewById(R.id.resta);
        mult = findViewById(R.id.mult);
        div = findViewById(R.id.div);
        c = findViewById(R.id.C);
        fin = findViewById(R.id.fin);
        BI2 = findViewById(R.id.BI2);
        BI2.setText(".");

        pantalla.setText("0");

        BI2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (pantalla.getText().toString().indexOf(".") == -1){
                    if (pantalla.getText().equals("0")){
                        pantalla.setText("0.");
                    }else if (calculo==true) {
                        pantalla.setText("0.");
                        calculo = false;
                    }else{
                        pantalla.setText(pantalla.getText() + ".");
                    }
                }
            }
        });


        B1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (calculo == true){
                    pantalla.setText("0");
                    calculo = false;
                }
                if (pantalla.getText().equals("0")){
                    pantalla.setText("1");
                }else {
                    pantalla.setText(pantalla.getText() + "1");
                }
            }
        });

        B2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (calculo == true){
                    pantalla.setText("0");
                    calculo = false;
                }
                if (pantalla.getText().equals("0")){
                    pantalla.setText("2");
                }else {
                    pantalla.setText(pantalla.getText() + "2");
                }
            }
        });

        B3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (calculo == true){
                    pantalla.setText("0");
                    calculo = false;
                }
                if (pantalla.getText().equals("0")){
                    pantalla.setText("3");
                }else {
                    pantalla.setText(pantalla.getText() + "3");
                }
            }
        });

        B4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (calculo == true){
                    pantalla.setText("0");
                    calculo = false;
                }
                if (pantalla.getText().equals("0")){
                    pantalla.setText("4");
                }else {
                    pantalla.setText(pantalla.getText() + "4");
                }
            }
        });

        B4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (calculo == true){
                    pantalla.setText("0");
                    calculo = false;
                }
                if (pantalla.getText().equals("0")){
                    pantalla.setText("4");
                }else {
                    pantalla.setText(pantalla.getText() + "4");
                }
            }
        });

        B5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (calculo == true){
                    pantalla.setText("0");
                    calculo = false;
                }
                if (pantalla.getText().equals("0")){
                    pantalla.setText("5");
                }else {
                    pantalla.setText(pantalla.getText() + "5");
                }
            }
        });

        B6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (calculo == true){
                    pantalla.setText("0");
                    calculo = false;
                }
                if (pantalla.getText().equals("0")){
                    pantalla.setText("6");
                }else {
                    pantalla.setText(pantalla.getText() + "6");
                }
            }
        });

        B7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (calculo == true){
                    pantalla.setText("0");
                    calculo = false;
                }
                if (pantalla.getText().equals("0")){
                    pantalla.setText("7");
                }else {
                    pantalla.setText(pantalla.getText() + "7");
                }
            }
        });

        B8.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (calculo == true){
                    pantalla.setText("0");
                    calculo = false;
                }
                if (pantalla.getText().equals("0")){
                    pantalla.setText("8");
                }else {
                    pantalla.setText(pantalla.getText() + "8");
                }
            }
        });

        B9.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (calculo == true){
                    pantalla.setText("0");
                    calculo = false;
                }
                if (pantalla.getText().equals("0")){
                    pantalla.setText("9");
                }else {
                    pantalla.setText(pantalla.getText() + "9");
                }
            }
        });

        B0.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (calculo == true){
                    pantalla.setText("0");
                    calculo = false;
                }
                if (pantalla.getText().equals("0")){
                    pantalla.setText("0");
                }else {
                    pantalla.setText(pantalla.getText() + "0");
                }
            }
        });

        c.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                ans = 0;
                tipo = "";
                calculo = true;
                pantalla.setText("0");
            }
        });

        fin.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
               if (ans != 0){
                if (tipo.equals("+")){
                    ans = ans + Double.parseDouble(pantalla.getText().toString());
                    tipo = "+";
                    pantalla.setText(String.valueOf(ans));
                    ans = 0;
                    tipo = "";
                    calculo = true;
                }else if(tipo.equals("-")){
                    ans = ans - Double.parseDouble(pantalla.getText().toString());
                    tipo = "+";
                    pantalla.setText(String.valueOf(ans));
                    ans = 0;
                    tipo = "";
                    calculo = true;
                }else if(tipo.equals("*")){
                    ans = ans * Double.parseDouble(pantalla.getText().toString());
                    tipo = "+";
                    pantalla.setText(String.valueOf(ans));
                    ans = 0;
                    tipo = "";
                    calculo = true;
                }else if(tipo.equals("/")){
                    ans = ans / Double.parseDouble(pantalla.getText().toString());
                    tipo = "+";
                    pantalla.setText(String.valueOf(ans));
                    ans = 0;
                    tipo = "";
                    calculo = true;
                }
            }}
        });

        suma.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (ans == 0){
                    ans = Double.parseDouble(pantalla.getText().toString());
                    tipo = "+";
                    pantalla.setText(String.valueOf(ans));
                    calculo = true;
                }else{
                    if (tipo.equals("+")){
                        ans = ans + Double.parseDouble(pantalla.getText().toString());
                        tipo = "+";
                        pantalla.setText(String.valueOf(ans));
                        calculo = true;
                    }else if(tipo.equals("-")){
                        ans = ans - Double.parseDouble(pantalla.getText().toString());
                        tipo = "+";
                        pantalla.setText(String.valueOf(ans));
                        calculo = true;
                    }else if(tipo.equals("*")){
                        ans = ans * Double.parseDouble(pantalla.getText().toString());
                        tipo = "+";
                        pantalla.setText(String.valueOf(ans));
                        calculo = true;
                    }else if(tipo.equals("/")){
                        ans = ans / Double.parseDouble(pantalla.getText().toString());
                        tipo = "+";
                        pantalla.setText(String.valueOf(ans));
                        calculo = true;
                    }
                }

            }
        });

        resta.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (ans == 0){
                    ans = Double.parseDouble(pantalla.getText().toString());
                    tipo = "+";
                    pantalla.setText(String.valueOf(ans));
                    calculo = true;
                }else{
                    if (tipo.equals("+")){
                        ans = ans + Double.parseDouble(pantalla.getText().toString());
                        tipo = "-";
                        pantalla.setText(String.valueOf(ans));
                        calculo = true;
                    }else if(tipo.equals("-")){
                        ans = ans - Double.parseDouble(pantalla.getText().toString());
                        tipo = "-";
                        pantalla.setText(String.valueOf(ans));
                        calculo = true;
                    }else if(tipo.equals("*")){
                        ans = ans * Double.parseDouble(pantalla.getText().toString());
                        tipo = "-";
                        pantalla.setText(String.valueOf(ans));
                        calculo = true;
                    }else if(tipo.equals("/")){
                        ans = ans / Double.parseDouble(pantalla.getText().toString());
                        tipo = "-";
                        pantalla.setText(String.valueOf(ans));
                        calculo = true;
                    }
                }

            }
        });

        mult.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                    if (ans == 0){
                        ans = Double.parseDouble(pantalla.getText().toString());
                        tipo = "*";
                        pantalla.setText(String.valueOf(ans));
                        calculo = true;
                    }else{
                        if (tipo.equals("+")){
                            ans = ans + Double.parseDouble(pantalla.getText().toString());
                            tipo = "*";
                            pantalla.setText(String.valueOf(ans));
                            calculo = true;
                        }else if(tipo.equals("-")){
                            ans = ans - Double.parseDouble(pantalla.getText().toString());
                            tipo = "*";
                            pantalla.setText(String.valueOf(ans));
                            calculo = true;
                        }else if(tipo.equals("*")){
                            ans = ans * Double.parseDouble(pantalla.getText().toString());
                            tipo = "*";
                            pantalla.setText(String.valueOf(ans));
                            calculo = true;
                        }else if(tipo.equals("/")){
                            ans = ans / Double.parseDouble(pantalla.getText().toString());
                            tipo = "*";
                            pantalla.setText(String.valueOf(ans));
                            calculo = true;
                        }
                    }

                }
        });

        div.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (ans == 0){
                    ans = Double.parseDouble(pantalla.getText().toString());
                    tipo = "+";
                    pantalla.setText(String.valueOf(ans));
                    calculo = true;
                }else{
                    if (tipo.equals("+")){
                    ans = ans + Double.parseDouble(pantalla.getText().toString());
                    tipo = "/";
                    pantalla.setText(String.valueOf(ans));
                    calculo = true;
                    }else if(tipo.equals("-")){
                        ans = ans - Double.parseDouble(pantalla.getText().toString());
                        tipo = "/";
                        pantalla.setText(String.valueOf(ans));
                        calculo = true;
                    }else if(tipo.equals("*")){
                        ans = ans * Double.parseDouble(pantalla.getText().toString());
                        tipo = "/";
                        pantalla.setText(String.valueOf(ans));
                        calculo = true;
                    }else if(tipo.equals("/")){
                        ans = ans / Double.parseDouble(pantalla.getText().toString());
                        tipo = "/";
                        pantalla.setText(String.valueOf(ans));
                        calculo = true;
                    }
                }

            }
        });
    }

}
