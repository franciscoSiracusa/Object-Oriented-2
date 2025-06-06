package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.List;

public class DatabaseProxy implements DatabaseAccess {

    private DatabaseRealAccess databaseRealAccess;
    private boolean isLog;

    public DatabaseProxy(DatabaseRealAccess databaseRealAccess) {
        this.databaseRealAccess = databaseRealAccess;
        this.isLog = false;
    }

    public void logIn() {
        this.isLog = true;
    }

    public void logOut() {
        this.isLog = false;
    }

    @Override
    public Collection<String> getSearchResults(String queryString) {
        if (isLog) {
            return this.databaseRealAccess.getSearchResults(queryString);
        }
        return List.of();
    }

    @Override
    public int insertNewRow(List<String> rowData) {
        if (isLog) {
            return this.databaseRealAccess.insertNewRow(rowData);
        }
        return -1;
    }
}