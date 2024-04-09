package househunt;

import java.util.ArrayList;
import java.util.List;

public final class TableWriter {
    List<List<String>> table;

    public TableWriter(List<String> headers) {
        table = new ArrayList<>();
        table.add(headers);
    }

    public void addRow(List<String> row) {
        table.add(row);
    }

    // Replace with StringBuilder.
    @Override
    public String toString() {
        for (List<String> l : table) {
            for (String s : l) {
                System.out.print("%s ");
            }
            System.out.println();
        }
        return super.toString();
    }
}
