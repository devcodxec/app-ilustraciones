package actividades;

import android.app.Activity;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.proyecto.appilustraciones.R;

import java.io.Serializable;

import database.AdminSQLiteOpenHelper;
import modelo.Usuario;

public class RegistroActivity extends Activity implements Serializable {

    EditText nombres;
    EditText apellidos;
    EditText username;
    EditText password;
    EditText email;
    EditText telefono;
    EditText direccion;
    Button registrar;

    AdminSQLiteOpenHelper adminSQLiteOpenHelper;

    private final String LOG_APP = "APP_ILUSTRACIONES";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro);

        nombres= (EditText)findViewById(R.id.txtRegNombres);
        apellidos= (EditText)findViewById(R.id.txtRegApellidos);
        username= (EditText)findViewById(R.id.txtRegUsername);
        password= (EditText)findViewById(R.id.txtRegPassword);
        email= (EditText)findViewById(R.id.txtRegEmail);
        telefono= (EditText)findViewById(R.id.txtRegTelefono);
        direccion= (EditText)findViewById(R.id.txtRegDireccion);
        registrar= (Button)findViewById(R.id.btnRegistrar);

        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adminSQLiteOpenHelper = new AdminSQLiteOpenHelper(RegistroActivity.this, "bd_ilustraciones", null,1 );
                if(username.getText().toString().equals("")){
                    Toast.makeText(RegistroActivity.this, "Advertencia: El username es un campo obligatorio!", Toast.LENGTH_SHORT).show();
                } else if(password.getText().toString().equals("")){
                    Toast.makeText(RegistroActivity.this, "Advertencia: El password es un campo obligatorio!", Toast.LENGTH_SHORT).show();

                } else {
                    adminSQLiteOpenHelper.registrarUsuario(nombres.getText().toString(),
                            apellidos.getText().toString(),
                            username.getText().toString(),
                            password.getText().toString(),
                            email.getText().toString(),
                            telefono.getText().toString(),
                            direccion.getText().toString());
                }

            }
        });

    }

}