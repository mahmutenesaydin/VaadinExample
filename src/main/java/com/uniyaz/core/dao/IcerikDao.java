package com.uniyaz.core.dao;

import com.uniyaz.core.db.DbOperations;
import com.uniyaz.core.domain.Icerik;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class IcerikDao
{
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    Statement statement = null;
    ResultSet resultSet = null;

    public void addIcerik(Icerik icerik)
    {
        try {
            connection = DbOperations.getConnection();
            String sql = "Insert into Icerik(baslik, detay, yazar, id_kategori) values(?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,icerik.getBaslik());
            preparedStatement.setString(2,icerik.getDetay());
            preparedStatement.setString(3,icerik.getYazar());
            preparedStatement.setInt(4,icerik.getId_kategori());
            preparedStatement.executeUpdate();
        } catch (ClassNotFoundException exception) {
            exception.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public List<Icerik> listIcerik()
    {
        List<Icerik> icerikList = new ArrayList<Icerik>();
        try {
            connection = DbOperations.getConnection();
            String sql = "SELECT * FROM Icerik";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next())
            {
                icerikList.add(new Icerik(
                        resultSet.getInt("id"),
                        resultSet.getString("baslik"),
                        resultSet.getString("detay"),
                        resultSet.getString("yazar"),
                        resultSet.getInt("id_kategori")
                        ));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return icerikList;

    }
}
