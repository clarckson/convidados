package com.example.convidados.repositorio

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class ConvidadosDatabase(
    context: Context) : SQLiteOpenHelper(context, NAME, null, VERSION) {

        companion object {
            private const val NAME = "convidadosDB"
            private const val VERSION = 1
        }

    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL("create table Convidados (" +
                "id integer primary key autoincrement, "+
                "name text, " +
                "presenca integer); ")

    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {

    }
}