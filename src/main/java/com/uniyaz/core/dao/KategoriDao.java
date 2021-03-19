package com.uniyaz.core.dao;

import com.uniyaz.core.db.DbOperations;
import com.uniyaz.core.domain.Kategori;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class KategoriDao
{
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    Statement statement = null;

    public void addKategori(Kategori kategori)
    {
        try {
            connection = DbOperations.getConnection();
            String sql = "INSERT INTO kategori(ad) values(?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,kategori.getAd());
            preparedStatement.executeUpdate();
        } catch (ClassNotFoundException exception) {
            exception.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void deleteKategori(Kategori kategori)
    {
        try {
            connection = DbOperations.getConnection();
            preparedStatement = connection.prepareStatement("DELETE FROM kategori WHERE (id=?);");
            String deleteKategoriId=String.valueOf(kategori.getId());
            preparedStatement.setString(1, deleteKategoriId);
            preparedStatement.executeUpdate();
        } catch (SQLException | ClassNotFoundException | NullPointerException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Kategori> listKategori()
    {
        List<Kategori> kategoriList = new ArrayList<Kategori>();
        try {
            connection = DbOperations.getConnection();
            String sql =  "Select * from kategori";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next())
            {
                kategoriList.add(new Kategori(
                        resultSet.getInt("id"),
                        resultSet.getString("ad")
                ));
            }
        } catch (ClassNotFoundException exception) {
            exception.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return kategoriList;
    }
}
