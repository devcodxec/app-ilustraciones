package actividades;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.proyecto.appilustraciones.R;

import java.util.ArrayList;

import database.AdminSQLiteOpenHelper;

public class LoginActivity extends Activity {

    //Variables para los métodos
    private EditText username;
    private EditText password;
    Button login;

    AdminSQLiteOpenHelper adminSQLiteOpenHelper;

    private final String LOG_APP = "AppIlustraciones";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        username = (EditText)findViewById(R.id.txtLoginEmail);
        password = (EditText)findViewById(R.id.txtLoginPassword);

        login= (Button)findViewById(R.id.btnLogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adminSQLiteOpenHelper = new AdminSQLiteOpenHelper(LoginActivity.this, "bd_ilustraciones", null,1 );

                if(username.getText().toString().isEmpty() || password.getText().toString().isEmpty()){
                    Toast.makeText(LoginActivity.this, "Advertencia: Ingrese todos los campos!", Toast.LENGTH_SHORT).show();
                } else{
                    boolean buscarUsuario = adminSQLiteOpenHelper.login(username.getText().toString(), password.getText().toString());

                    if(buscarUsuario){
                        Toast.makeText(LoginActivity.this, "Bienvenido "+username.getText().toString(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        Bundle bundle = new Bundle();
                        startActivity(intent);
                        finish();

                    } else{
                        Toast.makeText(LoginActivity.this, "Error: Los datos son incorrectos!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    // Método que permite iniciar el RegistroActivity
    public void crearCuentaApp(@SuppressWarnings("UnusedParameters") View view) {
        Intent intent = new Intent(this, RegistroActivity.class);
        startActivity(intent);
    }

}
