public class CustomerManager {
    BaseDatabaseManager baseDatabaseManager;
    public void getCustomer(BaseDatabaseManager baseDatabaseManager) {
        this.baseDatabaseManager = baseDatabaseManager;
        baseDatabaseManager.getData();
    }
}
