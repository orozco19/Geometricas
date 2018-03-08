package com.orozcoh.santiago.geometricas;

import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.text.DecimalFormat;

public class geom_caract extends AppCompatActivity {

    ImageView limage;
    TextView tparametro, tinfo, tinfo1;
    EditText eparametro;
    double area, perimetro, volumen, parametro;
    Button button;
    RadioGroup rgroup;
    RadioButton rCirculo, rCuadrado, rCubo, rTriangulo;
    Drawable cubo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geom_caract);
        rCirculo = findViewById(R.id.rCirculo);
        rCuadrado = findViewById(R.id.rCuadrado);
        rCubo = findViewById(R.id.rCubo);
        rTriangulo = findViewById(R.id.rTriangulo);
        limage = findViewById(R.id.limage);
        eparametro = findViewById(R.id.eparametro);
        tparametro = findViewById(R.id.tparametro);
        button = findViewById(R.id.button);
        rgroup = findViewById(R.id.rgroup);
        tinfo = findViewById(R.id.tinfo);
        tinfo1 = findViewById(R.id.tinfo1);

    }

    public void onSelected(View view) {
        if(view.getId() == rCirculo.getId()){
            limage.setImageResource(R.drawable.circulo);
            tparametro.setText("Radio");
        }
        else if(view.getId() == rCuadrado.getId()){
            limage.setImageResource(R.drawable.cuadrado);
            tparametro.setText("Lado");
        }
        else if(view.getId() == rCubo.getId()){
            limage.setImageResource(R.drawable.cubo);
            tparametro.setText("Lado");
        }
        else if(view.getId() == rTriangulo.getId()){
            limage.setImageResource(R.drawable.triangulo);
            tparametro.setText("Lado");
        }

    }

    public void OnClicked(View view) {
        Double mydouble;
        if (TextUtils.isEmpty(eparametro.getText()))
            mydouble = 0.0;
        else
            mydouble = Double.parseDouble(eparametro.getText().toString());


        if (rgroup.getCheckedRadioButtonId() == rCirculo.getId()){
            area = 3.141592 * (mydouble * mydouble);
            perimetro = 2 * 3.141592 * mydouble;
            area =Double.parseDouble(new DecimalFormat("##.##").format(area));
            perimetro =Double.parseDouble(new DecimalFormat("##.##").format(perimetro));
            tinfo1.setText("Area = \nPerimetro=");
            tinfo.setText(+area+"\n"+perimetro);
        }
        else if (rgroup.getCheckedRadioButtonId() == rCuadrado.getId()){
            area = mydouble * mydouble;
            perimetro = 4*mydouble;
            area =Double.parseDouble(new DecimalFormat("##.##").format(area));
            perimetro =Double.parseDouble(new DecimalFormat("##.##").format(perimetro));
            tinfo1.setText("Area = \nPerimetro=");
            tinfo.setText(+area+"\n"+perimetro);
        }
        else if (rgroup.getCheckedRadioButtonId() == rTriangulo.getId()){
            area = (Math.sqrt(3)*mydouble * mydouble)/4;
            perimetro = 3*mydouble;
            area =Double.parseDouble(new DecimalFormat("##.##").format(area));
            perimetro =Double.parseDouble(new DecimalFormat("##.##").format(perimetro));
            tinfo1.setText("Area = \nPerimetro=");
            tinfo.setText(+area+"\n"+perimetro);
        }
        else if (rgroup.getCheckedRadioButtonId() == rCubo.getId()){
            area = 6*(mydouble*mydouble);
            perimetro = 12*mydouble;
            area =Double.parseDouble(new DecimalFormat("##.####").format(area));
            perimetro =Double.parseDouble(new DecimalFormat("##.##").format(perimetro));
            volumen =Double.parseDouble(new DecimalFormat("##.##").format(volumen));
            volumen = mydouble*mydouble * mydouble;
            tinfo1.setText("Area = \nPerimetro =\nVolumen =");
            tinfo.setText(+area+"\n"+perimetro+"\n"+volumen);
        }

    }
}