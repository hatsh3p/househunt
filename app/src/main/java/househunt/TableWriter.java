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
        StringBuilder builder = new StringBuilder();
        builder.append("House Hunter Results\n");
        builder.append(String.format("%89s", "-").replace(' ', '-')); //hard coded
        builder.append('\n');
        for (List<String> l : table) {
            for (String s : l) {
                builder.append(String.format("| %-20s", s));
            }
            builder.append("|\n");
        }
        builder.append(String.format("%89s", "-").replace(' ', '-')); //hard coded
        builder.append('\n');
        return builder.toString();
    }
}
