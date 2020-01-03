package com.qhit.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDao {
    static ComboPooledDataSource dataSource = new ComboPooledDataSource("c3p0-config.xml");
    static Connection conn = null;

    static {

        try {
            conn = dataSource.getConnection();
            if (conn != null) {
                System.out.println("连接成功");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /**
     * 增、删、改操作
     *
     * @param sql
     *            sql语句
     * @param params
     *            参数数组
     * @return 执行结果
     * @throws SQLException
     */
    public int executeUpdate(String sql, Object... params) throws SQLException {
        int result = 0;
        PreparedStatement pstmt = null;
        try {
            pstmt = conn.prepareStatement(sql);
            for (int i = 0; i < params.length; i++) {
                pstmt.setObject(i + 1, params[i]);
            }
            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
        return result;
    }

    /**
     * 查询操作
     *
     * @param sql
     *            sql语句
     * @param params
     *            参数数组
     * @return 查询结果集
     * @throws SQLException
     */
    public ResultSet executeQuery(String sql, Object... params) throws SQLException {
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            pstmt = conn.prepareStatement(sql);
            for (int i = 0; i < params.length; i++) {
                pstmt.setObject(i + 1, params[i]);
            }
            rs = pstmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
        return rs;
    }
}
