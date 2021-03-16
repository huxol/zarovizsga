package hu.nive.ujratervezes.zarovizsga.dogtypes;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class DogTypes {

    private DataSource dataSource;

    public DogTypes(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<String> getDogsByCountry(String country) {
        String countryByUpperCase = country.toUpperCase();
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt =
                        conn.prepareStatement(" SELECT FROM DogTypes where Country = ?");
        ) {
            stmt.setLong(1, country);

            // ...
        } catch (SQLException sqle) {
            throw new IllegalArgumentException("Error by insert", sqle);
        }
    }
}
