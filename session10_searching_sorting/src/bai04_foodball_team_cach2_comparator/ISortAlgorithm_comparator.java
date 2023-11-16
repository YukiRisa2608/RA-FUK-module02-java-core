package bai04_foodball_team_cach2_comparator;

import java.util.Comparator;
import java.util.List;
// để giảm thiểu việc  chỉnh sửa mã nguồn
// thêm một tham số trong các thuật toán sắp xếp để quyết định chiều sắp xếp (tăng dần hoặc giảm dần).
public interface ISortAlgorithm_comparator<T>{
    void sort(List<T> list, Comparator<T> comparator);
}
