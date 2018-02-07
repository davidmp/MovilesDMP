package upeu.edu.pe.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import upeu.edu.pe.db.DBconn;

/**
 * Created by Docente on 6/02/2018.
 */

public class AsistenciaDao extends DBconn {
    DBconn con;
    Context contex;
    SQLiteDatabase db;
    Cursor cur;
    String sql;

    public AsistenciaDao(Context context) {
        super(context);
        this.contex=context;
    }

    public void registrarAsistencia(int idEvento, int idUsuario, String codigo, String nombre, String companhia){
        con=new DBconn(contex);
        db=con.getWritableDatabase();
        db.execSQL("insert into asistencia(idEvento,idUsuario,codigo,nombres,companhia, fechahora,ofline) " +
                " values("+idEvento+","+idUsuario+",'"+codigo+"','"+nombre+"','"+companhia+"',datetime('now'),'0'); ");
    }

    public Cursor listarAsistencia(){
        con=new DBconn(contex);
        db=con.getReadableDatabase();
        sql="select * from asistencia ";
        cur=db.rawQuery(sql,null);
        return cur;
    }
}
