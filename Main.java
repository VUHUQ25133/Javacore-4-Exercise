package JV4;
import java.util.*;
public class Main {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

        Manager libraryManager = new Manager();
        
        // Đăng nhập
        if (libraryManager.login() == 1) {
            while (libraryManager.isAdminLoggedIn()) {
                // Hiển thị menu
                System.out.println("Select a function:");
                System.out.println("1. Add new product");
                System.out.println("2. Delete product");
                System.out.println("3. Edit product");
                System.out.println("4. Search products");
                System.out.println("5. Display All List");
                System.out.println("6. Logout");
                System.out.println("7. Exit");

                // Nhập lựa chọn từ người dùng
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                // Xử lý lựa chọn
                switch (choice) {
                    case 1:
                        libraryManager.addProduct();
                        break;
                    case 2:
                        libraryManager.deleteProduct();
                        break;
                    case 3:
                        libraryManager.editProduct();
                        break;
                    case 4:
                        libraryManager.searchProducts();
                        break;
                    case 5:
                        libraryManager.displayProductList();
                        break;
                    case 6:
                    	libraryManager.logout();
                    	break;                    	
                    case 7:
                        libraryManager.exit();
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } else {
            while (true) {
                // Hiển thị menu chức năng
                System.out.println("Select a function:");
                System.out.println("1. Search products");
                System.out.println("2. Display All List");
                System.out.println("3. Logout");
                System.out.println("4. Exit");

                // Nhập lựa chọn từ người dùng
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Đọc bỏ dòng trống

                // Xử lý lựa chọn
                switch (choice) {
                	case 1:
                		libraryManager.searchProducts();
                		break;
                	case 2:
                		libraryManager.displayProductList();
                        break;
                	case 3:
                		libraryManager.logout();
                    	break;
                	case 4:
                		libraryManager.exit();
                		break;
                	default: 
                		System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }
}
