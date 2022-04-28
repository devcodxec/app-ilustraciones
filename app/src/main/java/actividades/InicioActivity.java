package actividades;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.proyecto.appilustraciones.R;

public class InicioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);
    }

    // Método que permite iniciar el MainActivity
    public void iniciarApp(@SuppressWarnings("UnusedParameters") View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

}