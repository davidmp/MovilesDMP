package upeu.edu.pe.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import upeu.edu.pe.db.DBconn;

/**
 * Created by Docente on 6/02/2018.
 */

public class EventoDao extends DBconn {
    DBconn con;
    Context contex;
    SQLiteDatabase db;
    Cursor cur;
    String sql;

    public EventoDao(Context context) {
        super(context);
        this.contex=context;
    }

    public int eventoActivo(){
        con=new DBconn(contex);
        db=con.getReadableDatabase();
        sql=" select * from evento where estado='1' ";
        cur=db.rawQuery(sql, null);
        if(cur.moveToNext()){
            return cur.getInt(0);
        }else{
            return 0;
        }
    }



}
