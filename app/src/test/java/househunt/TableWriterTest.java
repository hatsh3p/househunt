package househunt;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class TableWriterTest {
    private TableWriter writer;

    @BeforeEach
    void setup() {
        List<String> headers = List.of("Zipcode", "Neighborhood", "Walkability Score", "School Score");
        writer = new TableWriter(headers);
    }

    @Test
    void testConstructorWithHeader() {
        List<String> expected = List.of("Zipcode", "Neighborhood", "Walkability Score", "School Score");
        List<String> actual = writer.table.get(0);
        Assertions.assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    void testAddRow() {
        List<String> expected = List.of("90000", "Los Angeles", "0", "0");
        writer.addRow(expected);
        List<String> actual = writer.table.get(1);
        Assertions.assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    void testToString() {
        writer.addRow(List.of("90001", "Pasadena", "100", "100"));
        writer.addRow(List.of("90002", "East Los Angeles", "50", "50"));
        writer.addRow(List.of("90003", "Glendale", "75", "75"));
        System.out.println(writer.toString());
    }
}