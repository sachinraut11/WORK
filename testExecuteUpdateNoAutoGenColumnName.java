/**
 * Tests stmt.executeUpdate(String, String[]) After doing an insert into a
 * table that doesn't have a generated column, the test should fail.
 * 
 * @throws SQLException
 */
public void testExecuteUpdateNoAutoGenColumnName() throws SQLException {

    Statement stmt = createStatement();

    String[] columnNames = new String[2];
    columnNames[0] = "I";
    columnNames[1] = "S";
    try {
        stmt.executeUpdate("insert into tab1 values(2, 3, 4.1)",
                columnNames);
        fail("FAIL -- executeUpdate should have failed...");
    } catch (SQLException ex) {
        assertFailedExecuteUpdateForColumnName(ex);
    }
}
}