package run;

import controller.QLSachMuon;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLSachMuon ql = new QLSachMuon();
        while(true){
            System.out.print("""
                       0. Exit
                       1. Nhập danh sách đầu sách mới. In ra danh sách các đầu sách đã có.\n
                       2. Nhập danh sách bạn đọc mới. In ra danh sách bạn đọc đã có.\n
                       3. Lập bảng QL mượn sách cho từng bạn đọc bằng cách nhập các đầu sách mà bạn đọc mượn,\n
                       và in danh sách ra màn hình (chú ý: cùng một loại bạn đọc với một đầu sách thì không thể\n
                       xuất hiện 2 lần trong bảng này).\n
                       4. Sắp xếp danh sách Quản lý mượn sách: Theo tên bạn đọc\n
                       5. Sắp xếp danh sách Quản lý mượn sách: Theo Số lượng cuốn sách được mượn (giảm dần)\n
                       6. Tìm kiếm và hiển thị danh sách mượn sách theo tên bạn đọc.\n
                    """);
            int chon = Integer.parseInt(sc.nextLine());
            switch(chon){
                case 1:
                    ql.nhapSach();
                    ql.inDsSach();
                    break;
                case 2:
                    ql.nhapBD();
                    ql.inDSBD();
                    break;
                case 3:
                    ql.nhapSMuon();
                    ql.inSachMuon();
                    break;
                case 4:
                    ql.sapXepQLMSTheoTenBD();
                    ql.inSachMuon();
                    break;
                case 5:
                    ql.sapXepQLMSTheoSoLuong();
                    ql.inSachMuon();
                    break;
                case 6:
                    String tenBd = sc.nextLine();
                    ql.timkiemVaHienThiDSSachMuon(tenBd);
                    break;
                case 0:
                    return;
                default:
                    break;
            }
        }
    }
}