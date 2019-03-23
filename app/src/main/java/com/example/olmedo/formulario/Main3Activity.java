package com.example.olmedo.formulario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.olmedo.formulario.utils.AppConstant;

public class Main3Activity extends AppCompatActivity {
    TextView mNombre, mApellido, mCorreo, mEdad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        mNombre= findViewById(R.id.tv_nombreAct3);
        mApellido= findViewById(R.id.tv_apellidoAct3);
        mCorreo= findViewById(R.id.tv_correoAct3);
        mEdad= findViewById(R.id.tv_edadAct3);

        Intent mIntent= this.getIntent();

        if(mIntent!=null) {
            mNombre.setText("Nombre: " + mIntent.getStringExtra(AppConstant.NOMBRE_KEY));
            mApellido.setText("Apellido: " + mIntent.getStringExtra(AppConstant.APELLIDO_KEY));
            mCorreo.setText("Correo: " + mIntent.getStringExtra(AppConstant.CORREO_KEY));
            mEdad.setText("Edad: " + mIntent.getStringExtra(AppConstant.EDAD_KEY));
        }
    }
}
