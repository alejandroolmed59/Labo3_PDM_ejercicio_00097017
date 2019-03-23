package com.example.olmedo.formulario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.olmedo.formulario.utils.AppConstant;

public class Main2Activity extends AppCompatActivity {
    TextView mNombre, mApellido, mCorreo, mEdad;
    Button mBotonShare;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mNombre= findViewById(R.id.tv_nombre);
        mApellido= findViewById(R.id.tv_apellido);
        mCorreo= findViewById(R.id.tv_correo);
        mEdad= findViewById(R.id.tv_edad);
        mBotonShare= findViewById(R.id.btn_share);

        Intent mIntent= getIntent();

        mNombre.setText(mIntent.getStringExtra(AppConstant.NOMBRE_KEY));
        mApellido.setText(mIntent.getStringExtra(AppConstant.APELLIDO_KEY));
        mCorreo.setText(mIntent.getStringExtra(AppConstant.CORREO_KEY));
        mEdad.setText(mIntent.getStringExtra(AppConstant.EDAD_KEY));

        mBotonShare.setOnClickListener(v->{
            String nombre= mNombre.getText().toString();
            String apellido= mApellido.getText().toString();
            String correo= mCorreo.getText().toString();
            String edad = mEdad.getText().toString();


            Intent newIntent= new Intent();
            newIntent.setType("text/plain");
            newIntent.setAction(Intent.ACTION_SEND);
            newIntent.putExtra(AppConstant.NOMBRE_KEY, nombre);
            newIntent.putExtra(AppConstant.APELLIDO_KEY, apellido);
            newIntent.putExtra(AppConstant.CORREO_KEY, correo);
            newIntent.putExtra(AppConstant.EDAD_KEY, edad);
            startActivity(newIntent);
        });
    }
}
