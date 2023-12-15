package repo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.google.gson.Gson;

import model.todo.DBTables;

public class Database {
    private Gson gson;
    private String TodoData = "db_zen-task";
    protected DBTables tables = new DBTables();
    
}
