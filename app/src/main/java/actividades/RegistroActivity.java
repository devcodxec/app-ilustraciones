package actividades;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.proyecto.appilustraciones.R;

import java.io.Serializable;

import modelo.Usuario;

public class RegistroActivity extends Activity implements Serializable {

    EditText nombresAux;
    EditText apellidosAux;
    EditText usernameAux;
    EditText passwordAux;
    EditText emailAux;
    Button registrar;
    Usuario usuario;

    private final String LOG_TAG = "AppOderFood";
    private static final String API_USUARIOS_URL = "http://10.0.2.2:8000/api/v1/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro);

        nombresAux= (EditText)findViewById(R.id.txtRegNombres);
        apellidosAux= (EditText)findViewById(R.id.txtRegApellidos);
        usernameAux= (EditText)findViewById(R.id.txtRegUsername);
        passwordAux= (EditText)findViewById(R.id.txtRegPassword);
        emailAux= (EditText)findViewById(R.id.txtRegEmail);
        registrar= (Button)findViewById(R.id.btnRegistrar);


    }

}