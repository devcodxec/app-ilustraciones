package database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class AdminSQLiteOpenHelper extends SQLiteOpenHelper {

    AdminSQLiteOpenHelper adminSQLiteOpenHelper;

    public Context context;


    public AdminSQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Utilidades.SQL_USUARIO);
        db.execSQL(Utilidades.SQL_COMPRA);
        db.execSQL(Utilidades.SQL_ITEM_COMPRA);
        db.execSQL(Utilidades.SQL_TIENDA);
        db.execSQL(Utilidades.SQL_CALIFICACION);
        db.execSQL(Utilidades.SQL_TIPO_ILUSTRACION);
        db.execSQL(Utilidades.SQL_ILUSTRACION);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int versionAntigua, int versionNueva) {
        db.execSQL("DROP TABLE IF EXISTS " + Utilidades.TABLA_USUARIO);
        db.execSQL("DROP TABLE IF EXISTS " + Utilidades.TABLA_COMPRA);
        db.execSQL("DROP TABLE IF EXISTS " + Utilidades.TABLA_ITEM_COMPRA);
        db.execSQL("DROP TABLE IF EXISTS " + Utilidades.TABLA_TIENDA);
        db.execSQL("DROP TABLE IF EXISTS " + Utilidades.TABLA_CALIFICACION);
        db.execSQL("DROP TABLE IF EXISTS " + Utilidades.TABLA_TIPO_ILUSTRACION);
        db.execSQL("DROP TABLE IF EXISTS " + Utilidades.TABLA_ILUSTRACION);
        onCreate(db);
    }

    //Métodos principales
    public void registrarUsuario(String nombres, String apellidos, String username, String password, String email, String telefono, String direccion) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(Utilidades.USUARIO_NOMBRES, nombres);
        contentValues.put(Utilidades.USUARIO_APELLIDOS, apellidos);
        contentValues.put(Utilidades.USUARIO_USERNAME, username);
        contentValues.put(Utilidades.USUARIO_PASSWORD, password);
        contentValues.put(Utilidades.USUARIO_EMAIL, email);
        contentValues.put(Utilidades.USUARIO_TELEFONO, telefono);
        contentValues.put(Utilidades.USUARIO_DIRECCION, direccion);
        long res = db.insert(Utilidades.TABLA_USUARIO, Utilidades.USUARIO_ID, contentValues);

        if(res == -1){
            Toast.makeText(context, "Error al guardar los datos del formulario", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context, "Usuario registrado correctamente!", Toast.LENGTH_SHORT).show();
        }
        db.close();
    }

    public boolean login(String username, String password) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM Usuario WHERE username= ? AND password=?", new String[]{username,password});
        if(cursor.getCount() > 0){
            return true;
        }
        else {
            return false;
        }

    }

}
