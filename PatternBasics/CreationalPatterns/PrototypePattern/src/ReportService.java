import java.util.HashMap;
import java.util.Map;

public class ReportService {
    private final GenerateReport defaultTemplate =
            new GenerateReport("Header", "Content", "Footer");

    private final Map<String, GenerateReport> registry = new HashMap<>();

    public ReportService() {
        registry.put("SIMPLE", defaultTemplate);
        registry.put("SALES", new GenerateReport("Sales Report", "Quarterly sales...", "Confidential"));
        registry.put("INVOICE", new GenerateReport("Invoice", "Line items...", "Thank you!"));
    }

    // clone default template
    public GenerateReport newReport() {
        return (GenerateReport) defaultTemplate.clone();
    }

    // clone named template
    public GenerateReport newReportFrom(String key) {
        GenerateReport proto = registry.get(key);
        if (proto == null) throw new IllegalArgumentException("Unknown template: " + key);
        return (GenerateReport) proto   .clone();
    }

    public void registerTemplate(String key, GenerateReport proto) {
        registry.put(key, proto);
    }
}
