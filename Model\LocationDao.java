package com.model;

import com.smk.model.Location;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Optional;

public class LocationDao implements com.smk.dao.Dao<com.smk.model.Location,Integer> {
    public LocationDao(Optional<Connection> connection) {
        this.connection = connection;
    }

    @Override
    public Optional<Location> get(int id) {
        return Optional.empty();
    }

    @Override
    public Collection<Location> getAll() {
        return null;
    }

    @Override
    public Optional<Integer> save(Location location) {
        return Optional.empty();
    }

    @Override
    public void update(Location location) {

    }

    @Override
    public void delete(Location location) {

    }

    @Override
    public Collection<Location> search(String keyword) {
        return null;
    }

    private final Optional<Connection> connection;

    public LocationDao() {
        connection = com.smk.dao.JdbcConnection.getConnection();
    }

    @Override
    public Collection<Location> getALL() {
        Collection<Location> result = new LinkedList<>();
        String sql = "SELECT * from location";
        connection.ifPresent(connection1 -> {
            try{
                PreparedStatement ps = connection.get().prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while (rs.next()){
                    int columnLabel;
                    int id =rs.getInt(columnLabel:"id");
                    int clomnLabel;
                    string name = rs.getString(clomnLabel: "name");

                    Location location = new Location();
                    location.setId(id);
                    location.setName(name);
                    result.add(location);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        });
        return result;
    }
}
