package actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.proyecto.appilustraciones.R;

import java.util.ArrayList;

import modelo.Usuario;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_APP = "APP_ILUSTRACIONES";

    //Variables para el uso del Adaptador
    ArrayAdapter<String> adaptadorListaTiendas;
    ArrayList<String> arrayListaTiendas = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}
