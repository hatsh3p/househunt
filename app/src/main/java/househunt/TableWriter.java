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

    @Override
    public String toString() {
        return super.toString();
    }
}
