package com.oscar.espinosa.moyabcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Double num1, num2, resultado;
    String operador;

    public void onClickBorrarTodo(View miView) {
        TextView tv = findViewById(R.id.TextView);
        tv.setText("");
    }

    public void onClickOperacionCapturaNumero1(View miView) {
        TextView tv = (TextView) findViewById(R.id.TextView);
        num1 = Double.parseDouble(tv.getText().toString());
        tv.setText("");
    }

    public void onClickSuma(View miView) {
        operador = "+";
        onClickOperacionCapturaNumero1(miView);
    }

    public void onClickResta(View miView) {
        operador = "-";
        onClickOperacionCapturaNumero1(miView);
    }

    public void onClickMulti(View miView) {
        operador = "*";
        onClickOperacionCapturaNumero1(miView);
    }

    public void onClickDivicion(View miView) {
        operador = "/";
        onClickOperacionCapturaNumero1(miView);
    }

    // Team methods-------------------------------------------------
    //Yoshi

    public void onClickVolCilindro(View miView){
        operador="VolCilindro";
        onClickOperacionCapturaNumero1(miView);
    }

    //Mora
    public void onClickAreaC(View miView){
        operador="area";
        onClickOperacionCapturaNumero1(miView);
    }

    //Replik
    public void onClickPerimetroR(View miView){
        operador="PerimetroR";
        onClickOperacionCapturaNumero1(miView);
    }
    public void onClickPerimetroD(View miView){
        operador="PerimetroD";
        onClickOperacionCapturaNumero1(miView);
    }

    //Oscar
    public void onClickAreaPoligono(View miView){
        operador="AreaPoligono";
        onClickOperacionCapturaNumero1(miView);
    }
    //---------------------------------------------------------------

    // ------------------------------------metodo-igual-------------------------------------

    public void onClickIgual(View miView){
        TextView tv = (TextView) findViewById(R.id.TextView);
        num2 = Double.parseDouble(tv.getText().toString());

        try {
            if (operador.equals("+")) {
                resultado = num1 + num2;
            }
            else {
                if (operador.equals("-")) {
                    resultado = num1 - num2;
                } else {
                    if (operador.equals("/")) {
                        resultado = num1 / num2;
                    } else {
                        if (operador.equals("*")) {
                            resultado = num1 * num2;
                        } else {
                            if (operador.equals("^")) {
                                resultado = Math.pow(num1, num2);
                            }else{
                                if (operador.equals("AreaPoligono")){
                                    resultado = num1 * num2 / 2;
                                }else{
                                    if (operador.equals("VolCilindro")){
                                        resultado = Math.PI * num1 * num1 * num2;
                                    }else{
                                        if (operador.equals("area")) {
                                            resultado = num1 * num1 * Math.PI;
                                        }else{
                                            if(operador.equals("PerimetroR")){
                                                resultado = Math.PI * num1 * 2;
                                            }else{
                                                if (operador.equals("PerimetroD")){
                                                    resultado = Math.PI * num1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            tv.setText(resultado.toString());
        }
        catch (NumberFormatException nfe){
            Toast.makeText(this,"Numero Incorrecto", Toast.LENGTH_SHORT).show();
        }
    }
    //---------------------------------------------------------------------------------------------

    public void onClickButtonOne(View miView){
        TextView tv = findViewById(R.id.TextView);
        String value = tv.getText().toString();
        tv.setText(value + "1");
    }

    public void onClickButtonTwo(View miView){
        TextView tv = findViewById(R.id.TextView);
        String value = tv.getText().toString();
        tv.setText(value + "2");
    }

    public void onClickButtonThree(View miView){
        TextView tv = findViewById(R.id.TextView);
        String value = tv.getText().toString();
        tv.setText(value + "3");
    }

    public void onClickButtonFour(View miView){
        TextView tv = findViewById(R.id.TextView);
        String value = tv.getText().toString();
        tv.setText(value + "4");
    }

    public void onClickButtonFive(View miView){
        TextView tv = findViewById(R.id.TextView);
        String value = tv.getText().toString();
        tv.setText(value + "5");
    }

    public void onClickButtonSix(View miView){
        TextView tv = findViewById(R.id.TextView);
        String value = tv.getText().toString();
        tv.setText(value + "6");
    }

    public void onClickButtonSeven(View miView){
        TextView tv = findViewById(R.id.TextView);
        String value = tv.getText().toString();
        tv.setText(value + "7");
    }

    public void onClickButtonEight(View miView){
        TextView tv = findViewById(R.id.TextView);
        String value = tv.getText().toString();
        tv.setText(value + "8");
    }

    public void onClickButtonNine(View miView){
        TextView tv = findViewById(R.id.TextView);
        String value = tv.getText().toString();
        tv.setText(value + "9");
    }

    public void onClickButtonZero(View miView){
        TextView tv = findViewById(R.id.TextView);
        String value = tv.getText().toString();
        tv.setText(value + "0");
    }
    public void onClickButtonpoint(View miView){
        TextView tv = findViewById(R.id.TextView);
        String value = tv.getText().toString();
        tv.setText(value + ".");
    }
}