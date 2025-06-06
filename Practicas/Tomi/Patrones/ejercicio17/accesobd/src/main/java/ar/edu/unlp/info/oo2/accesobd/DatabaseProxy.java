package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.List;

public class DatabaseProxy implements DatabaseAccess {
    private DatabaseRealAccess databaseRealAccess;

    public DatabaseProxy(DatabaseRealAccess databaseRealAccess) {
        this.databaseRealAccess = databaseRealAccess;
    }

    @Override
    public Collection<String> getSearchResults(String queryString) {
        if (!this.isAuthenticatedUser(user)) return List.of();
        return this.databaseRealAccess.getSearchResults(queryString);
    }

    @Override
    public int insertNewRow(List<String> rowData) {
        if (!this.isAuthenticatedUser()) return 0;
        return this.databaseRealAccess.insertNewRow(rowData);
    }

    private boolean isAuthenticatedUser(User user) {
        return loginService.isAuthenticatedUser(User user);
    }
}
