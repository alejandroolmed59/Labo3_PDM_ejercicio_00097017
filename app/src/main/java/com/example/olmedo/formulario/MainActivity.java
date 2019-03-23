package com.example.olmedo.formulario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.olmedo.formulario.utils.AppConstant;


public class MainActivity extends AppCompatActivity {

    EditText mNombre, mApellido, mEdad, mCorreo;
    Button mBotonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNombre= findViewById(R.id.et_nombre);
        mApellido= findViewById(R.id.et_apellido);
        mCorreo= findViewById(R.id.et_correo);
        mEdad= findViewById(R.id.et_edad);
        mBotonSubmit= findViewById(R.id.btn_submit);

        mBotonSubmit.setOnClickListener(v->{
            String nombre= mNombre.getText().toString();
            String apellido= mApellido.getText().toString();
            String correo= mCorreo.getText().toString();
            String edad = mEdad.getText().toString();
            Intent mIntent= new Intent(this, Main2Activity.class);
            mIntent.putExtra(AppConstant.NOMBRE_KEY, nombre);
            mIntent.putExtra(AppConstant.APELLIDO_KEY, apellido);
            mIntent.putExtra(AppConstant.CORREO_KEY, correo);
            mIntent.putExtra(AppConstant.EDAD_KEY, edad);
            startActivity(mIntent);
        });
    }
}
