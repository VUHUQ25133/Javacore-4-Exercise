package JV4;
import java.util.*;

//Manager.java
public class Manager {
	
	private boolean adminLoggedIn = false;
	boolean isAdminLoggedIn() {
        return adminLoggedIn;
    }
	
	 private List <Voghi> voghiList  = new ArrayList<>();
	 private List<Butchi> butchiList = new ArrayList<>();
	 private List<Butmuc> butmucList = new ArrayList<>();
	 private List  <Book> bookList   = new ArrayList<>();
	 
	 private Scanner scanner = new Scanner(System.in);
	 private static int voghiIdCounter = 1;
	 private static int butchiIdCounter = 1;
	 private static int butmucIdCounter = 1;
	 private static int bookIdCounter = 1;


	 // Chức năng 1: Thêm sản phẩm
	 void addProduct() {
	     System.out.println("Select product type to add:");
	     System.out.println("1. Voghi");
	     System.out.println("2. Butchi");
	     System.out.println("3. Butmuc");
	     System.out.println("4. Book");
	     System.out.print("Enter your choice: ");
	     int productTypeChoice = scanner.nextInt();
	     scanner.nextLine(); // Consume the newline
	
	     switch (productTypeChoice) {
	         case 1:
	             addVoghi();
	             break;
	         case 2:
	             addButchi();
	             break;
	         case 3:
	             addButmuc();
	             break;
	         case 4:
	             addBook();
	             break;
	         default:
	             System.out.println("Invalid choice.");
	     }
	 }

	 private void addVoghi() {
	     System.out.print("Enter name:__________");
	     String name = scanner.nextLine();
	     System.out.print("Enter price: ________");
	     double price = scanner.nextDouble();
	     scanner.nextLine(); // Consume the newline
	     System.out.print("Enter brand:_________");
	     String brand = scanner.nextLine();
	     System.out.print("Enter page: _________");
	     int page = scanner.nextInt();
	     scanner.nextLine(); // Consume the newline
	     System.out.print("Enter page type: ____");
	     String pageType = scanner.nextLine();
	     System.out.print("Enter page color: ___");
	     String pageColor = scanner.nextLine();
	     System.out.print("Enter page material: ");
	     String pageMaterial = scanner.nextLine();
	     System.out.print("Enter page size:_____");
	     String pageSize = scanner.nextLine();
	
	     Voghi newVoghi = new Voghi(name, price, brand, page, pageType, pageColor, pageMaterial, pageSize);
	     newVoghi.setId(voghiIdCounter);
	     voghiList.add(newVoghi);
	     System.out.println("Voghi " + voghiIdCounter++ + " has been added.");
	 }
	
	 private void addButchi() {
	     System.out.print("Enter name:____________");
	     String name = scanner.nextLine();
	     System.out.print("Enter price:___________");
	     double price = scanner.nextDouble();
	     scanner.nextLine(); // Consume the newline
	     System.out.print("Enter brand:___________");
	     String brand = scanner.nextLine();
	     System.out.print("Enter pencil color:____");
	     String pencilColor = scanner.nextLine();
	     System.out.print("Enter pencil material: ");
	     String pencilMaterial = scanner.nextLine();
	     System.out.print("Enter pencil hardness: ");
	     String pencilHardness = scanner.nextLine();
	
	     Butchi newButchi = new Butchi(name, price, brand, pencilColor, pencilMaterial, pencilHardness);
	     newButchi.setId(butchiIdCounter);
	     butchiList.add(newButchi);
	     System.out.println("Butchi " + butchiIdCounter++ + " has been added.");
	 }
	
	 private void addButmuc() {
	     System.out.print("Enter name:___________");
	     String name = scanner.nextLine();
	     System.out.print("Enter price:__________");
	     double price = scanner.nextDouble();
	     scanner.nextLine(); // Consume the newline
	     System.out.print("Enter brand:__________");
	     String brand = scanner.nextLine();
	     System.out.print("Enter pen color:______");
	     String penColor = scanner.nextLine();
	     System.out.print("Enter pen material:___");
	     String penMaterial = scanner.nextLine();
	     System.out.print("Enter pen type:_______");
	     String penType = scanner.nextLine();
	     System.out.print("Enter pen smoothness: ");
	     String penSmooth = scanner.nextLine();
	
	     Butmuc newButmuc = new Butmuc(name, price, brand, penColor, penMaterial, penType, penSmooth);
	     newButmuc.setId(butmucIdCounter);
	     butmucList.add(newButmuc);
	     System.out.println("butmuB " + butmucIdCounter++ + " has been added.");
	 }
	
	 private void addBook() {
		 System.out.print("Enter name:_____________");
		 String name = scanner.nextLine();
		 System.out.print("Enter price:____________");
		 double price = scanner.nextDouble();
		 scanner.nextLine(); // Consume the newline
		 System.out.print("Enter brand:____________");
	     String brand = scanner.nextLine();
	     System.out.print("Enter genre:____________");
	     String genre = scanner.nextLine();
	     System.out.print("Enter author:___________");
	     String author = scanner.nextLine();
	     System.out.print("Enter publisher:________");
	     String publisher = scanner.nextLine();
	     System.out.print("Enter publication year: ");
	     int publicationYear = scanner.nextInt();
	     scanner.nextLine(); // Consume the newline
	     System.out.print("Enter language:_________");
	     String language = scanner.nextLine();
	     
	     Book newBook = new Book(name, price, brand, genre, author, publisher, publicationYear, language);
	     newBook.setId(bookIdCounter);
	     bookList.add(newBook);
	     System.out.println("Book " + bookIdCounter++ + " has been added.");
	 }
	 
	 
	// Chức năng 2: Xóa sản phẩm
	 void deleteProduct() {
		 System.out.println("Select product type to delete:");
	     System.out.println("1. Voghi");
	     System.out.println("2. Butchi");
	     System.out.println("3. Butmuc");
	     System.out.println("4. Book");
	     System.out.print("Enter your choice: ");
	     int productTypeChoice = scanner.nextInt();
	     scanner.nextLine(); // Consume the newline

	     switch (productTypeChoice) {
	         case 1:
	             deleteVoghi();
	             break;
	         case 2:
	             deleteButchi();
	             break;
	         case 3:
	             deleteButmuc();
	             break;
	         case 4:
	             deleteBook();
	             break;
	         default:
	             System.out.println("Invalid choice.");
	     }
	 }    
	 private void deleteVoghi() {
	     System.out.print("Enter product name to delete: ");
	     String productName = scanner.nextLine();

	     ArrayList<Voghi> matchingProducts = new ArrayList<>();

	     for (Voghi product : voghiList) {
	         if (product.getName().equalsIgnoreCase(productName)) {
	             matchingProducts.add(product);
	         }
	     }

	     if (matchingProducts.isEmpty()) {
	         System.out.println("No matching products found.");
	     } else {
	         System.out.println("Matching products:");
	         for (Voghi product : matchingProducts) {
	             System.out.println("-----------------");
	             System.out.println("ID:     " + product.getId());
	             System.out.println(product);
	             System.out.println("-----------------");
	         }

	         System.out.print("Enter the ID of the product to delete: ");
	         int deleteId = scanner.nextInt();
	         scanner.nextLine(); // Consume the newline

	         for (int i = 0; i < voghiList.size(); i++) {
	             if (voghiList.get(i).getId() == deleteId) {
	                 voghiList.remove(i);
	                 for (int j = i; j < voghiList.size(); j++) {
	                     voghiList.get(j).setId(voghiList.get(j).getId() - 1);
	                 }
	                 System.out.println("Product with ID " + deleteId + " has been removed.");
	                 return;
	             }
	         }
	         System.out.println("Product with ID " + deleteId + " not found.");
	     }
	 }

	 private void deleteButchi() {
		 System.out.print("Enter product name to delete: ");
	     String productName = scanner.nextLine();

	     ArrayList<Butchi> matchingProducts = new ArrayList<>();

	     for (Butchi product : butchiList){
	     	 if (product.getName().equalsIgnoreCase(productName)) {
	     		 matchingProducts.add(product);
	    	 }
	     }

	     if (matchingProducts.isEmpty()) {
	    	 System.out.println("No matching products found.");
	     } else {
	    	 System.out.println("Matching products:");

	    	 for (Butchi product : matchingProducts) {
	    		 System.out.println("-----------------");
		         System.out.println("ID:     " + product.getId());
		         System.out.println(product);
		         System.out.println("-----------------");
	    	 }

	    	 System.out.print("Enter the ID of the product to delete: ");
	    	 int deleteId = scanner.nextInt();
	    	 scanner.nextLine(); // Consume the newline
	    	 for (int i = 0; i < butchiList.size(); i++) {
	             if (butchiList.get(i).getId() == deleteId) {
	            	 butchiList.remove(i);
	            	 for (int j = i; j < butchiList.size(); j++) {
	            		 butchiList.get(j).setId(butchiList.get(j).getId() - 1);
	                 }
	                 System.out.println("Product with ID " + deleteId + " has been removed.");
	                 return;
	             }
	         }
   	         System.out.println("Product with ID " + deleteId + " not found.");
	     } 
	 }

	 private void deleteButmuc() {
		System.out.print("Enter product name to delete: ");
		String productName = scanner.nextLine();

		ArrayList<Butmuc> matchingProducts = new ArrayList<>();

		for (Butmuc product : butmucList)
		{
		    if (product.getName().equalsIgnoreCase(productName))
		    {
		        matchingProducts.add(product);
		    }
		}
		if (matchingProducts.isEmpty())
		{
		    System.out.println("No matching products found.");
		}
		else
		{
		    System.out.println("Matching products:");
		    for (Butmuc product : matchingProducts)
		    {
		        System.out.println("-----------------");
		        System.out.println("ID:     " + product.getId());
		        System.out.println(product);
		        System.out.println("-----------------");
		    }
		    System.out.print("Enter the ID of the product to delete: ");
		    int deleteId = scanner.nextInt();
		    scanner.nextLine(); // Consume the newline
	        for (int i = 0; i < butmucList.size(); i++)
	        {
	            if (butmucList.get(i).getId() == deleteId)
	            {
	                butmucList.remove(i);
	                for (int j = i; j < butmucList.size(); j++)
	                {
	                    butmucList.get(j).setId(butmucList.get(j).getId() - 1);
	                }
	                System.out.println("Product with ID " + deleteId + " has been removed.");
	                return;
	            }
	        }
	        System.out.println("Product with ID " + deleteId + " not found.");
	    }
	}
	 
	 private void deleteBook()
	 {
	     System.out.print("Enter product name to delete: ");
	     String productName = scanner.nextLine();

	     ArrayList<Book> matchingProducts = new ArrayList<>();

	     for (Book product : bookList)
	     {
	         if (product.getName().equalsIgnoreCase(productName))
	         {
	        	 matchingProducts.add(product);
	         }
	     }

	     if (matchingProducts.isEmpty())
	     {
	         System.out.println("No matching products found.");
	     }
	     else
         {
             System.out.println("Matching products:");
             for (Book product : matchingProducts)
             {
                 System.out.println("-----------------");
                 System.out.println("ID:     " + product.getId());
                 System.out.println(product);
                 System.out.println("-----------------");
             }
             System.out.print("Enter the ID of the product to delete: ");
             int deleteId = scanner.nextInt();
             scanner.nextLine(); // Consume the newline
             for (int i = 0; i < bookList.size(); i++)
             {
                 if (bookList.get(i).getId() == deleteId)
                 {
                     bookList.remove(i);
                     for (int j = i; j < bookList.size(); j++)
                     {
                         bookList.get(j).setId(bookList.get(j).getId() - 1);
                     }
                     System.out.println("Product with ID " + deleteId + " has been removed.");
                     return;
                 }
             }
             System.out.println("Product with ID " + deleteId + " not found.");
         }
	 }
	 
	 
	 //Chức năng 3: Sửa sản phẩm
	 void editProduct() {
		 System.out.println("Select product type to edit:");
		 System.out.println("1. Voghi");
		 System.out.println("2. Butchi");
		 System.out.println("3. Butmuc");
		 System.out.println("4. Book");
		 System.out.print("Enter your choice: ");
		 int productTypeChoice = scanner.nextInt();
		 scanner.nextLine(); // Consume the newline
		 switch (productTypeChoice) {
		     case 1:
		         editVoghi();
		         break;
		     case 2:
		         editButchi();
		         break;
		     case 3:
		         editButmuc();
		         break;
		     case 4:
		         editBook();
		         break;
		     default:
		         System.out.println("Invalid choice.");
		 }
	 }
	 private void editVoghi() {
		 System.out.print("Enter the name of the Voghi to edit: ");
		 String input = scanner.nextLine();

		 for (Voghi voghi : voghiList) {
		     if (voghi.getName().equalsIgnoreCase(input)) {
		         // Nhập các thông tin mới
		         System.out.print("Enter new name: ");
		         String newName = scanner.nextLine();
		         System.out.print("Enter new price: ");
		         double newPrice = scanner.nextDouble();
		         scanner.nextLine(); // Consume the newline
		         System.out.print("Enter new brand: ");
		         String newBrand = scanner.nextLine();
		         System.out.print("Enter new page: ");
		         int newPage = scanner.nextInt();
		         scanner.nextLine(); // Consume the newline
		         System.out.print("Enter new page type: ");
		         String newPageType = scanner.nextLine();
		         System.out.print("Enter new page color: ");
		         String newPageColor = scanner.nextLine();
		         System.out.print("Enter new page material: ");
		         String newPageMaterial = scanner.nextLine();
		         System.out.print("Enter new page size: ");
		         String newPageSize = scanner.nextLine();
		         // Cập nhật thông tin của sản phẩm
		         voghi.setName(newName);
		         voghi.setPrice(newPrice);
		         voghi.setBrand(newBrand);
		         voghi.setPage(newPage);
		         voghi.setPageType(newPageType);
		         voghi.setPageColor(newPageColor);
		         voghi.setPageMaterial(newPageMaterial);
		         voghi.setPageSize(newPageSize);
		         System.out.println("Product information has been updated.");
		         return;
		     }
		 }
		 System.out.println("Product not found in the list.");
	 }
	 
	 private void editButchi() {
		 System.out.print("Enter the name of the Butchi to edit: ");
		 String input = scanner.nextLine();

		 for (Butchi butchi : butchiList) {
		     if (butchi.getName().equalsIgnoreCase(input)) {
		         // Nhập các thông tin mới
		         System.out.print("Enter new name: ");
		         String newName = scanner.nextLine();
		         System.out.print("Enter new price: ");
		         double newPrice = scanner.nextDouble();
		         scanner.nextLine(); // Consume the newline
		         System.out.print("Enter new brand: ");
		         String newBrand = scanner.nextLine();
		         System.out.print("Enter new pencil color: ");
		         String newPencilColor = scanner.nextLine();
		         System.out.print("Enter new pencil material: ");
		         String newPencilMaterial = scanner.nextLine();
		         System.out.print("Enter new pencil hardness: ");
		         String newPencilHardness = scanner.nextLine();

		         // Cập nhật thông tin của sản phẩm
		         butchi.setName(newName);
		         butchi.setPrice(newPrice);
		         butchi.setBrand(newBrand);
		         butchi.setPencilColor(newPencilColor);
		         butchi.setPencilMaterial(newPencilMaterial);
		         butchi.setPencilHardness(newPencilHardness);

		         System.out.println("Product information has been updated.");
		         return;
		     }
		 }

		 System.out.println("Product not found in the list.");
	 }

	 private void editButmuc() {
		 System.out.print("Enter the name of the Butmuc to edit: ");
		 String input = scanner.nextLine();

		 for (Butmuc butmuc : butmucList) {
		     if (butmuc.getName().equalsIgnoreCase(input)) {
		         // Nhập các thông tin mới
		         System.out.print("Enter new name: ");
		         String newName = scanner.nextLine();
		         System.out.print("Enter new price: ");
		         double newPrice = scanner.nextDouble();
		         scanner.nextLine(); // Consume the newline
		         System.out.print("Enter new brand: ");
		         String newBrand = scanner.nextLine();
		         System.out.print("Enter new pen color: ");
		         String newPenColor = scanner.nextLine();
		         System.out.print("Enter new pen material: ");
		         String newPenMaterial = scanner.nextLine();
		         System.out.print("Enter new pen type: ");
		         String newPenType = scanner.nextLine();
		         System.out.print("Enter new pen smoothness: ");
		         String newPenSmooth = scanner.nextLine();

		         // Cập nhật thông tin của sản phẩm
		         butmuc.setName(newName);
		         butmuc.setPrice(newPrice);
		         butmuc.setBrand(newBrand);
		         butmuc.setPenColor(newPenColor);
		         butmuc.setPenMaterial(newPenMaterial);
		         butmuc.setPenType(newPenType);
		         butmuc.setPenSmooth(newPenSmooth);

		         System.out.println("Product information has been updated.");
		         return;
		     }
		 }
		 System.out.println("Product not found in the list.");
	 }

	 private void editBook() {
		 System.out.print("Enter the name of the Book to edit: ");
		 String input = scanner.nextLine();

		 for (Book book : bookList) {
		     if (book.getName().equalsIgnoreCase(input)) {
		         // Nhập các thông tin mới
		         System.out.print("Enter new name: ");
		         String newName = scanner.nextLine();
		         System.out.print("Enter new price: ");
		         double newPrice = scanner.nextDouble();
		         scanner.nextLine(); // Consume the newline
		         System.out.print("Enter new brand: ");
		         String newBrand = scanner.nextLine();
		         System.out.print("Enter new genre: ");
		         String newGenre = scanner.nextLine();
		         System.out.print("Enter new author: ");
		         String newAuthor = scanner.nextLine();
		         System.out.print("Enter new publisher: ");
		         String newPublisher = scanner.nextLine();
		         System.out.print("Enter new publication year: ");
		         int newPublicationYear = scanner.nextInt();
		         scanner.nextLine(); // Consume the newline
		         System.out.print("Enter new language: ");
		         String newLanguage = scanner.nextLine();

		         // Cập nhật thông tin của sản phẩm
		         book.setName(newName);
		         book.setPrice(newPrice);
		         book.setBrand(newBrand);
		         book.setGenre(newGenre);
		         book.setAuthor(newAuthor);
		         book.setPublisher(newPublisher);
		         book.setPublicationYear(newPublicationYear);
		         book.setLanguage(newLanguage);

		         System.out.println("Product information has been updated.");
		         return;
		     }
		 }

		 System.out.println("Product not found in the list.");
	 }
	 
	 
	 //Chức năng 4: Tìm kiếm sản phẩm
	 void searchProducts() {
		 	System.out.println("Enter search keyword:");
		    String keyword = scanner.nextLine().toLowerCase();

		    List<Product> searchResults = new ArrayList<>();


		    for (Voghi voghi : voghiList) {
		        if (voghi.containsKeyword(keyword)) {
		            searchResults.add(voghi);
		        }
		    }

		    for (Butchi butchi : butchiList) {
		        if (butchi.containsKeyword(keyword)) {
		            searchResults.add(butchi);
		        }
		    }

		    for (Butmuc butmuc : butmucList) {
		        if (butmuc.containsKeyword(keyword)) {
		            searchResults.add(butmuc);
		        }
		    }

		    for (Book book : bookList) {
		        if (book.containsKeyword(keyword)) {
		            searchResults.add(book);
		        }
		    }


		    if (!searchResults.isEmpty()) {
		        System.out.println("Select display format:");
		        System.out.println("1. Table format");
		        System.out.println("2. List format");
		        System.out.print("Enter your choice: ");
		        int displayChoice = scanner.nextInt();
		        scanner.nextLine(); // Consume the newline

		        if (displayChoice== 1)	           
		                displayTable(searchResults);
		        else
		                displayList(searchResults);
		    }
		    
		    else System.out.println("No matching products found.");
	 }



		// In danh sách
		private void displayList(List<Product> products) {
		    System.out.println("Search results:");
		    System.out.println("------");

		    for (Product product : products) {
		        System.out.println("Product Name: " + product.getName());
		        System.out.println("Price: " + product.getPrice());
		        System.out.println("Brand: " + product.getBrand());
		        displayAdditionalList(product);
		        System.out.println("------");
		    }
		}
	 
		// In bảng
		private void displayTable(List<Product> products) {
		    System.out.println("| Product Name  |  Price   |    Brand     |          Additional information          |");
		    System.out.println("|---------------|----------|--------------|------------------------------------------|");

		    for (Product product : products) {
		        System.out.println("| " + formatCell(product.getName(), 14)
		                + "| " + formatCell(String.valueOf(product.getPrice()), 9)
		                + "| " + formatCell(product.getBrand(), 13)
		                + "| " + AdditionalInfo(product)
		                + "|");
		        System.out.println("|---------------|----------|--------------|------------------------------------------|");
		    }

		    
		}

		// formatCell()
		private String formatCell(String data, int length) { 
		    return String.format("%-" + length + "s", data);
		}
		// Thông tin thêm dạng ds
		private String AdditionalList(Product product) {
		    if (product instanceof Voghi) {
		        Voghi voghi = (Voghi) product;
		        return "- Page Color: " + voghi.getPageColor()
		           + "\n- Page Material: " + voghi.getPageMaterial()
		           + "\n- Page Size: " + voghi.getPageSize();
		    } else if (product instanceof Butchi) {
		        Butchi butchi = (Butchi) product;
		        return "- Pencil Color: " + butchi.getPencilColor()
		           + "\n- Pencil Material: " + butchi.getPencilMaterial()
		           + "\n- Pencil Hardness: " + butchi.getPencilHardness();
		    } else if (product instanceof Butmuc) {
		        Butmuc butmuc = (Butmuc) product;
		        return "- Pen Color: " + butmuc.getPenColor()
		           + "\n- Pen Material: " + butmuc.getPenMaterial()
		           + "\n- Ink Type: " + butmuc.getPenType()
		           + "\n- Pen Smoothness: " + butmuc.getPenSmooth();
		    } else if (product instanceof Book) {
		        Book book = (Book) product;
		        return "- Genre: " + book.getGenre()
		           + "\n- Author: " + book.getAuthor()
		           + "\n- Publisher: " + book.getPublisher()
		           + "\n- Published Year: " + book.getPublicationYear()
		           + "\n- Language: " + book.getLanguage();
		    }
		    return "";
		}
		// Thông tin thêm dạng bảng
		private String AdditionalInfo(Product product) {
		    if (product instanceof Voghi) {
		        Voghi voghi = (Voghi) product;
		        return 	"- Page Number: " + formatCell(String.valueOf(voghi.getPage()), 26) + "|\n"
		         	+ 	"|               |          |              | " 
		        	+ 	"- Page Type: " + formatCell(voghi.getPageType(), 28) + "|\n"  
		        	+ 	"|               |          |              | "
		        	+ 	"- Page Color: " + formatCell(voghi.getPageColor(), 27) + "|\n"
		            + 	"|               |          |              | "
		            + 	"- Page Material: " + formatCell(voghi.getPageMaterial(), 24) + "|\n"
		            + 	"|               |          |              | "
		            + 	"- Page Size: " + formatCell(voghi.getPageSize(), 28);
		    } 
		    
		    else if (product instanceof Butchi) {
		        Butchi butchi = (Butchi) product;
		        return 	"- Pencil Color: " + formatCell(butchi.getPencilColor(), 25) + "|\n"
		        	+   "|               |          |              | "
		        	+   "- Pencil Material: " + formatCell(butchi.getPencilMaterial(), 22) + "|\n"
		        	+   "|               |          |              | "
		        	+   "- Pencil Hardness: " + formatCell(butchi.getPencilHardness(), 22);
		    } 
		    
		    else if (product instanceof Butmuc) {
		        Butmuc butmuc = (Butmuc) product;
		        return 	"- Pen Color: " + formatCell(butmuc.getPenColor(), 28) + "|\n"
		        
		           	+ 	"- Pen Material: " + formatCell(butmuc.getPenMaterial(), 25)+ "|\n"
		           	+   "|               |          |              | "		           
		           	+ 	"- Ink Type: " + formatCell(butmuc.getPenType(), 29) + "|\n"
		           	+   "|               |          |              | "
		           	+ 	"- Pen Smoothness: " + formatCell(String.valueOf(butmuc.getPenSmooth()), 23);
		    } 
		    
		    else if (product instanceof Book) {
		        Book book = (Book) product;
		        return 	"- Genre: " + formatCell(book.getGenre(), 32) + "|\n"
		        	+   "|               |          |              | "
		           	+ 	"- Author: " + formatCell(book.getAuthor(), 31) + "|\n" 
		           	+   "|               |          |              | "
		           	+ 	"- Publisher: " + formatCell(book.getPublisher(), 28) + "|\n"
		           	+   "|               |          |              | "
		           	+	"- Published Year: " + formatCell(String.valueOf(book.getPublicationYear()), 23) + "|\n"
		           	+   "|               |          |              | "
		           	+ 	"- Language: " + formatCell(book.getLanguage(), 29);
		    }
		    return "";
		}

		// In thông tin thêm
		private void displayAdditionalInfo(Product product) {
		    System.out.println(AdditionalInfo(product));
		}
		private void displayAdditionalList(Product product) {
		    System.out.println(AdditionalList(product));
		}
		
		//Chức năng 5: Đăng nhập
		int login() {
	  	 	System.out.print("Login as ADMIN(1) or GUEST(2): ");
	  	 	int dangnhap = scanner.nextInt();
	     	scanner.nextLine();
	     
	     	if (dangnhap == 1) {
		     	System.out.print("Enter username: ");
		     	String username = scanner.nextLine();
		     	System.out.print("Enter password: ");
		     	String password = scanner.nextLine();
		
		     	if (username.equals("vuhuq") && password.equals("xxx")) {
		         	System.out.println("Login successful. Welcome, admin!");
		         	adminLoggedIn = true;
		         	return 1;
		     	} else {
		         	System.out.println("Login failed. Access denied.");
		         	System.exit(0);
		         	return 0;
		     	}
		 	}
	     	else {
	    	 	System.out.println("Login successful. Welcome, guest!");
	         	return 2;
	     	}
	 	}
		
		
		//Chức năng 6: Hiển thị danh sách
		void displayProductList() {
		    System.out.println("Product List:");
		    System.out.println("------");
		    
		    System.out.println("List of Voghi:");
		    display(voghiList);
		    System.out.println("List of Butchi:");
		    display(butchiList);
		    System.out.println("List of Butmuc:");
		    display(butmucList);
		    System.out.println("List of Book:");
		    display(bookList);
		}
		protected void display(List<? extends Product> products) {
		    for (Product product : products) {
		        System.out.println("-----------------");
		        product.getFullInfo();		        
		    }
		    System.out.println("-----------------");
		}
		
	 	//Chức năng 7: Đăng xuất
	 	void logout() {
		    adminLoggedIn = false;
		    System.out.println("Admin logged out successfully.");
		    // Gọi lại hàm đăng nhập
		    login();
	 	}
	 	// Chức năng 8: Thoát
	 	void exit() {
		    System.out.println("Exiting the program. Goodbye!");
		    System.exit(0);
		}
}
