/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apayroll.libcore;

import com.apayroll.config.Config;

import java.sql.Time;
import java.sql.Timestamp;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sly
 */
public class Database implements Config{
    private Connection db = null;
    private String SQLStatement = null;
    private PreparedStatement stmt = null;
    private ResultSet res = null;
    private long lastInsertedId;
    
    public Database(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            db = (Connection) DriverManager.getConnection("jdbc:mysql://"+HOST+":"+MYSQL_PORT+"/"+DB_NAME, MYSQL_USERNAME, MYSQL_PASSWORD);
        } catch (SQLException e){
            System.out.println(e.getErrorCode());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void query(String SQLStatement) throws SQLException{
        this.SQLStatement = SQLStatement;
        stmt = db.prepareStatement(this.SQLStatement);
    }
    
    public void query(String SQLStatement, boolean isReturnGeneratedKeys) throws SQLException{
        if(isReturnGeneratedKeys){
            this.SQLStatement = SQLStatement;
            stmt = db.prepareStatement(this.SQLStatement, PreparedStatement.RETURN_GENERATED_KEYS);
        } else {
            query(SQLStatement);
        }
    }
    
    public void rollBack() throws SQLException{
        this.db.rollback();
    }
    
    // begin transaction
    public void beginTransaction(boolean autoCommit) throws SQLException{
        this.db.setAutoCommit(autoCommit);
    }
    
    public void beginTransaction() throws SQLException{
        this.db.setAutoCommit(false);
    }

    public void commit() throws SQLException{
        this.db.commit();
    }

    public void close() throws SQLException{
        this.db.close();
    }

    // bind values
    public void bind(int index, Object value) throws SQLException {
        switch (value.getClass().getSimpleName()){
            case "String":
                stmt.setString(index, value.toString());
                break;
            case "Integer":
                stmt.setInt(index,  Integer.parseInt(value.toString()));
                break;
            case "Double":
                stmt.setDouble(index, Double.parseDouble(value.toString()) );
                break;
            case "Float":
                stmt.setFloat(index, Float.parseFloat(value.toString()) );
                break;
            case "Boolean":
                stmt.setBoolean(index, Boolean.parseBoolean(value.toString()) );
                break;
            case "Long":
                stmt.setLong(index, Long.parseLong(value.toString()) );
                break;
            case "Short":
                stmt.setShort(index, Short.parseShort(value.toString()) );
                break;
            case "Byte":
                stmt.setByte(index, Byte.parseByte(value.toString()) );
                break;
            case "Character":
                stmt.setCharacterStream(index, null, value.toString().charAt(0));
                break;
            case "Date":
                stmt.setDate(index, Date.valueOf(value.toString()));
                break;
            case "Time":
                stmt.setTime(index, Time.valueOf(value.toString()));
                break;
            case "Timestamp":
                stmt.setTimestamp(index, Timestamp.valueOf(value.toString()));
                break;
            default:
                System.out.println("Unsupported type");
                break;
        }
    }

    // execute query
    public boolean execute(){
        try {
            if(SQLStatement.toUpperCase().matches(".*\\bSELECT\\b.*")){
                res = stmt.executeQuery();
            } else {
                stmt.executeUpdate();
                ResultSet rs = stmt.getGeneratedKeys();
                if(rs.next()){
                    this.lastInsertedId = rs.getLong(1);
                }
            }
            return true;
        } catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    
    public long getLastInsertId(){
        return lastInsertedId;
    }

    public ResultSet getResultSet(){
        return res;
    }

    public List<Object> fetchDataObjects(){
        List<Object> data = new ArrayList<>();
        try {
            while(res.next()){
                List<Object> row = new ArrayList<>();
                for(int i = 1; i <= res.getMetaData().getColumnCount(); i++){
                    row.add(res.getObject(i));
                }
                data.add(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

    // get single result
    public Object getSingleResult() throws SQLException{
        res = stmt.executeQuery(this.SQLStatement);
        if(res.next()){
            return res.getObject(1);
        }
        return null;
    }

    // row count
    public int getRowCount() throws SQLException{
        res = stmt.executeQuery(this.SQLStatement);
        int rowCount = 0;
        while(res.next()){
            rowCount++;
        }
        return rowCount;
    }
}
