package pt.ipg.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //São os botões
    Button button1, button2, button3, button4, button5, button6,
            button7, button8, button9, button0, ponto, dividir, mais,
            multiplicar, apagar, ce, buttonmenos, ButtonViews , igual;
    // São as TextView
    TextView text1,text2,text3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Aqui é pra dizer o id de cada um deles, no caso butões e TextView
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button1 = (Button) findViewById(R.id.button1);
        button9 = (Button) findViewById(R.id.button9);
        button0 = (Button) findViewById(R.id.button0);
        ponto = (Button) findViewById(R.id.ponto);
        ButtonViews = (Button) findViewById(R.id.ButtonViews);
        dividir = (Button) findViewById(R.id.dividir);
        multiplicar = (Button) findViewById(R.id.multiplicar);
        mais = (Button) findViewById(R.id.mais);
        apagar = (Button) findViewById(R.id.apagar);
        ce = (Button) findViewById(R.id.ce);
        igual = (Button) findViewById(R.id.igual);
        buttonmenos = (Button) findViewById(R.id.buttonmenos);
        text1 = (TextView) findViewById(R.id.text1);
        text2 = (TextView) findViewById(R.id.text2);
        text3 = (TextView) findViewById(R.id.text3);
        boolean bool = false;
    }
    boolean bool = false;
    public void button_1(View c) {
        if( bool == false){
            String str = text1.getText().toString();
            text1.setText(str+"1");
        } else {
            String str = text2.getText().toString();
            text2.setText(str+"1");
        }

    }
    public void button_2(View c) {
        if( bool == false){
            String str = text1.getText().toString();
            text1.setText(str+"2");
        } else {
            String str = text2.getText().toString();
            text2.setText(str+"2");
        }
    }
    public void button_3(View c) {
        if( bool == false){
            String str = text1.getText().toString();
            text1.setText(str+"3");
        } else {
            String str = text2.getText().toString();
            text2.setText(str+"3");
        }
    }
    public void button_4(View c) {
        if( bool == false){
            String str = text1.getText().toString();
            text1.setText(str+"4");
        } else {
            String str = text2.getText().toString();
            text2.setText(str+"4");
        }
    }
    public void button_5(View c) {
        if( bool == false){
            String str = text1.getText().toString();
            text1.setText(str+"5");
        } else {
            String str = text2.getText().toString();
            text2.setText(str+"5");
        }
    }
    public void button_6(View c) {
        if( bool == false){
            String str = text1.getText().toString();
            text1.setText(str+"6");
        } else {
            String str = text2.getText().toString();
            text2.setText(str+"6");
        }
    }
    public void button_7(View c) {
        if( bool == false){
            String str = text1.getText().toString();
            text1.setText(str+"7");
        } else {
            String str = text2.getText().toString();
            text2.setText(str+"7");
        }
    }
    public void button_8(View c) {
        if( bool == false){
            String str = text1.getText().toString();
            text1.setText(str+"8");
        } else {
            String str = text2.getText().toString();
            text2.setText(str+"8");
        }
    }
    public void button_9(View c) {
        if( bool == false){
            String str = text1.getText().toString();
            text1.setText(str+"9");
        } else {
            String str = text2.getText().toString();
            text2.setText(str+"9");
        }
    }
    public void button_0(View c) {
        if( bool == false){
            String str = text1.getText().toString();
            text1.setText(str+"0");
        } else {
            String str = text2.getText().toString();
            text2.setText(str+"0");
        }
    }
    public void button_multiplicar(View c) {

        bool = true;
        text3.setText("*");
    }
    public void button_dividir(View c) {
        bool = true;
        text3.setText("/");
    }

    public void button_mais(View c) {
        bool = true;
        text3.setText("+");
    }
    public void button_apagar(View c) {
    }
    public void button_ponto(View c) {
    }
    public void button_ce(View c) {
        bool = false;
            text1.setText("");
            text2.setText("");
            text3.setText("");
    }
    public void button_menos(View c) {
    }
    public void button_igual(View c) {
    }
    public void button_Views(View c) {
    }





}


























