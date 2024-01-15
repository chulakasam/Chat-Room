package lk.ijse.Model;

import lk.ijse.Dto.userDto;
import lk.ijse.db.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserModel {

    public boolean saveUser(userDto userDto) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();
        String sql="INSERT INTO user VALUES(?)";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setString(1,userDto.getUserName());
       return pstm.executeUpdate()>0;
    }
}
