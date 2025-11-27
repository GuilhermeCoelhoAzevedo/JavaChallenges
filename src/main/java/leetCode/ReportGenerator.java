package leetCode;

import java.util.List;

/**
 * A class responsible for generating reports in various formats.
 * This class connects to a database, fetches data, and then formats
 * it into either PDF or CSV.
 */
public class ReportGenerator {

    /**
     * Generates a report based on the given type and data.
     *
     * @param reportType The type of report to generate ("PDF" or "CSV").
     * @param data The list of data to include in the report.
     * @return A byte array representing the generated report file.
     */
    public byte[] generateReport(String reportType, List<String> data) {
        System.out.println("Connecting to the database...");
        // Simulate fetching more data based on initial data
        List<String> enrichedData = fetchDataFromDB(data);
        System.out.println("Data fetched successfully.");

        if (reportType.equalsIgnoreCase("PDF")) {
            // Specific logic for creating a PDF report
            System.out.println("Formatting report as PDF...");
            String pdfContent = "PDF HEADER\n";
            for (String item : enrichedData) {
                pdfContent += "PDF-ITEM: " + item + "\n";
            }
            pdfContent += "PDF FOOTER\n";
            System.out.println("PDF report generated.");
            // Simulate returning the file as a byte array
            return pdfContent.getBytes();

        } else if (reportType.equalsIgnoreCase("CSV")) {
            // Specific logic for creating a CSV report
            System.out.println("Formatting report as CSV...");
            StringBuilder csvContent = new StringBuilder();
            csvContent.append("id,value\n"); // CSV header
            int index = 1;
            for (String item : enrichedData) {
                csvContent.append(index++).append(",").append(item).append("\n");
            }
            System.out.println("CSV report generated.");
            // Simulate returning the file as a byte array
            return csvContent.toString().getBytes();
        } else {
            System.out.println("Error: Unsupported report type.");
            return null;
        }
    }

    /**
     * Simulates a database call to fetch and enrich data.
     * In a real application, this would involve JDBC calls.
     */
    private List<String> fetchDataFromDB(List<String> initialData) {
        // In a real scenario, we might use the initialData in a WHERE clause.
        // For this example, we'll just add a prefix to show it's "enriched".
        return initialData.stream()
                .map(item -> "DB_" + item)
                .collect(java.util.stream.Collectors.toList());
    }
}
