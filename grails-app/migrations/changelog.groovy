databaseChangeLog = {

    changeSet(author: "makelsa (generated)", id: "1557779603974-1") {
        createTable(tableName: "foo") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "fooPK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "code", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "another_foo_id", type: "BIGINT")
        }
    }

    changeSet(author: "makelsa (generated)", id: "1557779603974-2") {
        createTable(tableName: "foo_sub_foos") {
            column(name: "sub_foos__id", type: "BIGINT") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "makelsa (generated)", id: "1557779603974-3") {
        addForeignKeyConstraint(baseColumnNames: "another_foo_id", baseTableName: "foo", constraintName: "FK3445q5ehqmexdrqlv4ro3dhn9", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "foo")
    }

    changeSet(author: "makelsa (generated)", id: "1557779603974-4") {
        addForeignKeyConstraint(baseColumnNames: "sub_foos__id", baseTableName: "foo_sub_foos", constraintName: "FKkwn8xg3fkg7w0ynguw5smh9hx", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "foo")
    }
}
