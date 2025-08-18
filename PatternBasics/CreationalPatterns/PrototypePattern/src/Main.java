public class Main {
    public static void main(String[] args) {
        ReportService service = new ReportService();

        GenerateReport r1 = service.newReport();
        r1.setHeader("Daily Ops");
        r1.setContent("All systems green.");
        r1.setFooter("Generated at 08:30");
        r1.show();

        GenerateReport r3 = service.newReport();
        r1.setHeader("Daily Ops");
        r1.setContent("All systems green. V1");
        r1.show();
        // cloned object in different address but with same content
        System.out.println(r1);
        System.out.println(r3);

        GenerateReport r2 = service.newReportFrom("SALES");
        r2.setContent("Q4 sales up 18% YoY");
        r2.show();

    }
}
