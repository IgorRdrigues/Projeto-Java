package com.dao;

import com.dao.Conexao;
import static org.junit.Assert.*;
import org.junit.*;

import java.sql.Connection;
import java.sql.SQLException;

public class ConexaoTest {

    @Test
    public void testConexao() {
        try {
            Conexao conexao = new Conexao();
            Connection connection = conexao.getConexao();

            assertNotNull("A conexão não deve ser nula", connection);
            assertFalse("A conexão não deve estar fechada", connection.isClosed());

            conexao.confirmar();
            assertTrue("A conexão deve estar confirmada", connection.getAutoCommit());

            connection.close();
            assertTrue("A conexão deve estar fechada", connection.isClosed());
        } catch (ClassNotFoundException | SQLException e) {
            fail("Exceção inesperada: " + e.getMessage());
        }
    }
}
