package actividades;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.proyecto.appilustraciones.R;

import java.util.ArrayList;

public class LoginActivity extends Activity {

    //Variables para los métodos
    private EditText username;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        username = findViewById(R.id.txtLoginEmail);
        password = findViewById(R.id.txtLoginPassword);
    }

    // Método que permite iniciar el RegistroActivity
    public void crearCuentaApp(@SuppressWarnings("UnusedParameters") View view) {
        Intent intent = new Intent(this, RegistroActivity.class);
        startActivity(intent);
    }

    public void loginApp(@SuppressWarnings("UnusedParameters") View view) {
        final String usernameAux = username.getText().toString();
        final String passwordAux = password.getText().toString();
    }


}
