package ra.run;

import ra.util.InputMethods;

public class BookManagement {
    public static void main(String[] args) {
        //Basic
        while (true) {
            System.out.println("**************************BASIC-MENU************************** ");
            System.out.println("1. Quản lý danh mục");
            System.out.println("2. Quản lý sản phẩm");
            System.out.println("3. Thoát");
            byte choice = InputMethods.getByte();
            switch (choice) {
                case 1:
                    CatalogMenu();
                    break;
                case 2:
                    ProductMenu();
                    break;
                case 3:
                    System.out.println("Tạm Biệt");
                    break;
                default:
                    System.out.println("lựa chọn không đúng.");
            }
            if (choice == 3) {
                break;
            }
        }
    }

    //Catalog
    public static void CatalogMenu() {
        while (true) {
            System.out.println("********************CATALOG-MANAGEMENT******************** ");
            System.out.println("1. Nhập số danh mục thêm mới và nhập thông tin cho từng danh mục");
            System.out.println("2. Hiển thị thông tin tất cả các danh mục");
            System.out.println("3. Sửa tên danh mục theo mã danh mục");
            System.out.println("4. Xóa danh muc theo mã danh mục (lưu ý ko xóa khi có sản phẩm)");
            System.out.println("5. Quay lại ");
            byte choice2 = InputMethods.getByte();
            switch (choice2) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        }
    }

    //PRODUCT
    public static void ProductMenu() {
        while (true) {
            System.out.println("**********************PROD-MENU*********************** ");
            System.out.println("1. Nhập số sản sản phẩm và nhập thông tin sản phẩm");
            System.out.println("2. Hiển thị thông tin các sản phẩm");
            System.out.println("3. Sắp xếp sản phẩm theo giá giảm dần");
            System.out.println("4. Xóa sản phẩm theo mã");
            System.out.println("5. Tìm kiếm sách theo tên sách");
            System.out.println("6. Thay đổi thông tin của sách theo mã sách");
            System.out.println("7. Quay lại ");
            byte choice3 = InputMethods.getByte();
            switch (choice3) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    return;
                default:
                    System.err.println("lựa chọn không chính xác!!");
            }

        }

    }
}
