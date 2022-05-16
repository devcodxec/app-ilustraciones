package database;

public class Utilidades {

    //Constantes para la tabla USUARIO
    public static final String TABLA_USUARIO = "Usuario";
    public static final String USUARIO_ID = "Id_Usuario";
    public static final String USUARIO_NOMBRES = "nombres";
    public static final String USUARIO_APELLIDOS = "apellidos";
    public static final String USUARIO_USERNAME = "username";
    public static final String USUARIO_PASSWORD = "password";
    public static final String USUARIO_EMAIL = "email";
    public static final String USUARIO_TELEFONO = "telefono";
    public static final String USUARIO_DIRECCION = "direccion";

    public static final String SQL_USUARIO = "CREATE TABLE " + TABLA_USUARIO +
                                            " (" + USUARIO_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                                            USUARIO_NOMBRES + " TEXT, " +
                                            USUARIO_APELLIDOS + " TEXT, " +
                                            USUARIO_USERNAME + " TEXT NOT NULL, " +
                                            USUARIO_PASSWORD + " TEXT NOT NULL, " +
                                            USUARIO_EMAIL + " TEXT, " +
                                            USUARIO_TELEFONO + " TEXT, " +
                                            USUARIO_DIRECCION + " TEXT);";

    //Constantes para la tabla COMPRA
    public static final String TABLA_COMPRA = "Compra";
    public static final String COMPRA_ID = "Id_Compra";
    public static final String COMPRA_FECHA = "fecha";
    public static final String COMPRA_SUBTOTAL = "subtotal";
    public static final String COMPRA_IVA = "iva";
    public static final String COMPRA_TOTAL = "total";
    public static final String COMPRA_ID_USUARIO = "Id_Usuario";

    public static final String SQL_COMPRA = "CREATE TABLE " + TABLA_COMPRA +
                                            " (" + COMPRA_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                                            COMPRA_FECHA + " DATE, " +
                                            COMPRA_SUBTOTAL + " DOUBLE, " +
                                            COMPRA_IVA + " DOUBLE, " +
                                            COMPRA_TOTAL + " DOUBLE, " +
                                            COMPRA_ID_USUARIO + " INTEGER);";

    //Constantes para la tabla ITEM_COMPRA
    public static final String TABLA_ITEM_COMPRA = "Item_Compra";
    public static final String ITEM_COMPRA_ID = "Id_ItemCompra";
    public static final String ITEM_COMPRA_CANTIDAD = "cantidad";
    public static final String ITEM_COMPRA_PRECIO_UNITARIO = "precioUnitario";
    public static final String ITEM_COMPRA_ID_COMPRA = "Id_Compra";
    public static final String ITEM_COMPRA_ID_ILUSTRACION = "Id_Ilustracion";

    public static final String SQL_ITEM_COMPRA = "CREATE TABLE " + TABLA_ITEM_COMPRA +
                                                " (" + ITEM_COMPRA_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                                                ITEM_COMPRA_CANTIDAD + " INT, " +
                                                ITEM_COMPRA_PRECIO_UNITARIO + " DOUBLE, " +
                                                ITEM_COMPRA_ID_COMPRA + " INTEGER, " +
                                                ITEM_COMPRA_ID_ILUSTRACION + " INTEGER);";

    //Constantes para la tabla ILUSTRACION
    public static final String TABLA_ILUSTRACION = "Ilustracion";
    public static final String ILUSTRACION_ID = "Id_Ilustracion";
    public static final String ILUSTRACION_NOMBRE = "nombre";
    public static final String ILUSTRACION_DESCRIPCION = "descripcion";
    public static final String ILUSTRACION_PRECIO = "precio";
    public static final String ILUSTRACION_FOTO = "foto";
    public static final String ILUSTRACION_ID_TIENDA = "Id_Tienda";
    public static final String ILUSTRACION_ID_TIPO_ILUSTRACION = "Id_TipoIlustracion";

    public static final String SQL_ILUSTRACION = "CREATE TABLE " + TABLA_ILUSTRACION +
                                                " (" + ILUSTRACION_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                                                ILUSTRACION_NOMBRE + " TEXT, " +
                                                ILUSTRACION_DESCRIPCION + " TEXT, " +
                                                ILUSTRACION_PRECIO + " DOUBLE, " +
                                                ILUSTRACION_FOTO + " TEXT, " +
                                                ILUSTRACION_ID_TIENDA + " INTEGER, " +
                                                ILUSTRACION_ID_TIPO_ILUSTRACION + " INTEGER);";

    //Constantes para la tabla TIPO_ILUSTRACION
    public static final String TABLA_TIPO_ILUSTRACION = "Tipo_Ilustracion";
    public static final String TIPO_ILUSTRACION_ID = "Id_TipoIlustracion";
    public static final String TIPO_ILUSTRACION_DESCRIPCION = "descripcion";

    public static final String SQL_TIPO_ILUSTRACION = "CREATE TABLE " + TABLA_TIPO_ILUSTRACION +
                                                      " (" + TIPO_ILUSTRACION_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                                                      TIPO_ILUSTRACION_DESCRIPCION + " TEXT);";


    //Constantes para la tabla CALIFICACION
    public static final String TABLA_CALIFICACION = "Calificacion";
    public static final String CALIFICACION_ID = "Id_Calificacion";
    public static final String CALIFICACION_VALOR = "valor";
    public static final String CALIFICACION_COMENTARIO = "comentario";
    public static final String CALIFICACION_ID_TIENDA = "Id_Tienda";
    public static final String CALIFICACION_ID_USUARIO = "Id_Usuario";

    public static final String SQL_CALIFICACION = "CREATE TABLE " + TABLA_CALIFICACION +
                                                  " (" + CALIFICACION_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                                                  CALIFICACION_VALOR + " INT, " +
                                                  CALIFICACION_COMENTARIO + " TEXT, " +
                                                  CALIFICACION_ID_TIENDA + " INTEGER, " +
                                                  CALIFICACION_ID_USUARIO + " INTEGER);";

    //Constantes para la tabla TIENDA
    public static final String TABLA_TIENDA = "Tienda";
    public static final String TIENDA_ID = "Id_Tienda";
    public static final String TIENDA_NOMBRE = "nombre";
    public static final String TIENDA_DESCRIPCION = "descripcion";
    public static final String TIENDA_DIRECCION = "direccion";
    public static final String TIENDA_TELEFONO = "telefono";
    public static final String TIENDA_EMAIL = "email";
    public static final String TIENDA_FOTO= "foto";

    public static final String SQL_TIENDA = "CREATE TABLE " + TABLA_TIENDA +
                                            " (" + TIENDA_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                                            TIENDA_NOMBRE + " TEXT, " +
                                            TIENDA_DESCRIPCION + " TEXT, " +
                                            TIENDA_DIRECCION + " TEXT, " +
                                            TIENDA_TELEFONO + " TEXT, " +
                                            TIENDA_EMAIL + " TEXT, " +
                                            TIENDA_FOTO + " TEXT);";


}
