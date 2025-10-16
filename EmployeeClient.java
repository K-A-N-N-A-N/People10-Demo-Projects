import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class EmployeeClient {

    private static final String BASE_URL = "http://localhost:8080/employees";

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Choose operation: 1=List, 2=Add, 3=Get, 4=Update, 5=Delete, 0=Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch(choice) {
                case 1: listEmployees(); break;
                case 2: addEmployee(scanner); break;
                case 3: getEmployee(scanner); break;
                case 4: updateEmployee(scanner); break;
                case 5: deleteEmployee(scanner); break;
                case 0: System.exit(0);
                default: System.out.println("Invalid choice");
            }
        }
    }

    private static void listEmployees() throws Exception {
        URL url = new URL(BASE_URL);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        Scanner in = new Scanner(conn.getInputStream());
        while (in.hasNext()) System.out.println(in.nextLine());
        in.close();
    }

    private static void addEmployee(Scanner scanner) throws Exception {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Role: ");
        String role = scanner.nextLine();

        String json = String.format("{\"name\":\"%s\",\"role\":\"%s\"}", name, role);

        sendRequest(BASE_URL, "POST", json);
    }

    private static void getEmployee(Scanner scanner) throws Exception {
        System.out.print("Employee ID: ");
        String id = scanner.nextLine();
        URL url = new URL(BASE_URL + "/" + id);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        Scanner in = new Scanner(conn.getInputStream());
        while (in.hasNext()) System.out.println(in.nextLine());
        in.close();
    }

    private static void updateEmployee(Scanner scanner) throws Exception {
        System.out.print("Employee ID: ");
        String id = scanner.nextLine();
        System.out.print("New Name: ");
        String name = scanner.nextLine();
        System.out.print("New Role: ");
        String role = scanner.nextLine();

        String json = String.format("{\"name\":\"%s\",\"role\":\"%s\"}", name, role);
        sendRequest(BASE_URL + "/" + id, "PUT", json);
    }

    private static void deleteEmployee(Scanner scanner) throws Exception {
        System.out.print("Employee ID: ");
        String id = scanner.nextLine();
        sendRequest(BASE_URL + "/" + id, "DELETE", null);
    }

    private static void sendRequest(String urlStr, String method, String json) throws Exception {
        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod(method);
        if(json != null) {
            conn.setDoOutput(true);
            conn.setRequestProperty("Content-Type", "application/json");
            OutputStream os = conn.getOutputStream();
            os.write(json.getBytes());
            os.flush();
            os.close();
        }

        Scanner in = new Scanner(conn.getInputStream());
        while (in.hasNext()) System.out.println(in.nextLine());
        in.close();
    }
}
