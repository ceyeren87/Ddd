module com.sau.db {
    requires jakarta.persistence;
    requires org.eclipse.persistence.jpa;

    opens com.sau.db;
    exports  com.sau.db;

}