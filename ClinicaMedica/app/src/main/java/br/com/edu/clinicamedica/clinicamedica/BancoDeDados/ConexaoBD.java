package br.com.edu.clinicamedica.clinicamedica.BancoDeDados;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by higor on 08/02/17.
 */

public class ConexaoBD  extends SQLiteOpenHelper{
    public static final int DATABASE_VERSION=1;
    public static final String DATABASE_NAME="Clinica.db";

    private static final String SQL_CREATE_TABLE_AGENDAMENTO="CREATE TABLE agendamento (\n" +
            "    idadgendamento INTEGER       PRIMARY KEY AUTOINCREMENT\n" +
            "                                 NOT NULL,\n" +
            "    idmedico       INTEGER       REFERENCES medico (idmedico) ON DELETE CASCADE\n" +
            "                                                              ON UPDATE CASCADE,\n" +
            "    idpaciente     INTEGER       REFERENCES paciente (idpaciente) ON DELETE CASCADE\n" +
            "                                                                  ON UPDATE CASCADE,\n" +
            "    dataconsulta   DATETIME,\n" +
            "    horario        VARCHAR (45),\n" +
            "    status         VARCHAR (45),\n" +
            "    observacoes    VARCHAR (500) \n" +
            ");\n";
    private static final String SQL_CREATE_TABLE_HORARIOCONSULTA="CREATE TABLE horarioconsulta (\n" +
            "    idhorario  INTEGER      PRIMARY KEY AUTOINCREMENT\n" +
            "                            NOT NULL,\n" +
            "    hora       VARCHAR (20),\n" +
            "    idconsulta INTEGER      REFERENCES medico (idmedico) ON DELETE CASCADE\n" +
            "                                                         ON UPDATE CASCADE\n" +
            ");\n";
    private static final String SQL_CREATE_TABLE_MEDICO="CREATE TABLE medico (\n" +
            "    idmedico      INTEGER       PRIMARY KEY AUTOINCREMENT\n" +
            "                                NOT NULL,\n" +
            "    nomemedico    VARCHAR (70),\n" +
            "    especialidade VARCHAR (100),\n" +
            "    crm VARCHAR (20)\n"+
            ");";
    private static final String SQL_CREATE_TABLE_PACIENTE="CREATE TABLE paciente (\n" +
            "    idpaciente   INTEGER      PRIMARY KEY AUTOINCREMENT\n" +
            "                              NOT NULL,\n" +
            "    nomepaciente VARCHAR (70),\n" +
            "    nascimento   VARCHAR (20),\n" +
            "    celular      VARCHAR (20) \n" +
            ");\n";
    private static final String SQL_CREATE_TABLE_PRONTUARIO="CREATE TABLE prontuario (\n" +
            "    idprontuario INTEGER       PRIMARY KEY AUTOINCREMENT\n" +
            "                               NOT NULL,\n" +
            "    medicamento  VARCHAR (50),\n" +
            "    resultado    VARCHAR (500),\n" +
            "    posologia    VARCHAR (50),\n" +
            "    idconsulta   INTEGER       REFERENCES agendamento (idadgendamento) ON DELETE CASCADE\n" +
            "                                                                       ON UPDATE CASCADE\n" +
            ");";
    private static final String SQL_CREATE_TABLE_USUARIO="CREATE TABLE usuario (idusuario   INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n" +
            "    nome        VARCHAR (20),\n" +
            "    usuario     VARCHAR (20),\n" +
            "    senha       VARCHAR (20),\n" +
            "    tipousuario VARCHAR (50) \n" +
            ");";

    private static final String SQL_POPULATE_TABLES=" INSERT INTO usuario VALUES(NULL,'Cicero Higor','medico','123','medico')";
    private static final String SQL_DELETE_TABLE_AGENDAMENTO="DROP TABLE IF EXISTS AGENDAMENTO";
    private static final String SQL_DELETE_TABLE_HORARIOCONSULTA="DROP TABLE IF EXISTS  HORARIOCONSULTA";
    private static final String SQL_DELETE_TABLE_MEDICO="DROP TABLE IF EXISTS  MEDICO";
    private static final String SQL_DELETE_TABLE_PACIENTE="DROP TABLE IF EXISTS PACIENTE";
    private static final String SQL_DELETE_TABLE_PRONTUARIO="DROP TABLE IF EXISTS  PRONTUARIO";
    private static final String SQL_DELETE_TABLE_USUARIO="DROP TABLE IF EXISTS  USUARIO";

    public ConexaoBD(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db){
        db.execSQL(SQL_CREATE_TABLE_AGENDAMENTO);
        db.execSQL(SQL_CREATE_TABLE_HORARIOCONSULTA);
        db.execSQL(SQL_CREATE_TABLE_MEDICO);
        db.execSQL(SQL_CREATE_TABLE_PACIENTE);
        db.execSQL(SQL_CREATE_TABLE_PRONTUARIO);
        db.execSQL(SQL_CREATE_TABLE_USUARIO);
        db.execSQL(SQL_POPULATE_TABLES);

    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DELETE_TABLE_AGENDAMENTO);
        db.execSQL(SQL_DELETE_TABLE_HORARIOCONSULTA);
        db.execSQL(SQL_DELETE_TABLE_MEDICO);
        db.execSQL(SQL_DELETE_TABLE_PACIENTE);
        db.execSQL(SQL_DELETE_TABLE_PRONTUARIO);
        db.execSQL(SQL_DELETE_TABLE_USUARIO);


        onCreate(db);
    }


}